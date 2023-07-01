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
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class Levels1 {
    
    public Key_Master1 key;
    
    JFrame frame;
    JTabbedPane tabbedPane;
    JPanel beginner1,beginner2,intermediate1,intermediate2,expertise1,expertise2;
    Image icon;
    JTextField coordinations1,coordinations2,coordinations3,coordinations4,coordinations5,coordinations6;
    
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
    
    
    
    
    
    
    
    
    Levels1(){
        frame = new JFrame();
        frame.setTitle("Keyboard Master");
        frame.setSize(1450,800);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
        
        icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png");
        
        frame.setIconImage(icon);
        
        
        play = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Play.png");
        
        
        
        //Beginner - I Configuration starts here.............
        
        beginnerStar = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Beginner_Star.png");
        
        
        
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
        
        intermediateStar = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Twostars.png");
        
        
        
        //Intermediate - I Configuration Starts Here.....
        
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
       
        
        
       //Level 41 Configuration Starts Here................
       
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
        
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
        tabbedPane.add("Expertise - I", expertise1);
        
        expertise2 = new JPanel();
        expertise2.setLayout(null);
        expertise2.setBackground(Color.GRAY);
        expertise2.add(coordinations6);
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
    
    public void openPlayground1(){
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
    
    
   public void openPlayground5(){
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
   
   public void openPlayground6(){
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
   
   
   public void openPlayground10(){
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
   
   
   //Button - I Configurtion Ends Here............
   
   
   
   
   //Button - II Configuration starts here.............
   
   public void openPlayground11(){
       open11.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              try{
              key = new Key_Master1();
              Working w = new Working();
              w.key = key;
              
              String level11  = "In a very hot and dry desert, there was a smart crow. The crow was really thirsty and was looking for water. After flying for a long time, the crow saw a pitcher that was partly buried in the sand. The crow felt hopeful but wasn't sure if there would be any water in it. The crow flew down and looked inside the pitcher. It saw that there was a little bit of water at the bottom, but it was too low for the crow to drink using its beak. The crow thought hard, trying to figure out what to do.";
              
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
   
   public void openPlayground15(){
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
   
   
   public void openPlayground16(){
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
   
   
   
   
   public void openPlayground20(){
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
   
   public void openPlayground21(){
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
   
   
   
   public void openPlayground25(){
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
   
   
   
   
   public void openPlayground26(){
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
   
   
   
   public void openPlayground30(){
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
   
   public void openPlayground31(){    // Level 31 - Level 35 : "The Impact of climate change".
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
   
   
   
   
   public void openPlayground35(){
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
   
   
   
   
   public void openPlayground36(){             //Level 36 - Level 40 : "Data Entry and Accuracy in Typing".
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
   
   
   public void openPlayground40(){
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
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
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
    }
    
    
    
}
