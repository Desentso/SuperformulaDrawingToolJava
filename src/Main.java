
import functions.Superformula;
import gui.Gui;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Olli
 */
public class Main {
    
    public static void main(String args[]){
        
        System.out.println("Test");
        
        Gui gui = new Gui();
        Superformula superformula = new Superformula(new ArrayList<>());
        
        //superformula.calculate();
        
        gui.run();
        
    }
}
