/*
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 */
package exer_aula15_loiane;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra qualquer: ");
        String letra = scan.next();

        /*if (letra.equalsIgnoreCase("a") || 
         letra.equalsIgnoreCase("e") || 
         letra.equalsIgnoreCase("i") || 
         letra.equalsIgnoreCase("o") || 
         letra.equalsIgnoreCase("u")) {
         System.out.println("Você digitou uma VOGAL");
         } else {
         System.out.println("Você digitou uma CONSOANTE");
         }
         */
        if (letra.length() > 1){
            System.out.println("Não foi digitado uma letra válida.");
        } else {
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Você digitou uma VOGAL");
                break;
            default:
                System.out.println("Você digitou uma CONSOANTE");
        }
        
        
        }
    }

}
