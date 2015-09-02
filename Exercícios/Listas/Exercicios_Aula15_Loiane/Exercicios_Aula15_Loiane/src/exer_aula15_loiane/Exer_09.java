/*
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 */
package exer_aula15_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double num1 = scan.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double num2 = scan.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double num3 = scan.nextDouble();

        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            //num1 é menor
            //num3 é maior
            //num1 < num < num3
            System.out.println(num3 + " -- " + num2 + " -- " + num1);

//primeiro else
        } else if (num1 <= num1 && num1 <= num3 && num3 <= num2) {
            //num1 é menor
            //num2 é maior
            //num1 < num3 < num2
            System.out.println(num2 + " -- " + num3 + " -- " + num1);
//segundo else            
        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            //num2 é menor
            //num3 é maior
            //num2 < num1 < num3
            System.out.println(num3 + " -- " + num1 + " -- " + num2);
        } //terceiro else        
        else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            //num2 é menor
            //num1 é maior
            //num2 < num3 < num1
            System.out.println(num1 + " -- " + num3 + " -- " + num2);
        } //quarto else        
        else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            //num3 é menor
            //num2 é maior
            //num3 < num1 < num2
            System.out.println(num2 + " -- " + num1 + " -- " + num3);
        } //quinto else        
        else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
            //num3 é menor
            //num1 é maior
            //num3 < num2 < num1
            System.out.println(num1 + " -- " + num2 + " -- " + num3);
        }

    }
}
