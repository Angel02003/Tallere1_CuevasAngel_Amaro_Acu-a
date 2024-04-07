package Ayudantias.ayudantia2.CodigoAyudantia2;

public class ListaLibro {

    private Libros[]arregloLibros;
    private int cantidadMaximaLibros;
    private int cantidadActualLibros;


    public ListaLibro (int cantidadMaximaLibros){

        if (cantidadMaximaLibros<=0){
            throw new IllegalArgumentException("la cantidad maxima no puede ser menor igual a 0");
        }

        this.cantidadMaximaLibros=cantidadMaximaLibros;
        this.arregloLibros=new Libros[cantidadMaximaLibros];
        this.cantidadActualLibros=0;
    }


    public int buscarLibro(String tituloLibro){

        for (int i = 0; i < this.cantidadActualLibros; i++) {
            if (this.arregloLibros[i].getTituloLibro().equalsIgnoreCase(tituloLibro)){
                return i;
            }
        }
        return -1;
    }


    public Libros optenerLibro(int pocicion){

        if (pocicion<=0 || pocicion>=this.cantidadMaximaLibros){
            throw new IllegalArgumentException("la pocicion del libro no se encontro");
        }
        return this.arregloLibros[pocicion];
    }

    public void agregarLibro(Libros nuevoLibro){
        if (this.buscarLibro(nuevoLibro.getTituloLibro())!=-1){
            throw new IllegalArgumentException("el libro no fue encontrado");
        }
        if (this.cantidadActualLibros==this.cantidadMaximaLibros){
            throw new IllegalArgumentException("el arreglo se enuentra lleno");
        }
        this.arregloLibros[this.cantidadActualLibros]=nuevoLibro;
        this.cantidadActualLibros++;
    }

    public boolean eliminarLibro(String tituloLibro){

        int pocicion=this.buscarLibro(tituloLibro);

        if (pocicion<=0){
            for (int i = 0; i < this.cantidadActualLibros-1; i++) {
                this.arregloLibros[i]=this.arregloLibros[i+1];
            }
            this.cantidadActualLibros--;
            return true;
        }
        return false;
    }

    public int getCantidadMaximaLibros() {
        return cantidadMaximaLibros;
    }

    public int getCantidadActualLibros() {
        return cantidadActualLibros;
    }
}
