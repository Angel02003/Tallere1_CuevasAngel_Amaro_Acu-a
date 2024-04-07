package TodoCodeHerenciaClase6.Encapsulamiento.EjercicioDePokemonTodoCode;

import ucn.StdOut;

public class Squartle extends Pokemon implements InterfacesAgua{


    public Squartle() {
    }

    @Override
    protected void AtacarPlacaje() {
        StdOut.println("hola soy Squartle y este es mu ataque placaje");
    }

    @Override
    protected void AtacarAraniaso() {
        StdOut.println("hola soy Squartle y este es mu ataque araniazo");
    }

    @Override
    protected void AtacarMordisco() {
        StdOut.println("hola soy Squartle y este es mu ataque Mordisco");
    }

    @Override
    public void AtacarIdrobomba() {
        StdOut.println("hola soy Squarte y este es mu ataque Hidrobomba");
    }

    @Override
    public void AtacarBurbuja() {
        StdOut.println("hola soy Squarte y este es mu ataque burbuja");
    }

    @Override
    public void AtacarPistolaAgua() {
        StdOut.println("hola soy Squarte y este es mu ataque Pistola Agua");
    }
}
