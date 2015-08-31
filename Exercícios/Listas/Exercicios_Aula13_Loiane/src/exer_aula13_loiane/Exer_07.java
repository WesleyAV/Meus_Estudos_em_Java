/*
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário. 
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a medida do lado do quadrado: ");
        double lado = scan.nextDouble();

        double area = lado * lado;

        System.out.println("O dobro da área é de: " + (area * 2));

    }
}
