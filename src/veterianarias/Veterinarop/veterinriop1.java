package veterianarias.Veterinarop;

public class veterinriop1 {

    private String nombreMascota;
    private String nombreDuenio;
    private int edad;
    private String especieAnimal;
    private String razonDeVisita;
    private String estadoAnimal;

    public veterinriop1(String nombreMascota, String nombreDuenio, int edad, String especieAnimal, String razonDeVisita, String estadoAnimal) {
        this.nombreMascota = nombreMascota;
        this.nombreDuenio = nombreDuenio;
        this.edad = edad;
        this.especieAnimal = especieAnimal;
        this.razonDeVisita = razonDeVisita;
        this.estadoAnimal = estadoAnimal;
    }

    //---------------------------------------------------------------------------------------------------------------


    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public String getRazonDeVisita() {
        return razonDeVisita;
    }

    public String getEstadoAnimal() {
        return estadoAnimal;
    }
    //---------------------------------------------------------------------------------------------------------------


    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEspecieAnimal(String especieAnimal) {
        this.especieAnimal = especieAnimal;
    }

    public void setRazonDeVisita(String razonDeVisita) {
        this.razonDeVisita = razonDeVisita;
    }

    public void setEstadoAnimal(String estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }
}// final
