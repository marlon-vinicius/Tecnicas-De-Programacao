/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Informar um saldo e imprimir o saldo com reajuste de 1%
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o saldo: ");
        double saldo = input.nextDouble();
        
        double reajuste = saldo + (saldo / 100);
        
        System.out.print("O saldo com reajuste é: "+ reajuste);
    }
}
