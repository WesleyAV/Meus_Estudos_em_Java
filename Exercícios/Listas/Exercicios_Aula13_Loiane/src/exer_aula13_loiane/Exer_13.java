/*
 * Faça um Programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês. Calcule e mostre o total do seu
 * salário no referido mês, sabendo-se que são descontados 11% para o
 * Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
 * programa que nos dê:
 * . salário bruto.
 *  a. quanto pagou ao INSS.
 *  b. quanto pagou ao sindicato.
 *  c. o salário líquido.
 *  d. calcule os descontos e o salário líquido, conforme a tabela abaixo:
 *       + Salário Bruto : R$ - IR (11%) : R$ - INSS
 * (8%) : R$ - Sindicato ( 5%) : R$ = Salário
 * Liquido : R$
 * Obs.: Salário Bruto - Descontos = Salário Líquido.


 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double valorhora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha por mês: ");
        double horames = scan.nextDouble();

        double salariobruto = valorhora * horames;
        double inss = salariobruto * 0.08;
        double sindicato = salariobruto * 0.05;
        double ir = salariobruto * 0.11;
        double totaldescontos = inss + sindicato + ir;
        double salliquido = salariobruto - totaldescontos;

        //Exibindo os resultados
        System.out.println("O salário bruto é de: " + salariobruto);
        System.out.println("Valor pago ao INSS:" + inss);
        System.out.println("Valor pago ao Sindicato: " + sindicato);
        System.out.println("Valor pago de IR: " + ir);
        System.out.println("Total de descontos: " + totaldescontos);
        System.out.println("Salário Líquido:" + salliquido);

    }
}
