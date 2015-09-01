/*
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e 
 * mostre em graus Farenheit.
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.println("A temperatura de " + c + " graus Celsius é equivalente a " + f + " graus Farenheit.");
    }
}
