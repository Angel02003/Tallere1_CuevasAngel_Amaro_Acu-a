package veterianarias;

public class Almoadiata {

    private  String nombreDeLaMasota;
    private String NombreDeLdUEÑO;
    private int edad;
    private String especieAnimal;
    private String razonDeVisita;
    private String estadoDelAnimal;


    public Almoadiata(String nombreDeLaMasota, String nombreDeLdUEÑO, int edad, String especieAnimal, String razonDeVisita, String estadoDelAnimal) {
        this.nombreDeLaMasota = nombreDeLaMasota;
        NombreDeLdUEÑO = nombreDeLdUEÑO;
        this.edad = edad;
        this.especieAnimal = especieAnimal;
        this.razonDeVisita = razonDeVisita;
        this.estadoDelAnimal = estadoDelAnimal;
    }

    // --------------------------------------------------------------------------------------------------------------------------
    // sett


    public String getNombreDeLaMasota() {
        return nombreDeLaMasota;
    }

    public String getNombreDeLdUEÑO() {
        return NombreDeLdUEÑO;
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

    public String getEstadoDelAnimal() {
        return estadoDelAnimal;
    }
//-----------------------------------------------------------------------------------------------------------------------


    //sett

    public void setNombreDeLaMasota(String nombreDeLaMasota) {
        this.nombreDeLaMasota = nombreDeLaMasota;
    }

    public void setNombreDeLdUEÑO(String nombreDeLdUEÑO) {
        NombreDeLdUEÑO = nombreDeLdUEÑO;
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

    public void setEstadoDelAnimal(String estadoDelAnimal) {
        this.estadoDelAnimal = estadoDelAnimal;
    }
}
