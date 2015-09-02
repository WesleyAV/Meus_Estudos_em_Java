/*
 * Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
 * D = (R + S) /2 onde R = (A + B) elevado a 2 e S = (B + C) elevado a 2
 */
package lista_geral;

import java.util.Scanner;

/**
 *
 * @author Wesley
 */
public class Exer_02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor A: ");
        double a = scan.nextDouble();
        
        System.out.println("Informe o valor B: ");
        double b = scan.nextDouble();
        
        System.out.println("Informe o valor C: ");
        double c = scan.nextDouble();
    
    double area = a + b + c;
    
    
    
        System.out.println("A área do triângulo é: " + area);
    }
    
    
}
