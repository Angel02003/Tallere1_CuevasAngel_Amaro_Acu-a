package Ayudantias.ayudantia2.CodigoAyudantia2;

import ucn.StdIn;
import ucn.StdOut;

public class CodigoAyudantia2 {
    public static void main(String[]args){

        ListaUsuario contenedorUsuario=new ListaUsuario(999);
        ListaPelicula contenedorPelicula=new ListaPelicula(999);
        ListaLibro contenedorLibro=new ListaLibro(999);


        MenuPrincipal(contenedorUsuario,contenedorLibro,contenedorPelicula);


    }

    public static void MenuPrincipal(ListaUsuario contenedorUsuario,ListaLibro contenedorLibro,ListaPelicula contenedorPeliculas){

        boolean verificaicion=true;

        while (verificaicion){

            StdOut.println("ingrese una de las siguientes opcciones ");
            StdOut.println("[1] para agregar ususario");
            StdOut.println("[2] para listar usuario");
            StdOut.println("[3] buscar usuario");
            StdOut.println("[4] eliminar usuario");
            StdOut.println("--------------------------------");
            StdOut.println("[5] agregar libro");
            StdOut.println("[6] listar libros");
            StdOut.println("[7] buscar libro");
            StdOut.println("[8] eliminar libro");
            StdOut.println("--------------------------------");
            StdOut.println("[9] agregar pelicula");
            StdOut.println("[10] listar pelicula ");
            StdOut.println("[11] abuscar pelicula");
            StdOut.println("[12] eliminar pelicula");
            StdOut.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::");
            StdOut.println("[13] PARA SALIR");

            String opccion= StdIn.readLine();

            switch (opccion){

                case "1"->agregarUsuario(contenedorUsuario);
                case "2"->litarUsuario(contenedorUsuario);
                case "3"->abuscarUsuario(contenedorUsuario);
                case "4"->eliminarUsuario(contenedorUsuario);
                case "5"->agregarLibros(contenedorLibro);
                case "6"->listarLibros(contenedorLibro);
                case "7"->buscarLibros(contenedorLibro);
                case "8"->eliminarLibros(contenedorLibro);
              case  "13"-> verificaicion=false;



            }// swich
        }// while
    }// void





    public static void agregarUsuario(ListaUsuario contenedorUsuario){

StdOut.println("::::::::::ingrese los datos del nuevo usuario::::::::");

StdOut.println("ingrese el nombre del usuario");
String nombre=StdIn.readLine();
StdOut.println("ingrese el apllido paterno:");
String apellidoPaterno=StdIn.readLine();
StdOut.println("el apellido materno es :");
String appellidoMaterno=StdIn.readLine();
StdOut.println("INGRESE EL rut");
String rut=StdIn.readLine();
StdOut.println("el nombre de usuario es :");
String NOMBREuSUARIO=StdIn.readLine();
StdOut.println("la contraceña es :");
String contraceña=StdIn.readLine();
StdOut.println("el tipo de contraceña es");
String tipoDeContraceña=StdIn.readLine();


Usuario nuevoUsuario=new Usuario(nombre,apellidoPaterno,appellidoMaterno,rut,NOMBREuSUARIO,contraceña,tipoDeContraceña);
contenedorUsuario.agregarUsuario(nuevoUsuario);


    }



    public static void litarUsuario(ListaUsuario contenedorUsuario){

       Usuario listar;

        for (int i = 0; i < contenedorUsuario.getCantidadActualUsuario(); i++) {

            listar=contenedorUsuario.optenerUsuario(i);

            StdOut.println("-------------------------------------------------------------------------------");
            StdOut.println("el nombre del ususario es:::::"+listar.getNombre()+":::::::");
            StdOut.println("el apellido paterno es:::::"+listar.getApellidoPaterno()+":::::::");
            StdOut.println("el apellido materno :::::"+listar.getApellidoMaterno()+":::::::");
            StdOut.println("el rut:::::"+listar.getRut()+":::::::");
            StdOut.println("el nombre de ususario es:::::"+listar.getNombreUsuario()+":::::::");
            StdOut.println("la contraceña es:::::"+listar.getContraceña()+":::::::");
            StdOut.println("el  tipo de contraceña:::::"+listar.getTipoDeContraceña()+":::::::");
            StdOut.println("-------------------------------------------------------------------------------");
        }




    }
    public static void abuscarUsuario(ListaUsuario contenedorUsuario){

        StdOut.println("ingrese el nombre para buscar");
      String busqueda=StdIn.readLine();

      int buscar=contenedorUsuario.buscarUsuario(busqueda);

        if (buscar!=-1){
            Usuario encontrado=contenedorUsuario.optenerUsuario(buscar);

            StdOut.println("el nombre es ::::"+encontrado.getNombre());
            StdOut.println("el apellido paterno es :::::"+ encontrado.getApellidoPaterno());
             StdOut.println("el apellido materno es :::::"+ encontrado.getApellidoMaterno());
             StdOut.println("el rut es :::::"+ encontrado.getRut());
             StdOut.println("el nombre De Usuario :::::"+ encontrado.getNombreUsuario());
             StdOut.println("la contraceña es :::::"+ encontrado.getContraceña());
             StdOut.println("el tipo de contraceña :::::"+ encontrado.getTipoDeContraceña());

        }


    }
    public static void eliminarUsuario(ListaUsuario contenedorUsuario){
StdOut.println("INGRESE EL NOMBRE A ELIMINAR");
 String nombreAHEliminar=StdIn.readLine();

 if (contenedorUsuario.eliminarUsuario(nombreAHEliminar)){
     StdOut.println("el usuario::::::: ah sido eliminado con exito::::::");
 }
 else {
     StdOut.println("::::: el usuario no se encontro intente nuevamente::::::");
 }
    }


