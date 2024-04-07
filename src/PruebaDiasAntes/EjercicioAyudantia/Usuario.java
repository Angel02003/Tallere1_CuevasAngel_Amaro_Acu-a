package PruebaDiasAntes.EjercicioAyudantia;

public class Usuario {

    private String nombreUsusario;
    private String apellidoUsuario;
    private String rutUsuario;
    private String menbreciaUsuario;

    //---------------------------------------------------------------------------------------------------------

    public Usuario(String nombreUsusario, String apellidoUsuario, String rutUsuario, String menbreciaUsuario) {
        this.nombreUsusario = nombreUsusario;
        this.apellidoUsuario = apellidoUsuario;
        this.rutUsuario = rutUsuario;
        this.menbreciaUsuario = menbreciaUsuario;
    }


    //---------------------------------------------------------------------------------------------------------

    public String getNombreUsusario() {
        return nombreUsusario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getRutUsuario() {
        return rutUsuario;
    }

    public String getMenbreciaUsuario() {
        return menbreciaUsuario;
    }

    //---------------------------------------------------------------------------------------------------------

    public void setNombreUsusario(String nombreUsusario) {
        this.nombreUsusario = nombreUsusario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public void setRutUsuario(String rutUsuario) {
        this.rutUsuario = rutUsuario;
    }

    public void setMenbreciaUsuario(String menbreciaUsuario) {
        this.menbreciaUsuario = menbreciaUsuario;
    }
}
