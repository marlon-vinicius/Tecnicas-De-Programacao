/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;
import java.util.Scanner;

/**
 *
 * @author 1091392223022
 */
// Cria e manipula um objeto Conta1
public class TesteConta1 {
    public static void main(String[] args) {
      // cria um objeto Scanner para obter entrada a partir da janela de comando
      Scanner input = new Scanner(System.in);
      
      // cria um objeto Conta1 e atribui a minhaConta
      Conta1 minhaConta = new Conta1();
      
      // Exibe o valor inicial do nome (null)
      System.out.printf("O nome inicial é: %s%n%n", minhaConta.getName());
      
      // Solicita e lê o nome
      System.out.println("Por favor, entre com o nome: ");
      String name = input.nextLine();  // Lê uma linha de texto
      minhaConta.setName(name); // Insere "name" em minhaConta
      System.out.println();  // Gera uma saida de uma linha em branco
      
      // Exibe o nome armazenado no objeto minhaConta
      System.out.printf("O nome do objeto em minhaConta é: %n%s%n", minhaConta.getName());
    }
            
} // Fim da classe TesteConta1
