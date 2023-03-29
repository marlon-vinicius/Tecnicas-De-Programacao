package exercicios;
import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Escreva um programa que leia um número e imprima todos os números primos menores ou iguais ao número informado.

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int cont = 0;
        
        System.out.println("Digite um número:");
        num = input.nextInt();
        
        System.out.println("Os números primos até o número "+ num +" é:");
        
        for (int i=2; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    cont ++;
                }
            } 
            
            if (cont == 2){
                    System.out.print(i+ " "); 
                }
            cont = 0;
       }
    }
}
