package Unidad1.EjercicioTaller;

import ucn.In;

public class ListaVideoJuegos {

    private VideoJuegos[]arregloVideoJuegos;
    private  int cantidadMaximaVideoJuegos;
    private int cantidadActualVideojuegos;


    public ListaVideoJuegos(int cantidadMaximaVideoJuegos){

        if (cantidadMaximaVideoJuegos<=0){
            throw new IllegalArgumentException("la cantidad maxima no puede ser //--//--//--menor o igual a 0");
        }
        this.cantidadMaximaVideoJuegos=cantidadMaximaVideoJuegos;
        this.arregloVideoJuegos=new VideoJuegos[cantidadMaximaVideoJuegos];
        this.cantidadActualVideojuegos=0;
    }

    //--------------------------------------------------------------------------------------------------------------------------


    public int buscarvideojuego(String Nombre){

        for (int i = 0; i < this.cantidadActualVideojuegos; i++) {

            if (this.arregloVideoJuegos[i].getNombreVideoJuego().equalsIgnoreCase(Nombre)){
                return i;
            }
        }
        return -1;
    }

    //-------------------------------------------------------------------------------------------------------------

    public void agregarVideojuego (VideoJuegos nuevoVideojuego){

        if (this.buscarvideojuego(nuevoVideojuego.getNombreVideoJuego())!=-1){
            throw new IllegalArgumentException("el empleado ya existe en el arreglo");
        }
        if (this.cantidadActualVideojuegos==this.cantidadMaximaVideoJuegos){
            throw new IllegalArgumentException("el arreglo esta lleno");
        }

       this.arregloVideoJuegos[this.cantidadActualVideojuegos]=nuevoVideojuego;
        this.cantidadActualVideojuegos++;
    }



    //-------------------------------------------------------------------------------------------------------------

    public VideoJuegos optener(int pocicion){

        if (pocicion<0 || pocicion>=this.cantidadMaximaVideoJuegos){
            throw new IllegalArgumentException("la pocicion no fue encontrada");
        }

        return this.arregloVideoJuegos[pocicion];

    }

    //---------------------------------------------------------------------------------------------------------

    public void lecturaDeArchivosVideoJiegos(String nombreArchivo2){
        VideoJuegos videoJuegos;

        In archivoEntrada2=new In(nombreArchivo2);

        while (!archivoEntrada2.isEmpty()){

            String[] linea2= archivoEntrada2.readLine().split(",");

             String codigo=linea2[0];
             String nombreVideoJuego=linea2[1];
             int precioVideoJuego=Integer.parseInt(linea2[2]);
             String generoVideoJuego=linea2[3];
             String clasificacion=(linea2[4]);
             String desarrollo=linea2[5];
             String plataforma=linea2[6];

            videoJuegos=new VideoJuegos(codigo,nombreVideoJuego,precioVideoJuego,generoVideoJuego,clasificacion,desarrollo,plataforma);

            this.agregarVideojuego(videoJuegos);

        }
        archivoEntrada2.close();
    }


    public int getCantidadMaximaVideoJuegos() {
        return cantidadMaximaVideoJuegos;
    }

    public int getCantidadActualVideojuegos() {
        return cantidadActualVideojuegos;
    }
}
