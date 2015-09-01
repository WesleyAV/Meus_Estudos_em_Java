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
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número do tipo inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número do tipo real: ");
        double num3 = scan.nextDouble();

        int a = (num1 * 2) * (num2 / 2);
        double b = (num1 * 3) + num3;
        double c = Math.pow (num3, 3);

        System.out.println("o produto do dobro do primeiro com metade do segundo é: " + a);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + b);
        System.out.println("O terceiro elevado ao cubo é: " + c);

    }
}
