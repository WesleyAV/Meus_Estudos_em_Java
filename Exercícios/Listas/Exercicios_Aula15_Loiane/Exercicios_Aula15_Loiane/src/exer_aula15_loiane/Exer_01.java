package exer_aula15_loiane;

import java.util.Scanner;

/*
 * Faça um Programa que peça dois números e imprima o maior deles. 

 /**
 *
 * @author Wesley
 */
public class Exer_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        if (num1 > num2) {
            System.out.println("O primeiro número é MAIOR");
        } else {
            System.out.println("O segundo número é MAIOR");
        }
    }
}
