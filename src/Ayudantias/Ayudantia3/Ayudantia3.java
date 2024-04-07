package Ayudantias.Ayudantia3;

import ucn.StdIn;
import ucn.StdOut;

public class Ayudantia3 {
    public static void main(String[]args) throws IllegalAccessException {

ListaUsuario contenedorUsuario=new ListaUsuario(123);

ListaProducto contenedorProducto=new ListaProducto(123);

MenuPrincipal(contenedorUsuario,contenedorProducto);




    }



    public static void MenuPrincipal(ListaUsuario contenedorUsuario, ListaProducto contenedoProducto) throws IllegalAccessException {

        boolean verificacion=true;

        while (verificacion){

            StdOut.println(":::::::::::::::ingrese una de las siguientes opcciones:::::::::::::::");
            StdOut.println("[1]ver los datos del usuario ordenados alfabeticamente");
            StdOut.println("[2]ver los datos del producto en orden de codigo EAN");
            StdOut.println("[3]crear  ususario");
            StdOut.println("[4] eliminar usuarios (A partir del rut)");
            StdOut.println("[5]crear Producto");
            StdOut.println("[6] eliminar productos(A PARTIR DEL CODIGO ENAN)");
            StdOut.println("[7]vender productos al cliente ");
            StdOut.println("[8] para salir");

            StdOut.println("-------------------------------------------------------------------------------------------");

            String opccionElegiida= StdIn.readLine();

            switch (opccionElegiida){

                case "1"-> datosAlabeticos(contenedorUsuario);
                case "2"-> ordenPorCodigoEnan(contenedoProducto);
                case "3"-> crearUsuario(contenedorUsuario);
                case "4"->eliminarUsuario(contenedorUsuario);
                case "5"->crearProducto(contenedoProducto);
                case "6"->eliminarproducto(contenedoProducto);
                case "7"-> venderProducto(contenedoProducto);
                case "8"-> verificacion=false;

            }//swhitch

        }//while

    }//menu principal


    public static void datosAlabeticos(ListaUsuario contenedorUsuario) throws IllegalAccessException {
        Usuario listar;

        for (int i = 0; i<contenedorUsuario.getCantidadActualUsuario(); i++) {
            listar=contenedorUsuario.optenerUsuario(i);

            StdOut.println("------------------------------------------------------------------------");

            StdOut.println("el nombre del usuario es"+ listar.getNombreUsuario());
            StdOut.println("el apellido del ususario es"+listar.getApellidoUsuario());
            StdOut.println("el rut del ususario es "+listar.getRutUsuario());
            StdOut.println("la menbresia del usuario es"+listar.getMenbresia());

            StdOut.println("-----------------------------------------------------------------------------");
        }

    }

    public static void  ordenPorCodigoEnan(ListaProducto contenedorProducto) throws IllegalAccessException {
        Productos listarProducto;

        for (int i = 0; i < contenedorProducto.getCantidadActualProductos() ; i++) {
            listarProducto=contenedorProducto.optener(i);
            StdOut.println("-----------------------------------------------------------");
            StdOut.println("el codio del producto es:::::"+listarProducto.getEneanCode()+":::::::");
            StdOut.println("el nombre del producto es :::::"+listarProducto.getNombreProducto()+":::::");
            StdOut.println("la menbrecia que tiene es :::::"+listarProducto.getCantidad()+"::::::");

            StdOut.println("-------------------------------------------------------------------");
        }

    }
    public static void crearUsuario(ListaUsuario contenedorUsuario) throws IllegalAccessException {

        StdOut.println("-------------------------------------------------------------------------");

        StdOut.println("::::ingrese los datos den nuevo usuario:::::");
        StdOut.println(":::ingrese el nombre del usuario::::");
        String nombreUsuario=StdIn.readLine();
        StdOut.println("::::ingrese el apellido del usuario::::");
        String apellidoDelUsuario=StdIn.readLine();
        StdOut.println("::::ingrese el rut del ususario::::");
        String rutUsuario=StdIn.readLine();
        StdOut.println("::::ingrese la menbrecia del usuario::::");
        String menbrecia=StdIn.readLine();

        StdOut.println("-------------------------------------------------------------------------");


        Usuario nuevousuario=new Usuario(nombreUsuario,apellidoDelUsuario,rutUsuario,menbrecia);

        contenedorUsuario.agregarUsuario(nuevousuario);

    }
    public static void eliminarUsuario(ListaUsuario contenedorUsuario){

        StdOut.println("ingrese el rut del usuario a eliminar");
        String rutAeliminar=StdIn.readLine();

        if (contenedorUsuario.eliminarUsuario(rutAeliminar)){
            StdOut.println(":::::el usuario::::::"+rutAeliminar+"::::::ah sido eliminado con exito::::");
        }
        else {
            StdOut.println("el dato del usuario ingresado recien no ha sido encontrado");
        }

    }
    public static void crearProducto(ListaProducto contenedorProducto) throws IllegalAccessException {

        StdOut.println(":::::ingrese los datos de los productos que quiere ingresar:::::");

        StdOut.println(":::::ingrese el codigo del producto:::::");
        String codidigoProducto=StdIn.readLine();
        StdOut.println(":::::ingresse el nombre del producto:::::");
        String nombreProducto=StdIn.readLine();
        int cantidadDeProductos;
        cantidadDeProductos=verificacion("ingrese la cantidad de productos a ingresear");

        Productos nuevoProducto=new Productos(codidigoProducto,nombreProducto,cantidadDeProductos);
        contenedorProducto.agregar(nuevoProducto);

    }
    public static void eliminarproducto(ListaProducto contenedorProducto){
        StdOut.println("ingrese el codigo del producto que quiere eliminar");
        String codigoDelProducto=StdIn.readLine();

        if (contenedorProducto.eliminar(codigoDelProducto)){
            StdOut.println("el producto con codigo:::::"+codigoDelProducto+":::::: ah sido eliminado con exito");
        }
        else {
            StdOut.println("::::::el producto no se ah encontrado::::::");
        }


    }
    public static void venderProducto(ListaProducto contenedorProducto){

    }



    public static int verificacion(String frace){
        while (true) {
            StdOut.println(frace);
            String edadcomoString = StdIn.readLine();

            if (esNumerico(edadcomoString)) {
                return Integer.parseInt(edadcomoString);
            }
        }
    }

    public static boolean esNumerico(String edadcomoString){

     try {
         Integer.parseInt(edadcomoString);
         return true;
     }catch (NumberFormatException exception){
         StdOut.println("lo ingresado como :::::::::"+edadcomoString+":::::::: no es un factor numerico");
         return false;
     }
    }



}
