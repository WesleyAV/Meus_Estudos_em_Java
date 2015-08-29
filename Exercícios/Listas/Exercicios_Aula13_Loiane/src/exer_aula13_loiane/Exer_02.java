/*
 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número]. 
 */
package exer_aula13_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Entre com um número do tipo inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
        
    }
}
