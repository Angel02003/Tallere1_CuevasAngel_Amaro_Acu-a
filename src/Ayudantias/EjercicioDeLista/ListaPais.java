package Ayudantias.EjercicioDeLista;

public class ListaPais {

     private Ciudad[]arreglo;
     private int cantidadMaxima;
     private int cantidadActual;


     //-----------------------------------------------------------------------------
                                     // lista

   public  ListaPais (int cantidadMaxima) throws IllegalAccessException {

        if (cantidadMaxima<=0){
             throw new IllegalAccessException("la cantidad maxima no puede ser 0");
        }
        this.cantidadMaxima=cantidadMaxima;
        this.arreglo=new Ciudad[cantidadMaxima];
        this.cantidadActual=0;

   }
   //---------------------------------------------------------------------------------


   public int buscarCiudad(String nombre){

        for (int i = 0; i < this.cantidadActual; i++) {
             if (this.arreglo[i].getNombre().equalsIgnoreCase(nombre)){
                  return i;
             }

        }
        return -1;
   }

   //---------------------------------------------------------------------------------

   public Ciudad optener(int pocicion) throws IllegalAccessException {

        if (pocicion<0 || pocicion>=this.cantidadMaxima){
        throw new IllegalAccessException("pocicion no encontrada");
        }
        return this.arreglo[pocicion];
   }


//--------------------------------------------------------------------------------------
    public void agregar(Ciudad nuevaCiudad) throws IllegalAccessException {

       if (this.buscarCiudad(nuevaCiudad.getNombre())!=-1){
           throw new IllegalAccessException("la ciudad no fue encontrada");
       }
       if (this.cantidadActual==this.cantidadMaxima){
           throw new IllegalAccessException("arreglo lleno");
       }

       this.arreglo[this.cantidadActual]=nuevaCiudad;
       this.cantidadActual++;
    }



    //-------------------------------------------------------------------------------
    public boolean eliminar (String ciudad){

       int  pocicion=this.buscarCiudad(ciudad);

     if (pocicion<=0) {
       for (int i = 0; i <this.cantidadActual-1; i++) {
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
