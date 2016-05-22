/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import functions.Superformula;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author Olli
 */
public class DrawingBoard extends JPanel{
    
    public DrawingBoard(){
        
    }
    
    @Override
    protected void paintComponent(Graphics g){

        super.paintComponent(g);
        
        Superformula superformula = new Superformula(new ArrayList<>());
        superformula.calculate();
        
        //ArrayList<Double> nums = superformula.getNums();
        HashMap<Double, Double> coords = superformula.getCoords();
        
        g.drawLine(300, 0, 300, 500);
        g.drawLine(0, 250, 600, 250);
        
        Graphics2D g2d = (Graphics2D)g;
        g2d.setFont(new Font("default", Font.BOLD, 18));
        g2d.drawString("Y", 280, 20);
        g2d.drawString("X", 560, 240);
        
        double xlen = 50.0;
        double ylen = 50.0;
        
        System.out.println(250 + (50.0 * 0.0174));
        
        for(Double x : coords.keySet()){
            
                
            g.drawLine(300, 250, 300 + (int) Math.round(xlen * x), 250 + (int) Math.round(ylen * coords.get(x)));
            
        }
    }
    
    public void update(){
        
        repaint();
    }
}
