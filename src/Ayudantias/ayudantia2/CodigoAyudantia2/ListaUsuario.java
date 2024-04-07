package Ayudantias.ayudantia2.CodigoAyudantia2;

public class ListaUsuario {

    private Usuario[]arregloUsuario;
    private int cantidadaMaximaUsuario;
    private int cantidadActualUsuario;


    public ListaUsuario(int cantidadaMaximaUsuario){

        if (cantidadaMaximaUsuario<=0){
            throw new IllegalArgumentException("la cantidad maxima no puede ser menor a 0");
        }
        this.cantidadaMaximaUsuario=cantidadaMaximaUsuario;
        this.arregloUsuario=new Usuario[cantidadaMaximaUsuario];
        this.cantidadActualUsuario=0;
    }


    public int buscarUsuario(String nombre){

        for (int i = 0; i < this.cantidadActualUsuario; i++) {
           if (this.arregloUsuario[i].getNombre().equalsIgnoreCase(nombre)){
               return i;
           }
        }
        return -1;
    }


    public Usuario optenerUsuario(int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadaMaximaUsuario){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }
        return this.arregloUsuario[pocicion];
    }

    public void agregarUsuario(Usuario nuevoUsuario){

        if (this.buscarUsuario(nuevoUsuario.getNombre())!=-1){
            throw new IllegalArgumentException("el ususario ya existe");
        }
        if (this.cantidadActualUsuario==this.cantidadaMaximaUsuario){
            throw new IllegalArgumentException("el arreglo esta lleno ");
        }
        this.arregloUsuario[this.cantidadActualUsuario]=nuevoUsuario;
        this.cantidadActualUsuario++;
    }


    public boolean eliminarUsuario(String nombre){

        int pocicion=this.buscarUsuario(nombre);

        if (pocicion<=0){
            for (int i = 0; i < this.cantidadActualUsuario-1; i++) {
                this.arregloUsuario[i]=this.arregloUsuario[i+1];
            }
            this.cantidadActualUsuario--;
            return true;
        }
        return false;
    }

    public int getCantidadaMaximaUsuario() {
        return cantidadaMaximaUsuario;
    }

    public int getCantidadActualUsuario() {
        return cantidadActualUsuario;
    }
}
