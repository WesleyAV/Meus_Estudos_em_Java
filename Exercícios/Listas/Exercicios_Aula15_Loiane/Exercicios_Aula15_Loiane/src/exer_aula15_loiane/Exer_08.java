/*
 * Faça um programa que pergunte o preço de três produtos e informe qual produto 
 * você deve comprar, sabendo que a decisão é sempre pelo mais barato.
 */
package exer_aula15_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double valor1 = scan.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double valor2 = scan.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double valor3 = scan.nextDouble();

        if (valor1 <= valor2 && valor1 <= valor3) {
            System.out.println("Compre o primeiro produto.");
        } else if (valor2 <= valor1 && valor2 <= valor3) {
            System.out.println("Compre o segundo produto.");
        } else if (valor3 <= valor1 && valor3 <= valor2) {
            System.out.println("Compre o terceiro produto.");
        }
    }
}
