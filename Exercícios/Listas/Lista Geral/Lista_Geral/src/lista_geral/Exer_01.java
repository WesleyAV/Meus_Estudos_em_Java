/*
 * Faça um programa que permita entrar com a quantidade de pães e leite. 
 * Informe o valor da conta do cliente, sabendo que cada  litro de leite custa 
 * R$2,50 e cada pão custa R$0,25.
 */
package lista_geral;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de pães: ");
        double paes = scan.nextDouble();

        System.out.println("Digite a quantidade de leite: ");
        double leite = scan.nextDouble();

        double totalpaes = paes * 0.25;
        double totalleite = leite * 2.50;

        double totalcompra = totalpaes + totalleite;

        System.out.println("O valor total da compra é de: " + totalcompra);

    }
}
