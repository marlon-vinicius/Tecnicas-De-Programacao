/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// usando o construtor de Conta2 para inicializar a instância "name"
//no momento em que cada objeto Conta2 é criado
package contas;

/**
 *
 * @author 1091392223022
 */
public class TesteConta2 {
    public static void main(String[] args) {
        //criando dois objetos Conta2
        Conta2 minhaConta1 = new Conta2("Marlon");
        Conta2 minhaConta2 = new Conta2("Vinicius");
        
        //exibe o valor inicial de "name" para Conta2
        System.out.printf("Os nome dos objetos são: %s %s", minhaConta1.getName(),minhaConta2.getName());
    }
    
}
