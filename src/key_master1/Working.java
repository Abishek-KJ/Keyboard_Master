/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/***
 * Comparison time to check words with dictionary:
 * 10,000 words = 4 Minutes:43 Seconds:96 Milliseconds
 * 5,000 words = 2 Minutes:14 Seconds:93 Milliseconds
 * 2,500 words = 1Minute:04 Seconds:93 Milliseconds
 * 1250 words = 29 Seconds
 * 625 = 13 Seconds
 * 313 = 7 Seconds
 * 156 = 4 Seconds
*/

package key_master1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.BufferedReader;
import java.lang.Exception;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public  class Working implements KeyListener,ActionListener{
    //String paragraph = "Example";
    String getData,user;  //Default Access Modifier
    public static int count,mispelledWords; //public Access Modifier and static variable 
    public static String getQuestion = " "; //public Access Modifier and static variable
    public static boolean ctrlPressed,cPressed,xPressed;
    //public static boolean controlPressed,cClicked,xClicked,vPressed;
    //public boolean controlPressed, vPressed, cClicked, xClicked, control_Pressed;
    byte display,dialog,open,show;
    public boolean oneTime;
   // public boolean control_Pressed;
    
    public Key_Master1 key;  //To Access Another Class's Variable Create Variable for Superclass.
    
    public Levels1 level1;
    
    //public Working(Key_Master1 key){
       // this.key = key;
    //}

    
    
        @Override
    public void keyReleased(KeyEvent e) {
        try{
        //getData = " ";
        getData = this.key.canvas.getText();
        System.out.println("From getData text : "+getData);
        if(getData == null){
            System.out.println("getData is null");
        }
        else{
        System.out.println("--------------------------------");
        System.out.println(getData);
        processQuestion(getData);
        }
        }
        catch(Exception check){
                System.out.println(check);
                }
        /*switch(e.getKeyCode()){
            case KeyEvent.VK_CONTROL:
                ctrlPressed = true;
                break;
                
            case KeyEvent.VK_C:
                cPressed = true;
                break;
        }
        if(ctrlPressed && cPressed){
            System.out.println("Control + C is Blocked, So Don't Cheat");
            e.consume();
        }*/
    }
    
    
        @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //boolean ctrlPressed, cPressed, xPressed;
        //boolean ctrlPressed = false;
        //boolean cPressed = false;
        //boolean xPressed = false;
        switch(e.getKeyCode()){
            case KeyEvent.VK_CONTROL:
                ctrlPressed = true;
                break;
            
            case KeyEvent.VK_C:
                if(show == 0){
                cPressed = true;
                }
                show = 1;
                break;
                
            case KeyEvent.VK_X:
                xPressed = true;
                break;    
        }
        
        
        if((ctrlPressed  && cPressed) || (ctrlPressed && xPressed)){
            System.out.println("From User Log : Control + C and Control + X is Blocked, So Don't Cheat");
            
            ImageIcon icon = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Stop.png");
            
            JLabel label = new JLabel("Copy Text and Cut Text is Blocked");
            label.setFont(new Font("arial",Font.BOLD,30));
            label.setForeground(Color.RED);
        
            if(display == 0)
            {
            JOptionPane.showMessageDialog(Key_Master1.con,label,"Alert",JOptionPane.OK_OPTION,icon);
            display = 1;
            }
            
            
            e.consume();
        }   
        
        switch(e.getKeyCode()){
            case KeyEvent.VK_CONTROL:
                ctrlPressed = true;
                break;
                
            case KeyEvent.VK_X:
                xPressed = true;
                break;
        }
        if(ctrlPressed && xPressed){
            System.out.println("From User Log : Control + X is Blocked");
            e.consume();
        }
        

    } 
   
       
    public void processQuestion(String question){
        try{
        getQuestion = question;
        String words[] = question.split(" ");
        System.out.println("From question : "+question);
        System.err.println("--------------------------------");
        System.err.println("Words Count : "+words.length);
        System.err.println("--------------------------------");
        count = 1;
        for(String word : words){           
            System.out.println("Words "+count+++" : "+word);
            String dictionary = dictionary(word);
           }
        System.out.println("---------------------------------");
        }
        catch(Exception check){
            System.out.println(check);
        }
        
        
                                Key_Master1.board.addKeyListener(new KeyListener(){
            //boolean controlPressed,vPressed,cClicked,xClicked;
            boolean controlPressed = false;
            boolean vPressed = false;
            boolean cClicked = false;
            boolean xClicked = false;
            boolean ctrlPressed = false;
            boolean control_Pressed = false;
            
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_CONTROL:
                        controlPressed = true;
                        ctrlPressed = true;
                        control_Pressed = true;
                        break;
                        
                    case KeyEvent.VK_C:
                          //if(cClicked == true);
                         //if(cClicked == false){
                        cClicked = true;
                         //}
                        break;
                   
                    case KeyEvent.VK_X:
                        xClicked = true;
                        break;
                                               
                    case KeyEvent.VK_V:
                        vPressed = true;
                        break;
            }
                
                if(ctrlPressed && vPressed){
                    System.out.println("From User Log : Control + V is Blocked");
                    
                    ImageIcon icon = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Stop.png");
                    
                    JLabel label = new JLabel("Paste Text is Blocked");
                    label.setFont(new Font("arial",Font.BOLD,30));
                    label.setForeground(Color.RED);
                    
                    if(dialog == 0){
                    //JOptionPane.showMessageDialog(Key_Master1.con,label,"Alert", JOptionPane.OK_OPTION,icon);
                    dialog = 1;
                    }
                   e.consume();
               }
                
                if((control_Pressed && cClicked) || (controlPressed && xClicked)){
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                System.out.println("From User Log : Control + C and Control + X, is Blocked");
                
                ImageIcon icon = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Wrong.png");
                
                JLabel label = new JLabel("Copy Text and Cut Text is Blocked");
                label.setFont(new Font("arial", Font.BOLD,30));
                label.setForeground(Color.RED);
                
                if(open == 0) {
                //JOptionPane.showMessageDialog(Key_Master1.con,label,"Alert",JOptionPane.OK_OPTION,icon);
                open = 1;
                }
                
                e.consume();
                
           }
                
       }
            
            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
                                
                                
                                //this.key.check.addActionListener(new ActionListener(){
                                //    if()
                                //});
        
        //Key_Master1.board.getInputMap().put(KeyStroke.getKeyStroke("Control V"),"none");
    }

                           
                                        
    public static  String dictionary(String search){ //declared static keyword to avoid object creation error
        try{
         System.out.println("Execution Starts");
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/words_alpha.txt"));
        String line;
        while((line=reader.readLine()) != null){
           if(line.equalsIgnoreCase(search)){
               System.out.println("This is spelled by Correctly(Compared with dictionary)");
               return search;
           }
        }
        System.out.println("This word is misspelled(Compared with dictionary)");
        reader.close();
        count = count+1;
        }
        catch(IOException detect){
            System.out.println(detect);
        }
        
         //count(mispelledWords); //methodName(argument name);
        return search;
    }
    
                                        
    @Override
    public void actionPerformed(ActionEvent e) throws NumberFormatException {
        //Key_Master1.con.setBackground(new Color(123,122,121));
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //user = " ";
        int correction = 0;
        user = this.key.board.getText();
        System.out.println("From user variable: "+user);
       /* String getUserWords[] = user.split(" ");
        String words[] = getQuestion.split( " ");
       for(String word : words){

       if(words.length != getUserWords.length){
          System.out.println("Arrays have different lengths");
          return;
      }
       else{
        for(int i = 0;i<words.length;i++){
            if(!words[i].equals(getUserWords[i])){
                correction = correction+1;
            }
        }
       }
       }*/
        
       // JLabel label = new JLabel("Correction : "+correction+" Try Again :)");
        JLabel misspelled = new JLabel("There are some words misspelled typed here.\n Please double check before submitting");
        misspelled.setFont(new Font("arial",Font.BOLD,30));
        misspelled.setForeground(Color.RED);
        
        
        JLabel completed = new JLabel("Hurray! You've Successfully Completed :)");
        completed.setFont(new Font("arial",Font.BOLD,30));
        
        JLabel blank = new JLabel("Blank or Empty");
        blank.setFont(new Font("arial",Font.BOLD,30));
        blank.setForeground(Color.BLACK);
        
        ImageIcon party = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Party_Small.png");
        ImageIcon wrong = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Wrong.png");
        
        //Blank JTextArea
        if(user.isBlank()){
            JOptionPane.showMessageDialog(this.key.con,blank,"Blank or Empty",JOptionPane.INFORMATION_MESSAGE);
        }
        
        //If User's answer question matches(Correct Answer)
        else  if(getQuestion.equals(user)){
            JOptionPane.showMessageDialog(this.key.con,completed,"Successfully Completed",JOptionPane.YES_OPTION,party);
        }
        //JOptionPane.showMessageDialog(this.key.con, correction,"Correction",JOptionPane.OK_OPTION);
        
        //If user's answer is wrong
        else{
            JOptionPane.showMessageDialog(this.key.con,misspelled,"Alert",JOptionPane.OK_OPTION,wrong);
        } 
    }
    
    
     public void backButton() throws NumberFormatException{
        this.key.check.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                 int state = level1.frame.getState();
                 if((state & JFrame.ICONIFIED) != 0){
                    System.out.println("Level1's JFrame is Minimized");
                 }
                 else
                 {
                    System.out.println("Levels1's JFrame is not Minimized");
                 }
                }
                catch(NullPointerException npe){
                    System.out.println(npe);
                } 
            }
            });
     }
     
     public void methodCall(){
         backButton();
     }
     
           /* private class level1 {

                public level1() {
                }
            }
        });
    }*/
     
     //static{
        // backButton();
     //}
    
   /* public void KeyPressed(KeyEvent e){
        switch(e.getKeyCode()){
            case KeyEvent.VK_CONTROL:
                ctrlPressed = true;
                break;
                
            case KeyEvent.VK_V:
                vPressed = true;
                break;
        }
        
        if(ctrlPressed && vPressed){
            System.out.println("Control + V is Blocked");
        }
    }*/
    
    
