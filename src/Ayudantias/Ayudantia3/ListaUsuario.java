package Ayudantias.Ayudantia3;

public class ListaUsuario {

    private Usuario[]arregloUsuario;
    private int cantidadMaximaUsuario;
    private int cantidadActualUsuario;



    public ListaUsuario(int cantidadMaximaUsuario) throws IllegalAccessException {

        if (cantidadMaximaUsuario<=0){
            throw new IllegalAccessException("la cantidad maxima no puede ser menor a 0");
        }
        this.cantidadMaximaUsuario=cantidadMaximaUsuario;
        this.arregloUsuario=new Usuario[cantidadMaximaUsuario];
        this.cantidadActualUsuario=0;
    }


    public int buscarUsuario(String rut){

        for (int i = 0; i < this.cantidadActualUsuario; i++) {
            if (this.arregloUsuario[i].getRutUsuario().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }



    public Usuario optenerUsuario(int pocicion) throws IllegalAccessException {

        if (pocicion<0 || pocicion>=this.cantidadMaximaUsuario){
            throw new IllegalAccessException("la pocicion del usuario no fue encontrado");
        }
        return this.arregloUsuario[pocicion];
    }



    public void agregarUsuario(Usuario nuevoUsuario) throws IllegalAccessException {

        if (this.buscarUsuario(nuevoUsuario.getRutUsuario()) != -1) {
            throw new IllegalAccessException("ususario ya existente");
        }
        if (this.cantidadActualUsuario == this.cantidadMaximaUsuario) {
            throw new IllegalAccessException("arreglo lleno");
        }
        this.arregloUsuario[this.cantidadActualUsuario]=nuevoUsuario;
        this.cantidadActualUsuario++;
    }

    public boolean eliminarUsuario(String rut){
        int pocicion=this.buscarUsuario(rut);

        if (pocicion<=0) {
            for (int i = 0; i < this.cantidadActualUsuario - 1; i++) {
                this.arregloUsuario[i] = this.arregloUsuario[i + 1];
            }
            this.cantidadActualUsuario--;
            return true;

        }
        return false;
    }

    public int getCantidadMaximaUsuario() {
        return cantidadMaximaUsuario;
    }

    public int getCantidadActualUsuario() {
        return cantidadActualUsuario;
    }
}
