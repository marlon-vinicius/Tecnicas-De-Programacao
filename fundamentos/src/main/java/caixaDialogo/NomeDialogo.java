/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caixaDialogo;

import javax.swing.JOptionPane;

/**
 *
 * @author 1091392223022
 */
public class NomeDialogo {
    public static void main(String[] args) {
        
        // Pede para o usuário inserir o nome
        String name = JOptionPane.showInputDialog("Qual é o seu nome ?");
        
//        // Cria mensagem 
//        String message = String.format("Olá %s, bem vindo ao Java", name);
//        
//        // Exibe a mensagem com o nome do usuário
//        JOptionPane.showMessageDialog(null, message);
        
        // Exibe a mensagem passando a variável diretamente
        JOptionPane.showMessageDialog(null, "Olá "+ name +", bem vindo ao Java");
    }
}
