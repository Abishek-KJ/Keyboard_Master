/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package key_master1;

//package defaultpackage; 

/**
 *
 * @author Lenovo
 */

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.Rectangle;
import java.lang.StringBuffer;
import java.lang.StringBuilder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
//import javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JOptionPane;
import defaultpackage.About; 


public class Levels1 { 
    
    public Key_Master1 key; 
    
    public Working w; 
    
    public About about; 
    
    JFrame frame;
    JTabbedPane tabbedPane;
    JPanel beginner1,beginner2,intermediate1,intermediate2,expertise1,expertise2;
    Image icon;
    public  JTextField coordinations1,coordinations2,coordinations3,coordinations4,coordinations5,coordinations6;
    
    //Beginner - I variable declaration starts here......
    
    JLabel beginner;
    JLabel level1, level2, level3, level4, level5, level6, level7, level8, level9, level10;
    JButton open1,open2, open3, open4, open5, open6, open7, open8, open9, open10;
    ImageIcon beginnerStar, play; 
     
    //Beginner - I variable declaration ends here.....
    
    
    //Beginner - II variable declaration Starts here.........
    
    JLabel beginnerLevel2;
    JLabel level11, level12, level13, level14, level15, level16, level17, level18, level19, level20;
    JButton open11,open12, open13, open14, open15, open16, open17, open18, open19, open20;
    
    //Beginner - II variable declaration ends here.........
    
    
    
    //Intermediate - I variable declaration starts here..........
    
    JLabel intermediateLevel1;
    JLabel level21, level22, level23, level24, level25, level26, level27, level28, level29, level30;
    JButton open21, open22, open23, open24, open25, open26, open27, open28, open29, open30;
    ImageIcon intermediateStar;
    
   //Intermediate - I variable declaration ends here............
    
    
   //Intermediate - II variable declaration starts here......
    
    JLabel intermediateLevel2;
    JLabel level31, level32, level33, level34, level35, level36, level37, level38, level39, level40;
    JButton open31, open32, open33, open34, open35, open36, open37, open38, open39, open40;
    
    //Intermediate - II variable declaration ends here........
    
    
    
    //Expertise - I variable declaration starts here..................
    
    JLabel expertiseLevelOne;
    JLabel expertiseLevel1;
    JLabel level41, level42, level43, level44, level45, level46, level47, level48, level49, level50;
    JButton open41, open42, open43, open44, open45, open46, open47, open48, open49, open50;
    
    //Expertise - I variable declaration ends here.......................
    
    
    
    //Expertise - II variable declaration starts here........................
    
    JLabel expertiseLevelTwo;
    JLabel expertiseLevel2;
    JLabel level51, level52, level53, level54, level55, level56, level57, level58, level59, level60;
    JButton open51, open52, open53, open54, open55, open56, open57, open58, open59, open60;
    Font font;
    
    //Expertise - II variable declaration ends here...........................
    
    
    //About the software variable declaration starts here...........................
    
    JButton aboutTheSoftware[]; 
    ImageIcon information;
    int buttonCount; 
    
   // JLabel aboutTheSoftware[];
    //JFrame about;
    
    
    //JButton[] aboutTheSoftware;
    
   
    
    
    
    
    
