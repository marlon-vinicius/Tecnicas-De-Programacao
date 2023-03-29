package exercicios;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Escreva um programa que leia um número inteiro e verifique se ele é um número par ou ímpar.

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número para saber se o número é par ou ímpar: ");
        int num = input.nextInt();
        
        if (num % 2 == 0) {
            System.out.print("O número "+ num +" é par !!");
        }
        else {
            System.out.print("O número "+ num +" é ímpar !!");
        }
    }
}
