/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.avaliacao1b;
import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2, multiplicacao;
        
        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        num2 = input.nextInt(); 
        
        multiplicacao = num1 * num2;
        
        System.out.printf("O resultado da multiplicação é: %d%n ",multiplicacao);
    }
}
