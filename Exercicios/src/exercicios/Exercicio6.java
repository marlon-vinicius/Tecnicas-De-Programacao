package exercicios;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Crie um programa que leia um número e imprima a sequência de Fibonacci até o número informado.
public class Exercicio6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        System.out.println("Sequência Fibonacci até o número "+ num +" é:");
        int a = 1;
        int b = 0;
        
        for (int i = 1; a <= num; i++) {
            System.out.print(a + " ");
            int aux = a;
            a = a + b;
            b = aux;
        }
    }
}
