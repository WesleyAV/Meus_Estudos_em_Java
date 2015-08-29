/*
 * Faça um Programa que peça dois números e imprima a soma. 
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número ");
        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos números digitados é: " + soma);
    }
}
