package Ayudantias;

import Ayudantias.EjercicioDeLista.Ciudad;
import Ayudantias.EjercicioDeLista.ListaPais;
import Ayudantias.EjercicioDeLista.ListaPais;
import ejerciciosClases.Clase5.ESTUDIANTE;
import ucn.StdIn;
import ucn.StdOut;

public class main {
    public static void main(String[]args) throws IllegalAccessException {


    }



    public static void MenuPrincipal(ListaPais contenedor) throws IllegalAccessException {
        boolean verificacion=true;

        while (verificacion){

            StdOut.println("ingrese una de las opcciones");
            StdOut.println("[1] listarCiudades");
            StdOut.println("[2] ingresar datos del pais");
            StdOut.println("[3] eliminar ciudades ");
            StdOut.println("[4] salir ");
            String opccionElegida= StdIn.readLine();
         switch (opccionElegida){
             case "1"->listarciudad(contenedor);
             case "2"-> DatosDelPais(contenedor);
             case "3"->elimineCiudad(contenedor);
             case "4" -> verificacion=false;
             default -> StdOut.println("opccion no valida");
         }//swhich
            

        }// while
        
    }// menu

    public static void listarciudad(ListaPais contenedor) throws IllegalAccessException {


        Ciudad listar;
        for (int i = 0; i < contenedor.getCantidadActual(); i++) {
            listar=contenedor.optener(i);
            StdOut.println("las ciudades guardadas son");
            StdOut.println(":::"+listar.getNombre()+":::");
            StdOut.println(":::"+listar.getAlcalde()+":::");
            StdOut.println(":::"+listar.getIdioma()+":::");
            StdOut.println(":::"+listar.getCantidadDeHabitante()+":::");
            StdOut.println("--------------------------------------------------------------------------");

        }

    }

    //_-----------------------------------------------------------------------------------------------------------------
    public static void DatosDelPais(ListaPais contenedor) throws IllegalAccessException {
        int  caintidadDeHabitantestotal=0;

        StdOut.println("ingrese el nombre de la ciudad");
        String nombreCiudad=StdIn.readLine();
        StdOut.println("ingrese el nombre del alcalde");
        String nombreAlcalde=StdIn.readLine();
        StdOut.println("ingrese el  idioma de la ciudad");
        String idiomaCiudad=StdIn.readLine();
        StdOut.println("ingrese la cantidad de habitnates");
        int cantidadHabitantes=StdIn.readInt();

        caintidadDeHabitantestotal=caintidadDeHabitantestotal+cantidadHabitantes;

        Ciudad nuevaCiudad=new Ciudad(nombreCiudad,nombreAlcalde,idiomaCiudad,cantidadHabitantes);
        contenedor.agregar(nuevaCiudad);

StdOut.println("lleva"+caintidadDeHabitantestotal);

        if (caintidadDeHabitantestotal>=18000000){
            StdOut.println("no se puede agregar mas habitantes"+caintidadDeHabitantestotal);
        }

    }
    
    //_----------------------------------------------------------------------------------------------------------
    public static void elimineCiudad(ListaPais contenedor){
        StdOut.println("ingrese el nombre de la ciudad a eliminar");
        String nombreAEliminar=StdIn.readLine();

        if (contenedor.eliminar(nombreAEliminar)){
            StdOut.println("se ha eliminado la ciudad con exito");
        }else {
                 StdOut.println("ciudad no encontrada");
        }
    }
    


    public static void buscar(ListaPais contenedor) throws IllegalAccessException {
        StdOut.println("ingrese el nombre de la ciudad que quiere buscar");
        String nombreCiudada=StdIn.readLine();

        int busqueda=contenedor.buscarCiudad(nombreCiudada);
        if (busqueda!=-1){
            Ciudad octencion=contenedor.optener(busqueda);
            StdOut.println("el nombre es"+octencion.getNombre());
            StdOut.println("el alcalde es"+octencion.getAlcalde());
            StdOut.println("el idioma es"+octencion.getIdioma());
            StdOut.println();

        }


    }

}
