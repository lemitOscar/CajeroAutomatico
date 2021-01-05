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
public class HijaDepositar extends PadreOpera {

    @Override
    public void Transacciones() {
       
        Deposito();
        setSaldo(getSaldo() + deposito);
        System.out.println("-----------------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("-----------------------------------");
    }

}
