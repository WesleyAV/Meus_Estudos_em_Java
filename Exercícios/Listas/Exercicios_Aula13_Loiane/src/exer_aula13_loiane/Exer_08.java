/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês. 
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double vhora = scan.nextDouble();

        System.out.println("Digite o total de horas trabalhadas no mês: ");
        double totalhora = scan.nextDouble();

        double salario = vhora * totalhora;

        System.out.println("O salário a receber é de: " + salario);

    }
}
