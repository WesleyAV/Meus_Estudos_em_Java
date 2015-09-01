/*
 * Faça um Programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.  o C = (5 * (F-32) / 9).
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Farenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f - 32) / 9);

        System.out.println("A temperatura de " + f + " graus Farenheit é equivalente a " + c + " graus Celcius.");
    }
}
