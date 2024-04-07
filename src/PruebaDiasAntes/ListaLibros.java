package PruebaDiasAntes;

import EjercicioLibreria.ListaLibro;

public class ListaLibros {


     private Libros[]arreglo;
     private int cantidadMaxima;
     private int cantidadActual;

     public ListaLibros (int cantidadMaxima){

         if (cantidadMaxima<=0){
             throw new IllegalArgumentException("la cantidad maxima no puede ser menor igual a 0");
         }
         this.cantidadMaxima=cantidadMaxima;
         this.arreglo=new Libros[cantidadMaxima];
         this.cantidadActual=0;
     }


     public int buscar(String isbn){

         for (int i = 0; i < this.cantidadActual; i++) {
             if (this.arreglo[i].getCodigoisnbn().equalsIgnoreCase(isbn)){
                 return i;
             }
         }
         return -1;
     }

     public Libros optener(int pocicion){

         if (pocicion<0 || pocicion>=this.cantidadMaxima){
             throw new IllegalArgumentException("la pocicion no fue encontrada");
         }
         return this.arreglo[pocicion];
     }

     public void agregar(Libros nuevoLibro){

         if (this.buscar(nuevoLibro.getCodigoisnbn())!=-1){
             throw new IllegalArgumentException("el libro ya existe");
         }
         if (this.cantidadActual==this.cantidadMaxima){
             throw new IllegalArgumentException("el arreglo esta lleno");
         }
         this.arreglo[this.cantidadActual]=nuevoLibro;
         this.cantidadActual++;
     }
     public boolean eliminar(String isbn){

         int pocicion=this.buscar(isbn);
         if (pocicion<=0) {
             for (int i = 0; i < this.cantidadActual-1; i++) {

                 this.arreglo[i]=this.arreglo[i+1];
             }
             this.cantidadActual--;
             return true;
         }
         return false;
     }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }
}
