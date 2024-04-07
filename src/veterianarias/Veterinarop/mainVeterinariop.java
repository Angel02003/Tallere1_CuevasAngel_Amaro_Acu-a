package veterianarias.Veterinarop;

import TodoCodeHerenciaClase6.Empleado;
import ucn.StdIn;
import ucn.StdOut;

public class mainVeterinariop {
    public static void main(String[] args) {

        Listaveterinariop contenedorVeterinario=new Listaveterinariop(9999999);

        MenuPrincipal(contenedorVeterinario);



    }

    public static void  MenuPrincipal(Listaveterinariop contenedorVeterinario){
        boolean verificar=true;

        while (verificar){

            StdOut.println("::::::::::bienbenido al menu principal eliga una de la siguiente opcion::::::::::::");

            StdOut.println("[1] PARA LISTAR A LAS MASCOTAS");
            StdOut.println("[2] PARA BUSACAR UNA MASCOTA");
            StdOut.println("[3] PARA AGREGAR A UNA MASCOTA");
            StdOut.println("[4] PARA ELIMINAR A UNA MASCOTA");
            StdOut.println("[5] PARA SALIR DE LA SESION");

            String opccion=StdIn.readLine();

            switch (opccion){

                case "1"->listar(contenedorVeterinario);
                case "2"->buscar(contenedorVeterinario);
                case "3"->agregar(contenedorVeterinario);
                case "4"->eliminar(contenedorVeterinario);
                case "5"-> verificar=false;

                default -> StdOut.println("la opccion eleguida no es valida");
            }

        }
        StdOut.println(":::::::::::::gracias por todo adios usuario::::::::::::::::::::" );

    }


    public static void  listar (Listaveterinariop contenedorVeterinario){

        veterinriop1 listar;

        for (int i = 0; i < contenedorVeterinario.getCantidadActual(); i++) {
            listar=contenedorVeterinario.optener(i);

            StdOut.println("______________________________________________________________________________");

            StdOut.println("el nombre de la mascota es ::::"+ listar.getNombreMascota()+":::::::::");
            StdOut.println("el nombre del dienio es ::::::::"+ listar.getNombreDuenio()+":::::::::");
            StdOut.println("la edad de la mascota es ::::::::"+ listar.getEdad()+"::::::::::::::::");
            StdOut.println("la especie del animal es ::::::::" + listar.getEspecieAnimal()+":::::::::::");
            StdOut.println("la razon de visita es ::::::::::::" + listar.getRazonDeVisita()+":::::::::::");
            StdOut.println("el estado de la mascota es "+ listar.getEstadoAnimal());
            StdOut.println("------------------------------------------------------------------------------");

        }


    }


    public static void buscar (Listaveterinariop contenedorVeterinario){

        StdOut.println("ingrese el nombre de la mascota");
        String nombreMascota=StdIn.readLine();

        int buscar=contenedorVeterinario.buscar(nombreMascota);

        if (buscar!=-1){
            veterinriop1 encontrado=contenedorVeterinario.optener(buscar);

            StdOut.println("-------------------------------------------------------------------------");

            StdOut.println("el nombre de la mascota buscada es :::::"+ encontrado.getNombreMascota());
            StdOut.println("el nombre del duenio encontrado es ::::::"+ encontrado.getNombreDuenio());
            StdOut.println("la edad de la mascota encontrada es ::::::"+ encontrado.getEdad());
            StdOut.println("la especie de la mascota encontrada es :::::"+ encontrado.getEspecieAnimal());
            StdOut.println("la razon de la mascota encontrada es :::::::"+ encontrado.getRazonDeVisita());
            StdOut.println("el estado de la mascota es "+ encontrado.getEstadoAnimal());

            StdOut.println("------------------------------------------------------------------------");
        }

    }
    public static void  agregar (Listaveterinariop contenedorVeterinario){


        StdOut.println("ingrese el nombre de la mascota");
        String nombreMascota=StdIn.readLine();
        StdOut.println("ingrese el nombre del dienio");
        String nombreDuenio=StdIn.readLine();
        int  edadMascota=verificacionNumerica("ingrese la edad de la mascota");
        StdOut.println("ingrese la especie de la mascota");
        String especieMascota=StdIn.readLine();
        StdOut.println("ingresa la razon de visita");
        String razonDeVisita=StdIn.readLine();

        String estadoAnimal=estadoMascota();


        veterinriop1 nuevaMascota=new veterinriop1(nombreMascota,nombreDuenio,edadMascota,especieMascota,razonDeVisita,estadoAnimal);
        contenedorVeterinario.agregar(nuevaMascota);

    }



    public static void  eliminar (Listaveterinariop contenedorVeterinario){

        StdOut.println("ingrese el nombre de la mascota");
        String nombreMascota=StdIn.readLine();

        if (contenedorVeterinario.eliminar(nombreMascota)){
            StdOut.println("La mascota "+ nombreMascota +" ah sido eliminada con exito");
        }
        else {
            StdOut.println("la mascota no fue encontrada intente nuevamente ");
        }

    }

    public static int verificacionNumerica (String frace){

        while (true){

            StdOut.println(frace);
            String edadComoString=StdIn.readLine();

            if (esNumerico(edadComoString)){

                return Integer.parseInt(edadComoString);
            }
        }
    }

    public static boolean esNumerico(String edadComoString){

        try {
            Integer.parseInt(edadComoString);
            return true;
        }catch (NumberFormatException exception){
            StdOut.println("lo ingresado como ::::"+ edadComoString+"::::::: no es un factor numerico");
        }
        return false;
    }



    public static  String estadoMascota(){

        while (true){

            StdOut.println("ingrese el estado de la mascota");
            StdOut.println("[1] enfermo");
            StdOut.println("[2] cirujia");
            StdOut.println("[3] revicion");
            int estado=StdIn.readInt();

            switch (estado){

                case 1 -> {
                    return "enfermedad";
                }
                case 2->{
                    return "cirujia";
                }
                case 3-> {
                    return "revicion";
                }
                default -> StdOut.println("la opccion ingresada no es valida");
            }

        }

    }
}
