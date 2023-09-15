/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package key_master1;

/**
 *
 * @author Lenovo
 */

import javax.swing.JFrame; 
import javax.swing.JLabel; 
import javax.swing.ImageIcon; 
import java.awt.Image; 
import java.awt.Toolkit; 
import java.awt.Color; 
import javax.swing.Timer; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent; 
import javax.swing.UIManager; 
import java.lang.reflect.Method; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException; 
import java.lang.IllegalAccessException; 
import java.lang.InstantiationException; 

import defaultpackage.About; 


public class Start {
    
    public JFrame frameStart; 
    
    public JLabel introduction; 
    
    public ImageIcon loading; 
    
    public Image iconStart; 
    
   
    
    Start(){ 
        
        //JFrame Configuration Starts Here...................
        
        
       frameStart = new JFrame(); 
       
      /* iconStart = new Image(); 
       
       iconStart = Toolkit.getImage(""); 
       
       
       iconStart = ToolKIt.getDefaultToolkit.getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); 
       
       iconStart = ToolKit.getDefaultToolKit.getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); 
        
       iconStart = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); */ 
       
       iconStart = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); 
       
       loading = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Introduction.gif"); 
       
       
       frameStart = new JFrame(); 
       frameStart.setIconImage(iconStart); 
       frameStart.setResizable(false); 
       //frameStart.setBounds(r);
       //frameStart.setSize(d); 
       frameStart.setSize(551,314); 
       frameStart.setLocationRelativeTo(null); 
       frameStart.getContentPane().setBackground(Color.GRAY); 
       frameStart.setLayout(null); 
       frameStart.setUndecorated(true); 
       frameStart.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
       
       
       introduction = new JLabel();
       introduction.setBounds(0,0,551,314); 
       introduction.setIcon(loading); 
       
       
       
       
       
       
       
       
       
       
       
       
       
       frameStart.add(introduction); 
       
       frameStart.setVisible(true); 
       
       
       int splashScreen = 6000; //Milliseconds 
       
       //byte splashScreen1 = (byte) 6000; //Milliseconds 
       
       //Timer timer = new Timer(splashScreen1, new ActionListener(){ 
       
       Timer timer = new Timer(splashScreen, new ActionListener(){     
       
       //Timer timer = new Timer(10000, new ActionListener(){ 
           @Override
           public void actionPerformed(ActionEvent e){
               frameStart.dispose(); 
               
               try{
                  UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
               } 
               catch(Exception exception){
                   System.out.println(exception); 
               }
              /* catch(ClassNotFoundException exception1 || InstantiationException exception2 || IllegalAccessException exception3 || UnsupportedLookAndFeelException exception4){ 
                   System.out.println(exception); 
               } 
               /*catch (InstantiationException ex) {
                   Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
               } catch (IllegalAccessException ex) {
                   Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
               } catch (UnsupportedLookAndFeelException ex) {
                   Logger.getLogger(Start.class.getName()).log(Level.SEVERE, null, ex);
               } */ 
              // Levels1 levels1 = new Levels1(); 
              // levels1.openPlayground1(); 
               for(int i = 2; i <= 60; i++){
                  // levels1.openPlayground1(); 
               } 
               
              try{
              Levels1 lev1 = new Levels1(); 
              
              //AboutTheSoftware about = new About(); 
              
              Method[] methods = lev1.getClass().getDeclaredMethods(); 
              
              //Method[] methods = about.getClass().getDeclaredMethods(); 
              
              for(Method method : methods){
                   if(method.getName().startsWith("openPlayground") || method.getName().startsWith("feedback")){     
                      method.invoke(lev1, (Object[]) null); 
                   } 
                   
                   /*if(method.getName().startsWith("AboutTheSoftware")){ 
                       method.invoke(about, (Object[]) null); 
                   }*/  
              }
              }
              catch(Exception exception){
                  System.out.println(exception); 
              }
              
           /*    try{
              
              AboutTheSoftware about = new About(); 
              
              Method[] methods1 = about.getClass().getDeclaredMethods(); 
              
              for(Method method : methods1){
                  if(method.getName().startsWith("About")){ 
                      method.invoke(about, (Object[]) null); 
                  } 
              }
              
              } 
              catch(Exception exception){
                  System.out.println(exception); 
              } 
              
              AboutTheSoftware about = new About(); 
              about.AboutTheSoftware(); 
              
       }   */ 
           } 
           
       });
       
       timer.setRepeats(false); 
       timer.start(); 
       
}

       
     // Levels1 levels1 = new Levels();  
      
    
     
     // Levels1 levels1 = new Levels1(); 
      
      
        
        
        
        
    

    
    
    public static void main(String[] args) throws Exception{ 
      //  try{
        //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); 
        Start start = new Start();  
    //    }
        //catch(ClassNotFoundException exception){
   //         System.out.println(exception); 
        //} 
        //finally{
        //    System.out.println(); 
      //  } 
        
       
       // Levels1 levels1 = new Levels1(); 
    }
    
    
    
}   





















