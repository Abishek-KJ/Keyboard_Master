/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package key_master1;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.*;
import javax.swing.text.StyleConstants;

public class Key_Master1{
   public static JFrame con;
   public static JTextArea canvas,board;
   public Container layer;
   public Image icon;
   public JButton check;
   public static JButton submit;
   public ImageIcon button;
    
   public Key_Master1() throws Exception{
        //Main Frame Configuration Starts Here.....
        con  = new JFrame("Keyboard Master");
        //con.setAlwaysOnTop(true);
        con.setSize(1450,800);
        GroupLayout group = new GroupLayout(con);
        con.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        con.setResizable(false);
        //Main Frame Configuration Ends Here.........
        
       //----------------------------------------------------
       
       //Container Configuration Starts Here..........
       layer = con.getContentPane(); //Attached container to JFrame;
       layer.setLayout(null);
       layer.setBackground(Color.GRAY);
       //Container Configuration Ends Here.........
       
       
       //Icon Configuration Starts Here.....
     //  icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); 
          icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Icon.png")); 
       con.setIconImage(icon);
       //Icon Configuration Ends Here....
       
 
       
       //Canvas Configuration Starts Here..........
      canvas = new JTextArea();
      canvas.setBounds(30,60,1375,300);
      canvas.setFont(new Font("arial",Font.BOLD,20));
      canvas.setLineWrap(true);
      canvas.setEditable(false); 
      canvas.setWrapStyleWord(true); //To Wrap around word boundaries
      MutableAttributeSet space = new SimpleAttributeSet();
      StyleConstants.setLineSpacing(space, 10);
      JScrollPane scroll = new JScrollPane(canvas);
      scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.setBounds(30,60,1375,300);
      scroll.setPreferredSize(new Dimension(1375,300));     
      //Container Configuration
      layer.add(scroll);
      //Container Configuration
      //canvas.setSize(800,500);
      //Canvas Configuration Ends Here..........
      
      //JButton Image
      //button = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Back_Arrow(1).png");
      
      
      //check Configuration Starts Here.....
      check = new JButton();
      check.setText("← Back");
      check.setFont(new Font("arial",Font.BOLD,15));
      check.setBounds(30,20,75,30);
      check.setToolTipText("To Check the Spelling of Master Paragraph");
      //check.doClick(1); 
      check.setVisible(false); 
      con.add(check); 
    //  con.add(check); 
     // con.setVisible(false); 
      //check Configuration Ends Here.........
      
      //board Configuration Starts Here
      board = new JTextArea();
      board.setBounds(30,400,1375,300);
      board.setFont(new Font("arial",Font.BOLD,20));
      board.setLineWrap(true);
      board.setWrapStyleWord(true);
      //board.getInputMap().put(KeyStroke.getKeyStroke("control V"), con);
      //JOptionPane.showMessageDialog(con,"Control + V is Blocked","Alert", JOptionPane.OK_OPTION);
      JScrollPane scroll1 = new JScrollPane(board);
      scroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
      scroll1.setBounds(30,410,1375,300);
      scroll1.setPreferredSize(new Dimension(1375,300));
      con.add(scroll1);
      
      
      
      //submit Configuration Starts Here.....
      submit = new JButton();
      submit.setText("Submit");
      submit.setFont(new Font("arial",Font.BOLD,15));
      submit.setBounds(1150,720,120,30);
      submit.setToolTipText("Submit Text you Typed to Verify against Master Paragraph");
      //submit.doClick(1);
      con.add(submit);
      //submit Configuration Ends Here......
      
      
      
      //JFrame Open in Center of the Screen Starts
      Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
      //con.setLocation(dimension.width/2-this.getSize().width/2,dimension.height/2-this.getSize().height/2);
      con.setLocationRelativeTo(null); //Centers the JFrame
      //JFrame Open in Center of the Screen Ends
      
      

      //Frame Configuration...
      con.setVisible(true);
      //Frame Configuration...\
      
   }
      
   /*public void addCopyTextKeyListener(JTextArea canvas){
        Working working = new Working();
        working.addCopyTextKeyListener(canvas);
      }*/

      
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        Key_Master1 km = new Key_Master1(); //Project's Core GUI - Graphical User Interface
        //Project's Core Class objects starts
        Working w = new Working();
        //Levels1 levels1 = new Levels1();
        w.key = km; //Working Class(Object).In Working Class Key_Master1(Object) = Key_Master1 Class(Object)
        //w.addTextAreaListener();
        km.canvas.addKeyListener(w);
        km.submit.addActionListener(w);
        km.canvas.setText( "Mastering typing can be challenging");
        w.processQuestion(km.canvas.getText());
        //w.backButton();
        km.check.addActionListener(w);
        //w.methodCall();
        //w.prevent();
        //w.addCopyTextKeyListener();
        //km.addCopyTextKeyListener(km.canvas);
        //Working w = new Working();
        //w.addTextAreaListener();
       // km.setIconImage(icon);
       //Project's Core Class Objects Ends
       
       //Levels GUI - Graphical User Interface starts Here
       //Levels level = new Levels();
       
        
        
    }


    /***private void setIconImage(Image image){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
    
}
