package TodoCodeHerenciaClase6;

public class Consultor extends Persona{


int NumeroDeCOnsultor;
String nombre;


    public Consultor(int id, String DNI, String nombre, String apellido, String domicilio, String telefono, int numeroDeCOnsultor, String nombre1) {
        super(id, DNI, nombre, apellido, domicilio, telefono);
        NumeroDeCOnsultor = numeroDeCOnsultor;
        this.nombre = nombre1;
    }



    public int getNumeroDeCOnsultor() {
        return NumeroDeCOnsultor;
    }

    public void setNumeroDeCOnsultor(int numeroDeCOnsultor) {
        NumeroDeCOnsultor = numeroDeCOnsultor;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
