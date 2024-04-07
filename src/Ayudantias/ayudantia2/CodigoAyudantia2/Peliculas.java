package Ayudantias.ayudantia2.CodigoAyudantia2;

public class Peliculas {


    private String idPelicula;
    private String nombrePelicula;
    private String director;
    private String genero1Pelicula;
    private String genero2Pelicula;
    private int cantidadDeHoras;
    private int cantidadDeminutos;
    private int anioDeEstrenoPelicula;
    private int stockPelicula;

    public Peliculas(String idPelicula, String nombrePelicula, String director, String genero1Pelicula, String genero2Pelicula, int cantidadDeHoras, int cantidadDeminutos, int anioDeEstrenoPelicula, int stockPelicula) {
        this.idPelicula = idPelicula;
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.genero1Pelicula = genero1Pelicula;
        this.genero2Pelicula = genero2Pelicula;
        this.cantidadDeHoras = cantidadDeHoras;
        this.cantidadDeminutos = cantidadDeminutos;
        this.anioDeEstrenoPelicula = anioDeEstrenoPelicula;
        this.stockPelicula = stockPelicula;
    }

    //----------------------------------------------------------------------------------------------------------------------------


    public String getIdPelicula() {
        return idPelicula;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero1Pelicula() {
        return genero1Pelicula;
    }

    public String getGenero2Pelicula() {
        return genero2Pelicula;
    }

    public int getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public int getCantidadDeminutos() {
        return cantidadDeminutos;
    }

    public int getAnioDeEstrenoPelicula() {
        return anioDeEstrenoPelicula;
    }

    public int getStockPelicula() {
        return stockPelicula;
    }
    //----------------------------------------------------------------------------------------------------------------------------


    public void setIdPelicula(String idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero1Pelicula(String genero1Pelicula) {
        this.genero1Pelicula = genero1Pelicula;
    }

    public void setGenero2Pelicula(String genero2Pelicula) {
        this.genero2Pelicula = genero2Pelicula;
    }

    public void setCantidadDeHoras(int cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public void setCantidadDeminutos(int cantidadDeminutos) {
        this.cantidadDeminutos = cantidadDeminutos;
    }

    public void setAnioDeEstrenoPelicula(int anioDeEstrenoPelicula) {
        this.anioDeEstrenoPelicula = anioDeEstrenoPelicula;
    }

    public void setStockPelicula(int stockPelicula) {
        this.stockPelicula = stockPelicula;
    }
}
