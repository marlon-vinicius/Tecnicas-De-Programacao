/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */
public class ExemploArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<numeros.length; i++){
            numeros[i] = input.nextInt();
        }
        
        System.out.print("Números informados:");
        for (int i = 0; i<numeros.length;i++){
           System.out.print(numeros[i] + " ");
        }
        
        double soma= 0;
        for (int i=0; i<numeros.length; i++){
            soma += numeros[i];
        }
        
        double media = soma / numeros.length;
        System.out.println("A média é :"+ media);
    }
}
