/*
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média. 
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota bimestral: ");
        int nota1 = scan.nextInt();

        System.out.println("Digite a segunda nota bimestral: ");
        int nota2 = scan.nextInt();

        System.out.println("Digite a terceira nota bimestral: ");
        int nota3 = scan.nextInt();

        System.out.println("Digite a quarta nota bimestral: ");
        int nota4 = scan.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média bimestral é: " + media);
    }
}