    public static void listarLibros(ListaLibro contenedorLibro){
        Libros listar;

        for (int i = 0; i < contenedorLibro.getCantidadActualLibros(); i++) {
            listar=contenedorLibro.optenerLibro(i);

            StdOut.println("------------------------------------------------------------------------------------");
            StdOut.println("la ide del libro es"+listar.getIdLibro());
            StdOut.println("el titulo del libro es "+ listar.getTituloLibro());
            StdOut.println("el autor del libro es "+ listar.getAutor());
            StdOut.println("el genero 1 del libro es "+ listar.getGenero1());
            StdOut.println("el genero 2 del libro es "+ listar.getGenero2());
            StdOut.println("la cantidad de paginas del libro es "+ listar.getCantidadPaginas() );
            StdOut.println("el anio de publicacion del libro es "+ listar.getAnioDePublicacion());
            StdOut.println("el stock del libro es "+ listar.getStock());
            StdOut.println("------------------------------------------------------------------------------------");

        }



    }
    public static void agregarLibros(ListaLibro contenedorLibro){

        StdOut.println("ingrese la ida del libro");
        String idLibro=StdIn.readLine();
        StdOut.println("ingrese el titulo del libro ");
        String tituloLibro=StdIn.readLine();
        StdOut.println("ingrese el autor del libro ");
        String autorLibro=StdIn.readLine();
        StdOut.println("ingrese el genero 1 de libro ");
        String genero1=StdIn.readLine();
        StdOut.println("ingrese el genero 2 del libro");
        String genero2=StdIn.readLine();
       int cantidadPagina= verificacion("ingrese la cantidad de paginas");
       int anioDePublicacio=verificacion("ingrese el anio de publicacion");
       int stock=verificacion("ingrese el stock del libro");

       Libros nuevoLibro=new Libros(idLibro,tituloLibro,autorLibro,genero1,genero2,cantidadPagina,anioDePublicacio,stock);
       contenedorLibro.agregarLibro(nuevoLibro);

    }
    public static void buscarLibros(ListaLibro contenedorLibro){
        StdOut.println("ingrese el titulo del libro ");
        String tituloLibro=StdIn.readLine();

        int pocicion=contenedorLibro.buscarLibro(tituloLibro);

        if (pocicion!=1) {
            Libros encontrado = contenedorLibro.optenerLibro(pocicion);

            StdOut.println("------------------------------------------------------------------------------------");
            StdOut.println("la ida del libro es"+encontrado.getIdLibro());
            StdOut.println("el titulo del libro es "+encontrado.getTituloLibro());
            StdOut.println("el autor del libro es"+encontrado.getAutor());
            StdOut.println("el genero 1 del libro es"+ encontrado.getGenero1());
            StdOut.println("el genero 2 del libro es" + encontrado.getGenero2());
            StdOut.println("la cantidad de paginas del libro es "+encontrado.getCantidadPaginas());
            StdOut.println("el anio de publicacion es "+ encontrado.getAnioDePublicacion());
            StdOut.println("el stock del libro es "+ encontrado.getStock());
            StdOut.println("------------------------------------------------------------------------------------");

        }


    }






    public static void eliminarLibros(ListaLibro contenedorLibro){
        StdOut.println("ingrese el titulo del libro a eliminar");
        String eliminar=StdIn.readLine();

        if (contenedorLibro.eliminarLibro(eliminar)){
            StdOut.println("EL LIBRO DE NOMBRE:::::"+eliminar+"::::::ah sido eliminado on exito");
        }
        else {
            StdOut.println("el libro no se ah podido eliminar o ya se encuentra eliminado");
        }

    }



















    public static int  verificacion(String frece) {
while (true){
        StdOut.println(frece);
        String edadComostring = StdIn.readString();

        if (esNumerico(edadComostring)) {
            return Integer.parseInt(edadComostring);
        }
      }
    }


    public static boolean esNumerico(String edadComostring){

        try {
            Integer.parseInt(edadComostring);
            return true;
        }
        catch (NumberFormatException exception){
            StdOut.println("lo ingresado como ::::::::"+edadComostring+"::::::: no es un factor numerico");
            return false;
        }


    }





}// clase final
