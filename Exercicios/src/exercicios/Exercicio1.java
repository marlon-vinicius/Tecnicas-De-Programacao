package exercicios;

/**
 *
 * @author 1091392223022
 */

//Faça um programa que imprima a soma dos números de 1 a 100.

public class Exercicio1 {
    public static void main(String[] args) {
        
        int soma = 0;
        
        for (int i =0;i<= 100; i++){
            soma += i;
        }
        
        System.out.println("A soma de 1 até 100 é " + soma);
    }
}
