/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gui.desenho;

/**
 *
 * @author 1091392223022
 */

// Utilizando DrawLine para conectar os cantos de um painel

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    
    @Override
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        
        int width = getWidth(); // largura total
        int height = getHeight(); // altura total
        
        // desenha uma linha a partir do canto superior esquerdo até o cando inferior esquerdo
        //g.drawLine(0,0,width,height);
        
        // desenha uma lista a partir do canto inferior esquerdo até o canto superior direito
        //g.drawLine(0,height,width, 0);
        
        // desenha uma linha a partitr do meio superior até o meio inferior
        //g.drawLine(width/2, 0, width/2, height);
        
        // desenha uma linha a partitr do meio esquerdo até o meio direito
        //g.drawLine(0, height/2, width, height/2);
        
        // desenha 14 linhas do canto superior esquerdo até o meio da sua extremidade
       // for(int i = 0; i< 14;i++){
       //     int x = width / 14 * i;
       //     int y = height / 2;
       //     g.drawLine(0, 0, x, y);
       // } 
       
        // desenha 14 linhas do canto superior esquerdo até a diagonal inferior esquerda
       // for (int i = 0; i < 14 ; i++){
       //     int x1 = 0;  // posição x inicial da linha 
        //    int y1 = (height / 14) * i; // posição y inicial da linha
        //    int x2 = (width / 14) * i+1;  // posição x final da linha
        //    int y2 = height; // posição y final da linha
        //    g.drawLine(x1, y1, x2, y2);
       // }
       
       // desenha uma estrela com 10 linhas
       int middleX = width / 2; // coordenada X do meio do painel
       int middleY = height /2; // coordenada Y do meio do painel       
       int radius = Math.min(width, height) / 3; // raio da circunferencia que circuscreve a estrela 1/3 do valor
       
       // define as coordenas dos vertices da estrela
       int[] xPoints = new int[11];
       int[] yPoints = new int[11];
       
       for (int i=0; i <11; i++) {
        double angle = i * Math.PI /5;
        int x = (int) (middleX + Math.cos(angle) * radius);
        int y = (int) (middleY + Math.sin(angle) * radius);
        
        if (i % 2 == 0){ // vertice externa
           xPoints[i] = x;
           yPoints[i] = y;
        } else { // vertice interno
            xPoints[i] = (int) (middleX + Math.cos(angle) * radius / 2);
            yPoints[i] = (int) (middleY + Math.sin(angle) * radius / 2); 
        }
       }
       g.drawPolyline(xPoints, yPoints, 11);
       
    } 
}
