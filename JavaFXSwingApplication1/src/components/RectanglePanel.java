/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

/**
 *
 * @author GIGABYTE
 */
public class RectanglePanel extends JPanel{
    public Color color;
    public void setColor(Color color){
        this.color = color;
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawImage(tombol, kotak.x, kotak.y, kotak.width, kotak.height, null);
        g.setColor(this.color);
        g.fillOval(200, 25, 100, 100);
        //g.setColor(Color.BLUE);
        //g.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        //g.drawString(ketikan, kotak.x +20, kotak.y+50);
        
    }
    
    /*private class Keyboard extends KeyAdapter{
        @Override
        public void keyTyped(KeyEvent ke){
            
            if(ke.getKeyCode()== KeyEvent.VK_ENTER)
            {
                ketikan = "";
            }else{
                ketikan += ke.getKeyChar();
            }
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Clicked ");
    }

    @Override
    public void mousePressed(MouseEvent me) {
        System.out.println("Pressed");
        Point titik = me.getPoint();
        if(kotak.contains(titik)){
            ketikan = "";
            repaint();
        }
        if(kotak2.contains(titik)){
            warna2 = Color.MAGENTA;
            repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        System.out.println("Released");
        Point titik = me.getPoint();
        if(kotak.contains(titik)){
            warna2 = Color.RED;
            repaint();
        }
        if(kotak2.contains(titik)){
            warna2 = Color.RED;
            repaint();
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        System.out.println("Enter");
    }

    @Override
    public void mouseExited(MouseEvent me) {
        System.out.println("Exit");
    }
*/
    
}
