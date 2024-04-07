package veterianarias;
import ucn.StdIn;
import ucn.StdOut;
public class Veterinaria {
    public static void main(String[] args) {

        Almoadiata datos;

        datos = OptenerDatos();


        datosveterinaria(datos);


        if (datos.getRazonDeVisita().equalsIgnoreCase("Enfermo")) {

            datos.setRazonDeVisita("enfermo");
        }

        if (datos.getRazonDeVisita().equalsIgnoreCase("cirugia")) {
       procedimientoQuirurjico(datos);
        }

    }

    public static Almoadiata OptenerDatos() {


        String nombreDeLaMasota;
        String NombreDeLdUEÑO;
        int edad;
        String especieAnimal;
        String razonDeVisita;
        String estadoDelAnimal;

        StdOut.println("nombre da su mascota" + ":");
        nombreDeLaMasota = StdIn.readLine();

        StdOut.println("nombre Del Duemio" + ":");
        NombreDeLdUEÑO = StdIn.readLine();

        edad = leerDatos("INGRESE SU EDAD" + ":");

        StdOut.println("Especie del animal" + ":");
        especieAnimal = StdIn.readLine();

        razonDeVisita=SubMenuDeVisitas();

        estadoDelAnimal = "ingresado";


        return new Almoadiata(nombreDeLaMasota, NombreDeLdUEÑO, edad, especieAnimal, razonDeVisita, estadoDelAnimal);

    }

// comprobar los datos

    public static int leerDatos(String frace) {
        while (true) {
            StdOut.println(frace);
            String edadComoString = StdIn.readLine();

// primero se rea el sub programa del bolean

            if (EsNumerico(edadComoString)) {
                return Integer.parseUnsignedInt(edadComoString);
            }
        }
    }


    // bolan

    public static boolean EsNumerico(String edadComoString) {
        try {
            Integer.parseUnsignedInt(edadComoString);
            return true;
        } catch (NumberFormatException exception) {
            StdOut.println("el valor ingresado" + "----" + edadComoString + "----" + "no es numerico intente nuevamente");
            return false;
        }
    }


    public static String SubMenuDeVisitas() {

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
                return "revicion";
            }
            default -> StdOut.println("ingrese una opccion valida");
        }
    }
}



    public static void datosveterinaria( Almoadiata datos) {

        StdOut.println("----------------------------------------------------------------------------------------------");

        StdOut.println("el nombre de la mascota es" + ":"+datos.getNombreDeLaMasota());
        StdOut.println("el nombre del duenio es" + ":"+datos.getNombreDeLdUEÑO());
        StdOut.println(" la edad de la mascota es" + ":"+datos.getEdad());
        StdOut.println("la especie del animal" + ":"+datos.getEspecieAnimal());
        StdOut.println("la razon de visita es" + ":"+datos.getRazonDeVisita());
        StdOut.println("el estado del animal es"+":"+datos.getEstadoDelAnimal());



        StdOut.println("-----------------------------------------------------------------------------------------------");

    }

    public static void procedimientoQuirurjico(Almoadiata mascotaIngresada ){

        int numero=(int) (Math.random()*100+1);

        if (numero< 50){
            StdOut.println("el procedimiento ha fallado ");
            mascotaIngresada.setEstadoDelAnimal("fallecido");
        }
        if (numero>50){
            StdOut.println("el procedimiento ha sido un exito");
            mascotaIngresada.setEstadoDelAnimal("la mascota ha sobrevivido");
        }


    }

}