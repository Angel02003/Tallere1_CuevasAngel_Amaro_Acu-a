package TodoCodeHerenciaClase6.Encapsulamiento.EjercicioDePokemonTodoCode;

import ucn.StdOut;
public class ClasesPokemon {
    public static void main(String[] args) {

        Pikachu pikachu=new Pikachu();
        Squartle squartle=new Squartle();
        Bulbazor bulbazor=new Bulbazor();
        Charmander charmander=new Charmander();



        squartle.AtacarAraniaso();
        squartle.AtacarIdrobomba();
        StdOut.println("---------------------------------------------------------");
        charmander.AtacarAraniaso();
        charmander.AtacarLanzaLLamas();
        StdOut.println("---------------------------------------------------------");
        bulbazor.AtacarAraniaso();
        bulbazor.AtacarDrenaje();
        StdOut.println("---------------------------------------------------------");
        pikachu.AtacarAraniaso();
        pikachu.AtacarImpactrueno();






    }
}
