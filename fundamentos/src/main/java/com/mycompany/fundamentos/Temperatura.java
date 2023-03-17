/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fundamentos;

/**
 *
 * @author 1091392223022
 */
public class Temperatura {
    public static void main (String[] args) {
        
        final double AJUSTE = 32;
        final double FATOR = 5.0 / 9.0;
        
        double f = 86 ;
        
        double celsius = (f - AJUSTE) * FATOR;

        System.out.println("Temperatura em ºC é " + celsius);
        
    }
}
