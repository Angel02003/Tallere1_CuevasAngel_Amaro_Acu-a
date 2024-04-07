package Ayudantias.ayudantia2.CodigoAyudantia2;

public class Libros {
    private String idLibro;
    private String tituloLibro;
    private String autor;
    private String genero1;
    private String genero2;
    private int cantidadPaginas;
    private int anioDePublicacion;
    private int stock;

    public Libros(String idLibro, String tituloLibro, String autor, String genero1, String genero2, int cantidadPaginas, int anioDePublicacion, int stock) {
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autor = autor;
        this.genero1 = genero1;
        this.genero2 = genero2;
        this.cantidadPaginas = cantidadPaginas;
        this.anioDePublicacion = anioDePublicacion;
        this.stock = stock;
    }

    //----------------------------------------------------------------------------------------------------------------------------


    public String getIdLibro() {
        return idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero1() {
        return genero1;
    }

    public String getGenero2() {
        return genero2;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public int getStock() {
        return stock;
    }
    //----------------------------------------------------------------------------------------------------------------------------


    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}



