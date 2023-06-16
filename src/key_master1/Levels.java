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
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseListener;
import javax.swing.JScrollPane;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.JTextField;

public class Levels {
    
    public  Key_Master1 key;
    
    JFrame frame;
    Image icon;
    JScrollPane scroll;
    JTextField coordinations;
    //Beginner level 1 and 2 Variable declaration starts here.....
    JLabel beginner,beginnerLevel1,beginnerLevel2;
    ImageIcon beginner1,play;
    public static JButton beginnerPlay,beginnerPlay1;
    //Beginner level 1 and 2 variable declaration ends here....
    
    JButton test;
     



    
    public Levels(){
        
        frame = new JFrame();
        //GroupLayout group = new GroupLayout(frame); //Group Layout makes easy to place component on frame when coding comparing to other Layouts
        frame.setTitle("Keyboard Master"); //JFrame title
        frame.setSize(1375,800);  //JFrame size
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //When JFrame Closes it also Memory also Freed up that is took by JFrame
        frame.setResizable(false); //JFrame cannot be Resizable
        frame.setLocationRelativeTo(null); //It Displays JFrame on the center of Screen
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setLayout(null);
        
        
        
        //Icon Configuration Starts Here........
        icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Icon.png"); //Getting Image Source using ImageIcon Class
        frame.setIconImage(icon); // Setting icon to JFrame by using setIconImage() method and icon is got by getImage()
        //Icon Configuration Ends Here.........
        
        //JTextField Configuration Starts Here.......
        coordinations = new JTextField("TextField goes here");
        coordinations.setFont(new Font("arial", Font.BOLD, 13));
        coordinations.setBounds(3,730,245,40);
        //JTextField Configuration Ends Here........
        
        
        
        //Mouse Listener to get X-Coordinate and Y-Coordinate in JFrame Starts Here.....
        frame.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int x = e.getX();
                int y = e.getY();
                coordinations.setText("X-Coordinate : "+x+", Y-Coordinate : "+y);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseReleased(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                int x = e.getX();
                int y = e.getY();
                coordinations.setText("X-Coordinate : "+x+", Y-Coordinate : "+y);   
            }

            @Override
            public void mouseExited(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        //Mouse Listener to get X-Coordinate and Y- Coordinate in JFrame Ends Here...
        
        
        
        //ScrollPane Configuration Starts Here........
        scroll = new JScrollPane();
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(1354,29,50,100);
        scroll.setPreferredSize(new Dimension(1354,29));
        scroll.setVisible(true);
        //ScrollPane Configuration Ends Here......
        
        //JPanel Configuration Starts Here.......
        //panel1 = new JPanel();
        //panel1.setBounds(37,66,100,100);
        //panel1.setBackground(Color.WHITE);
        //panel1.setForeground(Color.WHITE);    
        
        //Beginner Configuration Starts Here
        
        //ImageIcon Configuration Starts Here......
        beginner1 = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Beginner_Star.png");
        
       
        //JLabel Configuration Starts Here........
        beginner = new JLabel();
        beginner.setText("Beginner");
        beginner.setIcon(beginner1);
        beginner.setFont(new Font("arial", Font.PLAIN, 20));
        beginner.setForeground(Color.WHITE);
        //beginner.setBackground(Color.BLACK);
        beginner.setBounds(31,20,120,30);
        beginner.setVisible(true); 
        //JLabel Configuration Ends Here.........
        
        //Jlabel Configuration Starts Here....
        beginnerLevel1 = new JLabel();
        beginnerLevel1.setText("Level 1 : 3 Lines, 42 Words");
        beginnerLevel1.setFont(new Font("arial", Font.PLAIN, 20));
        beginnerLevel1.setForeground(Color.WHITE);
        beginnerLevel1.setBounds(31,60,300,30);
        beginnerLevel1.setVisible(true);
        //JLabel Configuration Ends Here.......
        
        //JLabel Configuration Starts Here......
        beginnerLevel2 = new JLabel();
        beginnerLevel2.setText("Level 2 : 4 Lines, 57 Words ");
        beginnerLevel2.setFont(new Font("arial", Font.PLAIN, 20));
        beginnerLevel2.setForeground(Color.WHITE);
        beginnerLevel2.setBounds(31, 100,300,30);
        //JLabel Configuration Ends Here........
        
        
        //ImageIcon Configuration Starts Here.......
        play  = new ImageIcon("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\Key_Master1\\src\\key_master1/Play.png");
        //ImageIcon Configuration Ends Here.........
        
        //JButton Configuration Starts Here.......
        beginnerPlay = new JButton("Open Playground");
        beginnerPlay.setIcon(play);
        beginnerPlay.setFont(new Font("arial", Font.PLAIN, 20));
        beginnerPlay.setBackground(Color.GRAY);
        beginnerPlay.setForeground(Color.WHITE);
        beginnerPlay.setBounds(1039,65,200,30);
     
  
        
        //JButton Configuration Ends Here..........
        
        //JButton Configuration Starts Here.....
        beginnerPlay1 = new JButton("Open Playground");
        beginnerPlay1.setIcon(play);
        beginnerPlay1.setFont(new Font("arial", Font.PLAIN, 20));
        beginnerPlay1.setBackground(Color.GRAY);
        beginnerPlay1.setForeground(Color.WHITE);
        beginnerPlay1.setBounds(1039,110,200,30);
        //JButton Configuration Ends Here........
        
        
        //Beginner Configuration Ends Here.......
        
        
        
        //Test Configuration Starts Here.....
        
        test = new JButton("Button Title");
        test.setForeground(Color.WHITE);
        test.setBackground(Color.GRAY);
        test.setBounds(660,790,30,50);
        
        
        //Components add in JFrame Starts Here........
        frame.getContentPane().add(coordinations);
        frame.getContentPane().add(scroll);
        frame.getContentPane().add(beginner);
        frame.add(beginnerLevel1);
        frame.add(beginnerLevel2);
        frame.add(beginnerPlay);
        frame.add(beginnerPlay1);
        frame.add(test);
        //Components add in JFrame Ends Here.......
        
        
        
        //Test Configuration starts here......
        test = new JButton("Button title");
        test.setForeground(Color.WHITE);
        test.setBackground(Color.GRAY);
        test.setBounds(1039,600,30,50);
        
        
        
        frame.setVisible(true);
    }
    
          public void openPlaygroundBeginnerLevel1(){
        beginnerPlay.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                try{
                key = new Key_Master1();
                Working w = new Working();
                w.key = key;
               // Key_Master1.submit.addActionListener((ActionListener) key);
               
                String level1 = "Welcome to the world of typing! As a beginner you are embarking on an exciting journey of improving your typing skills. With practice and patience you will soon find yourself typing with confidence and ease. Happy typing!";
                Key_Master1.canvas.setText(level1);
                Key_Master1.canvas.addKeyListener(w); //JTextArea
                //Key_Master1.submit.addActionListener(w);
                Key_Master1.submit.addActionListener(w); //JButton
                w.processQuestion(Key_Master1.canvas.getText());
                }
                catch(Exception detect){
                     System.out.println(detect);
                     detect.printStackTrace();
                }
            }
            
        });
          }
        
          
          
        public void openPlaygroundBeginnerLevel2(){
            beginnerPlay1.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    try{
                        
                        key = new Key_Master1();
                        Working w = new Working();
                        w.key = key;
                        
                        String level2 = "";
                        
                    }
                    catch(Exception detect){
                        
                    }
                    
                }
            });
        }
       

          
   public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); //Setting LookAndFeel Using UIManager Class's setLookAndFeel() static method 
        Levels levels = new Levels();
        levels.openPlaygroundBeginnerLevel1();
        
    }
}
                 