    public Levels1(){ 
        frame = new JFrame();
        frame.setTitle("Keyboard Master");
        frame.setSize(1450,800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        //frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        //frame.setAlwaysOnTop(false);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
        
       // icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); 
        icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Icon.png")); 
        
        frame.setIconImage(icon);
        
        
       // play = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Play.png"); 
        play = new ImageIcon(getClass().getClassLoader().getResource("Play.png")); 
        
        
        //Beginner - I Configuration starts here.............
        
       // beginnerStar = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Beginner_Star.png"); 
        beginnerStar = new ImageIcon(getClass().getClassLoader().getResource("Beginner_Star.png")); 
        
        
        
        beginner = new JLabel();
        beginner.setText("Beginner - I");
        beginner.setIcon(beginnerStar);
        beginner.setFont(new Font("arial",Font.PLAIN,20));
        beginner.setForeground(Color.WHITE);
        beginner.setBounds(70,26,160,30);
        
        
        //Level 1 Configuration starts here............
        
        level1 = new JLabel();
        level1.setFont(new Font("arial",Font.PLAIN,20));
        level1.setText("Level 1 : 2 Lines(37 Words)");
        level1.setForeground(Color.WHITE);
        level1.setBounds(70,76,270,30);
        
        
        open1 = new JButton();
        open1.setFont(new Font("arial",Font.PLAIN,20));
        open1.setIcon(play);
        open1.setText("Open Playground");
        open1.setBackground(Color.GRAY);
        open1.setForeground(Color.WHITE);
        open1.setBounds(1039,76,190,30);
        
        //Level 1 Configuration Ends here..........
        
        
        
        //Level 2 Configuration starts here.......
        
        level2 = new JLabel();
        level2.setFont(new Font("arial",Font.PLAIN,20));
        level2.setText("Level 2 : 2 Lines(32 Words)");
        level2.setForeground(Color.WHITE);
        level2.setBounds(70,136,270,30);
        
        
        open2 = new JButton();
        open2.setFont(new Font("arial",Font.PLAIN,20));
        open2.setIcon(play);
        open2.setText("Open Playground");
        open2.setBackground(Color.GRAY);
        open2.setForeground(Color.WHITE);
        open2.setBounds(1039,136,190,30); //76 + 45 = 121 + 4
        
        
        //Level 2 Configuration ends here.........
        
        
         level3 = new JLabel();
         level3.setFont(new Font("arial",Font.PLAIN,20));
         level3.setText("Level 3 : 2 Lines(42 Words)");
         level3.setForeground(Color.WHITE);
         level3.setBounds(70,196,270,30);
         
         
         open3 = new JButton();
         open3.setFont(new Font("arial",Font.PLAIN,20));
         open3.setIcon(play);
         open3.setText("Open Playground");
         open3.setBackground(Color.GRAY);
         open3.setForeground(Color.WHITE);
         open3.setBounds(1039,196,190,30); //121 + 45 = 166 + 5
         
         
         //Level 3 Configuration Ends here..........
         
         
         //Level 4 Configuration Starts Here.....
         
         level4 = new JLabel();
         level4.setFont(new Font("arial",Font.PLAIN,20));
         level4.setText("Level 4 : 2 Lines(36 Words)");
         level4.setForeground(Color.WHITE);
         level4.setBounds(70,256,270,30);
         
         
         
         open4 = new JButton();
         open4.setFont(new Font("arial",Font.PLAIN,20));
         open4.setBackground(Color.GRAY);
         open4.setForeground(Color.WHITE);
         open4.setIcon(play);
         open4.setText("Open Playground");
         open4.setBounds(1039,256,190,30);
         
         
         //Level 4 Configuration Ends Here....
         
         
        //Level 5 Configuration Starts Here.......
        
        level5 = new JLabel();
        level5.setFont(new Font("arial",Font.PLAIN,20));
        level5.setText("Level 5 : 2 Lines(33 Words)");
        level5.setForeground(Color.WHITE);
        level5.setBounds(70,316,270,30);
        
        
        
        open5 = new JButton();
        open5.setFont(new Font("arial",Font.PLAIN,20));
        open5.setBackground(Color.GRAY);
        open5.setForeground(Color.WHITE);
        open5.setIcon(play);
        open5.setText("Open Playground");
        open5.setBounds(1039,316,190,30);
        
        //Level 5 Configuration Starts Here..........
        
        
        
        //Level 6 Configuration Starts Here.........
        level6 = new JLabel();
        level6.setFont(new Font("arial",Font.PLAIN,20));
        level6.setText("Level 6 : 3 Lines(56 Words)");
        level6.setForeground(Color.WHITE);
        level6.setBounds(70,376,270,30);
        
        
        
        open6 = new JButton();
        open6.setFont(new Font("arial",Font.PLAIN,20));
        open6.setBackground(Color.GRAY);
        open6.setForeground(Color.WHITE);
        open6.setIcon(play);
        open6.setText("Open Playground");
        open6.setBounds(1039,376,190,30);
        
        
        //Level 6 Configuration Ends Here.........
        
        
        //Level 7 Configurtion Starts Here...........
        
        level7 = new JLabel();
        level7.setFont(new Font("arial",Font.PLAIN,20));
        level7.setText("Level 7 : 3 Lines(51 Words)");
        level7.setForeground(Color.WHITE);
        level7.setBounds(70,436,270,30);
        
        
        open7 = new JButton();
        open7.setFont(new Font("arial",Font.PLAIN,20));
        open7.setBackground(Color.GRAY);
        open7.setForeground(Color.WHITE);
        open7.setIcon(play);
        open7.setText("Open Playground");
        open7.setBounds(1039,436,190,30);
        
        //Level 7 Configuration Ends Here..........
        
        
        //Level 8 Configuration Starts here..........
        
        
        level8 = new JLabel();
        level8.setFont(new Font("arial",Font.PLAIN,20));
        level8.setText("Level 8 : 3 Lines(65 Words)");
        level8.setForeground(Color.WHITE);
        level8.setBounds(70,496,270,30);
        
        
        open8 = new JButton();
        open8.setFont(new Font("arial",Font.PLAIN,20));
        open8.setBackground(Color.GRAY);
        open8.setForeground(Color.WHITE);
        open8.setIcon(play);
        open8.setText("Open Playground");
        open8.setBounds(1039,496,190,30);
        
        
        //Level 8 Configuration Ends Here........
        
        
        //Level 9 Configuration Starts Here........
        
        
        level9 = new JLabel();
        level9.setFont(new Font("arial",Font.PLAIN,20));
        level9.setText("Level 9 : 3 Lines(59 Words)");
        level9.setForeground(Color.WHITE);
        level9.setBounds(70,556,270,30);
        
        
        open9 = new JButton();
        open9.setFont(new Font("arial",Font.PLAIN,20));
        open9.setBackground(Color.GRAY);
        open9.setForeground(Color.WHITE);
        open9.setIcon(play);
        open9.setText("Open Playground");
        open9.setBounds(1039,556,190,30);
     
        //Level 9 Configuration Ends Here.......
        
        
        //Level 10 Configurtion Starts Here.......
        
        level10 = new JLabel();
        level10.setFont(new Font("arial",Font.PLAIN,20));
        level10.setText("Level 10 : 3 Lines(63 Words)");
        level10.setForeground(Color.WHITE);
        level10.setBounds(70,616,270,30);
        
        
        open10 = new JButton();
        open10.setFont(new Font("arial",Font.PLAIN,20));
        open10.setBackground(Color.GRAY);
        open10.setForeground(Color.WHITE);
        open10.setIcon(play);
        open10.setText("Open Playground");
        open10.setBounds(1039,616,190,30);
        
        
        //Level 10 Configuration Ends Here........
        
        
        //Beginner - I Configuration Ends Here..........
        
        
        //Beginner - II Configuration Starts Here...........
        
        beginnerLevel2 = new JLabel();
        beginnerLevel2.setFont(new Font("arial",Font.PLAIN,20));
        beginnerLevel2.setIcon(beginnerStar);
        beginnerLevel2.setText("Beginner - II");
        beginnerLevel2.setForeground(Color.WHITE);
        beginnerLevel2.setBounds(70,26,160,30);
        
        //Level 11 Configuration Starts Here........
        
        level11 = new JLabel();
        level11.setFont(new Font("arial",Font.PLAIN,20));
        level11.setText("Level 11 : 4 Lines(101 Words)");
        level11.setBackground(Color.GRAY);
        level11.setForeground(Color.WHITE);
        level11.setBounds(70,76,270,30);
        
        open11 = new JButton();
        open11.setFont(new Font("arial", Font.PLAIN, 20));
        open11.setIcon(play);
        open11.setText("Open Playground");
        open11.setBackground(Color.GRAY);
        open11.setForeground(Color.WHITE);
        open11.setBounds(1039,76,190,30);
        
        
        //Level 11 Configuration Ends Here............
        
        
        
        //Level 12 Configuration Starts Here........
        
        level12 = new JLabel();
        level12.setFont(new Font("arial",Font.PLAIN,20));
        level12.setText("Level 12 : 4 Lines(100 Words)");
        level12.setForeground(Color.WHITE);
        level12.setBounds(70,136,270,30);
        
        
        open12 = new JButton();
        open12.setFont(new Font("arial",Font.PLAIN,20));
        open12.setIcon(play);
        open12.setText("Open Playground");
        open12.setBackground(Color.GRAY);
        open12.setForeground(Color.WHITE);
        open12.setBounds(1039,136,190,30);
        
        //Level 12 Configuration Ends Here...........
        
        
        
        //Level 13 Configuration Starts Here.......
        
        level13 = new JLabel();
        level13.setFont(new Font("arial",Font.PLAIN,20));
        level13.setText("Level 13 : 4 Lines(80 Words)");
        level13.setForeground(Color.WHITE);
        level13.setBounds(70,196,270,30);
        
        
        
        open13 = new JButton();
        open13.setFont(new Font("arial",Font.PLAIN,20));
        open13.setIcon(play);
        open13.setText("Open Playground");
        open13.setBackground(Color.GRAY);
        open13.setForeground(Color.WHITE);
        open13.setBounds(1039,196,190,30);
        
        
        //Level 13 Configuration Ends Here........
        
        
        //Level 14 Configuration Starts Here........
        
        
        level14 = new JLabel();
        level14.setFont(new Font("arial",Font.PLAIN,20));
        level14.setText("Level 14 : 4 Lines(73 Words)");
        level14.setBackground(Color.GRAY);
        level14.setForeground(Color.WHITE);
        level14.setBounds(70,256,270,30);
        
        
        open14 = new JButton();
        open14.setFont(new Font("arial",Font.PLAIN,20));
        open14.setIcon(play);
        open14.setText("Open Playground");
        open14.setBackground(Color.GRAY);
        open14.setForeground(Color.WHITE);
        open14.setBounds(1039,256,190,30);
        
        
        //Level 14 Configuration Ends Here..........
        
        
        //Level 15 Configuration Ends Here.....
        
        level15 = new JLabel();
        level15.setFont(new Font("arial",Font.PLAIN,20));
        level15.setText("Level 15 : 4 Lines(71 Words)");
        level15.setForeground(Color.WHITE);
        level15.setBounds(70,316,270,30);
        
        
        
        open15 = new JButton();
        open15.setFont(new Font("arial", Font.PLAIN,20));
        open15.setIcon(play);
        open15.setText("Open Playground");
        open15.setBackground(Color.GRAY);
        open15.setForeground(Color.WHITE);
        open15.setBounds(1039,316,190,30);
        
        
        //Level 15 Configuration ends here..........
        
        
        
        //Level 16 Configuration starts here.........
        
        level16 = new JLabel();
        level16.setFont(new Font("arial",Font.PLAIN,20));
        level16.setText("Level 16 : 5 Lines(92 Words)");
        level16.setForeground(Color.WHITE);
        level16.setBounds(70,376,270,30);
        
        
        open16 = new JButton();
        open16.setFont(new Font("arial",Font.PLAIN,20));
        open16.setIcon(play);
        open16.setText("Open Playground");
        open16.setBackground(Color.GRAY);
        open16.setForeground(Color.WHITE);
        open16.setBounds(1039,376,190,30);
        
        
        //Level 16 Configurtion ends here...............
        
        
        //Level 17 Configuration stats here.........
        
        
        level17 = new JLabel();
        level17.setFont(new Font("arial",Font.PLAIN,20));
        level17.setText("Level 17 : 5 Lines(93 Words)");
        level17.setForeground(Color.WHITE);
        level17.setBounds(70,436,270,30);
        
        
        
        open17 = new JButton();
        open17.setFont(new Font("arial",Font.PLAIN,20));
        open17.setIcon(play);
        open17.setText("Open Playground");
        open17.setBackground(Color.GRAY);
        open17.setForeground(Color.WHITE);
        open17.setBounds(1039,436,190,30);
        
        
        //Level 17 Configuration ends Here...........
        
        
        
        //Level 18 Configuration Starts Here.........
        
        level18 = new JLabel();
        level18.setFont(new Font("arial",Font.PLAIN,20));
        level18.setText("Level 18 : 5 Lines(87 Words)");
        level18.setForeground(Color.WHITE);
        level18.setBounds(70,496,270,30);
        
        
        open18 = new JButton();
        open18.setFont(new Font("arial", Font.PLAIN,20));
        open18.setIcon(play);
        open18.setText("Open Playground");
        open18.setBackground(Color.GRAY);
        open18.setForeground(Color.WHITE);
        open18.setBounds(1039,496,190,30);
        
        
        //Level 18 Configuration ends here..........
        
        
        
        //Level 19 Configuration Starts Here........
        
        level19 = new JLabel();
        level19.setFont(new Font("arial",Font.PLAIN,20));
        level19.setText("Level 19 : 5 Lines(105 Words)");
        level19.setForeground(Color.WHITE);
        level19.setBounds(70,556,270,30);
        
        
        
        open19 = new JButton();
        open19.setFont(new Font("arial",Font.PLAIN,20));
        open19.setIcon(play);
        open19.setText("Open Playground");
        open19.setBackground(Color.GRAY);
        open19.setForeground(Color.WHITE);
        open19.setBounds(1039,556,190,30);
        
        
        //Level 19 Configuration ends Here..........
        
        
        
        //Level 20 Configuration starts here...........
        
        
        level20 = new JLabel();
        level20.setFont(new Font("arial",Font.PLAIN,20));
        level20.setText("Level 20 : 5 Lines(84 Words)");
        level20.setForeground(Color.WHITE);
        level20.setBounds(70,616,270,30);
        
        
        open20 = new JButton();
        open20.setFont(new Font("arial",Font.PLAIN,20));
        open20.setIcon(play);
        open20.setText("Open Playground");
        open20.setBackground(Color.GRAY);
        open20.setForeground(Color.WHITE);
        open20.setBounds(1039,616,190,30);
        
        
        
        //Level 20 Configuration Ends Here.............
        
        
        //Beginner - II Configuration Ends Here........
        
        
        
        //Intermediate - I Configuration starts here..............
        
       // intermediateStar = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Twostars.png"); 
        intermediateStar = new ImageIcon(getClass().getClassLoader().getResource("Twostars.png")); 
        
        
        intermediateLevel1 = new JLabel();
        intermediateLevel1.setIcon(intermediateStar);
        intermediateLevel1.setFont(new Font("arial",Font.PLAIN,20));
        intermediateLevel1.setText("Intermediate - I");
        //intermediateLevel1.setBackground(Color.GRAY);
        intermediateLevel1.setForeground(Color.WHITE);
        intermediateLevel1.setBounds(70,26,280,30);
        
        //Level 21 Configuration starts here............
        
        level21 = new JLabel();
        level21.setFont(new Font("arial",Font.PLAIN,20));
        level21.setForeground(Color.WHITE);
        level21.setText("Level 21 : 6 Lines(114 Words)");
        level21.setBounds(70,76,270,30);
        
        
        open21 = new JButton();
        open21.setFont(new Font("arial",Font.PLAIN,20));
        open21.setBackground(Color.GRAY);
        open21.setForeground(Color.WHITE);
        open21.setIcon(play);
        open21.setText("Open Playground");
        open21.setBounds(1039,76,190,30);
        
        
        //Level 21 Configuration ends here.............
        
        
        
        //Level 22 Configuration starts here...........
        
        level22 = new JLabel();
        level22.setFont(new Font("arial",Font.PLAIN,20));
        level22.setForeground(Color.WHITE);
        level22.setText("Level 22 : 6 Lines(129 Words)");
        level22.setBounds(70,136,270,30);
        
        
        open22 = new JButton();
        open22.setFont(new Font("arial",Font.PLAIN,20));
        open22.setBackground(Color.GRAY);
        open22.setForeground(Color.WHITE);
        open22.setIcon(play);
        open22.setText("Open Playground");
        open22.setBounds(1039,136,190,30);
        
        //Level 22 Configuration ends here.......
        
        
        
        //Level 23 Configuration starts here........
        
        level23 = new JLabel();
        level23.setFont(new Font("arial",Font.PLAIN,20));
        level23.setForeground(Color.WHITE);
        level23.setText("Level 23 : 6 Lines(126 Words)");
        level23.setBounds(70,196,270,30);
        
        
        
        open23 = new JButton();
        open23.setFont(new Font("arial",Font.PLAIN,20));
        open23.setBackground(Color.GRAY);
        open23.setForeground(Color.WHITE);
        open23.setIcon(play);
        open23.setText("Open Playground");
        open23.setBounds(1039,196,190,30);
        
        //Level 23 Configuration ends here............
        
        
        
        //Level 24 Configuration starts here.................
        
        level24 = new JLabel();
        level24.setFont(new Font("arial",Font.PLAIN,20));
        level24.setForeground(Color.WHITE);
        level24.setText("Level 24 : 6 Lines(115 Words)");
        level24.setBounds(70,256,270,30);
        
        
        open24 = new JButton();
        open24.setFont(new Font("arial",Font.PLAIN,20));
        open24.setBackground(Color.GRAY);
        open24.setForeground(Color.WHITE);
        open24.setIcon(play);
        open24.setText("Open Playground");
        open24.setBounds(1039,256,190,30);
        
        //Level 24 Configuration ends here......
        
        
        
        //Level 25 Configurtion  starts here.......
        
        level25 = new JLabel();
        level25.setFont(new Font("arial",Font.PLAIN,20));
        level25.setForeground(Color.WHITE);
        level25.setText("Level 25 : 6 Lines(105 Words)");
        level25.setText("Level 25 : 6 Lines(105 Words)");
        level25.setBounds(70,316,270,30);
        
        
        
        open25 = new JButton();
        open25.setFont(new Font("arial",Font.PLAIN,20));
        open25.setBackground(Color.GRAY);
        open25.setForeground(Color.WHITE);
        open25.setIcon(play);
        open25.setText("Open Playground");
        open25.setBounds(1039,316,190,30);
        
        
        //Level 25 Configuration ends here.....
        
        
        //Level 26 Configuration starts here..........
        
        level26 = new JLabel();
        level26.setFont(new Font("arial",Font.PLAIN,20));
        level26.setForeground(Color.WHITE);
        level26.setText("Level 26 : 7 Lines(146 Words)");
        level26.setBounds(70,376,270,30);
        
        open26 = new JButton();
        open26.setFont(new Font("arial",Font.PLAIN,20));
        open26.setBackground(Color.GRAY);
        open26.setForeground(Color.WHITE);
        open26.setIcon(play);
        open26.setText("Open Playground");
        open26.setBounds(1039,376,190,30);
        
        //Level 26 Configuration ends here..........
        
        
        //Level 27 Configuration starts here.........
        
        level27 = new JLabel();
        level27.setFont(new Font("arial",Font.PLAIN,20));
        level27.setForeground(Color.WHITE);
        level27.setText("Level 27 : 7 Lines(143 Words)");
        level27.setBounds(70,436,270,30);
        
        open27 = new JButton();
        open27.setFont(new Font("arial",Font.PLAIN,20));
        open27.setBackground(Color.GRAY);
        open27.setForeground(Color.WHITE);
        open27.setIcon(play);
        open27.setText("Open Playground");
        open27.setBounds(1039,436,190,30);
        
        //Level 27 Configuration ends here..........
        
        
        //Level 28 Configuration starts here...............
        
        level28 = new JLabel();
        level28.setFont(new Font("arial",Font.PLAIN,20));
        level28.setForeground(Color.WHITE);
        level28.setText("Level 28 : 7 Lines(145 Words)");
        level28.setBounds(70,496,270,30);
        
        open28 = new JButton();
        open28.setFont(new Font("arial",Font.PLAIN,20));
        open28.setBackground(Color.GRAY);
        open28.setForeground(Color.WHITE);
        open28.setIcon(play);
        open28.setText("Open Playground");
        open28.setBounds(1039,496,190,30);
        
        //Level 28 Configuration ends here..............
        
        
        //Level 29 Configuration starts here..............
        
        level29 = new JLabel();
        level29.setFont(new Font("arial",Font.PLAIN,20));
        level29.setForeground(Color.WHITE);
        level29.setText("Level 29 : 7 Lines(125 Words)");
        level29.setBounds(70,556,270,30);
        
        
        open29 = new JButton();
        open29.setFont(new Font("arial",Font.PLAIN,20));
        open29.setBackground(Color.GRAY);
        open29.setForeground(Color.WHITE);
        open29.setIcon(play);
        open29.setText("Open Playground");
        open29.setBounds(1039,556,190,30);
        
        //Level 29 Configuration Ends here...........
        
        
        //Level 30 Configuration starts here.......
        
        level30 = new JLabel();
        level30.setFont(new Font("arial",Font.PLAIN,20));
        level30.setForeground(Color.WHITE);
        level30.setText("Level 30 : 7 Lines(150 Words)");
        level30.setBounds(70,616,270,30);
        
        
        open30 = new JButton();
        open30.setFont(new Font("arial",Font.PLAIN,20));
        open30.setBackground(Color.GRAY);
        open30.setForeground(Color.WHITE);
        open30.setIcon(play);
        open30.setText("Open Playground");
        open30.setBounds(1039,616,190,30);
        
        //Level 30 Configuration Ends here.................
        
        //Intermediate - I Configuration ends here.............
        
        
        
        
        //Intermdiate - II Configuration Starts Here........
        
        intermediateLevel2 = new JLabel();
        intermediateLevel2.setFont(new Font("arial",Font.PLAIN,20));
        intermediateLevel2.setForeground(Color.WHITE);
        intermediateLevel2.setIcon(intermediateStar);
        intermediateLevel2.setText("Intermediate - II");
        intermediateLevel2.setBounds(70,26,280,30);
        
                
        //Level 31 Configuration Starts here........
        
        level31 = new JLabel();
        level31.setFont(new Font("arial",Font.PLAIN,20));
        level31.setForeground(Color.WHITE);
        level31.setText("Level 31 : 8 Lines(162 Words)");
        level31.setBounds(70,76,270,30);
        
        
        open31 = new JButton();
        open31.setFont(new Font("arial",Font.PLAIN,20));
        open31.setBackground(Color.GRAY);
        open31.setForeground(Color.WHITE);
        open31.setIcon(play);
        open31.setText("Open Playground");
        open31.setBounds(1039,76,190,30);
        
        //Level 31 Configuration Ends here.......
        
        
        //Level 32 Configuration Starts here..........
        
        level32 = new JLabel();
        level32.setFont(new Font("arial",Font.PLAIN,20));
        level32.setForeground(Color.WHITE);
        level32.setText("Level 32 : 8 Lines(169 Words)");
        level32.setBounds(70,136,270,30);
        
        
        open32 = new JButton();
        open32.setFont(new Font("arial",Font.PLAIN,20));
        open32.setBackground(Color.GRAY);
        open32.setForeground(Color.WHITE);
        open32.setIcon(play);
        open32.setText("Open Playground");
        open32.setBounds(1039,136,190,30);
        
        //Level 32 Configuration Ends here..........
        
        
        //Level 33 Configuration Starts here........
        
        level33 = new JLabel();
        level33.setFont(new Font("arial",Font.PLAIN,20));
        level33.setForeground(Color.WHITE);
        level33.setText("Level 33 : 8 Lines(127 Words)");
        level33.setBounds(70,196,270,30);
        
        
        open33 = new JButton();
        open33.setFont(new Font("arial",Font.PLAIN,20));
        open33.setBackground(Color.GRAY);
        open33.setForeground(Color.WHITE);
        open33.setIcon(play);
        open33.setText("Open Playground");
        open33.setBounds(1039,196,190,30);
        
        //Level 33 Configuration Ends here..........
        
        
        //Level 34 Configuration Starts Here..............
        
        level34 = new JLabel();
        level34.setFont(new Font("arial",Font.PLAIN,20));
        level34.setForeground(Color.WHITE);
        level34.setText("Level 34 : 8 Lines(137 Words)");
        level34.setBounds(70,256,270,30);
        
        
        open34 = new JButton();
        open34.setFont(new Font("arial",Font.PLAIN,20));
        open34.setBackground(Color.GRAY);
        open34.setForeground(Color.WHITE);
        open34.setIcon(play);
        open34.setText("Open Playground");
        open34.setBounds(1039,256,190,30);
        
        //Level 34 Configuration Ends Here...................
        
        
        //Level 35 Configuration Starts Here.................
        
        level35 = new JLabel();
        level35.setFont(new Font("arial",Font.PLAIN,20));
        level35.setForeground(Color.WHITE);
        level35.setText("Level 35 : 8 Lines(142 Words)");
        level35.setBounds(70,316,270,30);
        
        
        open35 = new JButton();
        open35.setFont(new Font("arial",Font.PLAIN,20));
        open35.setBackground(Color.GRAY);
        open35.setForeground(Color.WHITE);
        open35.setIcon(play);
        open35.setText("Open Playground");
        open35.setBounds(1039,316,190,30);
        
        //Level 35 Configuration Ends Here.................
        
        
        
        //Level 36 Configuration Starts Here...............
        
        level36 = new JLabel();
        level36.setFont(new Font("arial",Font.PLAIN,20));
        level36.setForeground(Color.WHITE);
        level36.setText("Level 36 : 9 Lines(161 Words)");
        level36.setBounds(70,376,270,30);
        
        open36 = new JButton();
        open36.setFont(new Font("arial",Font.PLAIN,20));
        open36.setBackground(Color.GRAY);
        open36.setForeground(Color.WHITE);
        open36.setIcon(play);
        open36.setText("Open Playground");
        open36.setBounds(1039,376,190,30);
        
        //Level 36 Configuration Ends here..................
        
        
        //Level 37 Configuration Starts Here...................
        
        level37 = new JLabel();
        level37.setFont(new Font("arial",Font.PLAIN,20));
        level37.setForeground(Color.WHITE);
        level37.setText("Level 37 : 9 Lines(162 Words)");
        level37.setBounds(70,436,270,30);
        
        open37 = new JButton();
        open37.setFont(new Font("arial",Font.PLAIN,20));
        open37.setBackground(Color.GRAY);
        open37.setForeground(Color.WHITE);
        open37.setIcon(play);
        open37.setText("Open Playground");
        open37.setBounds(1039,436,190,30);
        
        //Level 37 Configurtion Ends Here...................
        
        
        //Level 38 Configuration Starts Here...............
        
        level38 = new JLabel();
        level38.setFont(new Font("arial",Font.PLAIN,20));
        level38.setForeground(Color.WHITE);
        level38.setText("Level 38 : 9 Lines(155 Words)");
        level38.setBounds(70,496,270,30);
        
        open38 = new JButton();
        open38.setFont(new Font("arial",Font.PLAIN,20));
        open38.setBackground(Color.GRAY);
        open38.setForeground(Color.WHITE);
        open38.setIcon(play);
        open38.setText("Open Playground");
        open38.setBounds(1039,496,190,30);
        
        //Level 38 Configuration Ends Here.............
        
        
        //Level 39 Configuration Starts Here..............
        
        level39 = new JLabel();
        level39.setFont(new Font("arial",Font.PLAIN,20));
        level39.setForeground(Color.WHITE);
        level39.setText("Level 39 : 9 Lines(157 Words)");
        level39.setBounds(70,556,270,30);
        
        open39 = new JButton();
        open39.setFont(new Font("arial",Font.PLAIN,20));
        open39.setBackground(Color.GRAY);
        open39.setForeground(Color.WHITE);
        open39.setIcon(play);
        open39.setText("Open Playground");
        open39.setBounds(1039,556,190,30);
        
        //Level 39 Configuration Ends Here...............
        
       
       //Level 40 Configuration Starts Here.......
       
       level40 = new JLabel();
       level40.setFont(new Font("arial",Font.PLAIN,20));
       level40.setBackground(Color.GRAY);
       level40.setForeground(Color.WHITE);
       level40.setText("Level 40 : 9 Lines(156 Words)");
       level40.setBounds(70,616,270,30);
       
       open40 = new JButton();
       open40.setFont(new Font("arial",Font.PLAIN,20));
       open40.setBackground(Color.GRAY);
       open40.setForeground(Color.WHITE);
       open40.setIcon(play);
       open40.setText("Open Playground");
       open40.setBounds(1039,616,190,30);
       
       //Level 40 Configuration Ends Here...............
       
      //Intermediate - II Configuration ends here...........
      
      
      //Expertise - I Configuration Starts Here..................
      
      /*expertiseLevelOne = new JLabel();
      expertiseLevelOne.setFont(new Font("arial",Font.PLAIN,20));
      expertiseLevelOne.setForeground(Color.WHITE);
      expertiseLevelOne.setIcon(beginnerStar);
      expertiseLevelOne.setText("Expertise - I");*/
      
      
      
      expertiseLevel1 = new JLabel();
      expertiseLevel1.setFont(new Font("arial",Font.PLAIN,20));
      expertiseLevel1.setForeground(Color.WHITE);
      expertiseLevel1.setIcon(intermediateStar);
     // expertiseLevel1.setText("Expertise - I");
      expertiseLevel1.setBounds(70,26,80,30);
      
      expertiseLevelOne = new JLabel();
      expertiseLevelOne.setFont(new Font("arial",Font.PLAIN,20));
      expertiseLevelOne.setForeground(Color.WHITE);
      expertiseLevelOne.setIcon(beginnerStar);
      expertiseLevelOne.setText("Expertise - I");
      Rectangle expertiseLevelOneBounds = new Rectangle(133,26,280,30);
      expertiseLevelOne.setBounds(expertiseLevelOneBounds);
      
      
      
      
       //Level 41 Configuration Starts Here................
       
       level41 = new JLabel();
       level41.setFont(new Font("arial",Font.PLAIN,20));
       level41.setForeground(Color.WHITE);
       level41.setText("Level 41 : 10 Lines(169 Words)");
       level41.setBounds(70,76,300,30);
       
       
       open41 = new JButton();
       open41.setFont(new Font("arial",Font.PLAIN,20));
       open41.setBackground(Color.GRAY);
       open41.setForeground(Color.WHITE);
       open41.setIcon(play);
       open41.setText("Open Playground");
       open41.setBounds(1039,76,190,30);
       
    
      //Level 41 Configuration ends here................
      
      
      //Level 42 Configuration starts here.................
      
      level42 = new JLabel();
      level42.setFont(new Font("arial",Font.PLAIN,20));
      level42.setForeground(Color.WHITE);
      level42.setText("Level 42 : 10 Lines(168 Words)");
      level42.setBounds(70,136,300,30);
      
      
      open42 = new JButton();
      open42.setFont(new Font("arial",Font.PLAIN,20));
      open42.setBackground(Color.GRAY);
      open42.setForeground(Color.WHITE);
      open42.setIcon(play);
      open42.setText("Open Playground");
      open42.setBounds(1039,136,190,30);
      
      //Level 42 Configuration ends here.............................
      
      
      //Level 43 Configuration starts here..............................
      
      level43 = new JLabel();
      level43.setFont(new Font("arial",Font.PLAIN,20));
      level43.setForeground(Color.WHITE);
      level43.setText("Level 43 : 10 Lines(168 Words)");
      level43.setBounds(70,196,300,30);
      
      
      open43 = new JButton();
      open43.setFont(new Font("arial",Font.PLAIN,20));
      open43.setBackground(Color.GRAY);
      open43.setForeground(Color.WHITE);
      open43.setIcon(play);
      open43.setText("Open Playground");
      open43.setBounds(1039,196,190,30);
      
      //Level 43 Configuration ends here...............
      
      
      //Level 44 Configuration starts here..............
      
      level44 = new JLabel();
      level44.setFont(new Font("arial",Font.PLAIN,20));
      level44.setForeground(Color.WHITE);
      level44.setText("Level 44 : 10 Lines(185 Words)");
      level44.setBounds(70,256,300,30);
      
      
      open44 = new JButton();
      open44.setFont(new Font("arial",Font.PLAIN,20));
      open44.setBackground(Color.GRAY);
      open44.setForeground(Color.WHITE);
      open44.setIcon(play);
      open44.setText("Open Playground");
      open44.setBounds(1039,256,190,30);
      
      //Level 44 Configuraion ends here.....................
      
      
      //Level 45 Configuration starts here..................
      
      level45 = new JLabel();
      level45.setFont(new Font("arial",Font.PLAIN,20));
      level45.setForeground(Color.WHITE);
      level45.setText("Level 45 : 11 Lines(215 Words)");
      level45.setBounds(70,316,300,30);
      
      
     open45 = new JButton();
     open45.setFont(new Font("arial",Font.PLAIN,20));
     open45.setBackground(Color.GRAY);
     open45.setForeground(Color.WHITE);
     open45.setIcon(play);
     open45.setText("Open Playground");
     open45.setBounds(1039,316,190,30);
     
     //Level 45 Configuration ends here..................
     
     
     //Level 46 Configuration starts here..............
     
     level46 = new JLabel();
     level46.setFont(new Font("arial",Font.PLAIN,20));
     level46.setForeground(Color.WHITE);
     level46.setText("Level 46 : 11 Lines(203 Words)");
     level46.setBounds(70,376,300,30);
     
     
     open46 = new JButton();
     open46.setFont(new Font("arial",Font.PLAIN,20));
     open46.setBackground(Color.GRAY);
     open46.setForeground(Color.WHITE);
     open46.setIcon(play);
     open46.setText("Open Playground");
     open46.setBounds(1039,376,190,30);
     
     //Level 46 Configuration ends here................
     
     
     //Level 47 Configuration starts here...............
     
     level47 = new JLabel();
     level47.setFont(new Font("arial",Font.PLAIN,20));
     level47.setForeground(Color.WHITE);
     level47.setText("Level 47 : 11 Lines(190 Words)");
     level47.setBounds(70,436,300,30);
     
     
     open47 = new JButton();
     open47.setFont(new Font("arial",Font.PLAIN,20));
     open47.setBackground(Color.GRAY);
     open47.setForeground(Color.WHITE);
     open47.setIcon(play);
     open47.setText("Open Playground");
     open47.setBounds(1039,436,190,30);
     
     //Level 47 Configuration ends here...................
     
     
     //Level 48 Configuration starts here.....................
     
     level48 = new JLabel();
     level48.setFont(new Font("arial",Font.PLAIN,20));
     level48.setForeground(Color.WHITE);
     level48.setText("Level 48 : 11 Lines(224 Words)");
     level48.setBounds(70,496,300,30);
     
     
     open48 = new JButton();
     open48.setFont(new Font("arial",Font.PLAIN,20));
     open48.setBackground(Color.GRAY);
     open48.setForeground(Color.WHITE);
     open48.setIcon(play);
     open48.setText("Open Playground");
     open48.setBounds(1039,496,190,30);
     
     //Level 48 Configuration ends here...............................
     
     
     
     //Level 49 Configuration starts here.......................
     
     level49 = new JLabel();
     level49.setFont(new Font("arial",Font.PLAIN,20));
     level49.setForeground(Color.WHITE);
     level49.setText("Level 49 : 12 Lines(214 Words)");
     level49.setBounds(70,556,300,30);
     
     
     open49 = new JButton();
     open49.setFont(new Font("arial",Font.PLAIN,20));
     open49.setBackground(Color.GRAY);
     open49.setForeground(Color.WHITE);
     open49.setIcon(play);
     open49.setText("Open Playground");
     open49.setBounds(1039,556,190,30);
     
     //Level 49 Configuration ends here..........................
     
     
     //Level 50 Configuration starts here............................
     
     level50 = new JLabel();
     level50.setFont(new Font("arial",Font.PLAIN,20));
     level50.setForeground(Color.WHITE);
     level50.setText("Level 50 : 12 Lines(210 Words)");
     Rectangle bounds = new Rectangle(70,616,300,30);
     level50.setBounds(bounds);
     
     
     open50 = new JButton();
     open50.setFont(new Font("arial",Font.PLAIN,20));
     open50.setBackground(Color.GRAY);
     open50.setForeground(Color.WHITE);
     open50.setIcon(play);
     open50.setText("Open Playground");
     Rectangle bounds1 = new Rectangle(1039,616,190,30);
     open50.setBounds(bounds1);
     
     //Level 50 Configuration ends here......................................
     
     //Expertise - I Configuration ends here......................................
     
     
     
     //Expertise - II Configuration starts here............................
     
     expertiseLevel2 = new JLabel();
     expertiseLevel2.setFont(new Font("arial",Font.PLAIN,20));
     expertiseLevel2.setForeground(Color.WHITE);
     expertiseLevel2.setIcon(intermediateStar);
     //expertiseLevel2.setText("Expertise - II");
     Rectangle expertiseTwo = new Rectangle(70,26,80,30);
     expertiseLevel2.setBounds(expertiseTwo);
     
     
     expertiseLevelTwo = new JLabel();
     expertiseLevelTwo.setFont(new Font("arial",Font.PLAIN,20));
     expertiseLevelTwo.setForeground(Color.WHITE);
     expertiseLevelTwo.setIcon(beginnerStar);
     expertiseLevelTwo.setText("Expertise - II");
     Rectangle expertiseLevelTwoBounds = new Rectangle(133,26,280,30);
     expertiseLevelTwo.setBounds(expertiseLevelTwoBounds);
     
     
     //Level 51 Configuration Starts Here.................
     
     level51 = new JLabel();
     level51.setFont(new Font("arial",Font.PLAIN,20));
     level51.setForeground(Color.WHITE);
     level51.setText("Level 51 : 12 Lines(218 Words)");
     Rectangle level51Bounds = new Rectangle(70,76,300,30);
     level51.setBounds(level51Bounds);
     
     open51 = new JButton();
     open51.setFont(new Font("arial",Font.PLAIN,20));
     open51.setBackground(Color.GRAY);
     open51.setForeground(Color.WHITE);
     open51.setIcon(play);
     open51.setText("Open Playground");
     Rectangle open51Bounds = new Rectangle(1039,76,190,30);
     open51.setBounds(open51Bounds);
     
     
     //Level 51 Configuration Ends Here..........................
     
     
     
     
     //Level 52 Configurtion Starts Here.............................
     
     level52 = new JLabel();
     level52.setFont(new Font("arial",Font.PLAIN,20));
     level52.setForeground(Color.WHITE);
     level52.setText("Level 52 : 12 Lines(237 Words)");
     Rectangle level52Bounds = new Rectangle(70,136,300,30);
     level52.setBounds(level52Bounds);
     
     
    open52 = new JButton();
    open52.setFont(new Font("arial",Font.PLAIN,20));
    open52.setBackground(Color.GRAY);
    open52.setForeground(Color.WHITE);
    open52.setIcon(play);
    open52.setText("Open Playground");
    Rectangle open52Bounds = new Rectangle(1039,136,190,30);
    open52.setBounds(open52Bounds);
    
    //Level 52 Configuration Ends Here..............................
    
    
    //Level 53 Configuration Starts Here.........................
    
    level53 = new JLabel();
    level53.setFont(new Font("arial",Font.PLAIN,20));
    level53.setForeground(Color.WHITE);
    level53.setText("Level 53 : 13 Lines(247 Words)");
    Rectangle level53Bounds = new Rectangle(70,196,300,30);
    level53.setBounds(level53Bounds);
    
    
    open53 = new JButton();
    open53.setFont(new Font("arial",Font.PLAIN,20));
    open53.setBackground(Color.GRAY);
    open53.setForeground(Color.WHITE);
    open53.setIcon(play);
    open53.setText("Open Playground");
    Rectangle open53Bounds = new Rectangle(1039,196,190,30);
    open53.setBounds(open53Bounds);
    
    
    //Level 53 Configuration Ends Here...................
    
    
    //Font Configuration Starts Here....................
    
    font = new Font("arial",Font.PLAIN,20);
    
    //Font Configuration Ends Here.........................
    
   
    //Level 54 Configuration Starts Here..............
    
    level54 = new JLabel();
    level54.setFont(font);
    level54.setForeground(Color.WHITE);
    level54.setText("Level 54 : 13 Lines(239 Words)");
    Rectangle level54Bounds = new Rectangle(70,256,300,30);
    level54.setBounds(level54Bounds);
    
    
    open54 = new JButton();
    open54.setFont(font);
    open54.setBackground(Color.GRAY);
    open54.setForeground(Color.WHITE);
    open54.setIcon(play);
    open54.setText("Open Playground");
    Rectangle open54Bounds = new Rectangle(1039,256,190,30);
    open54.setBounds(open54Bounds);
    
   //Level 54 Configuration Ends Here.........................
   
   
   //Level 55 Configuration Starts Here.........................
   
   level55 = new JLabel();
   level55.setFont(font);
   level55.setForeground(Color.WHITE);
   level55.setText("Level 55 : 13 Lines(239 Words)");
   Rectangle level55Bounds = new Rectangle(70,316,300,30);
   level55.setBounds(level55Bounds);

   open55 = new JButton();
   open55.setFont(font);
   open55.setBackground(Color.GRAY);
   open55.setForeground(Color.WHITE);
   open55.setIcon(play);
   open55.setText("Open Playground");
   Rectangle open55Bounds = new Rectangle(1039,316,190,30);
   open55.setBounds(open55Bounds);
   
   //Level 55 Configuration Ends Here...............
   
   
   //Level 56 Configuration Starts Here..............
   
    level56 = new JLabel();
    level56.setFont(font);
    level56.setForeground(Color.WHITE);
    level56.setText("Level 56 : 13 Lines(239 Words)");
    Rectangle level56Bounds = new Rectangle(70,376,300,30);
    level56.setBounds(level56Bounds);
    
    
    open56 = new JButton();
    open56.setFont(font);
    open56.setBackground(Color.GRAY);
    open56.setForeground(Color.WHITE);
    open56.setIcon(play);
    open56.setText("Open Playground");
    Rectangle open56Bounds = new Rectangle(1039,376,190,30);
    open56.setBounds(open56Bounds);
   
   
   //Level 56 Configuration Ends Here....................
   
   
   
   //Level 57 Configuration Starts Here.................
   
   
   level57 = new JLabel();
   level57.setFont(font);
   level57.setForeground(Color.WHITE);
   level57.setText("Level 57 : 14 Lines(248 Words)");
   Rectangle level57Bounds = new Rectangle(70,436,300,30);
   level57.setBounds(level57Bounds);
   
   
   open57 = new JButton();
   open57.setFont(font);
   open57.setBackground(Color.GRAY);
   open57.setForeground(Color.WHITE);
   open57.setIcon(play);
   open57.setText("Open Playground");
   Rectangle open57Bounds = new Rectangle(1039,436,190,30);
   open57.setBounds(open57Bounds);
   
   //Level 57 Configuration Ends Here.................
   
   
   //Level 58 Configuration Starts Here........................
   
   level58 = new JLabel();
   level58.setFont(font);
   level58.setForeground(Color.WHITE);
   level58.setText("Level 58 : 14 Lines(257 Words)");
   Rectangle level58Bounds = new Rectangle(70,496,300,30);
   level58.setBounds(level58Bounds);
   
   open58 = new JButton();
   open58.setFont(font);
   open58.setBackground(Color.GRAY);
   open58.setForeground(Color.WHITE);
   open58.setIcon(play);
   open58.setText("Open Playground");
   Rectangle open58Bounds = new Rectangle(1039,496,190,30);
   open58.setBounds(open58Bounds);
   
   //Level 58 Configuration Ends Here.....................
   
   
   
   //Level 59 Configuration Starts Here..................
   
   level59 = new JLabel();
   level59.setFont(font);
   level59.setForeground(Color.WHITE);
   level59.setText("Level 59 : 14 Lines(253 Words)");
   Rectangle level59Bounds = new Rectangle(70,556,300,30);
   level59.setBounds(level59Bounds);
   
   
   open59 = new JButton();
   open59.setFont(font);
   open59.setBackground(Color.GRAY);
   open59.setForeground(Color.WHITE);
   open59.setIcon(play);
   open59.setText("Open Playground");
   Rectangle open59Bounds = new Rectangle(1039,556,190,30);
   open59.setBounds(open59Bounds);
   
   //Level 59 Configuration Ends Here...........................
   
   
   
   //Level 60 Configuration Starts Here.............................
   
   level60 = new JLabel();
   level60.setFont(font);
   level60.setForeground(Color.WHITE);
   level60.setText("Level 60 : 14 Lines(256 Words)");
   Rectangle level60Bounds = new Rectangle(70,616,300,30);
   level60.setBounds(level60Bounds);
   
   
   open60 = new JButton();
   open60.setFont(font);
   open60.setBackground(Color.GRAY);
   open60.setForeground(Color.WHITE);
   open60.setIcon(play);
   open60.setText("Open Playground");
   Rectangle open60Bounds = new Rectangle(1039,616,190,30);
   open60.setBounds(open60Bounds);
   
   
   //Level 60 Configuration Ends Here..........................
   
   
   
   //About the software configuration starts here....................
   
  // information = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Information_New.png"); 
   information = new ImageIcon(getClass().getClassLoader().getResource("Information_New.png"));   
   
  buttonCount = 6; 
  aboutTheSoftware = new JButton[buttonCount];
   
  // int length = 6;
   
   for(int i = 0;i < buttonCount;i++){
       aboutTheSoftware[i] = new JButton();
       aboutTheSoftware[i].setFont(new Font("arial",Font.PLAIN,20));
       aboutTheSoftware[i].setBackground(Color.GRAY);
       aboutTheSoftware[i].setForeground(Color.WHITE);
       //aboutTheSoftware[i].setIcon(JOptionPane.INFORMATION_MESSAGE);
       //aboutTheSoftware[i].setIcon(1);
       aboutTheSoftware[i].setIcon(information);
       aboutTheSoftware[i].setText(" About the software");
       aboutTheSoftware[i].setBounds(1200,700,220,30);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
  
    
 
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
      
      
      
      
      
      
      
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
        tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(0,0,1456,800);
        tabbedPane.setFont(new Font("arial", Font.PLAIN, 15));
        //tabbedPane.setBackground(Color.GRAY);
        
        
        coordinations1 = new JTextField();
        coordinations1.setFont(new Font("arial", Font.BOLD, 13));
        coordinations1.setBounds(5,700,290,30);
        
        
        coordinations2 = new JTextField();
        coordinations2.setFont(new Font("arial", Font.BOLD,  13));
        coordinations2.setBounds(5,700,290,30);
        
        
        
        coordinations3 = new JTextField();
        coordinations3.setFont(new Font("arial", Font.BOLD, 13));
        coordinations3.setBounds(5,700,290,30);
        
        
        
        coordinations4 = new JTextField();
        coordinations4.setFont(new Font("arial",Font.BOLD,13));
        coordinations4.setBounds(5,700,290,30);
        
        
        
        coordinations5 = new JTextField();
        coordinations5.setFont(new Font("arial",Font.BOLD,13));
        coordinations5.setBounds(5,700,290,30);
        
        
          
        coordinations6 = new JTextField();
        coordinations6.setFont(new Font("arial", Font.BOLD, 13));
        coordinations6.setBounds(5,700,290,30);
        
        
        beginner1 = new JPanel();
        //beginner1.setFont(new Font("arial", Font.PLAIN, 40));
        beginner1.setLayout(null);
        beginner1.setBackground(Color.GRAY);
        beginner1.add(coordinations1);
        beginner1.add(aboutTheSoftware[0]);
        beginner1.add(beginner);
        beginner1.add(level1);
        beginner1.add(open1);
        beginner1.add(level2);
        beginner1.add(open2);
        beginner1.add(level3);
        beginner1.add(open3);
        beginner1.add(level4);
        beginner1.add(open4);
        beginner1.add(level5);
        beginner1.add(open5);
        beginner1.add(level6);
        beginner1.add(open6);
        beginner1.add(level7);
        beginner1.add(open7);
        beginner1.add(level8);
        beginner1.add(open8);
        beginner1.add(level9);
        beginner1.add(open9);
        beginner1.add(level10);
        beginner1.add(open10);
        tabbedPane.add("Beginner - I" ,beginner1);
        
        
        beginner2 = new JPanel();
        beginner2.setLayout(null);
        beginner2.setBackground(Color.GRAY);
        beginner2.add(coordinations2);
        beginner2.add(aboutTheSoftware[1]);
        beginner2.add(beginnerLevel2);
        beginner2.add(level11);
        beginner2.add(open11);
        beginner2.add(level12);
        beginner2.add(open12);
        beginner2.add(level13);
        beginner2.add(open13);
        beginner2.add(level14);
        beginner2.add(open14);
        beginner2.add(level15);
        beginner2.add(open15);
        beginner2.add(level16);
        beginner2.add(open16);
        beginner2.add(level17);
        beginner2.add(open17);
        beginner2.add(level18);
        beginner2.add(open18);
        beginner2.add(level19);
        beginner2.add(open19);
        beginner2.add(level20);
        beginner2.add(open20);
        tabbedPane.add("Beginner - II", beginner2);
        
        intermediate1 = new JPanel();
        intermediate1.setLayout(null);
        intermediate1.setBackground(Color.GRAY);
        intermediate1.add(coordinations3);
        intermediate1.add(aboutTheSoftware[2]);
        intermediate1.add(intermediateLevel1);
        intermediate1.add(level21);
        intermediate1.add(open21);
        intermediate1.add(level22);
        intermediate1.add(open22);
        intermediate1.add(level23);
        intermediate1.add(open23);
        intermediate1.add(level24);
        intermediate1.add(open24);
        intermediate1.add(level25);
        intermediate1.add(open25);
        intermediate1.add(level26);
        intermediate1.add(open26);
        intermediate1.add(level27);
        intermediate1.add(open27);
        intermediate1.add(level28);
        intermediate1.add(open28);
        intermediate1.add(level29);
        intermediate1.add(open29);
        intermediate1.add(level30);
        intermediate1.add(open30);
        tabbedPane.add("Intermediate - I",intermediate1);
        
        intermediate2 = new JPanel();
        intermediate2.setLayout(null);
        intermediate2.setBackground(Color.GRAY);
        intermediate2.add(coordinations4);
        intermediate2.add(aboutTheSoftware[3]);
        intermediate2.add(intermediateLevel2);
        intermediate2.add(level31);
        intermediate2.add(open31);
        intermediate2.add(level32);
        intermediate2.add(open32);
        intermediate2.add(level33);
        intermediate2.add(open33);
        intermediate2.add(level34);
        intermediate2.add(open34);
        intermediate2.add(level35);
        intermediate2.add(open35);
        intermediate2.add(level36);
        intermediate2.add(open36);
        intermediate2.add(level37);
        intermediate2.add(open37);
        intermediate2.add(level38);
        intermediate2.add(open38);
        intermediate2.add(level39);
        intermediate2.add(open39);
        intermediate2.add(level40);
        intermediate2.add(open40);
        tabbedPane.add("Intermediate - II", intermediate2);
        
        expertise1 = new JPanel();
        expertise1.setLayout(null);
        expertise1.setBackground(Color.GRAY);
        expertise1.add(coordinations5);
        expertise1.add(aboutTheSoftware[4]);
        expertise1.add(expertiseLevel1);
        expertise1.add(expertiseLevelOne);
        expertise1.add(level41);
        expertise1.add(open41);
        expertise1.add(level42);
        expertise1.add(open42);
        expertise1.add(level43);
        expertise1.add(open43);
        expertise1.add(level44);
        expertise1.add(open44);
        expertise1.add(level45);
        expertise1.add(open45);
        expertise1.add(level46);
        expertise1.add(open46);
        expertise1.add(level47);
        expertise1.add(open47);
        expertise1.add(level48);
        expertise1.add(open48);
        expertise1.add(level48);
        expertise1.add(open48);
        expertise1.add(level49);
        expertise1.add(open49);
        expertise1.add(level50);
        expertise1.add(open50);
        tabbedPane.add("Expertise - I", expertise1);
        
        expertise2 = new JPanel();
        expertise2.setLayout(null);
        expertise2.setBackground(Color.GRAY);
        expertise2.add(coordinations6);
        expertise2.add(aboutTheSoftware[5]);  
        expertise2.add(expertiseLevel2);
        expertise2.add(expertiseLevelTwo);
        expertise2.add(level51);
        expertise2.add(open51);
        expertise2.add(level52);
        expertise2.add(open52);
        expertise2.add(level53);
        expertise2.add(open53);
        expertise2.add(level54);
        expertise2.add(open54);
        expertise2.add(level55);
        expertise2.add(open55);
        expertise2.add(level56);
        expertise2.add(open56);
        expertise2.add(level57);
        expertise2.add(open57);
        expertise2.add(level58);
        expertise2.add(open58);
        expertise2.add(level59);
        expertise2.add(open59);
        expertise2.add(level60);
        expertise2.add(open60);
        tabbedPane.add("Expertise - II", expertise2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        frame.add(tabbedPane);
        
        frame.setVisible(true);
        
        
        
        tabbedPane.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int x = e.getX();
                int y = e.getY();
                
                coordinations1.setText("X - Coordinate : "+x+", "+"Y - Coordinate : "+y);
                
                coordinations2.setText("X - Coordinate : "+x+", "+"Y - Coordinate : "+y);
                
                coordinations3.setText("X - Coordinate : "+x+", "+"Y - Coordinate : "+y);
                
                coordinations4.setText("X - Coordinate : "+x+", "+"Y - Coordinate : "+y);
                        
                coordinations5.setText("X - Coordinate : "+x+", "+"Y - Coordintate : "+y);
                
                coordinations6.setText("X - Coordinate : "+x+", "+"Y - Coordinate : "+y);
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
                
        
        frame.setVisible(true);
        
    }
    
    
    
    //Beginner - I Button Configuration Starts Here.................
    
    public void openPlayground1(){      //Level 1 - Level 5 : "Welcoming the Beginner into the Typing World."
        open1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    key = new Key_Master1();
                    Working w = new Working();
                    w.key = key;
                    
                    String level1 = "Welcome to the world of typing! As a beginner you are embarking on an exciting journey of improving your typing skills. With practice and patience you will soon find yourself typing with confidence and ease. Happy typing!";
                    
                    Key_Master1.canvas.setText(level1);
                    Key_Master1.canvas.addKeyListener(w);
                    Key_Master1.submit.addActionListener(w);
                    w.processQuestion(Key_Master1.canvas.getText());
                    
                }
                catch(Exception check){
                    System.out.println(check);
                }
            }
            
        });
        
    }
    
    
    public void openPlayground2(){
        open2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                try{
                key = new Key_Master1();
                Working w = new Working();
                w.key = key;
                
                String level2 = "Start with hand placement and finger positioning, focusing on muscle memory and accuracy. Take your time, type deliberately, and practice regularly. Soon, you'll glide across the keys effortlessly with speed and precision.";
                
                Key_Master1.canvas.setText(level2);
                Key_Master1.canvas.addKeyListener(w);
                Key_Master1.submit.addActionListener(w);
                w.processQuestion(Key_Master1.canvas.getText());
                
            }
            catch(Exception detect){
                System.out.println(detect);
            }
            }
    });
 }
    
   public void openPlayground3(){
       open3.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level3 = "Congratulations on your progress! Expand your typing skills with touch typing, where you type without looking at the keyboard. Train your fingers to find keys instinctively using tactile feedback. With practice, you'll reduce reliance on visual cues and increase speed and efficiency.";
                   
                   
                   
                   Key_Master1.canvas.setText(level3);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground4(){
       open4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  String level4 = "Well done! Challenge yourself with complex texts and varied typing exercises. Explore articles, essays, and book excerpts to enhance vocabulary and sentence structures. Maintain a steady rhythm, embrace mistakes as learning opportunities, and strive for improvement.";
                  
                  Key_Master1.canvas.setText(level4);
                  Key_Master1.canvas.addKeyListener(w);
                  Key_Master1.submit.addActionListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
           
       }
       });
   }
    
    
   public void openPlayground5(){  //Level 1 - Level 5 : "Welcoming the Beginner into the Typing World."
       open5.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level5 = "You're becoming proficient! Explore specialized typing techniques for efficiency. Prioritize ergonomics, maintain good posture, and take breaks. Embrace challenges, push boundaries, and enjoy the exciting journey of typing. Keep going and Happy typing!";
                   
                   Key_Master1.canvas.setText(level5);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
               }
             catch(Exception detect){
                 System.out.println(detect);
             }
           }
       });
   }
   
   public void openPlayground6(){   //Level 6 - Level  10 : "The tale of race between tortoise and hare".
       open6.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level6 = "Once upon a time, there was a tortoise and a hare. The tortoise was slow and steady, always taking its time, while the hare was fast and full of energy. They lived in a beautiful forest, and one sunny day, they decided to have a race to settle their ongoing argument about who was the fastest.";
                   
                   Key_Master1.canvas.setText(level6);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground7(){
       open7.addActionListener(new ActionListener(){
       public void actionPerformed(ActionEvent e){
          try{
              key = new Key_Master1();
              Working w = new Working();
              w.key = key;
               
              String level7 = "The tortoise knew it couldn't match the hare's speed, but it believed in its own persistence and determination. The hare, on the other hand, was overconfident and believed victory would be easy. The animals gathered at the starting line, and the race began with a signal from the wise old owl.";
              
              Key_Master1.canvas.setText(level7);
              Key_Master1.canvas.addKeyListener(w);
              Key_Master1.submit.addActionListener(w);
              w.processQuestion(Key_Master1.canvas.getText());
       }
          catch(Exception detect){
              System.out.println(detect);
          }
       }
   });
   }
   
   
   public void openPlayground8(){
       open8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  String level8 = "With a burst of energy, the hare sprinted ahead, leaving the tortoise far behind in a cloud of dust. The hare was so fast that it quickly disappeared from sight. Meanwhile, the tortoise kept plodding along at its own slow and steady pace, never giving up. It focused on putting one foot in front of the other, believing that consistency would eventually lead to success.";
                  
                  Key_Master1.canvas.setText(level8);
                  Key_Master1.canvas.addKeyListener(w);
                  Key_Master1.submit.addActionListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
   public void openPlayground9(){
       open9.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level9 = "As the hare raced ahead, it became overconfident and decided to take a nap under a shady tree, thinking there was plenty of time to rest. Meanwhile, the tortoise continued its slow but determined progress, inching closer to the finish line. The tortoise knew that perseverance and determination were the keys to victory, no matter how slow it seemed.";
                   
                   Key_Master1.canvas.setText(level9);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground10(){ //Level 6 - Level 10 : "The tale of race between tortoise and hare."
       open10.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level10 = "When the hare woke up, it saw the tortoise nearing the finish line. Panicking, the hare sprinted, but it was too late. The tortoise had won. The animals cheered, impressed by the tortoise's perseverance.The hare learned that speed alone isn't enough and that overconfidence can lead to defeat. The tortoise valued consistency and never giving up. They became friends, celebrating humility and determination.";
                   
                   Key_Master1.canvas.setText(level10);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   
               }
              catch(Exception detect){
                  System.out.println(detect);
              }
           }
       });
   }
   
   
   //Beginner - I Configuration Ends Here....................
   
   
   
   
   //Beginner - II Configuration Starts Here.......................
   
   public void openPlayground11(){   //Level 11 - Level 15 : "The crow and the pitcher."
       open11.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
              key = new Key_Master1();
              Working w = new Working();
              w.key = key;
              
              String level11  = "In a very hot and dry desert, there was a smart crow. The crow was really thirsty and was looking for water. After flying for a long time, the crow saw a pitcher that was partly buried in the sand. The crow felt hopeful but was not sure if there would be any water in it. The crow flew down and looked inside the pitcher. It saw that there was a little bit of water at the bottom, but it was too low for the crow to drink using its beak. The crow thought hard, trying to figure out what to do.";
              
              Key_Master1.canvas.setText(level11);
              Key_Master1.canvas.addKeyListener(w);
              Key_Master1.submit.addActionListener(w);
              w.processQuestion(Key_Master1.canvas.getText());      
              }   
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
   
   public void openPlayground12(){
       open12.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level12 = "The clever crow had a really smart idea! It started picking up small stones and dropping them into the pitcher, one by one. When the stones fell into the pitcher, they pushed the water up, making it rise higher and closer to the crow's beak. The crow kept dropping more and more stones until the water level became high enough for the crow to reach it. Finally, the crow was able to drink the water and felt so happy and relieved. The crow was really proud of itself for being so clever and finding a way to quench its thirst";
                   
                   Key_Master1.canvas.setText(level12);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground13(){
       open13.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level13 = "The moral of this fable is that intelligence, coupled with creativity, can triumph over seemingly insurmountable challenges. The crow's capacity to think outside the box and cleverly utilize available resources allowed it to discover a solution to its thirst. This fable emphasizes the significance of problem-solving and the ability to adapt to our environment. It serves as a reminder that with a touch of ingenuity and resourcefulness, we have the potential to conquer any obstacles that may obstruct our path.";
                   
                   Key_Master1.canvas.setText(level13);
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
               
           }
       });
}
   
   
   
   public void openPlayground14(){
       open14.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level14 = "The birds witnessed the strength of unity and realized that by combining their efforts, they could overcome their individual limitations. Their shared determination and collective action not only quenched their thirst but also fostered a sense of camaraderie among them. This part of the fable serves as a powerful reminder that when we work together, supporting and uplifting one another, we can achieve remarkable things and pave the way for a brighter future.";
                   
                   Key_Master1.canvas.setText(level14);
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   public void openPlayground15(){  //Level 11 - Level 15 : "The crow and the pitcher."
       open15.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key  = key;
                  
                  String level15 = "Through their collective and unwavering efforts, the birds discovered that unity and collaboration have the power to transcend individual limitations and create a profound synergy that leads to remarkable achievements. This fable serves as a timeless and inspiring reminder that by fostering a spirit of cooperation, embracing diversity, and harnessing the power of teamwork, we can overcome challenges, inspire positive change, and build a future where everyone can flourish together harmoniously.";
                  
                  Key_Master1.canvas.setText(level15);
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
   
   public void openPlayground16(){ //Level 16 - Level 20 : "The tale of four cows and one lion."
       open16.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  String level16 =  "In a vast and serene grassland, bathed in the gentle hues of the setting sun, four cows named Ethan, Liam, Noah, and Oliver found solace in their shared bond. Like the blades of grass that danced harmoniously in the breeze, they formed an unbreakable quartet, their gentle moos echoing across the open meadows. With curious eyes and contented hearts, they roamed the grassy expanse, discovering the wonders of nature that surrounded them. Little did they know, their peaceful existence was about to be transformed by an encounter that would shape their destinies.";
                  
                  Key_Master1.canvas.setText(level16);
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
   public void openPlayground17(){
       open17.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  String level17 = "Into their world of tranquil grazing strode Leo, a majestic lion whose powerful presence commanded attention and reverence. Ethan, Liam, Noah, and Oliver, captivated by the regality that emanated from his magnificent mane and piercing gaze, were instantly drawn to his aura of strength, grace, and wisdom. As they spent time in Leo's company, they marveled at his noble demeanor and gentle guidance, finding in him a mentor and protector. Their admiration grew exponentially as they witnessed firsthand his remarkable ability to navigate the challenges of life with unwavering dignity and poised resilience.";
                  
                  Key_Master1.canvas.setText(level17);
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
   public void openPlayground18(){
       open18.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  String level18 = "One fateful day, a dark shadow cast its ominous presence upon their cherished grassland as a formidable pack of wolves emerged, their piercing howls breaking the tranquility that once enveloped the meadows. Ethan, Liam, Noah, and Oliver, fueled by an unwavering sense of loyalty and a shared responsibility to protect their fellow grazers, united in a resolute stand against the encroaching threat. With hearts beating as one, they formed an impenetrable barrier around their comrades, their determination kindled by Leo's commanding roar that echoed with unwavering resolve.";
                  
                  Key_Master1.canvas.setText(level18);
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
   public void openPlayground19(){
       open19.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level19 = "The ferocious wolves, taken aback by the unwavering alliance of Leo and the cows, found themselves hesitant and uncertain in the face of such a formidable united front. The strength of their predatory instincts wavered, subdued by the indomitable spirit that radiated from this unified force. As the tension dissipated and peace restored, a profound sense of gratitude enveloped the hearts of Ethan, Liam, Noah, and Oliver. Overwhelmed by the magnitude of Leo's courage and selflessness, they approached him with deep admiration and sincere gratitude. In a moment of humble reverence, they offered their unwavering loyalty, pledging to stand by his side through every challenge.";
                   
                   Key_Master1.canvas.setText(level19);
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }               
           }
       });
   }
   
   
   
   
   public void openPlayground20(){    //Level 16 - Level 20 : "The tale of four cows and one lion."
       open20.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   String level20 = "From that day forward, Leo, Ethan, Liam, Noah, and Oliver embarked on a shared journey, safeguarding the grassland and all its inhabitants. Each cow, with his unique strengths and gentle nature, contributed to the collective harmony of their newfound herd. Ethan's resourcefulness, Liam's nurturing spirit, Noah's unwavering bravery, and Oliver's keen intuition blended seamlessly with Leo's regal leadership.Together, they created a sanctuary where friendship flourished, inspiring others with their unwavering unity and determination to protect and preserve the beauty of their shared home.";
                   
                   Key_Master1.canvas.setText(level20);
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });       
   }
   
   
   //Beginner - II Configuration ends here............
   
   
   
   //Intermediate - I Configuration starts here..........
   
   public void openPlayground21(){    //Level 21 - Level 25 : "The Power of Positive Thinking."
       open21.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuffer level21 = new StringBuffer("Positive thinking is a powerful mindset that can have a profound impact on our lives. When we consciously choose to focus on the positive aspects of our experiences, we invite more joy, gratitude, and contentment into our daily lives. It involves cultivating an optimistic outlook, embracing a constructive mindset, and approaching challenges with a sense of possibility and growth. By adopting positive thinking, we open ourselves up to a world of opportunities and set the stage for personal transformation and fulfillment.Positive thinking is not about ignoring or denying the existence of problems or difficulties. Instead, it is about acknowledging them and choosing to direct our attention towards solutions and the potential for positive outcomes.");
                  
                  Key_Master1.canvas.setText(level21.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   
   }
   
   
       
       public void openPlayground22(){
           open22.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  try{
                      key = new Key_Master1();
                      Working w = new Working();
                      w.key = key;
                      
                      StringBuffer level22 = new StringBuffer("One of the remarkable benefits of positive thinking is its ability to help us develop resilience and bounce back from setbacks. When faced with obstacles or failure, positive thinking allows us to view them as temporary setbacks rather than insurmountable roadblocks. It empowers us to learn from our mistakes, adapt our strategies, and persist in the pursuit of our goals. With a positive mindset, we can transform adversity into opportunities for personal growth, self-improvement, and ultimately, success. By cultivating a positive mindset, we develop the mental fortitude to overcome challenges and setbacks. We are less likely to dwell on the negative aspects of a situation and more inclined to focus on finding solutions and alternative paths forward. Positive thinking enables us to maintain a sense of optimism and determination.");
                      
                      Key_Master1.canvas.setText(level22.toString());
                      Key_Master1.canvas.addKeyListener(w);
                      w.processQuestion(Key_Master1.canvas.getText());
                      Key_Master1.submit.addActionListener(w);
                  }
                  catch(Exception detect){
                      System.out.println(detect);
                  }
              } 
           });
       }
       
       
       
       public void openPlayground23(){
           open23.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent e){
                  try{
                      key = new Key_Master1();
                      Working w = new Working();
                      w.key = key;
                      
                      StringBuffer level23 = new StringBuffer("In addition to resilience, positive thinking greatly enhances our overall psychological and emotional well-being. When we intentionally direct our attention to the positive aspects of life, we reduce stress, anxiety, and negative thought patterns. By focusing on the good, we invite more happiness, contentment, and inner peace into our lives. Positive thinking allows us to appreciate the beauty around us, find joy in the simple pleasures, and cultivate a sense of gratitude for the blessings we have. When we practice positive thinking, we shift our perspective from dwelling on what is lacking or going wrong to appreciating what is going well in our lives. This shift in focus enables us to experience greater satisfaction and fulfillment. By acknowledging and celebrating the positive aspects of our lives.");
                      
                      Key_Master1.canvas.setText(level23.toString());
                      Key_Master1.canvas.addKeyListener(w);
                      w.processQuestion(Key_Master1.canvas.getText());
                      Key_Master1.submit.addActionListener(w);
                  }
                  catch(Exception detect){
                      System.out.println(detect);
                  }
              } 
           });
       }
   
   
   
   public void openPlayground24(){
       open24.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level24 = new StringBuffer("Furthermore, positive thinking strengthens our relationships and fosters deeper connections with others. When we approach interactions with a positive mindset, we create an environment of trust, empathy, and understanding. We become better listeners, more compassionate companions, and supportive friends. By maintaining a positive attitude, we inspire and uplift those around us, spreading positivity and kindness in our interactions. Positive thinking not only enriches our own lives but also has a ripple effect, positively influencing the lives of those we come in contact with.When we embody positive thinking in our relationships, we create a safe and nurturing space for open communication and connection. Our positive energy and attitude can inspire others to adopt a similar mindset.");
                   
                   Key_Master1.canvas.setText(level24.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground25(){    //Level 21 - Level 25 : "The Power of Positive Thinking."
       open25.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level25 = new StringBuffer("Moreover, positive thinking enhances our problem-solving skills and empowers us to overcome challenges effectively. With a positive mindset, we approach problems with optimism, creativity, and a solution-oriented mindset. Instead of getting stuck in negativity or feeling overwhelmed by obstacles, we focus on finding solutions and exploring alternative approaches. Positive thinking opens our minds to new possibilities, encourages innovative thinking, and helps us navigate through difficulties with a sense of confidence and determination. When we approach problem-solving with a positive mindset, we are more likely to discover creative solutions and make progress towards our goals. Positive thinking allows us to maintain a clear and focused perspective.");
                   
                   Key_Master1.canvas.setText(level25.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }                   
       });
   }
   
   
   
   
   public void openPlayground26(){    //Level 26 - Level 30 : "The Importance of Time Management."
       open26.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level26 = new StringBuffer("Effective time management is an indispensable and transformative skill that plays a pivotal role in optimizing the trajectory of our daily lives. It involves purposefully strategizing, meticulously coordinating, and seamlessly integrating our diverse endeavors to extract the utmost value from the finite and precious resource that is time. By cultivating and honing our proficiency in the art of time management, we can substantially elevate our productivity levels, mitigate the weighty burden of stress, and forge a harmonious equilibrium between the multifaceted tapestry of our personal and professional responsibilities. Embracing the tenets of effective time management endows us with the empowering ability to assume an authoritative stance over the ticking hands of the clock, ensconcing ourselves in the driving seat of our own destinies. By wielding this newfound power, we ensure that our time is judiciously allocated to the pursuits that hold the highest resonance and transformative.");
                   
                   Key_Master1.canvas.setText(level26.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground27(){
       open27.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level27 = new StringBuffer("The benefits of adept time management extend far beyond the mere boundaries of productivity and efficiency, permeating various facets of our lives with a transformative touch. By skillfully managing our time, we liberate ourselves from the clutches of procrastination, unfettering our potential to steadfastly steer towards our goals and priorities. This propels us towards making well-informed decisions, optimizing resource allocation, and gracefully meeting deadlines without succumbing to the overwhelming weight of pressure. Furthermore, the art of time management bestows upon us the invaluable gift of order and command over the intricacies of our existence, ushering in a profound sense of serenity and tranquility. As stress dissipates, we are able to bask in the profound peace of mind that arises from orchestrating our days with meticulous care. Moreover, time management acts as a catalyst for holistic well-being, gifting us with ample opportunities for self-care.");
                   
                   Key_Master1.canvas.setText(level27.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground28(){
       open28.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level28 = new StringBuffer("To enhance our prowess in time management, it is imperative to harness a diverse array of strategies that can propel us towards optimal efficiency. Foremost among these is the act of setting clear, well-defined goals and priorities that serve as our guiding beacons amidst the vast sea of tasks and responsibilities. By discerning the true essence of what holds genuine significance to us, we are empowered to allocate our most precious resource - time - with wisdom and precision. Employing the aid of meticulously crafted schedules or comprehensive to-do lists allows us to tread the path of organization, safeguarding us against the perils of aimless wandering and ensuring that we remain firmly anchored to our objectives. Simultaneously, eradicating distractions and erecting sturdy boundaries becomes a necessity, for it is through these fortifications that we can harness the remarkable power of unwavering focus and undiluted concentration.");
                   
                   Key_Master1.canvas.setText(level28.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   public void openPlayground29(){
       open29.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level29 = new StringBuffer("While time management holds immense potential for personal growth and accomplishment, it is not without its fair share of obstacles. One recurring challenge is the all-too-familiar inclination to shoulder an excessive load of responsibilities, thereby unwittingly subjecting ourselves to the clutches of overwhelm and the arduous task of prioritization. Cultivating the art of uttering a resolute \"no\" and setting realistic expectations emerge as pivotal skills to triumph over this formidable challenge. Equally daunting is the perennial adversary known as procrastination, which stealthily undermines our best intentions and sabotages our time management endeavors. Conquering this formidable foe necessitates the cultivation of unwavering self-discipline, as well as breaking down complex tasks into bite-sized, manageable steps that are easier to tackle. Additionally, harnessing the power of time-blocking techniques.");
                   
                   Key_Master1.canvas.setText(level29.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground30(){     //Level 25 - Level 30 : "The Importance of Time Management."
       open30.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                
                   StringBuffer level30 = new StringBuffer("In essence, the art of time management unveils a world of possibilities, offering us the key to unlock the treasures hidden within the fleeting moments of our lives. As we bid farewell to the shackles of disorganization and embrace the empowering embrace of efficient time management, we embark on a journey towards enhanced productivity, heightened well-being, and unparalleled fulfillment. With each deliberate choice and calculated allocation of our time, we weave the tapestry of a life that resonates with our deepest values and aspirations. Let us cherish the significance of time, for it is the currency through which we mold our destiny. With a steadfast commitment to effective time management, we embrace the boundless potential that lies within us, propelling ourselves towards a future with accomplishment, purpose, and an enduring sense of fulfillment. So, dear friends, let us seize the reins of time and embark on this transformative voyage together.");
                   
                   Key_Master1.canvas.setText(level30.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   //Intermediate - I Configuration Ends Here.........
   
   
   //Intermediate - II Configuration Starts Here.....................
   
   public void openPlayground31(){    // Level 31 - Level 35 : "The Impact of climate change."
       open31.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
               key = new Key_Master1();
               Working w = new Working();
               w.key = key;
               
               StringBuffer level31 = new StringBuffer("Climate change, a pressing global issue, has been a topic of concern for scientists, policymakers, and individuals alike. It refers to the long-term alteration of temperature and typical weather patterns in different regions of the world. This alteration is primarily attributed to human activities, particularly the burning of fossil fuels, deforestation, and industrial processes that release greenhouse gases into the atmosphere. The consequences of climate change are wide-ranging and encompass various aspects of our planet, including the environment."+"\n"+"The primary driver of climate change is the excessive emission of greenhouse gases, such as carbon dioxide (CO2), methane (CH4), and nitrous oxide (N2O). These gases trap heat in the Earth's atmosphere, leading to a phenomenon known as the greenhouse effect. As a result, the Earth's surface and lower atmosphere experience a gradual increase in temperature, referred to as global warming. This warming trend has been observed over the past century and is expected to continue unless significant actions are taken to reduce greenhouse emissions.");
               
               Key_Master1.canvas.setText(level31.toString());
               Key_Master1.canvas.addKeyListener(w);
               w.processQuestion(Key_Master1.canvas.getText());
               Key_Master1.submit.addActionListener(w);
           }
           catch(Exception detect){
               System.out.println(detect);
           }
           }  
       });
   }
   
   
   
   public void openPlayground32(){
       open32.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level32 = new StringBuffer("One of the most impacts of climate change is the increase in extreme weather events. Heatwaves, droughts, hurricanes, and heavy rainfall are becoming more frequent and intense in many parts of the world. These events not only cause immediate devastation, but also have long-term consequences for ecosystems, agriculture, and human settlements. For instance, prolonged droughts can lead to water scarcity, crop failures, and food insecurity, while intense storms and flooding can result in property damage, displacement of communities, and loss of life."+"\n"+"The melting of polar ice caps and glaciers is another profound consequence of climate change. The Arctic region, in particular, is experiencing rapid ice loss, leading to rising sea levels. This poses a significant threat to low-lying coastal areas and small island nations, increasing the risk of flooding and coastal erosion. Furthermore, the loss of ice reduces the Earth's reflectivity, amplifying the warming effect and creating a feedback loop that accelerates climate change. The impacts of melting ice are not limited to sea-level rise; they also disrupt ecosystems.");
                   
                   Key_Master1.canvas.setText(level32.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
   });
   
   }
   
   
   public void openPlayground33(){
       open33.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level33 = new StringBuffer("Climate change also has far-reaching implications for ecosystems and biodiversity. As temperatures rise and weather patterns shift, many species struggle to adapt to the new conditions. This can result in changes in migration patterns, altered breeding seasons, and shifts in the distribution of plant and animal species. Ecosystems that have evolved over millennia are now being disrupted, leading to a loss of biodiversity and ecological imbalance."+"\n"+"The consequences of climate change are not limited to the natural world; they also have significant social and economic impacts. Vulnerable communities, particularly those in developing countries, are disproportionately affected by climate change. Limited access to resources, inadequate infrastructure, and a high dependence on climate-sensitive sectors such as agriculture make these communities more susceptible to the adverse effects of changing weather patterns.");
                   
                   Key_Master1.canvas.setText(level33.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);      
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground34(){
       open34.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level34 = new StringBuffer("The economic implications of climate change are substantial. Damage to infrastructure, agricultural losses, increased healthcare costs, and the need for adaptation measures all pose financial burdens on societies. Moreover, the potential disruption of global supply chains and the increased frequency of extreme weather events can have ripple effects on the global economy. Addressing climate change requires substantial investments in renewable energy, sustainable infrastructure, and resilient systems."+"\n"+"Recognizing the urgency of the issue, global efforts to address climate change have gained momentum in recent years. The Paris Agreement, adopted in 2015, is a landmark international agreement aimed at limiting global warming to well below 2 degrees Celsius above pre-industrial levels. It calls for collective action from countries to reduce greenhouse gas emissions, enhance climate resilience, and provide support to developing countries in their climate change adaptation and mitigation efforts.");
                   
                   Key_Master1.canvas.setText(level34.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   
   public void openPlayground35(){       //Level 30 - Level 35 : "The Impact of Climate Change."
       open35.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level35 = new StringBuffer("Individual actions also play a crucial role in combating climate change. Making sustainable choices in our daily lives, such as reducing energy consumption, using public transportation, and adopting environmentally friendly practices, can contribute to mitigating climate change. Education and awareness-raising campaigns are essential to empower individuals and communities to take action and make informed decisions. Addressing climate change requires collective efforts, international cooperation, and individual actions."+"\n"+"In conclusion, climate change is a multifaceted and urgent global issue with wide-ranging consequences. It affects the environment, ecosystems, human societies, and the global economy. The primary driver of climate change is the excessive emission of greenhouse gases, resulting from human activities. The impacts of climate change include increased frequency and intensity of extreme weather events, melting ice caps and rising sea levels, and economic challenges. create a more resilient and sustainable future for generations to come.");
                   
                   Key_Master1.canvas.setText(level35.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   
   public void openPlayground36(){             //Level 36 - Level 40 : "Data Entry and Accuracy in Typing."
       open36.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
               key = new Key_Master1();
               Working w = new Working();
               w.key = key;
               
               StringBuffer level36 = new StringBuffer("Data entry is a crucial aspect of information management, where accurate and efficient typing plays a pivotal role. The meticulous task of inputting data requires precision, attention to detail, and adherence to established standards. Data integrity and accuracy are of paramount importance in this process, as errors can have far-reaching consequences in decision-making, analysis, and overall data quality. Let us delve into the realm of data entry and explore the significance of accuracy in typing, along with the strategies and techniques employed to ensure reliable and error-free data input."+"\n"+"In the realm of data entry, precision and accuracy are indispensable. Each keystroke and character input must align with the intended information, reflecting a commitment to maintaining the integrity of the data. This entails a methodical approach to typing, whereby attention to detail is paramount. Practitioners of data entry must possess a keen eye for inconsistencies, typographical errors, and formatting irregularities, ensuring that the entered data adheres to the established conventions and requirements.");
               
               Key_Master1.canvas.setText(level36.toString());
               Key_Master1.canvas.addKeyListener(w);
               w.processQuestion(Key_Master1.canvas.getText());
              Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
               
   public void openPlayground37(){
       open37.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuffer level37 = new StringBuffer("To achieve optimal accuracy, it is essential to cultivate a range of strategies and techniques. Touch typing, a method where typists rely on muscle memory rather than visual cues, can significantly enhance typing speed and accuracy. By training fingers to automatically find the correct keys, touch typists minimize errors and achieve a seamless flow of data entry. Furthermore, the use of keyboard shortcuts and hotkeys can expedite the typing process, reducing the likelihood of errors caused by manual input. Maintaining accuracy in data entry also necessitates an understanding of the data being entered."+"\n"+"This knowledge empowers data entry professionals to exercise critical thinking and judgment, ensuring the accuracy and reliability of the entered information.Another critical aspect of accurate data entry is the utilization of validation and verification techniques. Validating data entry involves verifying the accuracy and completeness of entered information by cross-referencing it with source documents or databases. This process helps identify discrepancies or inaccuracies that may have occurred during the typing process.");
                  
                  Key_Master1.canvas.setText(level37.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          }
       });
   }
   
   
   
   public void openPlayground38(){
       open38.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuffer level38 = new StringBuffer("Additionally, employing data validation rules and algorithms can help detect errors or inconsistencies in real-time, providing immediate feedback to the typist and facilitating prompt correction. In the pursuit of accuracy, typists must also be mindful of their typing environment and ergonomic practices. Ergonomics plays a vital role in ensuring accuracy and the well-being of data entry professionals. A comfortable and well-designed workstation, with proper keyboard placement and wrist support, promotes good posture and minimizes fatigue and discomfort. Typists should also take regular breaks and do exercises to prevent repetitive strain injuries and maintain focus and concentration."+"\n"+"The significance of accuracy in data entry extends beyond individual tasks. Inaccurate or erroneous data can compromise the integrity of databases, analytics, and decision-making processes. It can lead to faulty conclusions, flawed reports, and misguided strategies. Organizations that rely on accurate data for operational, financial, or regulatory purposes must prioritize accuracy in data entry to maintain trust, efficiency, and compliance.");
                  
                  Key_Master1.canvas.setText(level38.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          } 
       });
   }
   
   
   
   public void openPlayground39(){
       open39.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level39 = new StringBuffer("Maintaining accuracy in data entry is not only crucial for individual tasks but also for the overall integrity of databases, analytics, and decision-making processes within organizations. Inaccurate or erroneous data can have far-reaching consequences, leading to faulty conclusions, flawed reports, and misguided strategies. For instance, financial institutions rely on accurate data for regulatory reporting and risk analysis, where even a minor error can result in severe consequences. Similarly, healthcare organizations depend on accurate data for patient records and medical research, where mistakes can compromise patient care and scientific validity."+"\n"+"To ensure accuracy in data entry, organizations must establish robust quality control measures. This includes implementing data validation checks, conducting regular audits, and providing training and feedback to data entry professionals. Validating data entry involves cross-checking the entered information against source documents or databases to identify discrepancies or inaccuracies. By incorporating automated validation rules and algorithms, organizations can streamline this process and minimize the risk of errors slipping through.");
                   
                   Key_Master1.canvas.setText(level39.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground40(){  //Level 35 - Level 40 : "Data Entry and Accuracy in Typing."
       open40.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuffer level40 = new StringBuffer("Moreover, organizations should prioritize data governance practices to ensure accurate and reliable data entry. Data governance encompasses the policies, procedures, and controls that govern the management of data within an organization. By establishing clear guidelines and standards for data entry, organizations can promote consistency, accuracy, and accountability. This involves defining data entry procedures, specifying data formats and conventions, and implementing data quality monitoring mechanisms.In addition to organizational efforts, data entry professionals should be encouraged to continuously improve their skills and stay updated with their skills."+"\n"+"In conclusion, accuracy in data entry is vital for ensuring the reliability and usefulness of data within organizations. Inaccurate data can lead to faulty decision-making, compromised reporting, and potential risks for various industries. By implementing quality control measures, establishing data governance practices, and providing ongoing training and support to data entry professionals, organizations can enhance accuracy in data entry and maintain the integrity of their data assets and drive through successful outcomes.");
                   
                   Key_Master1.canvas.setText(level40.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   //Intermediate - II Configuration Ends here...........
   
   
   //Expertise - I Configuration starts here.................
   
   public void openPlayground41(){  //Level 41 - Level 44 : "The Significance of Cultural Diversity."
       open41.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level41 = new StringBuilder("Cultural diversity holds paramount significance in our interconnected and globalized world, encompassing the simultaneous existence of an extensive array of cultural customs, traditions, and beliefs within the framework of a community or the broader global context. The profound recognition and authentic appreciation of cultural diversity contribute indispensably to the establishment and enhancement of social cohesion, fostering an environment of mutual respect, amity, and inclusivity. The embracement and commemoration of cultural diversity enable individuals to venerate and uphold their own cultural heritage, while concurrently cultivating an ethos of open-mindedness, acceptance, and empathy towards others. This intricately woven tapestry of diverse cultures begets a multifaceted and pluralistic society."+"\n"+"where the inherent value and magnificence of differences are accorded due recognition and admiration, fostering a profound sense of belonging, unity, and harmony among all constituents of the community. Cultural diversity assumes a pivotal and transformative role in shaping the multifaceted realms of art, literature, and intellectual pursuits. Each culture emanates its distinct and captivating artistic expressions, captivating storytelling traditions, and alluring creative manifestations.");
                   
                   Key_Master1.canvas.setText(level41.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground42(){
       open42.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level42 = new StringBuilder("These profound and intricate artistic endeavors serve not only as steadfast guardians of cultural heritage but also as catalysts for cross-cultural innovation, collaboration, and exploration. The convergence and intermingling of diverse artistic traditions engender a fertile ground for the birth of novel forms, innovative styles, and compelling narratives, cultivating a dynamic and vibrant cultural landscape wherein creativity flourishes and artists discover boundless inspiration within the tapestry of humanity's rich and diverse cultural fabric. The seamless exchange and amalgamation of artistic ideas and influences between cultures enhance artistic expression, nurture and strengthen cultural identities, and give rise to a universal language that transcends geographical, social, and linguistic boundaries."+"\n"+"Uniting people across the globe through shared aesthetic experiences. Through the interplay and harmonization of diverse artistic traditions, humanity's creative endeavors find new dimensions, inviting individuals to immerse themselves in the beauty of cultural diversity and witness the transformative power of artistic expression.Cultural diversity assumes a pivotal and consequential role in fostering economic growth and develop our interconnected and interdependent global landscape.");
                   
                   Key_Master1.canvas.setText(level42.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground43(){
       open43.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level43 = new StringBuilder(" The dynamic exchange and fusion of diverse cultures propel the engines of innovation, entrepreneurship, and international trade. Each culture contributes its unique and invaluable reservoir of knowledge, skills, and perspectives, acting as a catalyst for economic progress and bolstering competitiveness on a global scale. The amalgamation of diverse cultural influences engenders the emergence of novel industries, innovative products, and tailored services that cater to the multifaceted needs and discerning preferences of an increasingly diverse and multicultural consumer base. The conscious embrace and harnessing of cultural diversity in the realms of business and organizations create an environment that fosters and amplifies creativity, problem-solving prowess, and collaborative synergy."+"\n"+"Thereby propelling innovation forward and securing a competitive edge in the global marketplace. By effectively leveraging the diverse perspectives, experiences, and expertise of individuals hailing from disparate cultural backgrounds, organizations can ignite the flames of innovation, gain profound insights into the intricacies of global markets, and pave the way for sustained and resilient economic growth, attaining new heights of prosperity and success.");
                   
                   Key_Master1.canvas.setText(level43.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground44(){     //Level 41 - Level 44 : "The Significance of Cultural Diversity."
       open44.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level44 = new StringBuilder("Cultural diversity assumes a pivotal and transformative role in fostering social cohesion and nurturing a climate of peaceful coexistence among diverse communities. By promoting and upholding the principles of mutual respect, understanding, and acceptance, cultural diversity acts as a potent and efficacious antidote to the pervasive conflicts, prejudices, and stereotypes that often stem from ignorance or fear. When communities of different cultural backgrounds come together in a spirit of appreciation and celebration, they forge strong and resilient bridges of understanding, empathy, and connection. This serves as a solid foundation for constructive dialogue, cooperative engagement, and collective action in tackling shared societal challenges, such as social inequality, discrimination, and injustice."+"\n"+"Embracing and embracing cultural diversity in all its forms fosters social harmony and ensures that equal opportunities are afforded to all individuals, regardless of their cultural backgrounds. It fosters the cultivation of inclusive societies wherein diverse voices are not only heard and acknowledged but also valued and respected, thereby nurturing a climate of social justice, concord, and sustainable peace. By embracing and cherishing cultural diversity, we cultivate a world in which every individual can thrive and contribute.");
                   
                   Key_Master1.canvas.setText(level44.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
              }
             catch(Exception detect){
                 System.out.println(detect);
             }               
           }   
       });
   }
   
   
   
  public void openPlayground45(){  //Level 45 - Level 48 : "The Advantages and Disadvantages of Online Shopping."
      open45.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuilder level45 = new StringBuilder("The advent of online shopping has brought about a paradigm shift in the way we engage in retail transactions, endowing us with an abundance of advantages and conveniences. Foremost among these is the unparalleled accessibility it offers, granting consumers the freedom to peruse and procure an extensive range of products from the sanctuary of their own homes, unbound by the constraints of time and geographical boundaries. This sheer convenience of online shopping not only saves precious time but also obviates the necessity of physically venturing to brick-and-mortar establishments. Moreover, the virtual realm of online shopping affords shoppers an unparalleled gamut of products and services to choose from, endowing them with untrammeled access to a global marketplace at their very fingertips. With a mere handful of clicks, discerning consumers can navigate a veritable cornucopia of options, meticulously compare prices."+"\n"+"One prominent drawback associated with the realm of online shopping lies in the conspicuous absence of physical interaction with the merchandise. In stark contrast to traditional brick-and-mortar establishments, where customers can engage their senses by touching and trying on items before committing to a purchase, online shoppers are bereft of such experiential encounters. Consequently, this dearth of engagement may give rise to a sense of uncertainty and discontentment if the product received fails to align with preconceived expectations.");
                  
                  Key_Master1.canvas.setText(level45.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          }
      });
  }
  
  
  public void openPlayground46(){
      open46.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuilder level46 = new StringBuilder("Furthermore, online shopping necessitates a certain degree of reliance on product descriptions, images, and customer reviews, which, despite their informational value, may occasionally fall short in providing a comprehensive understanding of the product's quality or suitability. Thus, inherent in the realm of online shopping is a discernible level of risk, as consumers find themselves compelled to place their trust in the accuracy of the information provided and the reputation of the seller.Yet another drawback associated with the realm of online shopping lies in the lurking specter of fraud and the omnipresent security risks it entails. Regrettably, the expansive realm of the internet is not impervious to the machinations of unscrupulous individuals who seek to perpetrate scams and engage in fraudulent activities. As such, it is imperative for online shoppers to exercise caution when divulging their personal and financial information."+"\n"+"Cybercriminals, driven by nefarious intentions, may employ insidious tactics to pilfer sensitive data, including but not limited to credit card details, thereby catapulting unsuspecting victims into the treacherous realm of identity theft or subjecting them to unauthorized utilization of their hard-earned funds. In light of these pernicious threats, it is of paramount importance for online shoppers to remain steadfast in their commitment to security measures.");
                  
                  Key_Master1.canvas.setText(level46.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          }
      });
  }
  
  
  
  public void openPlayground47(){
      open47.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuilder level47 = new StringBuilder("These measures encompass selecting reputable websites, employing secure payment methods, and diligently fortifying their devices and accounts with robust passwords and state-of-the-art security software to shield themselves against the insidious predations of cybercriminals.Conversely, online shopping bestows upon discerning consumers a litany of advantages that serve as compelling reasons for its enduring popularity. Notably, a pivotal advantage lies in the unparalleled availability of an expansive assortment of products. Online retailers, unencumbered by the spatial limitations that confine their brick-and-mortar counterparts, can proffer an extensive repertoire of items that surpasses the inventory of physical stores. This bountiful range encompasses not only commonplace goods but also rare and elusive commodities that may prove elusive within local confines."+"\n"+"Consequently, online shoppers find themselves bestowed with an unparalleled opportunity to procure unique and specialized items that might otherwise elude their grasp. Moreover, the realm of online shopping often unveils a treasure trove of exclusive deals and discounts, affording consumers the delightful prospect of securing remarkable savings on their purchases. Such alluring incentives serve as an additional impetus for shoppers to embark upon the virtual realm of online commerce, reaping the tangible benefits of prudent financial management.");
                  
                  Key_Master1.canvas.setText(level47.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
      }
      });
  }
  
   
   
   public void openPlayground48(){   //Level 45 - Level 48 : "The Advantages and Disadvantages in Online Shopping."
       open48.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level48 = new StringBuilder("As we draw the curtains on our exploration of online shopping, it is incumbent upon us to cast a discerning gaze upon yet another compelling advantage that endows this mode of retail with an irresistible allure the unparalleled convenience of doorstep delivery. With a mere few clicks of the mouse or taps on the screen, discerning shoppers find themselves catapulted into a realm where the notion of laborious trips to physical stores is relegated to the annals of history. No longer must they grapple with the arduous task of navigating through bustling aisles, clutching heavy bags and enduring the weariness that permeates both body and soul. The realm of online shopping, in its benevolent embrace, affords them the resplendent luxury of having their carefully curated purchases transported to their very doorsteps, obliterating the need to embark upon physical sojourns to collect their coveted acquisitions."+"\n"+"This invaluable boon holds particular significance for individuals beset with mobility issues or those who find themselves ensnared within the clutches of limited access to reliable transportation. The seamless orchestration of doorstep delivery, in intricate ballet of efficiency, ensures that the sanctity of time is honored and the strains of physical exertion are assuaged. By deftly circumventing the interminable queues and the congested hallowed grounds of physical stores, online shoppers find themselves emboldened by the newfound reserves of time and energy.");
                   
                   Key_Master1.canvas.setText(level48.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
  public void openPlayground49(){  //Level 49 - Level 52 : "The Role of Technology in Education".
      open49.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  Working w = new Working();
                  w.key = key;
                  
                  StringBuilder level49 = new StringBuilder("Technology, with its inexorable march, has emerged as a transformative force within the realm of education, instigating seismic shifts in the pedagogical landscape. In this era defined by the ubiquitous presence of digital innovations, technology assumes a role of paramount significance, poised at the vanguard of reshaping and reimagining the educational journey for students and educators alike. With its multifaceted arsenal of interactive learning platforms, immersive virtual environments, and cutting-edge online collaboration tools, technology bequeaths upon the educational realm an unassailable array of opportunities to transcend the boundaries of conventional teaching and learning methodologies. This relentless march of technological advancements heralds a new dawn, one characterized by a tapestry of engagement, personalization, and inclusivity, where learners find themselves at the epicenter of a dynamic and vibrant learning ecosystem that unfurls boundless vistas of intellectual exploration and growth, Within this enchanting landscape."+"\n"+"The symbiotic relationship between technology and education flourishes, nurturing a harmonious union that is poised to redefine the very essence of learning itself.Amidst the ever-evolving landscape of education, the seamless integration of technology bestows upon the educational realm a pantheon of advantages that reverberate with resounding impact. Foremost among these advantages is the enhancement of accessibility and inclusivity, which serves as a clarion call for equitable educational opportunities to be made available to students.");
                  
                  Key_Master1.canvas.setText(level49.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          }
      });
  }
   
   
   
   public void openPlayground50(){
       open50.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level50 = new StringBuilder("Furthermore, technology unlocks the potential for personalized learning experiences, presenting a veritable cornucopia of opportunities for students to embark upon an odyssey of knowledge acquisition tailored precisely to their unique proclivities and individualized learning styles. Each student becomes the maestro of their educational symphony, conducting the harmonious crescendos of intellectual growth at their own rhythm, unhindered by the constraints of conventional, one-size-fits-all pedagogical approaches. Moreover, the advent of technology ushers in a cornucopia of interactive and immersive learning experiences, wherein educators wield the transformative power to imbue their lessons with a tapestry of multimedia elements, engendering an enchanting melange of visual and auditory stimuli that propel comprehension and retention to unprecedented heights. Through the judicious interweaving of interactive simulations, multimedia presentations, and captivating digital resources, educators orchestrate a symphony of engagement."+"\n"+"Enveloping students within a realm of intellectual curiosity and catalyzing a profound metamorphosis in the very fabric of their learning journeys.Within the realm of education, technology assumes the guise of a benevolent ally, endowing educators with an arsenal of tools and resources that amplify their pedagogical prowess. Online learning management systems stand as formidable gateways to a realm of enhanced efficiency, as educators deftly navigate through the labyrinthine corridors of virtual classrooms, armed with the power to create and distribute.");
                   
                   Key_Master1.canvas.setText(level50.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
              catch(Exception detect){
                  System.out.println(detect);
              }
           }
       });
   }
   
  //Expertise - I Configuration Ends Here..............................
   
   
   
   
   //Expertise - II Configuration Starts Here........................
   
   public void openPlayground51(){
       open51.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level51 = new StringBuilder("These digital platforms bring forth a cornucopia of opportunities to streamline administrative tasks, liberating educators from the shackles of mundane paperwork and providing them with invaluable time to focus on their true passion: the cultivation of young minds. Furthermore, educational software and applications assume the mantle of steadfast companions, furnishing teachers with a treasure trove of data-driven insights that serve as beacons illuminating the path to pedagogical excellence. Armed with these technological marvels, educators traverse the educational landscape with unwavering precision, guided by the flickering torchlight of granular student progress data. Through the lens of technology, educators become virtuoso conductors, orchestrating the symphony of learning with meticulous precision, attuned to the delicate nuances of each student's journey. Armed with data-rich knowledge, educators deftly navigate the vast expanses of pedagogy, honing their craft, and sculpting the contours of instruction to seamlessly meld with the unique mosaic of each student's learning needs."+"\n"+"In the ever-expanding landscape of education, technology stands as a catalyst, propelling collaboration and communication to unprecedented heights. Through the seamless integration of online platforms and virtual classrooms, the boundaries of time and space fade into insignificance, bestowing upon students the power to engage in real-time collaboration, transcending the constraints of physical proximity. Within these digital realms, students embark upon a voyage of discovery, united by a common purpose.");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
                   
                   Key_Master1.canvas.setText(level51.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);               
               }
           }
       });
   }
   
   
   
   public void openPlayground52(){    //Level 48 - Level 52 :  "The Role of Technology in Education."
       open52.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   Working w = new Working();
                   w.key = key;
                   
                   StringBuilder level52 = new StringBuilder("As they navigate the winding pathways of group projects, engaging in spirited discussions and exchanging invaluable peer feedback. Through the symphony of collective effort, harnessed by the unseen threads of digital connectivity, students are immersed in a tapestry of shared knowledge, fortifying their critical thinking skills, and fostering a deep sense of camaraderie. Moreover, technology acts as a conduit of communication, seamlessly linking educators, students, and parents in an intricate web of information exchange. With the click of a button, educators transcend the limitations of time and distance, effortlessly traversing the digital expanse to engage in meaningful conversations and provide timely guidance. The virtual realm becomes a vibrant hub of interaction, where questions find their answers, concerns are addressed, and the collective wisdom of educators, students, and parents intertwine to create a tapestry of shared understanding. Through the harmonious convergence of technology and communication, education transcends the boundaries of the physical world."+"\n"+"As the curtain rises on the stage of the 21st century, the spotlight of education falls upon the pivotal role of technology in preparing students for the untrodden paths that lie ahead. In this era of rapid technological advancement, the integration of technology within the educational sphere assumes paramount importance, serving as the cornerstone of future success. By embracing technology in education, students are bestowed with the precious gift of digital literacy, enabling them to unravel the intricacies of the digital realm with ease and finesse.");
                   
                   Key_Master1.canvas.setText(level52.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground53(){    //Level 53 - Level 56 : "AI - Artificial Intelligence."
       open53.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   w = new Working();
                   w.key = key;
                   
                   StringBuilder level53 = new StringBuilder("Artificial Intelligence (AI), a revolutionary field at the intersection of computer science and cognitive science, heralds a new era of technological advancements that replicate and augment human intelligence. At its core, AI encompasses the design, development, and deployment of computer systems endowed with the capability to perform tasks that traditionally demand human intellect. These intelligent systems are built upon a foundation of sophisticated algorithms, cutting-edge technologies, and vast amounts of data. They leverage a multitude of methodologies, including machine learning, natural language processing, and robotics, to emulate human cognitive processes such as learning, reasoning, and decision-making. By harnessing the power of AI, we unlock the potential for machines to analyze complex patterns, extract meaningful insights, and execute tasks with precision and efficiency. From autonomous vehicles to virtual assistants, AI permeates various aspects of our lives, revolutionizing industries, and reshaping the way we live, work, and interact. As AI continues to evolve and push the boundaries of human ingenuity, it holds the promise of transforming society and revolutionizing various fields."+"\n"+"Unlocking new frontiers of knowledge, and empowering us to tackle the most complex challenges of our time. With its boundless potential and transformative capabilities, AI stands as a testament to humanity's relentless pursuit of progress and innovation in the realm of intelligent systems. In addition to the industries mentioned above, AI has made significant strides in various other sectors, driving innovation and transforming operations. In the retail industry, AI is employed for demand forecasting, inventory management and personalized services.");
                   
                   Key_Master1.canvas.setText(level53.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   public void openPlayground54(){
       open54.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    key = new Key_Master1();
                    w = new Working();
                    w.key = key;
                    
                    StringBuilder level54 = new StringBuilder("Personalized recommendations, enabling businesses to optimize their supply chains and enhance customer experiences. In manufacturing, AI-powered robots and automation systems are revolutionizing production lines, increasing efficiency, and improving quality control. The agriculture sector benefits from AI through precision farming techniques, where sensors and data analytics help optimize irrigation, pest control, and crop management practices. AI also plays a vital role in the energy sector, optimizing energy consumption, predicting equipment failures, and enabling the integration of renewable energy sources into the grid. Furthermore, AI is leveraged in entertainment and media for content recommendation algorithms, video analysis, and virtual assistants. The applications of AI span across diverse industries, continually pushing the boundaries of what is possible and driving advancements in technology and productivity.Machine learning, as a subset of AI, encompasses a wide array of techniques and algorithms that empower computers to learn and make intelligent decisions without explicit programming. By analyzing vast amounts of data, unveiling intricate patterns, relationships, and insights that might elude human perception."+"\n"+"Machine learning algorithms can uncover patterns, relationships, and insights that may not be immediately apparent to humans. One of the fundamental architectures within machine learning is neural networks, inspired by the intricate workings of the human brain. Neural networks are composed of interconnected layers of artificial neurons that simulate the behavior of their biological counterparts. These networks excel in processing and interpreting complex data, enabling tasks such as noise reduction in image, speech recognition and translation.");
                    
                    Key_Master1.canvas.setText(level54.toString());
                    Key_Master1.canvas.addKeyListener(w);
                    w.processQuestion(Key_Master1.canvas.getText());
                    Key_Master1.submit.addActionListener(w);
                }
                catch(Exception detect){
                    System.out.println(detect);
                }
           }
       });
   }
   
   
   public void openPlayground55(){
       open55.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   w = new Working();
                   w.key = key;
                   
                   StringBuilder level55 = new StringBuilder("Natural language processing, and even autonomous decision-making. As machine learning and neural networks continue to advance, they hold the promise of unlocking new frontiers in AI, empowering systems to continually improve their performance, adapt to evolving scenarios, and revolutionize industries across the globe. As AI continues to progress rapidly, it is imperative to address the ethical considerations and challenges it presents. One significant concern revolves around the potential biases and discriminatory outcomes that can arise from AI systems, particularly as they learn from historical data that may contain inherent biases. The need for transparency, fairness, and accountability in AI algorithms is paramount to mitigate these risks and ensure equitable outcomes. Furthermore, the impact of AI on employment raises important questions regarding job displacement and the potential disruption of the workforce. It highlights the necessity of implementing upskilling and reskilling programs to empower individuals with the skills needed in the evolving job market. Additionally, safeguarding data privacy is crucial, as AI systems rely heavily on data collection analysis for decision-making, fairness and accountability."+"\n"+"Striking the right balance between leveraging data for innovation while respecting individuals privacy rights is an ongoing challenge. Moreover, addressing ethical dilemmas in autonomous systems, such as self-driving cars or AI-powered decision-making, requires careful consideration of moral and legal frameworks. By proactively addressing these ethical considerations and challenges, we can shape the responsible development and deployment of AI, ensuring its positive impact on society while mitigating potential risks.");
                   
                   Key_Master1.canvas.setText(level55.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground56(){   //Level 53 - Level 56 : "AI - Artificial Intelligence."
       open56.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   w = new Working();
                   w.key = key;
                   
                   StringBuilder level56 = new StringBuilder("The future trajectory of AI unfolds as a vast expanse brimming with boundless possibilities and profound transformative potential. As the continuum of AI systems propels forward, their evolution engenders an escalating sophistication, equipping them with the acumen to tackle intricate and multifaceted challenges previously deemed impervious to automation. The domain of robotics and automation stands on the precipice of remarkable advancement, with intelligent machines adeptly executing convoluted tasks with unwavering precision and unwonted efficiency. Momentous breakthroughs in the realms of natural language processing and computer vision are poised to unlock novel dimensions in the intricate tapestry of human-computer interaction, fostering an ecosystem of seamless communication and profound comprehension between sentient beings and AI systems. Unremittingly, AI-driven technologies continue to reconfigure industries, streamline operational modalities, and engender a paradigmatic shift in the very fabric of our toil, existence, and interconnectivity with the macrocosm enveloping us. Nevertheless, as the permeation of AI permeates the societal fabric. AI technologies has the power to transform our daily lives."+"\n"+"Yet, amidst this technological expanse. It behooves us to ensure the judicious stewardship of its development and deployment. Such an endeavor necessitates a concerted focus on assuaging concerns apropos of data privacy, algorithmic bias, and the plausible socio-economic implications that may arise in its wake.The future of AI kindles a beacon of hope, empowering us with unprecedented capacities, propelling the trajectory of progress, and engendering a resplendent tapestry of positive impact resonating across the global sphere.");
                   
                   Key_Master1.canvas.setText(level56.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
              catch(Exception detect){
                  System.out.println(detect);
              }
           }
       });
   }
  
   
   
   public void openPlayground57(){  //Level 57 - Level 60 : "The Future of Non - Renewable Energy."
      open57.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
                  key = new Key_Master1();
                  w = new Working();
                  w.key = key;
                  
                  StringBuilder level57 = new StringBuilder("The trajectory of non-renewable energy sources in the foreseeable future assumes an indisputably paramount significance and warrants profound contemplation and rigorous examination. As humanity strides forward resolutely and purposefully into an epoch characterized by an increasingly heightened ecological awareness, a palpable sense of urgency to mitigate the perils of climate change permeates the global consciousness. In this momentous juncture of our shared history, the sagacious utilization of non-renewable energy resources demands not just a cursory evaluation, but a meticulously conducted, multidimensional analysis that takes into account the intricate interplay between environmental preservation, energy security, and socio-economic considerations. Non-renewable energy, comprising the geological legacies of eons past, such as coal, oil, and natural gas, is intrinsically confined within the finite confines of our planet, irrefutably transgressing ecological thresholds and engendering a panoply of deleterious environmental ramifications that reverberate across our fragile biosphere. Thus, in the imminent years that lie ahead, the destiny of non-renewable energy rests precariously upon the precipice of a transformative precipice, where the progressive evolution of alternative technologies and the wide-scale adoption of sustainable and equitable practices."+"\n"+"Must harmoniously converge to effectively alleviate our protracted reliance on these impermanent, inherently unsustainable reserves. By forging ahead with unwavering resolve, fostering the relentless pursuit of pioneering research and development, catalyzing innovation, and nurturing a collective commitment to integrate ecologically conscious approaches into our energy policies and systems, we can navigate the treacherous waters of energy transition and boldly chart a course towards a more sustainable,equitable and regenerative energy landscape.");  
                  
                  Key_Master1.canvas.setText(level57.toString());
                  Key_Master1.canvas.addKeyListener(w);
                  w.processQuestion(Key_Master1.canvas.getText());
                  Key_Master1.submit.addActionListener(w);
              }
              catch(Exception detect){
                  System.out.println(detect);
              }
          }
      });
   }
   
   
   public void openPlayground58(){
       open58.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   w = new Working();
                   w.key = key;
                   
                   StringBuilder level58 = new StringBuilder("Regenerative energy landscape that befits the imperatives of our time and preserves the bountiful diversity of life on Earth for future generations.One pivotal and transformative aspect that will undeniably shape the future trajectory of non-renewable energy lies in the accelerated and unabated advancement of renewable energy sources. The ongoing and awe-inspiring plummet in costs associated with a plethora of renewable technologies, exemplified by the remarkable progress witnessed in solar and wind power, has heralded an epoch-defining turning point that reverberates throughout the global energy landscape. A conspicuous and resounding trend, characterized by an inexorable momentum, has swiftly emerged, with an ever-expanding chorus of governments, multinational corporations, and conscientious individuals resolutely pivoting towards a sustainable, low-carbon energy paradigm, eschewing the once-dominant reliance on non-renewable energy sources. This paradigmatic shift, propelled by an intricate tapestry of interconnected factors, embraces an unquenchable thirst for energy security in an era of geopolitical turbulence, an unwavering commitment to mitigate the specter of climate change through the substantial reduction of pernicious carbon emissions, and an acute recognition of the inextricable links between sustainable energy systems. The convergence of these multifaceted drivers has coalesced into a formidable force, fostering an environment ripe for the proliferation of renewable energy infrastructure, bolstering the foundation for a resolute and transition away from the antiquated shackles of non-renewable energy towards an era of unparalleled potential, underscored by clean energy innovation and catalytic economic growth on a global scale. In conjunction with the meteoric ascent of renewable energy, redefining the contours of our approach to energy generation and consumption.");
                   
                   System.out.println("From the Level 58 the Capacity of StringBuilder :"+level58.capacity());
                   Key_Master1.canvas.setText(level58.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
   
   
   public void openPlayground59(){
        open59.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    key = new Key_Master1();
                    w = new Working();
                    w.key = key;
                    
                   StringBuilder level59 = new StringBuilder("An additional pivotal facet exerting a profound influence over the prospective trajectory of non-renewable energy revolves around the intensifying global emphasis placed upon the adoption of sustainable practices. A sweeping tide of environmental regulations, international accords, and impassioned public awareness campaigns has coalesced to nurture an awakening collective consciousness, resolute in its acknowledgment of the detrimental consequences precipitated by the continued reliance on non-renewable energy sources. This burgeoning global awareness has galvanized nations and industries alike, impelling them to allocate substantial resources to the domain of research and development, with an unwavering commitment to augmenting energy efficiency and curtailing the pernicious carbon footprints engendered by conventional energy production. In this era of boundless possibilities, the vanguard of scientific inquiry propels the relentless quest for innovative solutions, and at the forefront lies the development of cleaner technologies, exemplified by the nascent but promising field of carbon capture and storage. This cutting-edge domain, with its vast potential, bears the capacity to assuage the grave environmental ramifications inherent in the utilization of non-renewable energy, heralding a new chapter characterized by the harmonization of progress."+"\n"+"Ecological stewardship Furthermore, the interplay of complex geopolitical dynamics and the ever-evolving energy landscapes on a global scale intricately shape the future trajectory of non-renewable energy. It is an inescapable reality that numerous nations, in their fervent pursuit of economic development and unwavering energy security, continue to rely heavily on non-renewable energy sources. Nevertheless, the escalating volatility that pervades fossil fuel markets, accentuated by the realization of their finite nature and environmental impact.");
                   
                   Key_Master1.canvas.setText(level59.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
                   Key_Master1.submit.addActionListener(w);
                }
                catch(Exception detect){
                    System.out.println(detect);
                }
           }
       });
   }
   
   
   
   public void openPlayground60(){  //Level 57 - Level 60 : "The Future of Non - Renewable Energy."
       open60.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
                   w = new Working();
                   w.key = key;
                   
                   StringBuilder level60 = new StringBuilder("Endangered a pressing imperative to explore and implement diversification strategies that can effectively mitigate the potential risks and vulnerabilities associated with overreliance on a singular energy source. Countries around the world have embarked upon a multifaceted expedition to fortify their energy portfolios, undertaking visionary measures to incorporate an extensive array of renewable sources, including solar and wind power, while concurrently delving into the realm of nuclear energy, harnessing the vast potential it holds. Furthermore, investments in groundbreaking technologies such as hydrogen and geothermal power, characterized by their nascent yet highly promising nature, are being fervently pursued, as they embody the embodiment of innovation and sustainability. By embarking on this diversified trajectory, nations aim to substantially reduce their dependence on non-renewable energy, ushering in an era of heightened energy stability, both in the short term and the long term, thus ensuring resilience in the face of evolving global energy dynamics. As we conscientiously navigate the intricate pathways of the future pertaining to non-renewable energy, it is of utmost significance to wholeheartedly acknowledge and underscore the pivotal role that education, innovation, and comprehensive policy frameworks play in shaping the trajectory."+"\n"+"Towards a sustainable and regenerative energy landscape. Education, serving as a cornerstone, assumes an indispensable position in this transformative journey, as it acts as an empowering catalyst in raising societal awareness. Finally, the formulation and implementation of robust policy frameworks, reverberating harmoniously at both the national and international levels, emerge as indispensable guiding forces that muster the collective will, incentivize behavioral change, and drive the inexorable transition towards renewable energy.");
                   
                   Key_Master1.canvas.setText(level60.toString());
                   Key_Master1.canvas.addKeyListener(w);
                   w.processQuestion(level60.toString());
                   Key_Master1.submit.addActionListener(w);
               }
               catch(Exception detect){
                   System.out.println(detect);
               }
           }
       });
   }
   
  /* @Override
   public void AboutTheSoftware(){
       
   }*/ 
   
   
   //for(Object )
   
   boolean visible = true; 

   
   public void feedback(){
      /* for(int i = 0; i <= 5; i++){
           aboutTheSoftware[i].addActionListener(new ActionListener(){ 
               
           });*/
      
          /* for(JButton button : aboutTheSoftware){
                aboutTheSoftware[button].addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       
                   } 
                });*/
                
         /*  for(JButton button : aboutTheSoftware){
               aboutTheSoftware[button].addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e){
                       
                   }
           });*/
         
            /* for(int button : aboutTheSoftware){
                 aboutTheSoftware[button].addActionListener(new ActionListener(){
                     
                 }); */
            
             for(JButton button : aboutTheSoftware){
                 button.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        About about = new About(); 
                        
                       //if(About.frame ) 
                       
                  /*  if(about.frame.isVisible() == false){
                        about.AboutTheSoftware(); 
                    }
                    
                    if(!about.frame.isVisible()){
                        about.AboutTheSoftware(); 
                    }*/ 
                    
                   /* if(!about.frame.isVisible()){
                        //frame = new JFrame();
                        about.AboutTheSoftware(); 
                    } */ 
                    
                   /* if(!about.frame.isVisible()){
                        AboutTheSoftware(); 
                        
                    }*/
                   
                  /* if(about.frame.isVisible() == false){
                       about.AboutTheSoftware(); 
                   }
                   
                   if(about.frame.isShowing()){
                       about.AboutTheSoftware(); 
                   } */ 
                    
                  /* if(about.frame.isShowing() == false){
                       about.AboutTheSoftware(); 
                   } */ 
                   
                  /* if(!about.frame.isShowing()){
                       about.AboutTheSoftware(); 
                   }
                   
                   if(about.frame.isShowing()){
                       frame.hide(); 
                   }*/
                  
                  /*if(about.frame.isVisible()){
                      
                  }
                  else{ 
                      about.AboutTheSoftware(); 
                  }*/
                  
                  /*if(!about.frame.isVisible()){  
                       about.frame.setVisible(true); 
                       about.AboutTheSoftware(); 
                   }*/
                  
                  /*  if(!about.frame.isVisible()){ 
                        about.frame.setVisible(true); 
                        about.AboutTheSoftware(); 
                        about.frame.setVisible(false); 
                    } */ 
                  
                  /* int visible = 50; 
                   
                   boolean visible = true; */ 
                   
                  /* boolean visible = true; */ 
                  
                  /* if(visible){ 
                       about.AboutTheSoftware(); 
                       
                       visible = false; 
                   } 
                   
                   if(visible){
                       about.AboutTheSoftware(); 
                   } 
                   
                   visible = false; */
                   
                  /* if(visible){ 
                       about.AboutTheSoftware();  
                   } 
                   
                   visible = false; */
                  
                  /*  if(visible == true){
                       about.AboutTheSoftware(); 
                       visible = false; 
                   }*/ 
                   
                   
                  /* if(visible == true){
                       about.AboutTheSoftware();  
                   } */
                   
                  /*  visible = false; */ 
                   
                  /* visible = false; */ 
                  
                  about.AboutTheSoftware(); 
                   
                   
                   
                  System.out.println(about.frame.isVisible()); 
                   
                    }
                 });
                 
         
         
       }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        //Working w = new Working();
        //w.backButton();
        Levels1 lev1 = new Levels1();
        lev1.openPlayground1();
        lev1.openPlayground2();
        lev1.openPlayground3();
        lev1.openPlayground4();
        lev1.openPlayground5();
        lev1.openPlayground6();
        lev1.openPlayground7();
        lev1.openPlayground8();
        lev1.openPlayground9();
        lev1.openPlayground10();
        lev1.openPlayground11();
        lev1.openPlayground12();
        lev1.openPlayground13();
        lev1.openPlayground14();
        lev1.openPlayground15();
        lev1.openPlayground16();
        lev1.openPlayground17();
        lev1.openPlayground18();
        lev1.openPlayground19();
        lev1.openPlayground20();
        lev1.openPlayground21();
        lev1.openPlayground22();
        lev1.openPlayground23();
        lev1.openPlayground24();
        lev1.openPlayground25();
        lev1.openPlayground26();
        lev1.openPlayground27();
        lev1.openPlayground28();
        lev1.openPlayground29();
        lev1.openPlayground30();
        lev1.openPlayground31();
        lev1.openPlayground32();
        lev1.openPlayground33();
        lev1.openPlayground34();
        lev1.openPlayground35();
        lev1.openPlayground36();
        lev1.openPlayground37();
        lev1.openPlayground38();
        lev1.openPlayground39();
        lev1.openPlayground40();
        lev1.openPlayground41();
        lev1.openPlayground42();
        lev1.openPlayground43();
        lev1.openPlayground44();
        lev1.openPlayground45();
        lev1.openPlayground46();
        lev1.openPlayground47();
        lev1.openPlayground48();
        lev1.openPlayground49();
        lev1.openPlayground50();
        lev1.openPlayground51();
        lev1.openPlayground52();
        lev1.openPlayground53();
        lev1.openPlayground54();
        lev1.openPlayground55();
        lev1.openPlayground56();
        lev1.openPlayground57();
        lev1.openPlayground58();
        lev1.openPlayground59();
        lev1.openPlayground60();
        lev1.feedback(); 
        AboutTheSoftware about = new About(); 
        about.AboutTheSoftware(); 
        
        
    }
    
}
