package EjercicioLibreria;

public class Libro {

    private String isbn;
    private String nombreLibro;
    private String nombreAutor;
    private String generoLibro;
    private int cantidadPaginas;
    private  String carril;

    public Libro(String isbn, String nombreLibro, String nombreAutor, String generoLibro, int cantidadPaginas, String carril) {
        this.isbn = isbn;
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.generoLibro = generoLibro;
        this.cantidadPaginas = cantidadPaginas;
        this.carril = carril;
    }

    //-------------------------------------------------------------------------------------------------------------
    public String getIsbn() {
        return isbn;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getGeneroLibro() {
        return generoLibro;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public String getCarril() {
        return carril;
    }
    //------------------------------------------------------------------------------------------

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setGeneroLibro(String generoLibro) {
        this.generoLibro = generoLibro;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setCarril(String carril) {
        this.carril = carril;
    }
}
