package EjercicioClase5;

public class ListaCiudad{

    private Ciudad[]arreglo;
    private int cantidadMaxima;
    private int cantidadActual;


    // lista
    //--------------------------------------------------------------------------------------------------

    public ListaCiudad (int cantidadMaxima) throws IllegalAccessException {
        if(cantidadMaxima<=0){
            throw new IllegalAccessException("la antidad maxima no piuede ser menor a 0");
        }
        this.cantidadMaxima=cantidadMaxima;
        this.arreglo=new Ciudad[cantidadMaxima];
        this.cantidadActual=0;
    }

    public int buscar(String nombre){

        for (int i = 0; i < this.cantidadActual; i++) {
            if (this.arreglo[i].getNombreCiudad().equalsIgnoreCase(nombre)){
                return i;
            }
        }
        return -1;
    }


    public Ciudad optener(int pocicion) throws IllegalAccessException {

        if(pocicion<0 || pocicion>=this.cantidadMaxima){
            throw new IllegalAccessException("arreglo lleno");
        }
        return this.arreglo[pocicion];
    }

    public void agregar(Ciudad nuevaCiudad) throws IllegalAccessException {

        if (this.buscar(nuevaCiudad.getNombreCiudad())!=-1){
            throw new IllegalAccessException("la ciudad no fue encontrada");
        }
        if (this.cantidadActual==this.cantidadMaxima){
            throw new IllegalAccessException("arreglo lleno");
        }
        this.arreglo[this.cantidadActual]=nuevaCiudad;
        this.cantidadActual++;
    }

    public boolean eliminar(String nombre){
        int pocicion=this.buscar(nombre);

        if (pocicion<=0){
            for (int i = 0; i < this.cantidadActual-1; i++) {
                this.arreglo[i]=this.arreglo[i+1];
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

    public Ciudad[] getArreglo() {
        return arreglo;
    }
}

