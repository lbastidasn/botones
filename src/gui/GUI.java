/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Estudiante
 */
import javax.swing.*;
import java.awt.*;
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String name=JOptionPane.showInputDialog(null,"what is your name?");
        int choice= JOptionPane.showConfirmDialog(null,"do you like cake?"+ name+ "?");
        if (choice==JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(null,"of course! Who doesnt it?");
        }else{
        JOptionPane.showMessageDialog(null, "We'll have to agree to disagree");
      //abrir ventanas de opcion  }*/
        
     /*JFrame frame= new JFrame();
     frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      String name1;
      name1="Casa";
      frame.setTitle(name1);
             
      abrir ventanas y ponerles nombre       */
   /* JFrame frame= new JFrame();
    frame.setVisible(true);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      String name1;
      name1="Casa";
      frame.setTitle(name1);
    Image icon=Toolkit.getDefaultToolkit().getImage("icon.gif");
    frame.setIconImage(icon);
    JPanel panel= (JPanel) frame.getContentPane();
    panel.setBackground(Color.WHITE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension (300,200));
    Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
    frame.setLocation(dim.width/2-frame.getSize().width/2,
            dim.height/2-frame.getSize().height/2);
    JButton button1= new JButton();
    button1.setText("I'm a button");
    button1.setBackground(Color.GREEN);
    frame.add(button1);
    frame.setLayout(new GridLayout(3,4));
    JButton button2= new JButton();
    button2.setText("Click me!");
   button2.setBackground(Color.BLUE);
    frame.add(button2);
    frame.setVisible(true);
    frame.setLayout(new BorderLayout(8,4));
    frame.add(new JButton ("center"),BorderLayout.CENTER);
 
     // ordenar cotones y crear botones*/
    JFrame frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension (250,200));
    frame.setTitle("Telephone");
    frame.setLayout(new BorderLayout());
    JPanel centerPanel=new JPanel (new GridLayout(4,3));
        for (int i = 1; i <=9; i++) {
            centerPanel.add(new JButton(""+i));
           
        }
    centerPanel.add(new JButton("*"));
    centerPanel.add(new JButton("0"));
    centerPanel.add(new JButton("#"));
    frame.add(centerPanel,BorderLayout.CENTER);
    JPanel southPanel=new JPanel (new FlowLayout());
    southPanel.add(new JLabel("number to dial"));
    southPanel.add(new JTextField(10));
    frame.add(southPanel,BorderLayout.SOUTH);
    frame.setVisible(true);
    }

    
}
