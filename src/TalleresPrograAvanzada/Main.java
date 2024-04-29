package Unidad1.EjercicioTaller;

import Unidad1.EjercicioVeterinario.Listaveterinariop;
import Unidad1.EjercicioVeterinario.veterinariop;
import ucn.ArchivoEntrada;
import ucn.In;
import ucn.StdIn;
import ucn.StdOut;

import javax.swing.text.View;
import java.util.Optional;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;




public class Main {
    public static void main(String[]args){


  ListaEmpleado contenedorEmpleado=new ListaEmpleado(9999);
  ListaCliente contenedorCliente=new ListaCliente(9999);
  ListaVideoJuegos contenedorVideoJuegos=new ListaVideoJuegos(9999);

       contenedorVideoJuegos.lecturaDeArchivosVideoJiegos("videojuegos.txt");
       contenedorEmpleado.lecturaDeArcivo("empleados.txt");
        int [] ListaVector={0,0,0};

  menuPrincipal(contenedorEmpleado,contenedorCliente,contenedorVideoJuegos,ListaVector);
    }





    public static void menuPrincipal(ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente ,ListaVideoJuegos contenedorVideoJuegos,int ListaVector[]){

StdOut.println("-------------------------------------------------------------------\n-------------------------------------------------------------------------");

        StdOut.println(" *******************bienbenido al menu**************** \n  *************ingrese una opccion************");
        StdOut.println("///////////////// [1] para iniciar secion /////////////////");
        StdOut.println("///////////////// [2] para cerrar programa /////////////////");
        String opccion= StdIn.readLine();

        ;
        while (true){

            if (opccion.equalsIgnoreCase("1")) {
                    segundomenu(contenedorEmpleado,contenedorVideoJuegos,contenedorCliente,ListaVector);
                    continue;
            } // todo ----> switch

            if (opccion.equalsIgnoreCase("2")){
                break;

            }
            menuPrincipal(contenedorEmpleado,contenedorCliente,contenedorVideoJuegos,ListaVector);
                   StdOut.println(":::: adios usuario  ::::");

           break;
        }// todo ---> while


    }  // todo ---> public static



