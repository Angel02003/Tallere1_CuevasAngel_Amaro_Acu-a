package TodoCodeHerenciaClase6.Encapsulamiento.EjercicioDePokemonTodoCode;

import ucn.StdOut;

public class Charmander extends Pokemon implements PokemonFuego{


    public Charmander() {
    }

    @Override
    protected void AtacarPlacaje() {
        StdOut.println("hola soy charander y este es mu ataque placaje");
    }

    @Override
    protected void AtacarAraniaso() {
        StdOut.println("hola soy charander y este es mu ataque araniazo");
    }

    @Override
    protected void AtacarMordisco() {
        StdOut.println("hola soy charander y este es mu ataque mordisco");
    }

    @Override
    public void AtacarPunioFuego() {
        StdOut.println("hola soy Charmander y este es mu ataque  punioFuego");
    }

    @Override
    public void AtacarLanzaLLamas() {
        StdOut.println("hola soy Charmander y este es mu ataque Lanzallamas");
    }

    @Override
    public void AtacarAscuas() {
        StdOut.println("hola soy Charmander y este es mu ataque ascuas");
    }
}
