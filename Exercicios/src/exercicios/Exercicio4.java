package exercicios;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Escreva um programa que leia um número e calcule o fatorial desse número.
public class Exercicio4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fatorial = 1;
        
        System.out.print("Digite um número para ver seu fatorial: ");
        int num = input.nextInt(); 
        
        for(int i = 1;i <= num; i++ ) {
           fatorial = fatorial * i;  
        }
        
        System.out.println("Fatorial de "+ num +" é: "+ fatorial);
    }
}
