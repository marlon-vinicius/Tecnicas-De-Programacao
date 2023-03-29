package exercicios;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Crie um programa que leia um número e verifique se ele é um número perfeito (soma dos seus divisores é igual a ele mesmo).
public class Exercicio5 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número para saber se o número é um número perfeito: ");
        int num = input.nextInt();
        int soma = 1;
        
        for(int i = 2;i < num; i++ ) {
           if (num % i == 0){
              soma += i; 
           }  
        }
        
        if (soma == num){
            System.out.print("O "+ num + " é um número perfeito!!");            
        }
        else {
            System.out.print("O "+ num + " não é um número perfeito!!");
        }
    }    
}