/*    public void prevent(){
        this.key.board.getInputMap().put(KeyStroke.getKeyStroke("control V") ,this.key.con);
        JOptionPane.showMessageDialog(this.key.con, "Paste is Blocked","Alert",JOptionPane.OK_OPTION);
    }*/

        
        //To block copy text from User
      /*  public void addCopyTextKeyListener(JTextArea canvas){
        Key_Master1.canvas.addKeyListener( new KeyAdapter() {
            boolean ctrlPressed = false;
            boolean cPressed = false;
            
            public void KeyPressed(KeyEvent e){
                switch(e.getKeyCode()){
                    
                    case KeyEvent.VK_CONTROL:
                        ctrlPressed = true;
                        break;
                        
                    case KeyEvent.VK_C:
                        cPressed = true;
                        break;
                }
                
                if(ctrlPressed && cPressed){
                    System.out.println("Blocked CTRL + C, No Cheating :)");
                    e.consume();
                }
            }
            
            public void KeyReleased(KeyEvent e){
                switch(e.getKeyCode()){
                    
                    case KeyEvent.VK_CONTROL:
                        ctrlPressed = true;
                        break;
                        
                    case KeyEvent.VK_C:
                        cPressed = true;
                        break;
                }
                
                if(ctrlPressed && cPressed){
                    System.out.println("Blocked CTRL + C, No Cheating :)");
                    e.consume();
                }
            }   
    });
        }
        
        //To block copy text from User

    @Override
    public void keyTyped(KeyEvent e) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
        
    
    
  
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*public static void count(int count){
        System.out.println("Misspelled Words : "+count);
        JOptionPane.showMessageDialog(Key_Master1.con,count,"Mispelled words count",JOptionPane.WARNING_MESSAGE);
    }*/
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    /*public void checkActionPerformed(java.awt.event.ActionEvent evt){
    String getData = " ";
    getData = this.key.canvas.getText();
    System.out.println(getData);
}*/

