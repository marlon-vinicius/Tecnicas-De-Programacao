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
        g.drawLine(0,0,width,height);
        
        // desenha uma lista a partir do canto inferior esquerdo até o canto superior direito
        g.drawLine(0,height,width, 0);
        
    } 
}
