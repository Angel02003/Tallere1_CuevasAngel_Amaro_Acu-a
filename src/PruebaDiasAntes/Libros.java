package PruebaDiasAntes;

public class Libros {

    private String codigoisnbn;
    private String nombreLibro;
    private String nombreAutor;
    private String generoLibro;
    private int cantidadDePaginas;

    public Libros(String codigoisnbn, String nombreLibro, String nombreAutor, String generoLibro, int cantidadDePaginas) {
        this.codigoisnbn = codigoisnbn;
        this.nombreLibro = nombreLibro;
        this.nombreAutor = nombreAutor;
        this.generoLibro = generoLibro;
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public String getCodigoisnbn() {
        return codigoisnbn;
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

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public void setCodigoisnbn(String codigoisnbn) {
        this.codigoisnbn = codigoisnbn;
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

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }
}
