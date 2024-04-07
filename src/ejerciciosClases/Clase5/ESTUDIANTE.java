package ejerciciosClases.Clase5;

public class ESTUDIANTE {

    private String nombre;
    private String rut;

    //-----------------------------------------------------------------------------------
                 // constructor

    public ESTUDIANTE(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }


    //------------------------------------------------------------------------------------
                               //get

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }


    //--------------------------------------------------------------------------------------
                                    //set


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
