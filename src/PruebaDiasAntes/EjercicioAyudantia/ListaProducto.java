package PruebaDiasAntes.EjercicioAyudantia;

public class ListaProducto {

    private Productos[] arregloProducto;
    private int cantidadMaximaProducto;
    private int cantidadActualProducto;


    public ListaProducto(int cantidadMaximaProducto){
        if (cantidadMaximaProducto<=0){
            throw new IllegalArgumentException("la cantidad maxima no puede ser menor igaul a 0");
        }
        this.cantidadMaximaProducto=cantidadMaximaProducto;
        this.arregloProducto=new Productos[cantidadMaximaProducto];
        this.cantidadActualProducto=0;
    }

    //---------------------------------------------------------------------------------------------------------

    public int buscar (String codigoProducto){

        for (int i = 0; i < this.cantidadActualProducto; i++) {
            if (this.arregloProducto[i].getCodigoProducto().equalsIgnoreCase(codigoProducto)){
                return i;
            }
        }
        return -1;
    }
    //---------------------------------------------------------------------------------------------------------
    public Productos optener(int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaximaProducto){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }
        return this.arregloProducto[pocicion];
    }
    //---------------------------------------------------------------------------------------------------------

    public void agregar(Productos nuevoProducto){
        if (this.buscar(nuevoProducto.getCodigoProducto())!=-1){
            throw new IllegalArgumentException("el producto ya existe");
        }
        if (this.cantidadActualProducto==this.cantidadMaximaProducto){
            throw new IllegalArgumentException("el arreglo esta lleno");
        }
        this.arregloProducto[this.cantidadActualProducto]=nuevoProducto;
        this.cantidadActualProducto++;
    }
    //---------------------------------------------------------------------------------------------------------

    public boolean eliminar(String codigoProducto ){

        int pocicion=this.buscar(codigoProducto);

        if (pocicion<=0){
            for (int i = 0; i < this.cantidadActualProducto-1; i++) {
                this.arregloProducto[i]=this.arregloProducto[i+1];
            }
            this.cantidadActualProducto--;
            return true;
        }
        return false;
    }
    //---------------------------------------------------------------------------------------------------------


    public int getCantidadMaximaProducto() {
        return cantidadMaximaProducto;
    }

    public int getCantidadActualProducto() {
        return cantidadActualProducto;
    }
}
