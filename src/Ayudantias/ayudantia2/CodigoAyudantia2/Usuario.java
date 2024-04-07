package Ayudantias.ayudantia2.CodigoAyudantia2;

public class Usuario {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String rut;
    private String nombreUsuario;
    private String contraceña;
    private String tipoDeContraceña;

    //-------------------------------------------------------------------------------------------------------


    public Usuario(String nombre, String apellidoPaterno, String apellidoMaterno, String rut, String nombreUsuario, String contraceña, String tipoDeContraceña) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.rut = rut;
        this.nombreUsuario = nombreUsuario;
        this.contraceña = contraceña;
        this.tipoDeContraceña = tipoDeContraceña;
    }
    //-------------------------------------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getRut() {
        return rut;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraceña() {
        return contraceña;
    }

    public String getTipoDeContraceña() {
        return tipoDeContraceña;
    }
    //-------------------------------------------------------------------------------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraceña(String contraceña) {
        this.contraceña = contraceña;
    }

    public void setTipoDeContraceña(String tipoDeContraceña) {
        this.tipoDeContraceña = tipoDeContraceña;
    }
}
