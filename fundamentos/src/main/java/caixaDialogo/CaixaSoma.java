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
public class CaixaSoma {
    public static void main(String[] args) {
        
        // Digitando os números na caixa de diálogo para somar
        String num1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String num2 = JOptionPane.showInputDialog("Digite o segundo número");
        
        // Convertendo as entradas de String para inteiro
        int convertNum1 = Integer.parseInt(num1);
        int convertNum2 = Integer.parseInt(num2);
        
        // Fazendo a soma dos dois números
        int soma = convertNum1 + convertNum2 ;
        
        String message = String.format("%s + %s = %s", num1,num2,soma);        
        JOptionPane.showMessageDialog(null,message);
        
        
    }
}
