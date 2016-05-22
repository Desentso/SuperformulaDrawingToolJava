/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Olli
 */
public class Superformula {
    
    private ArrayList<Double> numbers;
    private HashMap<Double, Double> coordinates;
    
    public Superformula(ArrayList<Integer> parameters){
        
        this.numbers = new ArrayList<>();
        this.coordinates = new HashMap<>();
    }
    
    public void calculate(){
        double m = 10.0;
        double n1 = 8.0;
        double n2 = 5.0;
        double n3 = 8.0;
        
        //double angle = 0;
        
        for(double i = 0; i < 360; i += 0.2){
            
            double angle = Math.toRadians(i);

            double sum1 = Math.pow(Math.abs(Math.cos((m*angle) / 4)), n2);
            double sum2 = Math.pow(Math.abs(Math.sin((m*angle) / 4)), n3);

            double r = Math.pow(sum1 + sum2, -(1/n1));

            //System.out.println(r + ", Angle: " + angle);
            double x = r * Math.cos(angle);
            double y = r * Math.sin(angle);
            this.coordinates.put(x, y);
            
            //System.out.println(r + ", Angle: " + angle + ", X: " + x + ", Y: " + y);
            
            this.numbers.add(r);
        }
    }
    
    public ArrayList<Double> getNums(){
        
        return this.numbers;
    }
    
    public HashMap<Double, Double> getCoords(){
        
        return this.coordinates;
    }
}
