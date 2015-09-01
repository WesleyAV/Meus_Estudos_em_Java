/*
 * Tendo como dados de entrada a altura de uma pessoa, construa um
 * algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 * (72.7*altura) - 58
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();

        double pesoideal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoideal);
    }
}
