/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Jesslim
 */
public class HijaRetiro extends PadreOpera {

    @Override
    public void Transacciones() {

        Retiro();

        if (getSaldo() <= 0) {
            System.out.println("----------------------");
            System.out.println("ya no tienes fondos");
            System.out.println("----------------------");

        } else {
            setSaldo(getSaldo() - retiro);
            System.out.println("----------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es de " + getSaldo());
            System.out.println("----------------------");
        }

    }

}
