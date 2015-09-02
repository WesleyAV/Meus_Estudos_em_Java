package exer_aula15_loiane;

import java.util.Scanner;

/*
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. 
 /**
 *
 * @author Wesley
 */
public class Exer_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        if (num >= 0) {
            System.out.println("O número digitado é POSITIVO");
        } else {
            System.out.println("O número digitado é NEGATIVO");
        }
    }
}
