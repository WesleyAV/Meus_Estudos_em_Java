/*
 * Faça um Programa que leia três números e mostre o maior e o menor deles.
 */
package exer_aula15_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();
        
        System.out.println("Digite o terceiro número: ");
        int num3 = scan.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("O primeiro número é o maior deles.");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("O segundo número é o maior deles");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("O terceiro número é o maior deles");
        }
        
        if (num1 <= num2 && num1 <= num3) {
            System.out.println("O primeiro número é o menor deles.");
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println("O segundo número é o menor deles");
        } else if (num3 <= num1 && num3 <= num2) {
            System.out.println("O terceiro número é o menor deles");
        }
    }
    
}
