/*
 * Faça um Programa que converta metros para centímetros. 
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos metros (m) deseja converter para centímetros (cm): ");
        double m = scan.nextDouble();

        double cm = m * 100;

        System.out.println(m + " Metros é igual á: " + cm + " centímetros. ");

    }

}
