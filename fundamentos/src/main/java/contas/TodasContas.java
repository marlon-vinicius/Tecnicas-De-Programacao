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
public class TodasContas {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       Conta1 primeiroObj = new Conta1();
       
        System.out.println("Digite o nome do primeiro objeto: ");
        String name = entrada.nextLine();
        primeiroObj.setName(name);
        
        Conta2 segundoObj = new Conta2("Vinicius");
        Conta2 terceiroObj = new Conta2("Souza");
        
        System.out.printf("Os nomes de todos os objetos: %s %s %s",
                primeiroObj.getName(),segundoObj.getName(),terceiroObj.getName());
    }
}
