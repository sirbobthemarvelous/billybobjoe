//https://www.wikihow.com/Make-a-GUI-Grid-in-Java

import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FinalDriver {
  
  
  public static void main(String[] args) {
    JFrame frame = new JFrame ("Minesweeper");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new ButtonGrid(16, 16));
    
    frame.pack();
    frame.setVisible(true);
    
  }
}