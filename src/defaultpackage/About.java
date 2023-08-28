package defaultpackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//import key_master1.AboutTheSoftware;

//import Key_Master1;

import key_master1.Levels1; 
import key_master1.AboutTheSoftware;

/**
 *
 * @author Lenovo
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;  
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Image;
import java.awt.Color; 
import java.awt.Font; 
import java.awt.event.MouseListener; 
//import org.w3c.dom.events.MouseEvent; 
import java.awt.event.MouseEvent;  
import javax.swing.JTextField;  



public class About implements AboutTheSoftware{       //Multiple Inheritance 
    
    
   public Levels1 levels1; 
    
    //About the software variable declaration starts here..................
   
    
   JFrame frame;  
   JLabel aboutInformations[]; 
   Image icon;
   int labelCount; 
   Font fontSpecifications; 
   JTextField coordinations; 
   ImageIcon information; 
   //JTextField Coordinations; 
   
   
   
   @Override 
   public void AboutTheSoftware(){
       
       //JFrame Configuration Starts Here.................
       
       frame = new JFrame();
       
       
       //Image Configuration Starts Here..............
       
       icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png");
       information = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Information_Bigsize.png"); 
       
       //Image Configuration Ends Here..................
       
       
       frame.setIconImage(icon);
       frame.setTitle("About the software");
       frame.setResizable(false); 
       frame.setDefaultCloseOperation(frame.DISPOSE_ON_CLOSE);
       frame.setLayout(null); 
       frame.setSize(800,500);
       frame.getContentPane().setBackground(Color.GRAY); 
       //frame.setBackground(Color.GRAY); 
       frame.setAlwaysOnTop(true); 
       frame.setLocationRelativeTo(null); 
      
       
       //Font Configuration Starts Here.................................
       
        fontSpecifications = new Font("arial",Font.PLAIN,20);
       
       
       
       //JLabel Configuration Starts Here.................
       
       //About Information Starts Here.....................
       
       
       labelCount = 13;  
       
       aboutInformations = new JLabel[labelCount]; 
       
       for(int i = 0; i < labelCount; i++){
           aboutInformations[i] = new JLabel(); 
           aboutInformations[i].setFont(fontSpecifications); 
           aboutInformations[i].setBackground(Color.GRAY); 
           aboutInformations[i].setForeground(Color.WHITE); 
           
       }
       
       //information = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Information_Bigsize.png"); 
       aboutInformations[0].setIcon(information); 
       aboutInformations[0].setFont(new Font("arial",Font.PLAIN,30));   
       aboutInformations[0].setText("About"); 
       aboutInformations[0].setBounds(320,10,150,50);   
       
       aboutInformations[1].setFont(new Font("arial",Font.BOLD,20)); 
       aboutInformations[1].setText("A Platform-Independent and Portable Software for Enhance your Typing Skills."); 
       aboutInformations[1].setBounds(25,55,800,50); 
       
       
       aboutInformations[2].setText("Software Name"); 
       
       aboutInformations[3].setText("Version Number");
       
       aboutInformations[4].setText("Release Date");
       
       aboutInformations[5].setText("Runs on");
       
       aboutInformations[6].setText("Build and developed by");
       
       
       //int y = 70;
       
       int yStart, yEnd; 
       
       //yStart = 70;
       
       yEnd = 245; 
       
       for(int i = 2, y = 90; i <= 6 && y <= yEnd; i = i+1, y = y+35){  
           aboutInformations[i].setBounds(170,y,280,50); 
       }
       
       
       for(int i = 7, y = 90; i <= 12 && y <= yEnd; i = i+1, y = y+35){
           aboutInformations[i].setText(":");
           aboutInformations[i].setBounds(390,y,20,50); 
       }
       
       
       aboutInformations[13].setText("Keyboard Master"); 
       
       aboutInformations[14].setText("1.0.0"); 
       
       aboutInformations[15].setText("31/08/2023"); 
       
       aboutInformations[16].setText("Windows,Linux,Unix,MacOS"); 
       
       aboutInformations[17].setText("K.J.Abishek"); 
       
       for(int i = 13, y = 90; i <= 18 && y <= yEnd; i = i+1, y = y+35){
           
       } 
       
       
       
       
       
       
       
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       //JTextField Configuration Starts Here...............................
       
      //coordinations = new JTextField(); 
      //coordinations.setFont(fontSpecifications);  
      //coordinations.setBounds(0,500,100,100); 
       
      coordinations  = new JTextField();
      coordinations.setFont(new Font("arial",Font.BOLD,13));  
      coordinations.setBounds(5,430,290,30);   
       
       
       
       
       
       
       
       
     
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       frame.add(coordinations); 
       
       
       for(int i = 0; i < labelCount; i++){
           frame.add(aboutInformations[i]); 
       }
       
       
       frame.setVisible(true); 
       
       //JFrame Configuration Ends Here.............
       //JFrame Configuration Ends Here.............
       
       
       
     //Levels1.
     
     
     //levels1.
       
       
       frame.addMouseListener(new MouseListener(){
           
           @Override 
           public void mouseClicked(MouseEvent e){
               
               int x = e.getX();
               int y = e.getY();
               
               //levels1.coordinations1.setText("X-Coordinations : "+x+" "+"Y-Coordinations : "+y); 
                 
               //this.levels1.coordinations1.setText("X - Coordinations : "+x+" "+"Y - Coordinations : "+y);
               
               coordinations.setText("X - Coordinate : "+x+" Y - Coordinate : "+y); 
               
           } 

           @Override
           public void mousePressed(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }

           @Override
           public void mouseReleased(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }

           @Override
           public void mouseEntered(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }

           @Override
           public void mouseExited(MouseEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
           }
           
           
       });
       
       
       
       
              
   }
   
   public static void main(String[] args) throws Exception{
       
       UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
       
       AboutTheSoftware about = new About();
       
       about.AboutTheSoftware(); 
       
       
   } 
    
    
    
}
