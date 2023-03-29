/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author 1091392223022
 */

// Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
// A média dos números 4,5 e 6. A somadas duas médias. A médias das duas médias
public class Ex2 {
    public static void main(String[] args) {
        double media = (7+8+9)/3;
        double media2 = (4+5+6)/3;
        
        double soma_media = (media + media2);
        
        double media_media = (media + media2) / 2;
        
        System.out.println("A média de 7, 8, 9 é: "+ media);
        System.out.println("A média de 4, 5, 6 é: " + media2);
        System.out.println("A soma das médias é: "+ soma_media);
        System.out.println("A média das médias é: "+ media_media);
    }
}
