package ejerciciosClases.Clase5.PaisYCiudades;

public class Ciudades {

    private String nombre;
    private String alcande;
    private  String idioma;
    private int cantidadDeHabitante;


    //-------------------------------------------------------------------------------
                                // constructor
    public Ciudades(String nombre, String alcande, String idioma, int cantidadDeHabitante) {
        this.nombre = nombre;
        this.alcande = alcande;
        this.idioma= idioma;
        this.cantidadDeHabitante = cantidadDeHabitante;
    }

    //---------------------------------------------------------------------------------------------------------
                                     // get

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getAlcande() {
        return alcande;
    }

    public int getCantidadDeHabitante() {
        return cantidadDeHabitante;
    }
}
