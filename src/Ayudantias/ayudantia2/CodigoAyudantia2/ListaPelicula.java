package Ayudantias.ayudantia2.CodigoAyudantia2;

public class ListaPelicula {


    private Peliculas[]arregloPelicula;
    private int cantidadMaximaPelicula;
    private int cantidadActualPelcula;


    public ListaPelicula(int cantidadMaximaPelicula){

        if (cantidadMaximaPelicula<=0){
            throw new IllegalArgumentException("la cantidad Maxima no puede ser menor igual a 0");
        }
        this.cantidadMaximaPelicula=cantidadMaximaPelicula;
        this.arregloPelicula=new Peliculas[cantidadMaximaPelicula];
        this.cantidadActualPelcula=0;
    }



    public int buscarPelicula(String nombrePelicula){

        for (int i = 0; i < this.cantidadActualPelcula; i++) {
            if (this.arregloPelicula[i].getNombrePelicula().equalsIgnoreCase(nombrePelicula)){
                return i;
            }
        }
        return -1;
    }

    public Peliculas optenerPelicual(int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaximaPelicula){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }
        return this.arregloPelicula[pocicion];
    }


    public void agregarPelicula(Peliculas nuevaPelicula){

        if (this.buscarPelicula(nuevaPelicula.getNombrePelicula())!=-1){
            throw new IllegalArgumentException("la pelicula ya existe");
        }
        if (this.cantidadActualPelcula==this.cantidadMaximaPelicula){
            throw new IllegalArgumentException("el arreglo esta lleno");
        }

        this.arregloPelicula[this.cantidadActualPelcula]=nuevaPelicula;
        this.cantidadActualPelcula++;

    }

    public boolean eliminar (String nombrePelicula) {

        int pocicion = this.buscarPelicula(nombrePelicula);
        if (pocicion <= 0) {
            for (int i = 0; i < this.cantidadActualPelcula - 1; i++) {
                this.arregloPelicula[i] = this.arregloPelicula[i + 1];
            }

            this.cantidadActualPelcula--;
            return true;

        }
        return false;
    }

    public int getCantidadMaximaPelicula() {
        return cantidadMaximaPelicula;
    }

    public int getCantidadActualPelcula() {
        return cantidadActualPelcula;
    }
}
