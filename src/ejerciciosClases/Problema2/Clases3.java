package ejerciciosClases.Problema2;

import ucn.StdIn;
import ucn.StdOut;

public class  Clases3 {
    public static void main(String[]args) {


     Almoadita datos;

     datos=OptenerDatos();

     despliege(datos);

     if (datos.getRazonDeVisita().equalsIgnoreCase("enfermedad")){
         datos.setRazonDeVisita("enfermo");
     }
     if (datos.getRazonDeVisita().equalsIgnoreCase("cirugia")){
         procedimiento(datos);
     }

    }

    public static Almoadita OptenerDatos(){

        String nombremascocta;
        String nombreDuenio;
        int edad;
        String especie;
        String razonDeVisita;
        String estado;


        StdOut.println("Ingrese el nomvre del duenio");
        nombreDuenio=StdIn.readLine();

        StdOut.println("ingrese el nombre de la mascota");
        nombremascocta=StdIn.readLine();

        edad=Verificacion("ingrese la edad de la mascota");

        StdOut.println("ingrese la especie del animal");
        especie=StdIn.readLine();


        razonDeVisita=submenu();

        estado="ingresado";

      return new Almoadita(nombreDuenio,nombremascocta,edad,especie,razonDeVisita,estado);
    }


    // no se caiga de manera int=String

    public static int Verificacion(String frace){
        while (true) {
            StdOut.println(frace);
            String edadcomoString = StdIn.readString();

            if (esnumerico(edadcomoString)) {

                return Integer.parseInt(edadcomoString);

            }
        }
    }

    public static boolean esnumerico(String edadcmomString){

        try {
            Integer.parseInt(edadcmomString);
            return true;
        }
        catch (NumberFormatException exception){
            StdOut.println("el valor"+"-------"+edadcmomString+"------"+"no es numerico");
            return false;
        }
    }


    public static String submenu(){
        while (true){

            StdOut.println("ingrese la razon de visita");
            StdOut.println("[1] ENFERMEDAD");
            StdOut.println("[2] CIRUGIA");
            StdOut.println("[3] REVICION");
            int opccion = StdIn.readInt();

            switch (opccion) {
                case 1 -> {
                    return "enfermedad";
                }
                case 2 -> {
                    return "cirugia";
                }
                case 3 -> {
                    return "revision";
                }

                default -> StdOut.println("la opccion no es coreccta");
            }
        }
    }



    public static void despliege(Almoadita dato){
        StdOut.println("el nombre del mascota es "+":"+ dato.getNombreDuenio());
        StdOut.println("el nombre de la duenio es "+":"+ dato.getNombremascocta());
        StdOut.println("la edad es "+":"+ dato.getEdad());
        StdOut.println("la especie es "+":"+ dato.getEspecie());
        StdOut.println("la razon de visita es "+":"+ dato.getRazonDeVisita());

    }

public static void  procedimiento(Almoadita mascotaIngresada) {

    int numero = (int) (Math.random() * 100 + 1);

    if (numero < 50) {
        StdOut.println("el perro ha muerto");
    }
    if (numero > 50) {
        StdOut.println("el perro resucito");
    }


}

}
