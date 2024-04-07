package TodoCodeHerenciaClase6.Encapsulamiento.EjercicioDePokemonTodoCode;

import ucn.StdOut;

public class Pikachu extends Pokemon implements PokemonElectrico{


    public Pikachu() {
    }

    @Override
    protected void AtacarPlacaje() {
        StdOut.println("hola soy Pikachu y este es mu ataque placaje");
    }

    @Override
    protected void AtacarAraniaso() {
        StdOut.println("hola soy Pikachu y este es mu ataque araniazo");
    }

    @Override
    protected void AtacarMordisco() {
        StdOut.println("hola soy Pikachu y este es mu ataque mordisco");
    }

    @Override
    public void AtacarImpactrueno() {
        StdOut.println("hola soy Pikachu y este es mu ataque inpactrueno");
    }

    @Override
    public void AtacarPunioTrueno() {
        StdOut.println("hola soy Pikachu y este es mu ataque punio Trueno");
    }
}
