package ejerciciosClases.Clase5;

public class ListaEstudiante {


    private ESTUDIANTE[]arreglo;
    private int cantidadMaxima;
    private int cantidadActual;



    //Lista
    public ListaEstudiante(int cantidadMaxima) throws IllegalAccessException {

        if(cantidadMaxima<=0){
            throw new IllegalAccessException("la cantidad maxima no puede ser 0");
        }
        this.cantidadMaxima=cantidadMaxima;
        this.arreglo=new ESTUDIANTE[cantidadMaxima];
        this.cantidadActual=0;
    }

    //buscar
    public int buscar(String rut){

        for (int i = 0; i < this.cantidadActual; i++) {
            if (this.arreglo[i].getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }


    //optener

    public ESTUDIANTE optener(int pocicion) throws IllegalAccessException {

        if (pocicion<0|| pocicion>=this.cantidadMaxima){
            throw new IllegalAccessException("POCICION NO ENCONTRADA");
        }
        return this.arreglo[pocicion];
    }


    // agregar
    public void agregar(ESTUDIANTE nuevoEstudiante) throws IllegalAccessException {

    if (this.buscar(nuevoEstudiante.getRut())!=-1){
        throw new IllegalAccessException("estudiante no encontrado");
    }

    if (this.cantidadActual==cantidadMaxima){
        throw new IllegalAccessException("arreglo lleno");
    }
    this.arreglo[this.cantidadActual]=nuevoEstudiante;
    this.cantidadActual++;
    }


    // eliminar
    public boolean eliminar(String rut){

        int pocicion=this.buscar(rut);

        if (pocicion<=0){
            for (int i = 0; i <this.cantidadActual-1 ; i++) {

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
}// llave final





