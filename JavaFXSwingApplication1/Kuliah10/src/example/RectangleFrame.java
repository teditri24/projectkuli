/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import javax.swing.JFrame;

/**
 *
 * @author GIGABYTE
 */
public class RectangleFrame extends JFrame{
    RectanglePanel panel;
    
    public RectangleFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Kuliah 10 - Rectangle");
        panel = new RectanglePanel();
        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main (String[] args){
        new RectangleFrame();
    }
}
