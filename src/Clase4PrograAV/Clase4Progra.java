package Clase4PrograAV;
import ucn.StdIn;
import ucn.StdOut;
import veterianarias.Almoadiata;

public class Clase4Progra {
    public static void main(String[] args) {


        CuentaBancaria cuentaBancaria=new CuentaBancaria(0);

        //--------------------------------------------------------------------------------------------------------
        // lectira inicial

        StdOut.println("-------------------------------------------------------------------------------------");

        int montoinicial=verificacion1("ingrese el monto inicial");

        cuentaBancaria.deposito(montoinicial);

        StdOut.println("saldo es "+":"+cuentaBancaria.getSaldo());


        //-------------------------------------------------------------------------------------------------------
        //deposito

        StdOut.println("------------------------------------------------------------------------------------");

        int montoDeDeposito=verificacion2("ingrese el monto a depositar");


        cuentaBancaria.deposito(montoDeDeposito);

        StdOut.println("el saldo total es"+":"+cuentaBancaria.getSaldo());
        //------------------------------------------------------------------------------------
        // giro

        StdOut.println("--------------------------------------------------------------------------");

        int montogiro=verificacion3("ingrese el monto que quiere girar");


        cuentaBancaria.giro(montogiro);

        StdOut.println("el saldo final es "+":"+cuentaBancaria.getSaldo());

    }



    public static int verificacion1(String frace) {
        while (true) {
            StdOut.println(frace);
            String edadComoString = StdIn.readLine();

            if (esnumerico(edadComoString)) {
                return Integer.parseInt(edadComoString);
            }
        }
    }
        public static boolean esnumerico(String edaComoString){

        try {
            Integer.parseInt(edaComoString);
            return true;
        }
        catch (NumberFormatException exception){
            StdOut.println("no es un factor numerico"+"----"+edaComoString+"----");
            return false;
        }

    }
    //----------------------------------------------------------------------------------------------------

    public static int verificacion2(String frace1) {
        while (true) {
            StdOut.println(frace1);
            String edadComoString1 = StdIn.readLine();

            if (esnumerico(edadComoString1)) {
                return Integer.parseInt(edadComoString1);
            }
        }
    }
    public static boolean esnumerico1(String edaComoString1){

        try {
            Integer.parseInt(edaComoString1);
            return true;
        }
        catch (NumberFormatException exception){
            StdOut.println("no es un factor numerico"+"----"+edaComoString1+"----");
            return false;
        }

    }

    //-----------------------------------------------------------------------------------------------------

    public static int verificacion3(String frace2) {
        while (true) {
            StdOut.println(frace2);
            String edadComoString2 = StdIn.readLine();

            if (esnumerico(edadComoString2)) {
                return Integer.parseInt(edadComoString2);
            }
        }
    }
    public static boolean esnumerico2(String edaComoString2){

        try {
            Integer.parseInt(edaComoString2);
            return true;
        }
        catch (NumberFormatException exception){
            StdOut.println("no es un factor numerico"+"----"+edaComoString2+"----");
            return false;
        }

    }




}
