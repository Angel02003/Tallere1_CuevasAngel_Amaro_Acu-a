package Ayudantias.Ayudantia3;

public class ListaProducto {


    private Productos[]arregloProductos;
    private int cantidadMaximaProducto;
    private int cantidadActualProductos;




    ListaProducto(int cantidadMaximaProducto) throws IllegalAccessException {

        if (cantidadMaximaProducto<=0){
            throw new IllegalAccessException("la cantidad maxima del prouccto no puede ser menor a 0");
        }
        this.cantidadMaximaProducto=cantidadMaximaProducto;
        this.arregloProductos=new Productos[cantidadMaximaProducto];
        this.cantidadActualProductos=0;
    }


    public int buscarProducto(String eneanCode){

        for (int i = 0; i < this.cantidadActualProductos; i++) {
            if (this.arregloProductos[i].getEneanCode().equalsIgnoreCase(eneanCode)){
                return i;
            }
        }
        return -1;
    }

    public Productos optener(int pocicion) throws IllegalAccessException {

        if (pocicion<0 ||pocicion>=cantidadMaximaProducto){
            throw new IllegalAccessException("la pocicion no fue encontrada");
        }
        return this.arregloProductos[pocicion];
    }



    public void agregar(Productos nuevoProducto) throws IllegalAccessException {

        if (this.buscarProducto(nuevoProducto.getEneanCode())!=-1){
            throw new IllegalAccessException("el codigo del producto no fue encontrado");
        }
        if (this.cantidadActualProductos==this.cantidadMaximaProducto){
            throw new IllegalAccessException("el arreglo de los productos esta lleno ");
        }
        this.arregloProductos[this.cantidadActualProductos]=nuevoProducto;
        this.cantidadActualProductos++;
    }


    public boolean eliminar(String eneanCode){

        int pocicion=this.buscarProducto(eneanCode);

        for (int i = 0; i < this.cantidadActualProductos-1; i++) {
            if (pocicion<=0){

                this.arregloProductos[i]=this.arregloProductos[i+1];
            }
            this.cantidadActualProductos--;
            return true;
        }
        return false;
    }

    public int getCantidadMaximaProducto() {
        return cantidadMaximaProducto;
    }

    public int getCantidadActualProductos() {
        return cantidadActualProductos;
    }
}