/*public static void main(String[] args) throws Exception{
    Working w = new Working();
    w.key = new Key_Master1();
    w.addTextAreaListener();
}*/

 /*   void checkActionPerformed() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String getData = " ";
        getData = this.key.canvas.getText();
        System.out.println(getData);
        
    }*/
    
    //Key_Typed() Method :
      /* try{
        System.out.println("Execution Starts");
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Abishek\\Dictionary\\english-words-master/words_alpha.txt"));
        String line;
        while((line  = reader.readLine()) != null){
            System.out.println("From Text File : "+line);
        }
        //System.out.println("From Text File: "+reader.readLine());
        }
        catch(IOException  detect){
            System.out.println(e);
            //e.printStackTrace();
        }*/
        //System.out.println(Arrays.toString(words));
    
    /*public void checkActionPerformed(java.awt.event.ActionEvent evt){
    String getData = " ";
    getData = this.key.canvas.getText();
    System.out.println(getData);
}*/

/*public static void main(String[] args) throws Exception{
    Working w = new Working();
    w.key = new Key_Master1();
    w.addTextAreaListener();
}*/

 /*   void checkActionPerformed() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String getData = " ";
        getData = this.key.canvas.getText();
        System.out.println(getData);
        
    }*/
    
    /*public void checkActionPerformed(java.awt.event.ActionEvent evt){
    String getData = " ";
    getData = this.key.canvas.getText();
    System.out.println(getData);
}*/

/*public static void main(String[] args) throws Exception{
    Working w = new Working();
    w.key = new Key_Master1();
    w.addTextAreaListener();
}*/

 /*   void checkActionPerformed() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String getData = " ";
        getData = this.key.canvas.getText();
        System.out.println(getData);
        
    }*/
     //   @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
      //  getData = " ";
        //getData = this.key.canvas.getText();
       // System.out.println("--------------------------------");
        //System.out.println(getData);
      
//  System.out.println("The Number of Words is "+lengthWords);
        
        //String words[] = getData.split(" ");
        //System.out.println("Word Count: "+words.length);
        //count = 1;
        //for(String word : words){           
           // System.out.println("Words "+count+++" : "+word);
            //String dictionary = dictionary(word);
            //System.out.println(dictionary);
           //}
        //System.out.println("---------------------------------");
    }
    
    
 /*  public static void main(String[] args){
        Working w = new Working();
        w.backButton();
    }*/
       
}