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
    
    //Beginner variable declaration starts here......
    JLabel beginner;
    JLabel level1, level2, level3, level4, level5, level6, level7, level8, level9, level10;
    JButton open1,open2, open3, open4, open5, open6, open7, open8, open9, open10;
    ImageIcon beginnerStar, play;
    
    
    //Beginner variable declaration ends here.....
    
    
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
        
        
        
        //Beginner Configuration starts here.............
        
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
        level1.setText("Level 1 : 2 Lines(40 Words)");
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
        level2.setText("Level 2 :  Lines (  Words)");
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
         level3.setText("Level 3 :  Lines (  Words)");
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
         level4.setText("Level 4 :  Lines (  Words)");
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
        level5.setText("Level 5 :  Lines (  Words)");
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
        level6.setText("Level 6 :  Lines (  Words)");
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
        level7.setText("Level 7 :  Lines (  Words)");
        level7.setForeground(Color.WHITE);
        level7.setBounds(70,436,270,30);
        
        
        open7 = new JButton();
        open7.setFont(new Font("arial",Font.PLAIN,20));
        open7.setBackground(Color.GRAY);
        open7.setForeground(Color.WHITE);
        open7.setIcon(play);
        open7.setText("Open Playrgound");
        open7.setBounds(1039,436,190,30);
        
        //Level 7 Configuration Ends Here..........
        
        
        //Level 8 Configuration Starts here..........
        
        
        level8 = new JLabel();
        level8.setFont(new Font("arial",Font.PLAIN,20));
        level8.setText("Level 8 :  Lines(  Words)");
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
        level9.setText("Level 9 :  Lines(  Words)");
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
        level10.setText("Level 10 :  Lines(  Words)");
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
        tabbedPane.add("Beginner - II", beginner2);
        
        intermediate1 = new JPanel();
        intermediate1.setLayout(null);
        intermediate1.setBackground(Color.GRAY);
        intermediate1.add(coordinations3);
        tabbedPane.add("Intermediate - I",intermediate1);
        
        intermediate2 = new JPanel();
        intermediate2.setLayout(null);
        intermediate2.setBackground(Color.GRAY);
        intermediate2.add(coordinations4);
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
                   
                   String level6 = "Microsoft";
                   
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
               
              String level7 = "Bill Gates";
              
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
                  
                  String level8 = "Abishek";
                  
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
                   
                   String level9 = "Dennis Ritchie";
                   
                   Key_Master1.canvas.setText(level9);
                   Key_Master1.canvas.addKeyListener(w);
                   Key_Master1.submit.addActionListener(w);
                   w.processQuestion(Key_Master1.canvas.getText());
               }
           }
       });
   }
   
   
   public void openPlayground10(){
       open10.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               try{
                   key = new Key_Master1();
               }
           }
       })
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
    }
    
    
    
}
