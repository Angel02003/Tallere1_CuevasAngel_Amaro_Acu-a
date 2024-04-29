package Unidad1.EjercicioTaller;

import ucn.In;
import ucn.StdOut;

public class ListaEmpleado {

    private Empleado[] arregloEmpleado;
    private int cantidadMaximaEmpleado;
    private int cantidaActualEmpleado;

    //-----------------------------------------------------------------------------------------------------------

                                    // constructor Lista Empleados


    public ListaEmpleado (int cantidadMaximaEmpleado){

        if (cantidadMaximaEmpleado<=0){
            throw new IllegalArgumentException("la cantidad maxima ----- no puede ser menor a 0");
        }
        this.cantidadMaximaEmpleado=cantidadMaximaEmpleado;
        this.arregloEmpleado=new Empleado[cantidadMaximaEmpleado];
        this.cantidaActualEmpleado=0;
    }
    //-----------------------------------------------------------------------------------------------------------

                                         // buscar Empleado

    public int buscarEmpleado (String nombreUsuario){

        for (int i = 0; i < this.cantidaActualEmpleado; i++) {
            if (this.arregloEmpleado[i].getNombreDeUsuario().equalsIgnoreCase(nombreUsuario)){
                return i;
            }
        }
        return -1;
    }

    //-----------------------------------------------------------------------------------------------------------

                                         // optener empleado
    public Empleado optenerEmpleado (int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaximaEmpleado){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }

        return this.arregloEmpleado[pocicion];

    }


    //-----------------------------------------------------------------------------------------------------------

                                        // agregar Empleado

    public void agregarEmpleado (Empleado nuevoEmpleado){

        if (this.buscarEmpleado(nuevoEmpleado.getNombreDeUsuario())!=-1){
            throw new IllegalArgumentException("el empleado ya existe en el arreglo");
        }
        if (this.cantidaActualEmpleado==this.cantidadMaximaEmpleado){
            throw new IllegalArgumentException("el arreglo esta lleno");
        }

        this.arregloEmpleado[this.cantidaActualEmpleado]=nuevoEmpleado;
        this.cantidaActualEmpleado++;
    }
    //-----------------------------------------------------------------------------------------------------------
                                            //Eliminar Empleado


    public boolean eliminar (String rut){

        int eliminar=this.buscarEmpleado(rut);

        if (eliminar<=0){
            for (int i = 0; i < this.cantidaActualEmpleado-1; i++) {
                this.arregloEmpleado[i]=this.arregloEmpleado[i+1];
            }
            this.cantidaActualEmpleado--;
            return true;
        }
        return false;
    }

    public int getCantidadMaximaEmpleado() {
        return cantidadMaximaEmpleado;
    }

    public int getCantidaActualEmpleado() {
        return cantidaActualEmpleado;
    }

//---------------------------------------------------------------------------------------------------------------
                                            // lectura de archivo

    public void lecturaDeArcivo(String nombreArcivo){

        Empleado empleado;
        In archivoEntrada=new In(nombreArcivo);

        while (!archivoEntrada.isEmpty()){

            String [] linea=archivoEntrada.readLine().split(",");

            String nombreDeUsuario=linea[0];
            String contraceña=linea[1];



            empleado=new Empleado(nombreDeUsuario,contraceña,0);

            this.agregarEmpleado(empleado);
        }
        archivoEntrada.close();
    }

}// final de la class
