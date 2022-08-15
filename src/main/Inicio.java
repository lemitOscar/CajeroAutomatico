package main;

import java.util.Scanner;

import operaciones.*;


public class Inicio {

    public static void main(String[] args) {
        boolean chi = true;
        HijaConsultaSaldo hijaConsultaSaldo = new HijaConsultaSaldo();
        hijaConsultaSaldo.setSaldo(500);
        while (chi) {
            System.out.println("PorFavor seleccione una opción:");
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Retiro de Efectivo");
            System.out.println("3. Deposito en efectivo");
            System.out.println("4. Salir");
            Scanner read = new Scanner(System.in);
            int sel = read.nextInt();
            switch (sel) {
                case 1:
                    hijaConsultaSaldo.Transacciones();
                    break;
                case 2:
                    PadreOpera kateRet = new HijaRetiro();
                    kateRet.Transacciones();
                    break;
                case 3:
                    PadreOpera kateDepo = new HijaDepositar();
                    kateDepo.Transacciones();
                    break;
                case 4:
                    chi = false;
                    break;
                default:
                    System.out.println("lo que ingresaste no es valido");
            }
        }

    }//fin main
}
