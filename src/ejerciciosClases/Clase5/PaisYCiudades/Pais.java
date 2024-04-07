package ejerciciosClases.Clase5.PaisYCiudades;

public class Pais {

    private Ciudades[] arreglo;
    private int cantidadMaxima;
    private int cantidadActual;


    public Pais(int cantidadMaxima) throws IllegalAccessException {
        if (cantidadMaxima <= 0) {
            throw new IllegalAccessException("la cantidad maxima no puede ser 0");
        }
        this.cantidadMaxima = cantidadMaxima;
        this.arreglo = new Ciudades[cantidadMaxima];
        this.cantidadActual = 0;
    }

    // buscar

    public int buscar(String nombre) {
        for (int i = 0; i < this.cantidadActual; i++) {
            if (this.arreglo[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    //optener
    public Ciudades optener(int posicion) throws IllegalAccessException {

        if (posicion < 0 || posicion >= this.cantidadMaxima) {
            throw new IllegalAccessException("pocicion no encontrad");
        }
        return this.arreglo[posicion];
    }
    //agregar

    public void agregar(Ciudades nuevaciudad) throws IllegalAccessException {

        if (this.buscar(nuevaciudad.getNombre()) != -1) {
            throw new IllegalAccessException("ciudad no encontrada");
        }
        if (this.cantidadActual == this.cantidadMaxima) {
            throw new IllegalAccessException("arreglo lleno");
        }
        this.arreglo[this.cantidadActual] = nuevaciudad;
        this.cantidadActual++;
    }



    //eliminar
    public boolean eliminar(String nombre) {

int pocicion=this.buscar(nombre);
        if (pocicion<=0) {
            for (int i = 0; i < this.cantidadActual - 1; i++) {
                this.arreglo[i] = this.arreglo[i + 1];
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