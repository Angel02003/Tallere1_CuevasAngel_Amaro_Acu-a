package Clase4PrograAV;

public class CuentaBancaria {

private int saldo;




//--------------------------------------------------------------
//constructor
    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    //----------------------------------------------------------------------------
// get

    public int getSaldo() {
        return saldo;
    }

    //---------------------------------------------------------------------
    // set

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    //----------------------------------------------------------------
    // giro
    public void giro(int monto){

        this.saldo-=monto;
    }



    //------------------------------------------------------
    // deposito

    public void deposito(int monto){

        this.saldo+=monto;
    }
}
