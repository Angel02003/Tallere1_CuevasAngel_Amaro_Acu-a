package Unidad1.EjercicioTaller;

public class VideoJuegos {

    private String codigo;
    private String nombreVideoJuego;
    private int precioVideoJuego;
    private String generoVideoJuego;
    private String clasificacion;
    private String desarrollo;
    private String plataforma;

    public VideoJuegos(String codigo, String nombreVideoJuego, int precioVideoJuego, String generoVideoJuego, String clasificacion, String desarrollo, String plataforma) {
        this.codigo = codigo;
        this.nombreVideoJuego = nombreVideoJuego;
        this.precioVideoJuego = precioVideoJuego;
        this.generoVideoJuego = generoVideoJuego;
        this.clasificacion = clasificacion;
        this.desarrollo = desarrollo;
        this.plataforma = plataforma;
    }

    //--------------------------------------------------------------------------------------------------------------------------


    public String getCodigo() {
        return codigo;
    }

    public String getNombreVideoJuego() {
        return nombreVideoJuego;
    }

    public int getPrecioVideoJuego() {
        return precioVideoJuego;
    }

    public String getGeneroVideoJuego() {
        return generoVideoJuego;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getDesarrollo() {
        return desarrollo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    //--------------------------------------------------------------------------------------------------------------------------

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombreVideoJuego(String nombreVideoJuego) {
        this.nombreVideoJuego = nombreVideoJuego;
    }

    public void setPrecioVideoJuego(int precioVideoJuego) {
        this.precioVideoJuego = precioVideoJuego;
    }

    public void setGeneroVideoJuego(String generoVideoJuego) {
        this.generoVideoJuego = generoVideoJuego;
    }

    public void setClasificacion(String clasificacion) {this.clasificacion = clasificacion;
    }

    public void setDesarrollo(String desarrollo) {
        this.desarrollo = desarrollo;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
