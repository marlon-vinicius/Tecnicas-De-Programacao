/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.desenho;

/**
 *
 * @author 1091392223022
 */

import javax.swing.JFrame;
public class DrawPanelTest {
    
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }
    
}
