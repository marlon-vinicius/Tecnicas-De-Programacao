/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.avaliacao1b;

/**
 *
 * @author 1091392223022
 */
public class EscolherMaior {
    public static void main(String[] args) {
        int[] a = new int[10];
        
        a[0] = 10;
        a[1] = 5;
        a[2] = 7;
        a[3] = 3;
        a[4] = 1;
        a[5] = 3;
        a[6] = 11;
        a[7] = 20;
        a[8] = 6;
        a[9] = 9;
        
        int menor = a[0];
        int maior = a[0];
        
        for (int i = 0; i < a.length; i++){
            if (a[i] > maior){
              maior = a[i];  
            }
            
            if (a[i] < menor){
              menor = a[i];  
            }            
        }
        
        System.out.println("Maior valor: "+maior);
        System.out.println("Menor valor: "+menor);
    }
}
