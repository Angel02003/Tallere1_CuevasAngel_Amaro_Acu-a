package EjercicioClase5;

public class Ciudad {

    private String nombreCiudad;
    private String alcalde;
    private String idioma;
    private int cantidadDeHabitantes;


    public Ciudad(String nombreCiudad, String alcalde, String idioma, int cantidadDeHabitantes) {
        this.nombreCiudad = nombreCiudad;
        this.alcalde = alcalde;
        this.idioma = idioma;
        this.cantidadDeHabitantes = cantidadDeHabitantes;
    }

    //---------------------------------------------------------------------------------------------------------

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getCantidadDeHabitantes() {
        return cantidadDeHabitantes;
    }
}
