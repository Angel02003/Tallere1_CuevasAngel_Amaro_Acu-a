package PruebaDiasAntes.EjercicioAyudantia;

public class Productos {


    private String codigoProducto;
    private String nombrePeoducto;
    private int cantidadProducto;

    //---------------------------------------------------------------------------------------------------------
    public Productos(String codigoProducto, String nombrePeoducto, int cantidadProducto) {
        this.codigoProducto = codigoProducto;
        this.nombrePeoducto = nombrePeoducto;
        this.cantidadProducto = cantidadProducto;
    }
    //---------------------------------------------------------------------------------------------------------

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public String getNombrePeoducto() {
        return nombrePeoducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }
    //---------------------------------------------------------------------------------------------------------


    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public void setNombrePeoducto(String nombrePeoducto) {
        this.nombrePeoducto = nombrePeoducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }
}
