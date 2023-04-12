/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.avaliacao1b;

/**
 *
 * @author 1091392223022
 */
public class ContarParesImpares {
    public static void main(String[] args) {
        int[] a = new int[13];
        
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        a[6] = 7;
        a[7] = 8;
        a[8] = 9;
        a[9] = 10;
        a[10] = 11;
        a[11] = 12;
        a[12] = 13;
        
        int par = 0;
        int impar = 0;
        
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
              par++;  
            }
            
            else {
              impar++;  
            }            
        }
        
        System.out.println("Quantidade de números pares: "+par);
        System.out.println("Quantidade de números impares: "+impar);
    }
}
