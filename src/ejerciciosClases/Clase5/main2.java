package ejerciciosClases.Clase5;

import ucn.StdIn;
import ucn.StdOut;

public class main2 {
public static void main(String[]args) throws IllegalAccessException {

ListaEstudiante contenedor=new ListaEstudiante(7);

MenuPrincipal(contenedor);

}



public static void MenuPrincipal(ListaEstudiante contenedor) throws IllegalAccessException {

    boolean verifica=true;

    while (verifica){


        StdOut.println("[1] para listar estudiantes");
        StdOut.println("[2] para buscar");
        StdOut.println("[3] para agregar");
        StdOut.println("[4] para eliminar");
        StdOut.println("[5] para salir");

         String opccionElegida=StdIn.readLine();


        switch (opccionElegida){


            case "1"-> listarEstudiante(contenedor);
            case "2"->buscarEstudiante(contenedor);
            case "3"->agregarEstudiante(contenedor);
            case "4"->eliminarEstudiante(contenedor);
            case "5"->verifica= false;

            default -> StdOut.println("opccion invalida");
        }// swich

        StdOut.println("opccion terminado");

    }// while




}// void

    //------------------------------------------------------------------------------------------------------
    public static void listarEstudiante(ListaEstudiante contenedor) throws IllegalAccessException {
    ESTUDIANTE lista;
        for (int i = 0; i < contenedor.getCantidadActual(); i++) {
            lista=contenedor.optener(i);
            StdOut.println("los estudiante :::");
            StdOut.println("nombre estudiante"+lista.getNombre());
            StdOut.println("el rut es "+ lista.getRut());
            StdOut.println("--------------------------------------------------------------");
        }

    }

    //--------------------------------------------------------------------------------------------------------------

    public static void buscarEstudiante(ListaEstudiante contenedor) throws IllegalAccessException {
    StdOut.println("ingrese el rut que quiere buscar");
    String rutAHBuscar=StdIn.readLine();

    int OPTENCION= contenedor.buscar(rutAHBuscar);
    if (OPTENCION!=-1){
     ESTUDIANTE busqueda=contenedor.optener(OPTENCION);
     StdOut.println("el nombre es :::"+busqueda.getNombre()+":::");
     StdOut.println("el rut es :::"+busqueda.getRut()+"::::");
    }else {
        StdOut.println("el rut no fue encontrado");
    }
    }

    //----------------------------------------------------------------------------------------------------------------

    public static void agregarEstudiante(ListaEstudiante contenedor) throws IllegalAccessException {

    StdOut.println(":::ingrese los datos que quire agragar:::");
    StdOut.println("ingrese el nombre del estudiante");
    String nombre=StdIn.readLine();
    StdOut.println("ingrese el rut del estudiante");
    String rut=StdIn.readLine();

    ESTUDIANTE nuevoEstudiante=new ESTUDIANTE(nombre,rut);
    contenedor.agregar(nuevoEstudiante);



    }
    //----------------------------------------------------------------------------------------------

    public static void eliminarEstudiante(ListaEstudiante contenedor){

    StdOut.println(":::ingrese el rut del estudiante que quiere eliminar:::");
    String rutEliminado=StdIn.readLine();

    if (contenedor.eliminar(rutEliminado)){
        StdOut.println("EL RUT:::"+rutEliminado+"::: ah sido eliminado con exito");
    }
    else {
        StdOut.println("rut no encontrado");
    }

    }
}
