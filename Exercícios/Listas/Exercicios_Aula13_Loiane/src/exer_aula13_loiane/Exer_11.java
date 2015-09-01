/*
 * Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 *     a. o produto do dobro do primeiro com metade do segundo .
 *     b. a soma do triplo do primeiro com o terceiro.
 *     c. o terceiro elevado ao cubo.
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número do tipo inteiro: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo número do tipo inteiro: ");
        double num2 = scan.nextDouble();

        System.out.println("Digite o terceiro número do tipo real: ");
        int num3 = scan.nextInt();

        double a = (num1 * 2) + (num2 / 2);
        double b = (num1 * 3) + num3;
        double c = (num3 * num3 * num3);
        
        System.out.println("o produto do dobro do primeiro com metade do segundo é: " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + b);
        System.out.println("O terceiro elevado ao cubo é: " + c);

    }
}
