/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;

/* ColorChooserDemo.java requires no other files. */
public class ColorChooserDemo extends JPanel
                              implements ChangeListener {

    protected JColorChooser tcc;
    protected JLabel banner;
    protected RectanglePanel rect;
    public ColorChooserDemo() {
        super(new BorderLayout());
        rect = new RectanglePanel();
        rect.setPreferredSize(new Dimension (200,150));
        rect.setBackground(Color.RED);
        rect.setBorder(BorderFactory.createTitledBorder("Model"));
        //Set up the banner at the top of the window
        /*banner = new JLabel("Welcome to the Tutorial Zone!",
                            JLabel.CENTER);
        banner.setForeground(Color.yellow);
        banner.setBackground(Color.blue);
        banner.setOpaque(true);
        banner.setFont(new Font("SansSerif", Font.BOLD, 24));
        banner.setPreferredSize(new Dimension(200, 100));
        
        JPanel bannerPanel = new JPanel(new BorderLayout());
        bannerPanel.setPreferredSize(new Dimension (300, 200));
        bannerPanel.add(banner, BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Kuliah 10"));
       */
       

        //Set up color chooser for setting text color
        tcc = new JColorChooser();
        tcc.setPreferredSize(new Dimension(500, 300));
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder(
                                                     "Choose Color"));
        final JLabel previewLabel = new JLabel("I Love Swing", JLabel.CENTER);
        previewLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 48));
        previewLabel.setSize(previewLabel.getPreferredSize());
        previewLabel.setBorder(BorderFactory.createEmptyBorder(0,0,1,0));
        previewLabel.setForeground(Color.yellow);
        tcc.setPreviewPanel(previewLabel);
        //tcc.setPreviewPanel(panel);

        //add(bannerPanel, BorderLayout.CENTER);
        add(rect, BorderLayout.CENTER);
        add(tcc, BorderLayout.PAGE_END);
    }

    public void stateChanged(ChangeEvent e) {
        Color newColor = tcc.getColor();
        rect.setColor(newColor);
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ColorChooserDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new ColorChooserDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
