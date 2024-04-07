package TodoCodeHerenciaClase6;

public class Empleado extends Persona {


    // por defecto todos las variablews deben estar en privado o  (Private dentro del codigo) para proteger las variables.
private int NumeroLegajo;
private int Sueldo;
private String Cargo;



    public Empleado(int id, String DNI, String nombre, String apellido, String domicilio, String telefono, int numeroLegajo, int sueldo, String cargo) {
        super(id, DNI, nombre, apellido, domicilio, telefono);
        NumeroLegajo = numeroLegajo;
        Sueldo = sueldo;
        Cargo = cargo;
    }



 // Polimorfismo
    // public lo puede usar todas las java class si estan extendidas o (extends)
    // private son variables pribadas que solo se pueden usar en la java class que fue creada

    public int getNumeroLegajo() {
        return NumeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        NumeroLegajo = numeroLegajo;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }
}
