package ejerciciosClases.Clase5.PaisYCiudades;

import ucn.StdIn;
import ucn.StdOut;

public class Main {
    public static void main(String[]args) throws IllegalAccessException {

        int verificador=LeerDatos("verificadores");
        Pais contenedor=new Pais(3);

        menuPrincipal(contenedor);

    }



    public static void menuPrincipal(Pais contenedor) throws IllegalAccessException {

        boolean verificacion=true;

        while (verificacion){
            StdOut.println(":::ingrese los datos del menu:::");
            StdOut.println("[1] para listar");
            StdOut.println("[2] para agagar");
            StdOut.println("[3] para eliminar");
            StdOut.println("[4] para buscar");
            StdOut.println("[5] para salir");

            String opccion= StdIn.readLine();

            switch (opccion){

                case "1"->listar(contenedor);
                case"2"->agregar(contenedor);
                case"3"->eliminar(contenedor);
                case"4"->buscar(contenedor);
                case"5"->verificacion=false;
                default -> StdOut.println("opion no valida");
            }// swith


        }//while

    }//menu

    public static void listar(Pais contenedor) throws IllegalAccessException {
        Ciudades listar;

        for (int i = 0; i < contenedor.getCantidadActual(); i++) {
            listar=contenedor.optener(i);
            StdOut.println("-----------------------------------------------------------");

            StdOut.println("el nombre de la ciudad es :::"+listar.getNombre());
            StdOut.println("el nombre del alcalde es:::"+listar.getAlcande());
            StdOut.println("el idioma es:::"+listar.getIdioma());
            StdOut.println("la cantidad de habitantes son"+listar.getCantidadDeHabitante());
            StdOut.println("----------------------------------------------------------------------------");
        }

    }
public static void agregar(Pais contenedor) throws IllegalAccessException {

        StdOut.println(":::::::ingrese los datos para agregar:::::::");
        StdOut.println("ingrese el nombre de la ciudad");
        String nombre=StdIn.readLine();
        StdOut.println("ingrese el nombre del alcalde");
        String nombreAlcalde=StdIn.readLine();
        StdOut.println("ingrese el IDIOMA");
        String idioma=StdIn.readLine();
        int cantidadDeHabitantes;
        cantidadDeHabitantes=LeerDatos("ingrese la cantidad de habitantes");


        Ciudades nuevaCiudad=new Ciudades(nombre,nombreAlcalde,idioma,cantidadDeHabitantes);
        contenedor.agregar(nuevaCiudad);

}
public static  void eliminar(Pais contenedor){
        StdOut.println("ingrese el nombre de la ciudad a eliminar");
        String nombreCiudad=StdIn.readLine();

        if (contenedor.eliminar(nombreCiudad)){
            StdOut.println("LA CIUDAD:::"+nombreCiudad+":::"+ "ah sido eliminada con eito");
        }
        else {
            StdOut.println("la ciudad no fue encontrada");
        }

}
public static void buscar(Pais contenedor) throws IllegalAccessException {

        StdOut.println("ingrese el nombre de la ciudad ");
        String nombre=StdIn.readLine();

        int pocicion=contenedor.buscar(nombre);

        if(pocicion!=-1){
            Ciudades ENCONTRAR=contenedor.optener(pocicion);

           StdOut.println("nombre"+ENCONTRAR.getNombre());

        }

}

public static int LeerDatos(String frace){
        while (true){
            StdOut.println(frace);
            String edadComoString=StdIn.readLine();

            if (esNumerico(edadComoString)){
                return Integer.parseInt(edadComoString);
            }

        }

}

public static boolean esNumerico(String edadcomoString){
        try {
            Integer.parseInt(edadcomoString);
            return true;
        }
        catch (NumberFormatException exception){
            StdOut.println("el valor::::::::"+edadcomoString+":::::::: no es numerico");
            return false;
        }

}


}
