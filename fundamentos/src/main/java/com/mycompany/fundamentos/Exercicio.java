/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;
import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */
public class Exercicio {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c,resultado;
        
        System.out.print("Digite o primeiro numero:");
        a = input.nextInt();
        
        System.out.print("Digite o segundo numero:");
        b = input.nextInt();
        
        System.out.print("Digite o terceiro numero:");
        c = input.nextInt(); 
        
        resultado = a * b * c;
        
        System.out.printf("O produto é %d%n ",resultado);
    }
}
