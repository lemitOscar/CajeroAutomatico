package operaciones;

import java.util.Scanner;

public abstract class PadreOpera {

    Scanner read = new Scanner(System.in);

    protected int transaccion, retiro, deposito;
    private static int saldo;

    //cantidad de retiro
    public void Retiro() {
        System.out.print("cuanto deseas retirar: ");
        retiro = read.nextInt();

    }

    // solicitar deposito
    public void Deposito() {
        System.out.print("Cuanto deseas depositar: ");
        deposito = read.nextInt();
    }

    //metodos abstractos...
    public abstract void Transacciones();

    //get y set para saldo
    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        PadreOpera.saldo = saldo;
    }

}
