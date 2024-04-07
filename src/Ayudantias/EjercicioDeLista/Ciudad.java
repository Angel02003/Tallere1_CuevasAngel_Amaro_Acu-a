package Ayudantias.EjercicioDeLista;

public class Ciudad {



    private String nombreciudad;
    private String alcalde;
    public String idioma;
    private int cantidadDeHabitante;
    //-----------------------------------------------------------------------------------------


    public Ciudad(String nombre, String alcalde, String idiomaCiudad, int cantidadDeHabitante) {
        this.nombreciudad = nombre;
        this.alcalde = alcalde;
        this.idioma=idioma;
        this.cantidadDeHabitante = cantidadDeHabitante;
    }


    //---------------------------------------------------------------------------------------------------
                                // get
    public String getNombre() {
        return nombreciudad;
    }

    public String getAlcalde() {
        return alcalde;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getCantidadDeHabitante() {
        return cantidadDeHabitante;
    }
}
