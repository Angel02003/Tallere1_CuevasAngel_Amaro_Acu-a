package ejerciciosClases.Problema2;

public class Almoadita {


    private String nombremascocta;
    private String nombreDuenio;
    private int edad;
    private String especie;
    private String razonDeVisita;
    private String estado;


    // CONSTRUCTOR
    //-------------------------------------------------------------------------------------------

    public Almoadita(String nombremascocta, String nombreDuenio, int edad, String especie, String razonDeVisita, String estado) {
        this.nombremascocta = nombremascocta;
        this.nombreDuenio = nombreDuenio;
        this.edad = edad;
        this.especie = especie;
        this.razonDeVisita = razonDeVisita;
        this.estado="ingresado";
    }


    // GET
    //---------------------------------------------------------------------------------------------------------------


    public String getNombremascocta() {
        return nombremascocta;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRazonDeVisita() {
        return razonDeVisita;
    }

    public String getEstado() {
        return estado;
    }
// SET
    //----------------------------------------------------------------------------------------


    public void setNombremascocta(String nombremascocta) {
        this.nombremascocta = nombremascocta;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRazonDeVisita(String razonDeVisita) {
        this.razonDeVisita = razonDeVisita;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
