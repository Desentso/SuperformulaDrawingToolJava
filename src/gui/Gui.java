/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Olli
 */
public class Gui implements Runnable{

    private JFrame frame;
    
    @Override
    public void run() {
        
        this.frame = new JFrame();
        
        this.frame.setPreferredSize(new Dimension(600, 540));

        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createObjects(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }
    
    public void createObjects(Container container){
        
        DrawingBoard draw = new DrawingBoard();
        
        container.add(draw);
    }

}
