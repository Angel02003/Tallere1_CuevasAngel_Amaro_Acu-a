package veterianarias.Veterinarop;

public class Listaveterinariop {


    private veterinriop1[] arregloVeterinariop;
    private int cantidadMaxima;
    private int cantidadActual;




    public Listaveterinariop (int cantidadMaxima){

        if (cantidadMaxima<=0){
            throw new IllegalArgumentException("la cantidad maxima no puede ser menor igual a 0");
        }
        this.cantidadMaxima=cantidadMaxima;
        this.arregloVeterinariop=new veterinriop1[cantidadMaxima];
        this.cantidadActual=0;
    }


     public int buscar (String NombreMascota){

         for (int i = 0; i < this.cantidadActual; i++) {
             if (this.arregloVeterinariop[i].getNombreMascota().equalsIgnoreCase(NombreMascota)){
                 return i;
             }
         }
        return -1;
}

    public veterinriop1 optener (int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaxima){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }

        return this.arregloVeterinariop[pocicion];
    }


    public void agregar (veterinriop1 nuevaMascota){

        if (this.buscar(nuevaMascota.getNombreMascota())!=-1){
            throw new IllegalArgumentException("la mascota ya existe");
        }
        if (this.cantidadActual==this.cantidadMaxima){
            throw new IllegalArgumentException("el arreglo esta lleno");
        }
        this.arregloVeterinariop[this.cantidadActual]=nuevaMascota;
        this.cantidadActual++;
    }

    public boolean eliminar (String nombreMascota){

        int eliminando=this.buscar(nombreMascota);

        if (eliminando<=0){
            for (int i = 0; i < this.cantidadActual-1; i++) {
                this.arregloVeterinariop[i]=this.arregloVeterinariop[i+1];
            }
            this.cantidadActual--;
            return true;
        }
        return false;
    }


    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
