/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package key_master1;

/**
 *
 * @author Lenovo
 */

import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color; 


public interface AboutTheSoftware{
    
    //JLabel aboutInformations[];
    
    //aboutInformations = new JLabel[7];
    
    //int MAX_SPEED = 50;
    
    void AboutTheSoftware();
    
}



public class about implements AboutTheSoftware{
    
    JFrame frame;
    JLabel aboutInformations[];
    
    public void AboutTheSoftware(){
        
        
        
        //JFrame Configuration Starts Here................
        
        frame = new JFrame();
        frame.setTitle("About");
        frame.setBackground(Color.GRAY);
        
        
        
        
        
    }
    
    
}