    public static void segundomenu(ListaEmpleado contenedorEmpleado,ListaVideoJuegos contenedorVideoJuegos,ListaCliente contenedorCliente,int ListaVector[]){

           StdOut.println("ingrese su nombre de usuario /// (Empleado)/// ");
           String nombreUsuario=StdIn.readLine();
           StdOut.println("ingrese su contraceña ////(Empleado)/// ");
           String contraceniaUsuario=StdIn.readLine();



        for (int i = 0; i < contenedorEmpleado.getCantidaActualEmpleado(); i++) {
            if (contenedorEmpleado.optenerEmpleado(i).getNombreDeUsuario().equalsIgnoreCase(nombreUsuario) &&
                    contenedorEmpleado.optenerEmpleado(i).getContraceña().equalsIgnoreCase(contraceniaUsuario)){

                tercermenu(contenedorEmpleado,contenedorVideoJuegos,contenedorCliente,ListaVector);


                }
            }


    }// todo:segudo menu

public static void tercermenu(ListaEmpleado contenedorEmpleado,ListaVideoJuegos contenedorVideoJuegos,ListaCliente contenedorCliente,int ListaVector[]){


    boolean verificador2=true;

    StdOut.println("*****************************************");
    StdOut.println("             Menu Principal              ");
    StdOut.println("*****************************************");

    StdOut.println("[1] para vender videojuego");
    StdOut.println("[2] buscar VideoJuego");
    StdOut.println("[3] MENU ESTADISTICA");
    StdOut.println("[4] cerrar menu");
    StdOut.println("[5] para revisar si se estan guardando los datos del cliente en las listas");
    String opccion=StdIn.readLine();
    while (verificador2){

        switch (opccion){

            case "1"->venderVideojuego(contenedorVideoJuegos,contenedorCliente,contenedorEmpleado,ListaVector);
            case"2"->buscarVideoJuego(contenedorVideoJuegos,contenedorCliente,contenedorEmpleado,ListaVector);
            case"3"->menuEstadistica(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
            case"4"-> menuPrincipal(contenedorEmpleado,contenedorCliente,contenedorVideoJuegos,ListaVector);
            case "5"-> listar(contenedorCliente,contenedorEmpleado,contenedorVideoJuegos,ListaVector);

        }// todo swhitch



    } // todo while verificador2


}
//-------------------------------------------------------------------------------------------------------------------------
public static void  listar (ListaCliente contenedorCliente,ListaEmpleado contenedorEmpleado,ListaVideoJuegos contenedorVieojuego,int ListaVector[]) {

    Cliente listar;

    for (int i = 0; i < contenedorCliente.getCantidadActualCliente(); i++) {
        listar = contenedorCliente.optener(i);

        StdOut.println("______________________________________________________________________________");

        StdOut.println(i + "   " + "El rut del cliente  es ::::" + listar.getRut() + ":::::::::");
        StdOut.println(i + "   " + "El nombre  completo ::::::::" + listar.getNombreCompleto() + ":::::::::");
        StdOut.println(i + "   " + "la CUENTA fue creada ::::::::" + listar.getCuenta() + "::::::::::::::::");
        StdOut.println(i + "   " + "El correo es ::::::::" + listar.getEmail() + ":::::::::::");
        StdOut.println(i + "   " + "El descuento sera del ::::::::::::" + "30% " + ":::::::::::");
        StdOut.println("la canidad por los  juegos es   " + listar.getVenta());

        StdOut.println("------------------------------------------------------------------------------");


    }
    tercermenu(contenedorEmpleado, contenedorVieojuego, contenedorCliente,ListaVector);

}

    //---------------------------------------------------------------------------------------------------------------------------
                                            // todo: vende videojuego
    public static void venderVideojuego(ListaVideoJuegos contenedorVideoJuegos,ListaCliente contenedorCliente,ListaEmpleado contenedorEmpleado,int ListaVector[]) {

            int contador=0;

        StdOut.println("ingrese el nombre del videojuego");
        String nombreVideojuego = StdIn.readLine();

        for (int i = 0; i < contenedorVideoJuegos.getCantidadActualVideojuegos(); i++) {
            if (contenedorVideoJuegos.optener(i).getNombreVideoJuego().equalsIgnoreCase(nombreVideojuego)) {

                StdOut.println("ustes es mienbro de la tienda");
                StdOut.println("[1] para si , si no esta como mienbro aprete 2 para agregarse");
                StdOut.println("[2] para no");
                String opccion = StdIn.readLine();

                if (opccion.equalsIgnoreCase("1")) {
                    StdOut.println("ingrese su rut, (Si no es mienbro lo regresara denuevo a la parte de videojuego a llevar)");
                    String rut=StdIn.readLine();

                    Cliente clienteActual;
                    Empleado empleadoActual;
                    VideoJuegos videoJuegosActual;
                    for (int j = 0; j < contenedorCliente.getCantidadActualCliente(); j++) {
                         clienteActual=contenedorCliente.optener(j);
                          empleadoActual=contenedorEmpleado.optenerEmpleado(j);
                          videoJuegosActual=contenedorVideoJuegos.optener(j);
                        if (clienteActual.getRut().equalsIgnoreCase(rut)){

                            double precioVideojuego = (contenedorVideoJuegos.optener(i).getPrecioVideoJuego()) - (contenedorVideoJuegos.optener(i).getPrecioVideoJuego() * 0.3);
                            String plataforma=videoJuegosActual.getPlataforma();

                            double comicion=precioVideojuego*0.02;

                            if (plataforma.equalsIgnoreCase("multiplataforma")){
                                ListaVector[0]++;
                                ListaVector[1]++;
                                ListaVector[2]++;
                            }

                            if (plataforma.equalsIgnoreCase("xbox")){

                                ListaVector[0]++; // todo: sumo 1(++)==> en la posicion 1 del vector
                            }

                            if (plataforma.equalsIgnoreCase("Nintendo")){
                                ListaVector[1]++;// todo: sumo 1(++)==> en la posicion 2 del vector
                            }
                            if (plataforma.equalsIgnoreCase("Playstation")){
                                ListaVector[2]++;// todo: sumo 1(++)==> en la posicion 3 del vector
                            }

                            clienteActual.setVenta(clienteActual.getVenta()+precioVideojuego);
                            empleadoActual.setComicion(empleadoActual.getComicion()+comicion);

                            StdOut.println("el videojuego fue vendido por   " + precioVideojuego);
                            tercermenu(contenedorEmpleado, contenedorVideoJuegos, contenedorCliente,ListaVector);

                        }else {
                            StdOut.println("lo siento, pero el rut no pertenece en el sistema ");
                        }
                    }

                } //  todo:llave if

                if (opccion.equalsIgnoreCase("2")) {
                    StdOut.println("como no es mienbro le gustaria convertirce en uno");
                    StdOut.println("[1] para si, si se combierte en mienbro tendra un 30% de descuento en la compra ");
                    StdOut.println("[2] para no, si decide que no sera regresado al videojuego a preguntar");
                    String opccion2 = StdIn.readLine();

                    if (opccion2.equalsIgnoreCase("1")) {

                        StdOut.println("ingrese su rut");
                        String rut = StdIn.readLine();
                        StdOut.println("ingrese su nombre completo");
                        String nombreCompleto = StdIn.readLine();
                        StdOut.println("ingrese su dirección de correo");
                        String direccion = StdIn.readLine();


                        Cliente nuevoCliente = new Cliente("", nombreCompleto, rut, direccion, 0,0);
                        contenedorCliente.agregar(nuevoCliente);

                        StdOut.println("ingrese 1 para voler al menu Principal");
                        String opccion3 = StdIn.readLine();

                        if (opccion3.equalsIgnoreCase("1")) {
                            tercermenu(contenedorEmpleado, contenedorVideoJuegos, contenedorCliente,ListaVector);
                        }
                        else {
                            StdOut.println("estimado usuario usted se equivoco de opccion, pero igual lo regresaremos al menu principal");
                            tercermenu(contenedorEmpleado,contenedorVideoJuegos,contenedorCliente,ListaVector);
                        }

                    }//todo: if

                    else {
                        StdOut.println("entendemos su decicion");
                    }//todo: else
                }// todo:else


            }// todo: if


        } // todo: fori


    }// todo: vender

    //---------------------------------------------------------------------------------------------------------------------------
                                            // TODO: buscar
    public static void buscarVideoJuego(ListaVideoJuegos contenedorVideoJuegos,ListaCliente contenedorCliente,ListaEmpleado contenedorEmpleado,int ListaVector[]){

        StdOut.println("ingrese el nombre del videojuego que quiere buscar");
        String nombreAhBuscar=StdIn.readLine();

        int buscar= contenedorVideoJuegos.buscarvideojuego(nombreAhBuscar);

        if (buscar!=-1){
         VideoJuegos encontrado=contenedorVideoJuegos.optener(buscar);

         StdOut.println("--------------------------------------------------------------------------");

         StdOut.println("El codigo del videojuego es:  "+encontrado.getCodigo());
         StdOut.println("El nombre del videojuego es:  "+ encontrado.getNombreVideoJuego());
         StdOut.println("El precio del videojuego es:  "+encontrado.getPrecioVideoJuego());
         StdOut.println("El genero del videojuego es: "+encontrado.getGeneroVideoJuego());
         StdOut.println("la clasificacion del videojuego es:  "+encontrado.getClasificacion());
         StdOut.println("El desarrollo del videojuego es:  "+encontrado.getDesarrollo());
        StdOut.println("La plataforma es:  "+ encontrado.getPlataforma());



         StdOut.println("--------------------------------------------------------------------------");

         tercermenu(contenedorEmpleado,contenedorVideoJuegos,contenedorCliente,ListaVector);

        }//todo : if


    }// todo : bucar

//---------------------------------------------------------------------------------------------------------------------------------
                                                     // todo: menu estadistica
    public static void menuEstadistica(ListaVideoJuegos contenedorVideoJuegos, ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente,int ListaVector[]){

        StdOut.println("[1] para ver el videojuego más vendido");
        StdOut.println("[2]para plataforma con mayor ventas");
        StdOut.println("[3]ventas de clientes registrados");
        StdOut.println("[4]imprimir ventas totales");
        StdOut.println("[5]trabajador con mas ventas");
        StdOut.println("[6]regresar  menu anterior");
        String opccion=StdIn.readLine();

        boolean verificador3=true;

        while (verificador3) {
            switch (opccion) {

                case"1"->videojuegoMasVentido(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
                case"2"->PlataformaConMasVentas(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
                case"3"->ventasclientesRegistrado(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
                case"4"->imprimirVentasTotales(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
                case "5"-> trabajadorConMasVentas(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
                case"6"->tercermenu(contenedorEmpleado,contenedorVideoJuegos,contenedorCliente,ListaVector);


            } // todo: switch
        }// todo: while

    }  // todo menu 3


    public static void  videojuegoMasVentido(ListaVideoJuegos contenedorVideoJuegos, ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente,int ListaVector[]){

        int [] ListaVectorMasdVendido={0,0,0,0,0,0,0,0,0,0};


       menuEstadistica(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);

    }


    public static void PlataformaConMasVentas(ListaVideoJuegos contenedorVideoJuegos, ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente,int ListaVector[]){

        StdOut.println("holasd" );

            if (ListaVector[0]>ListaVector[1] && ListaVector[0]>ListaVector[1]){
                StdOut.println("La plataforma xbox fue la mas vendida  "+ListaVector[0]);
            }
        StdOut.println("holasd" );

         if (ListaVector[1]>ListaVector[0] && ListaVector[1]>ListaVector[2]){
                StdOut.println("La plataforma nintendo fue la mas vendida con  "+ ListaVector[1]);
            }

        StdOut.println("holasd" );
           if (ListaVector[2]>ListaVector[1] && ListaVector[2]>ListaVector[0]){
                StdOut.println("La plataforma Playstation fue la mas vendida con  "+ListaVector[2]);
            }


           menuEstadistica(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);

        }


    public static void ventasclientesRegistrado(ListaVideoJuegos contenedorVideoJuegos, ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente,int ListaVector[]){

               StdOut.println("Lo siento ayudante, pero no se nos ocurrio como resolverlo\n se le giara al menu Estadistica");
            menuEstadistica(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);

    }

    public static void imprimirVentasTotales(ListaVideoJuegos contenedorVideoJuegos, ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente,int ListaVector[]){
        Cliente listar;

        for (int i = 0; i < contenedorCliente.getCantidadActualCliente(); i++) {
            listar=contenedorCliente.optener(i);

            StdOut.println("______________________________________________________________________________");

            StdOut.println("la canidad por los  juegos es   "+ listar.getVenta());

            StdOut.println("------------------------------------------------------------------------------");
        }
        menuEstadistica(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
    }

    public static void trabajadorConMasVentas(ListaVideoJuegos contenedorVideoJuegos, ListaEmpleado contenedorEmpleado,ListaCliente contenedorCliente,int ListaVector[]){
       Empleado listar;

        for (int i = 0; i < contenedorEmpleado.getCantidaActualEmpleado(); i++) {
            listar=contenedorEmpleado.optenerEmpleado(i);

            StdOut.println("______________________________________________________________________________");
            StdOut.println("el empleado"+listar.getNombreDeUsuario());
            StdOut.println("la canidad por los  juegos es   "+ listar.getComicion());

            StdOut.println("------------------------------------------------------------------------------");
        }
        menuEstadistica(contenedorVideoJuegos,contenedorEmpleado,contenedorCliente,ListaVector);
    }



} // todo---> main final
