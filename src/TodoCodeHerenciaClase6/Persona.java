package TodoCodeHerenciaClase6;

public class Persona {

    // variables
    int Id;
    String DNI;
    String Nombre;
    String Apellido;
    String Domicilio;
    String Telefono;

    // constructor


    public Persona(int id, String DNI, String nombre, String apellido, String domicilio, String telefono) {
        Id = id;
        this.DNI = DNI;
        Nombre = nombre;
        Apellido = apellido;
        Domicilio = domicilio;
        Telefono = telefono;
    }

  // gets y setter

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}
