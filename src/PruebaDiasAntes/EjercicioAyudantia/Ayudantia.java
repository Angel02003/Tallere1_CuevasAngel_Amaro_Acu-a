package PruebaDiasAntes.EjercicioAyudantia;

import ucn.StdIn;
import ucn.StdOut;

import java.util.Collections;

public class Ayudantia {
public static void main(String[]args){

    ListaUsuario contenedorUsuario=new ListaUsuario(999);
    ListaProducto contenedorProducto=new ListaProducto(999);

    menuPrincipal(contenedorUsuario,contenedorProducto);


  }



  public static void menuPrincipal(ListaUsuario contenedorUsuario,ListaProducto contenedorProducto){

  boolean verificacion=true;

  while (verificacion){

    StdOut.println(":::::::  eliga una de las siguientes opcciones  :::::::");
    StdOut.println("[1] listar los datos ingresados en orden alfabetico");
    StdOut.println("[2] listar los datos ingresados por codigo enan");
    StdOut.println("[3] crear usuario a partir del rut");
    StdOut.println("[4] eliminar usuario a partir del rut");
    StdOut.println("[5] crear producto a partir del codigo");
    StdOut.println("[6] eliminar producto a partir de codigo");
    StdOut.println("[7] vender producto al cliente");
    StdOut.println("[8] terminar recorrido");

    String opccion= StdIn.readLine();

    switch (opccion){

      case "1"->listarUsuarioOrfen(contenedorUsuario);
      case "2"->listarCodigoEnan(contenedorProducto);
      case "3"->agregarUsuario(contenedorUsuario);
      case "4"->eliminarUsuario(contenedorUsuario);
      case "5"->agregarProducto(contenedorProducto);
      case "6"->eliminarProducto(contenedorProducto);
      case "7"->venderProducto(contenedorProducto);
      case "8"->verificacion=false;

      default -> StdOut.println(":::::: LA OPCCION ELEGIDA NO ES VALIDA ::::::::");

    }
  }
    StdOut.println("::::: termino operacion adios usuario ::::::");

  }




  public static void listarUsuarioOrfen(ListaUsuario contenedorUsuario){

  Usuario listar;

    for (int i = 0; i < contenedorUsuario.getCantidadActualUsuario(); i++) {
      listar=contenedorUsuario.optener(i);

      StdOut.println("--------------------------------------------------------------------------------------------");
      StdOut.println("el nombre del usuario es :::::"+ listar.getNombreUsusario()+"::::::::");
      StdOut.println("el apellido del usuario es :::::"+listar.getApellidoUsuario()+":::::::");
      StdOut.println("el rut del usuario es::::::"+listar.getRutUsuario()+":::::::::");
      StdOut.println("la menbresia del usuario es"+listar.getMenbreciaUsuario()+"::::::::");
      StdOut.println("--------------------------------------------------------------------------------------------");

    }

}


public static void  listarCodigoEnan(ListaProducto contenedorProducto){

  Productos listarProducto;

  for (int i = 0; i < contenedorProducto.getCantidadActualProducto(); i++) {
    listarProducto=contenedorProducto.optener(i);

    StdOut.println("--------------------------------------------------------------------------------------------");
    StdOut.println("el codigo del producto es:::::::"+listarProducto.getCodigoProducto()+":::::::::");
    StdOut.println("el nombre del producto es :::::::"+ listarProducto.getNombrePeoducto()+"::::::::");
    StdOut.println("la cantidad del producto es ::::::"+listarProducto.getCantidadProducto()+"::::::::");
    StdOut.println("--------------------------------------------------------------------------------------------");
  }

}


  public static void agregarUsuario(ListaUsuario contenedorUsuario){
  StdOut.println("::::::::::ingrese los datos para agregar:::::::::::");


StdOut.println("ingrese el nombre del usuario");
String nombreUsuario=StdIn.readLine();
StdOut.println("ingrese apellido del usuario");
String apellidoUsuario=StdIn.readLine();
StdOut.println("ingrese el rut del ususario");
String rutUsuario=StdIn.readLine();
StdOut.println("ingrese la menbresia del usuario");
String menbrecia=StdIn.readLine();

   Usuario nuevoUsuario=new Usuario(nombreUsuario,apellidoUsuario,rutUsuario,menbrecia);
   contenedorUsuario.agregar(nuevoUsuario);
  }

  public static void eliminarUsuario(ListaUsuario contenedorUsuario){
  StdOut.println("::::::::::ingrese los datos para ELIMINAR :::::::::::");

  StdOut.println("ingrese el rut de la persona que quiere eliminar");
  String rutAeliminar=StdIn.readLine();
  if (contenedorUsuario.eliminar(rutAeliminar)){
    StdOut.println("el rut :::::::"+ rutAeliminar+":::::: ah sido eliminado con exito");
  }
  else {
    StdOut.println("el rut no fue encontrado intente otra ves ");
  }

  }

  public static void agregarProducto(ListaProducto contenedorPrroducto){
StdOut.println("::::::::::ingrese los datos para agregar:::::::::::");

StdOut.println("::::::ingerse el codigo del producto:::::::");
String codigoProducto=StdIn.readLine();
StdOut.println(":::::::ingrese el nombre del producto:::::::::");
String nombreProducto=StdIn.readLine();
StdOut.println("ingrese la cantidad de productos que hay en stok");
int cantidad=StdIn.readInt();

Productos nuevoProducto=new Productos(codigoProducto,nombreProducto,cantidad);
contenedorPrroducto.agregar(nuevoProducto);
  }

  public static void eliminarProducto(ListaProducto contenedorProducto){
    StdOut.println("::::::::::ingrese los datos para ELIMINAR :::::::::::");
    StdOut.println(":::::::ingrese el codigo del producto:::::::");
    String codigoProducto=StdIn.readLine();

  if (contenedorProducto.eliminar(codigoProducto)){
    StdOut.println("el producto ::::::: "+codigoProducto+" ::::::::: ah sido eliminado con exito");
  }else {
    StdOut.println("el producto no fue encontrado intente otra ves");
  }


  }

  public static void venderProducto(ListaProducto cocntenedorProducto){

  }



}
