package Ayudantias.Ayudantia3;

public class Productos {

    private String eneanCode;
    private String nombreProducto;
    private int cantidad;

    public Productos(String eneanCode, String nombreProducto, int cantidad) {
        this.eneanCode = eneanCode;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }
    //-----------------------------------------------------------------------------------------

    public String getEneanCode() {
        return eneanCode;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    //-------------------------------------------------------------------------------------

    public void setEneanCode(String eneanCode) {
        this.eneanCode = eneanCode;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
