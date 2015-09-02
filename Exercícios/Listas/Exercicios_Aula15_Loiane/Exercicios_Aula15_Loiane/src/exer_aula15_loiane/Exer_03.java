/*
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido. 
 */
package exer_aula15_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra (F ou M):");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("Foi informado FEMININO");
        } else if (input.equalsIgnoreCase("m")) {
            System.out.println("Foi informado MASCULINO");
        } else {
            System.out.println("Sexo inválido");
        }
    }

}
