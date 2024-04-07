package PruebaDiasAntes.EjercicioAyudantia;

public class ListaUsuario {

    private Usuario[]arreglo;
    private int cantidadMaximaUsuario;
    private int cantidadActualUsuario;


    public ListaUsuario(int cantidadMaximaUsuario){
        if (cantidadMaximaUsuario<=0){
            throw new IllegalArgumentException("la cantidad maxima no puede ser menor igual a 0");
        }
        this.cantidadMaximaUsuario=cantidadMaximaUsuario;
        this.arreglo=new Usuario[cantidadMaximaUsuario];
        this.cantidadActualUsuario=0;
    }
    //---------------------------------------------------------------------------------------------------------

    public int buscar(String rut){

        for (int i = 0; i < this.cantidadActualUsuario; i++) {
            if(this.arreglo[i].getRutUsuario().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    //---------------------------------------------------------------------------------------------------------
    public Usuario optener(int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaximaUsuario){
            throw new IllegalArgumentException("pocicion no encontrada");
        }
        return this.arreglo[pocicion];
    }

    //---------------------------------------------------------------------------------------------------------
    public void agregar(Usuario nuevoUsuario){

        if (this.buscar(nuevoUsuario.getRutUsuario())!=-1){
            throw new IllegalArgumentException("ususario ya existenete");
        }
        if (this.cantidadActualUsuario==this.cantidadMaximaUsuario){
            throw new IllegalArgumentException("el areglo esta lleno ");
        }


        this.arreglo[this.cantidadActualUsuario]=nuevoUsuario;
        this.cantidadActualUsuario++;
    }
    //---------------------------------------------------------------------------------------------------------
    public boolean eliminar(String rut){

        int pocicion=this.buscar(rut);
        if (pocicion<=0){
            for (int i = 0; i < this.cantidadActualUsuario-1; i++) {
                this.arreglo[i]=this.arreglo[i+1];
            }
            this.cantidadActualUsuario--;
            return true;
        }
        return false;

    }
    //---------------------------------------------------------------------------------------------------------

    public int getCantidadMaximaUsuario() {
        return cantidadMaximaUsuario;
    }

    public int getCantidadActualUsuario() {
        return cantidadActualUsuario;
    }
}
