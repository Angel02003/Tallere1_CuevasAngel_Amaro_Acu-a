package Unidad1.EjercicioTaller;

public class ListaCliente {

    private Cliente[]arregloCliente;
    private int cantidadMaximaCliente;
    private int cantidadActualCliente;


    public ListaCliente (int cantidadMaximaCliente){

        if (cantidadMaximaCliente<=0){
            throw new IllegalArgumentException("la cantidad maxima /// no puede ser menor  0");
        }
        this.cantidadMaximaCliente=cantidadMaximaCliente;
        this.arregloCliente=new Cliente[cantidadMaximaCliente];
        this.cantidadActualCliente=0;

    }


    public int buscar(String rut){

        for (int i = 0; i < this.cantidadActualCliente; i++) {
            if (this.arregloCliente[i].getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    //----------------------------------------------------------------------------------------------------------------------------


    public Cliente optener(int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaximaCliente){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }

        return this.arregloCliente[pocicion];

    }
    //----------------------------------------------------------------------------------------------------------------------------



    public void agregar(Cliente nuevoCliente){

        if (this.buscar(nuevoCliente.getRut())!=-1){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }
        if (this.cantidadActualCliente==this.cantidadMaximaCliente){
            throw new IllegalArgumentException("arrelgo lleno");
        }

        this.arregloCliente[this.cantidadActualCliente]=nuevoCliente;
        this.cantidadActualCliente++;
    }
    //----------------------------------------------------------------------------------------------------------------------------

    public boolean eliminar (String rut){

        int eliminar=this.buscar(rut);

        if (eliminar<=0){
            for (int i = 0; i < this.cantidadActualCliente-1; i++) {
                this.arregloCliente[i]=this.arregloCliente[i+1];
            }
            this.cantidadActualCliente--;
            return true;
        }
        return false;
    }

    public int getCantidadMaximaCliente() {
        return cantidadMaximaCliente;
    }

    public int getCantidadActualCliente() {
        return cantidadActualCliente;
    }
}
