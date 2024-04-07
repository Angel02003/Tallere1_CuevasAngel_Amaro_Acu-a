package TodoCodeHerenciaClase6.Encapsulamiento.EjercicioDePokemonTodoCode;

import ucn.StdOut;

public class Bulbazor extends Pokemon implements InterfacePlanta{

    public Bulbazor() {
    }

    @Override
    protected void AtacarPlacaje() {
        StdOut.println("hola soy bulbasor y este es mu ataque placaje");
    }

    @Override
    protected void AtacarAraniaso() {
        StdOut.println("hola soy bulbasor y este es mu ataque araniazo");
    }

    @Override
    protected void AtacarMordisco() {
        StdOut.println("hola soy bulbasor y este es mu ataque mordisco");
    }

    @Override
    public void AtacarDrenaje() {
        StdOut.println("hola soy bulbasor y este es mu ataque Drenaje");
    }

    @Override
    public void AtacarParalizar() {
        StdOut.println("hola soy bulbasor y este es mu ataque Drenaje");
    }
}
