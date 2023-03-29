package exercicio;

import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */

// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, messes e dias e mostre-a
// expressada em dias. Leve em consideração o ano com 365 dias e o mês com 30 dias
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite sua idade em anos: ");
        int ano = input.nextInt();
        
        System.out.print("Meses: ");
        int mes = input.nextInt();
        
        System.out.print("E agora em dias: ");
        int dias = input.nextInt();
        
        int idade = (ano * 365) + (mes * 30) + dias;
        
        System.out.println("A sua idade em dias é: " + idade + "dias");
    }
}
