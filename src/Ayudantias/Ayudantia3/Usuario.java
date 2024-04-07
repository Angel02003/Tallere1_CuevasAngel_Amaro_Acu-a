package Ayudantias.Ayudantia3;

public class Usuario {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String rutUsuario;
    private String menbresia;

    public Usuario(String nombreUsuario, String apellidoUsuario, String rutUsuario, String menbresia) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.rutUsuario = rutUsuario;
        this.menbresia = menbresia;
    }


//---------------------------------------------------------------------------------------
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public String getMenbresia() {
        return menbresia;
    }
    //-------------------------------------------------------------------------

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public void setMenbresia(String menbresia) {
        this.menbresia = menbresia;
    }
}
