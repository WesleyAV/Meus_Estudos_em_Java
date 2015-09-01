/*
 * Faça um programa que peça o tamanho de um arquivo para download
 * (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
 * informe o tempo aproximado de download do arquivo usando este link
 * (em minutos).
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho do arquivo para download? (MB)");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Qual a velocidade para realizar o download? (Mbps) ");
        double velocidade = scan.nextDouble();

        double tempoAprox = tamanhoArquivo / velocidade;
        System.out.println("O tempo aproximado para o download será de: " + tempoAprox + " minutos");
    }
}
