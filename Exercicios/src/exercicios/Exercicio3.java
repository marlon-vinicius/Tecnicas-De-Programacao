package exercicios;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

//Crie um programa que leia um número e imprima a tabuada de multiplicação desse número de 1 a 10.

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número para ver sua tabuada: ");
        int num = input.nextInt();
        
        System.out.println("Tabuada do "+ num +" :");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x "+ i + " = " + (num*i));
        }
    }
}
