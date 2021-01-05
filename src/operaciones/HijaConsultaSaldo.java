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
public class HijaConsultaSaldo extends PadreOpera {

    @Override
    public void Transacciones() {
        System.out.println("----------------------");
        System.out.println("tu saldo es: " + getSaldo());
        System.out.println("----------------------");
    }

}
