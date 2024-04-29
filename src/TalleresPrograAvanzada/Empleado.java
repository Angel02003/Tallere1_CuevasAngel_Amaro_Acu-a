package Unidad1.EjercicioTaller;

public class Empleado {

    private String nombreDeUsuario;
    private String contraceña;

    private double comicion;


    public Empleado(String nombreDeUsuario, String contraceña, double comicion) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.contraceña = contraceña;
        this.comicion=comicion;
    }




    //------------------------------------------------------------------------------------------------------------------

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public String getContraceña() {
        return contraceña;
    }


    public double getComicion() {
        return comicion;
    }
    //-----------------------------------------------------------------------------------------------------------

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public void setContraceña(String contraceña) {
        this.contraceña = contraceña;
    }


    public void setComicion(double comicion) {
        this.comicion = comicion;
    }
}
