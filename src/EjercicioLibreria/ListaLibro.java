package EjercicioLibreria;

public class ListaLibro {

    private Libro[]arreglo;
    private int cantidadMaxima;
    private int cantidadActual;



    public ListaLibro(int cantidadMaxima) throws IllegalAccessException {

        if (cantidadMaxima<=0){
            throw new IllegalAccessException("la cantidad maxima no puede ser menor a 0");
        }
        this.cantidadMaxima=cantidadMaxima;
        this.arreglo=new Libro[cantidadMaxima];
        this.cantidadActual=0;
    }


    public int buscar(String isbn){

        for (int i = 0; i < this.cantidadActual; i++) {
            if (this.arreglo[i].getIsbn().equalsIgnoreCase(isbn)){
                return i;
            }
        }
        return -1;
    }

    public Libro optener (int pocicion) throws IllegalAccessException {
        if (pocicion<0 || pocicion>=this.cantidadMaxima){
            throw new IllegalAccessException("la pocicion no fue encontrada");
        }
        return this.arreglo[pocicion];
    }


    public void agregar(Libro nuevoLibro) throws IllegalAccessException {

        if (this.buscar(nuevoLibro.getIsbn())!=-1){
            throw new IllegalAccessException("pocicion del libro no encontrado");
        }
        if (this.cantidadActual==this.cantidadMaxima){
            throw new IllegalAccessException("el arreglo se encuentra lleno");
        }
        this.arreglo[this.cantidadActual]=nuevoLibro;
        this.cantidadActual++;
    }

    public boolean eliminar(String isbn) {

        int pocicion = this.buscar(isbn);

        if (pocicion <= 0) {
            for (int i = 0; i < this.cantidadActual - 1; i++) {
                this.arreglo[i] = this.arreglo[i + 1];
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
