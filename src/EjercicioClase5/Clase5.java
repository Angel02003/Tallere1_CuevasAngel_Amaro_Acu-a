package EjercicioClase5;

import ucn.StdIn;
import ucn.StdOut;

public class Clase5 {
    public static void main(String[]args) throws IllegalAccessException {


        int valores;
        valores=leerDatos("ingrese los valores");
        ListaCiudad contenedor =new ListaCiudad(valores);
        menuPrincipal(contenedor);




    }



    public static void menuPrincipal(ListaCiudad contenedor) throws IllegalAccessException {

        boolean verificador = true;

        while (verificador) {

            StdOut.println("eliga una de las siguientes opcciones");
            StdOut.println("[1] listar valores");
            StdOut.println("[2] agrear ciudad");
            StdOut.println("[3] eliminar ciudad");
            StdOut.println("[4] buscar ciudad");
            StdOut.println("[5] salir ó terminar");

            String opcion=StdIn.readLine();

            switch (opcion){

                case "1"->listarValore(contenedor);
                case"2"->agregar(contenedor);
                case"3"->  eliminar(contenedor);
                case "4"-> buscar(contenedor);
                case "5"-> verificador=false;
                default -> StdOut.println("opccion no valida");
                }// swhitch

            StdOut.println("adios usuario");

        }//while

    }// menuPrincipal


    public static void listarValore(ListaCiudad contenedor) throws IllegalAccessException {
        Ciudad listar;

        for (int i = 0; i < contenedor.getCantidadActual(); i++) {
           listar=contenedor.optener(i);
           StdOut.println("---------------------------------------------------------------------------");
            StdOut.println("el nombre de la ciudad es"+"::::"+listar.getNombreCiudad());
            StdOut.println("el nombre del alcalde es"+"::::"+listar.getAlcalde());
            StdOut.println("el idioma hablado es"+"::::"+listar.getIdioma());
            StdOut.println("la cantidad de habitantes es "+"::::"+listar.getCantidadDeHabitantes());
            StdOut.println("--------------------------------------------------------------------------");
        }


    }
    public static void agregar(ListaCiudad contenedor) throws IllegalAccessException {

        StdOut.println(":::ingrese los valores:::");
        StdOut.println("ingrese el nombre de la ciudad");
        String nombre=StdIn.readLine();
        StdOut.println("ingrese el nombre del alcalde");
        String alcalde=StdIn.readLine();
        StdOut.println("ingrese el idioma");
        String idioma=StdIn.readLine();
        int cantidaDeHabitante;
        cantidaDeHabitante=leerDatos("ingrese la cantidad de habitantes");

        Ciudad nuevaCiudad=new Ciudad(nombre,alcalde,idioma,cantidaDeHabitante);
        contenedor.agregar(nuevaCiudad);

    }
    public static void eliminar(ListaCiudad contenedor){

        StdOut.println("ingrese el nombre de la ciudad a elimianr");
        String nombreCiudad=StdIn.readLine();

        if (contenedor.eliminar(nombreCiudad)){
            StdOut.println("la ciudad se ha eliminado exitozamente:::"+nombreCiudad);
        }
        else {
            StdOut.println("ciudad no encontrada");
        }

    }


    public static void buscar(ListaCiudad contenedor) throws IllegalAccessException {
        StdOut.println("ingrese el nombre de la ciudad a buscar");
        String nombre=StdIn.readLine();

        int busqueda=contenedor.buscar(nombre);

        if (busqueda!=-1){
            Ciudad envontrado=contenedor.optener(busqueda);

            StdOut.println("el nombre de la ciudad es"+envontrado.getNombreCiudad());
            StdOut.println("el nonmbre del alcalde es"+envontrado.getAlcalde());
            StdOut.println("el idioma de la aciudad es"+envontrado.getIdioma());
            StdOut.println("la cantidad de habitantes de la ciudad es "+envontrado.getCantidadDeHabitantes());

        }

    }
    public static int leerDatos(String frace) {
        while (true) {
            StdOut.println(frace);
            String edadComoString = StdIn.readLine();

// primero se rea el sub programa del bolean

            if (EsNumerico(edadComoString)) {
                return Integer.parseInt(edadComoString);
            }
        }
    }

    // bolan
    public static boolean EsNumerico(String edadComoString) {
        try {
            Integer.parseInt(edadComoString);
            return true;
        } catch (NumberFormatException exception) {
            StdOut.println("el valor ingresado" + "----" + edadComoString + "----" + "no es numerico intente nuevamente");
            return false;
        }
    }
}
