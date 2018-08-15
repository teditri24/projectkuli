/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

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
import javax.swing.JPanel;

/**
 *
 * @author GIGABYTE
 */
public class RectanglePanel extends JPanel implements MouseListener{
    Rectangle kotak, kotak2;
    Color warna1, warna2;
    Image tombol; 
    String ketikan ="";
    char[] ketikan2;
    
    public RectanglePanel(){
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLUE);
        kotak = new Rectangle(10, 10, 200, 100);
        kotak2 = new Rectangle(150, 150, 200, 200);
        warna1 = Color.YELLOW;
        warna2 = Color.RED;
        tombol = new ImageIcon(this.getClass().getResource("img/button.png")).getImage();
        addMouseListener(this);
        addKeyListener(new Keyboard());
        setFocusable(true);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(tombol, kotak.x, kotak.y, kotak.width, kotak.height, null);
        g.setColor(warna2);
        g.fillOval(kotak2.x, kotak2.y, kotak2.width, kotak2.height);
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.ITALIC, 24));
        g.drawString(ketikan, kotak.x +20, kotak.y+50);
        
    }
    
    private class Keyboard extends KeyAdapter{
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
}
