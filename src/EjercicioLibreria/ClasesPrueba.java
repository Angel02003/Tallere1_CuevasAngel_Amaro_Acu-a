package EjercicioLibreria;

import ucn.StdIn;
import ucn.StdOut;

public class ClasesPrueba {
    public static void main(String[]args) throws IllegalAccessException {

ListaLibro contenedor=new ListaLibro(999999999);
MenuPrincipal(contenedor);


    }
    public static void MenuPrincipal(ListaLibro contenedor) throws IllegalAccessException {

        boolean vericicacion=true;

        while (vericicacion){

            StdOut.println("ingrese una de las siguientes opcciones");
            StdOut.println("[1]Listar libros");
            StdOut.println("[2]buscar libro por ISBN");;
            StdOut.println("[3]Listar libros por genero");
            StdOut.println("[4]eliminar Libros");
            StdOut.println("[5]salir");

            String opccionElegida= StdIn.readLine();

            switch (opccionElegida){

                case "1"->listarLibro(contenedor);
                case "2"->buscarLibro(contenedor);
                case "3"->listarGenero(contenedor);
                case "4"->eliminar(contenedor);
                case "5"-> vericicacion=false;
            }//switch

        }//while

    }//MenuPrincipal

    public static void listarLibro(ListaLibro contenedor) throws IllegalAccessException {

        Libro listar;

        for (int i = 0; i < contenedor.getCantidadActual(); i++) {
            listar=contenedor.optener(i);

            StdOut.println("-----------------------------------------------------------------------------");
            StdOut.println("el isbn del libro es ::::::"+listar.getIsbn()+"::::::::::");
            StdOut.println("el nombre del libro es :::::"+listar.getNombreLibro()+"::::::::");
            StdOut.println("el autor del libro es :::::::"+listar.getNombreAutor()+"::::::::::");
            StdOut.println("el genero del libro es ::::::::"+listar.getGeneroLibro()+":::::::::::");
            StdOut.println("el carril en cual se encuentra es :::::::"+listar.getCarril()+":::::::::");
            StdOut.println("-----------------------------------------------------------------------------");

        }
    }

    public static void buscarLibro(ListaLibro contenedo) throws IllegalAccessException {

        StdOut.println("ingrese el isbn a buscacar");
        String ISBN=StdIn.readLine();

        int pocicion= contenedo.buscar(ISBN);

        if (pocicion!=-1) {
            Libro encontrado = contenedo.optener(pocicion);

            if (encontrado.getCantidadPaginas()<=150){
                encontrado.setCarril("se encuentra en el carril superior");
            }
            if (encontrado.getCantidadPaginas()>=151 || encontrado.getCantidadPaginas()<400){
                encontrado.setCarril("se encuentra en el carril intermedio");
            }

            if (encontrado.getCantidadPaginas()>=401){
                encontrado.setCarril("se encuentra en el carril inferrior");
            }

            StdOut.println("-----------------------------------------------------------------------------");
            StdOut.println("se an encontrado el isbn ::::::" + encontrado.getIsbn() + "::::::");
            StdOut.println("se an encontrado el nombre del libro ::::::" + encontrado + ":::::::");
            StdOut.println("se ah encontrado" + encontrado.getNombreAutor() + ":::::::");
            StdOut.println("se an encontrado el genero del libro" + encontrado.getGeneroLibro() + ":::::::");
            StdOut.println("se ah encontrado la pocicion del estante:::::" + encontrado.getCarril() + "::::::");
            StdOut.println("-----------------------------------------------------------------------------");

        }

        else {
            StdOut.println("el libro no ha sido encontrado con extito intente nuevamente");
        }

    }

    public static void listarGenero(ListaLibro contenedor){

    }

    public static void eliminar(ListaLibro contenedor){

      StdOut.println("ingrese el isbn a eliminar ");
       String eliminar=StdIn.readLine();

        if (contenedor.eliminar(eliminar)){
            StdOut.println("el libro::::::"+eliminar+":::::: ah sido eliminado con exito");
        }
        else {
            StdOut.println("el libro no ha sido encontrado con extito intente nuevamente");
        }

    }
}
