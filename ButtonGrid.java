import javax.swing.JFrame; //imports JFrame library
import javax.swing.JButton; //imports JButton library
import java.awt.GridLayout; //imports GridLayout library
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;


public class ButtonGrid extends JPanel{
  
  JPanel panel=new JPanel(); //creates panel
  
  public static String[][] grid; //names the grid of buttons
  public static JButton[][] full; //names the grid of buttons
  
  public ButtonGrid(int width, int length){ //constructor
    setPreferredSize(new Dimension(1000, 750));
    setLayout(new GridLayout(width,length)); //set layout
    full=new JButton[width][length]; //allocate the size of grid
    grid = BombGrid(width, length);
    for(int a=0; a<width; a++){
      for(int b=0; b<length; b++){
        full[a][b]=new JButton("e"); //creates new button   
        full[a][b].addActionListener (new Reveal());
        add(full[a][b]); //adds button to grid
        
      }
    }
    
    panel.setVisible(true); //makes frame visible
  }
  private class Reveal implements ActionListener
  {
    //--------------------------------------------------------------
    //  Updates the title via taking information from the bomb grid
    //--------------------------------------------------------------
    
    
    
    
    
    public void actionPerformed (ActionEvent event)
    {
      for(int a=0; a<full.length; a++){
        for(int b=0; b<full[0].length; b++){
          if(event.getSource() == full[a][b])
          {
            if(ButtonGrid.grid[a][b].equals(" , ")|| ButtonGrid.grid[a][b].equals("  ,  ")) {
              recurse(grid,a,b);
            }
            if (ButtonGrid.grid[a][b].equals("bomb")) { 
              full[a][b].setText("bomb");
            }
            if (!ButtonGrid.grid[a][b].equals("bomb")) {
              full[a][b].setText( NumNext(grid,a,b)+ " , " + NumDiag(grid,a,b));
            } 
          }
        }
      }
    }
    public void recurse(String[][] grid, int x, int y) {
      if(ButtonGrid.grid[x][y] == (" , ")|| ButtonGrid.grid[x][y] ==("  ,  ")) {
        full[x][y].setText( NumNext(grid,x,y)+ " , " + NumDiag(grid,x,y)); 
        if (x == 0 && y == 0) //upper left corner
        {
          recurse(grid, x, y+1);
          recurse(grid, x+1, y+1);
          recurse(grid, x+1, y);
        }
        else if (x == grid.length-1 && y == 0) //upper right corner
        {
          recurse(grid, x-1, y+1);
          recurse(grid, x, y+1);
          recurse(grid, x-1, y);
        }
        else if (x == 0 && y == grid[0].length-1) //lower left corner
        {
          recurse(grid, x+1, y);
          recurse(grid, x, y-1);
          recurse(grid, x+1, y-1);
          
        }
        else if (x == grid.length-1 && y == grid[0].length-1) //lower right corner
        {
          recurse(grid, x-1, y);
          recurse(grid, x-1, y-1);
          recurse(grid, x, y-1);
        }
        else if (x == 0) //left side
        {
          recurse(grid, x, y+1);
          recurse(grid, x+1, y+1);
          recurse(grid, x+1, y);
          recurse(grid, x, y-1);
          recurse(grid, x+1, y-1);
        }
        else if (x == grid.length-1) //right side
        {
          recurse(grid, x-1, y+1);
          recurse(grid, x, y+1);
          recurse(grid, x-1, y);
          recurse(grid, x-1, y-1);
          recurse(grid, x, y-1);
        }
        else if (y == 0) //top side
        {
          recurse(grid, x-1, y);
          recurse(grid, x+1, y);
          recurse(grid, x-1, y+1);
          recurse(grid, x, y+1);
          recurse(grid, x+1, y+1);
        }
        else if (y == grid[0].length-1) //bottom side
        {
          recurse(grid, x-1, y-1);
          recurse(grid, x, y-1);
          recurse(grid, x+1, y-1);
          recurse(grid, x-1, y);
          recurse(grid, x+1, y);
        }
        else{
          recurse(grid, x-1, y-1);
          recurse(grid, x, y-1);
          recurse(grid, x+1, y-1);
          recurse(grid, x-1, y);
          recurse(grid, x+1, y);
          recurse(grid, x-1, y+1);
          recurse(grid, x, y+1);
          recurse(grid, x+1, y+1);
        }
        
      }
      else full[x][y].setText( NumNext(grid,x,y)+ " , " + NumDiag(grid,x,y));
    }
  }
  
  public static String[][] BombGrid(int width, int length){ //constructor
    
    String symbol= "";
    
    grid=new String[width][length]; //allocate the size of grid
    for(int x=0; x<width; x++){
      for(int y=0; y<length; y++){ 
        Random rand = new Random();
        /*int bombValue= rand.nextInt(10);
         if (bombValue ==9) {symbol = "bomb";}*/
        
        if(Math.random() < .2) {
          symbol = "bomb";
        }
        else {
          symbol = "";
        }
        grid[x][y]=symbol; //creates new button    
        
      }
    }
    
    for(int y=0; y<length; y++){
      for(int x=0; x<width; x++){ 
        if (!grid[x][y].equals("bomb")) {
          grid[x][y]= NumNext(grid,x,y)+ " , " + NumDiag(grid,x,y);
        }
        
      }
    }
    
    
    
    return grid;
  }
  public static String NumNext(String[][] grid, int width, int length) {
    int total=0;
    if (width == 0 && length == 0) //upper left corner
    {
      if (grid[width+1][length].equals("bomb")) {total++; }
      if (grid[width][length+1].equals("bomb")) {total++;}
      
    }
    else if (width == grid.length-1 && length == 0) //upper right corner
    {
      if (grid[width-1][length].equals("bomb")) {total++;}
      if (grid[width][length+1].equals("bomb")) {total++;}
    }
    else if (width == 0 && length == grid[0].length-1) //lower left corner
    {
      if (grid[width+1][length].equals("bomb")) {total++;}
      if (grid[width][length-1].equals("bomb")) {total++;}
    }
    else if (width == grid.length-1 && length == grid[0].length-1) //lower right corner
    {
      if (grid[width-1][length].equals("bomb")) {total++;}
      if (grid[width][length-1].equals("bomb")) {total++;}
    }
    else if (width == 0) //left side
    {
      if (grid[width+1][length].equals("bomb")) {total++;}
      if (grid[width][length-1].equals("bomb")) {total++;}
      if (grid[width][length+1].equals("bomb")) {total++;}
    }
    else if (width == grid.length-1) //right side
    {
      if (grid[width-1][length].equals("bomb")) {total++;}
      if (grid[width][length-1].equals("bomb")) {total++;}
      if (grid[width][length+1].equals("bomb")) {total++;}
    }
    else if (length == 0) //top side
    {
      if (grid[width-1][length].equals("bomb")) {total++;}
      if (grid[width+1][length].equals("bomb")) {total++;}
      if (grid[width][length+1].equals("bomb")) {total++;}
    }
    else if (length == grid[0].length-1) //bottom side
    {
      if (grid[width-1][length].equals("bomb")) {total++;}
      if (grid[width+1][length].equals("bomb")) {total++;}
      if (grid[width][length-1].equals("bomb")) {total++;}
    }
    else{
      if (grid[width-1][length].equals("bomb")) {total++;}
      if (grid[width+1][length].equals("bomb")) {total++;}
      if (grid[width][length-1].equals("bomb")) {total++;}
      if (grid[width][length+1].equals("bomb")) {total++;}
    }
    if (total==0) {return "";}
    return String.valueOf(total);
  }
  public static String NumDiag(String[][] grid, int width, int length) {
    int total=0;
    if (width == 0 && length == 0) //upper left corner
    {
      if (grid[width+1][length+1].equals("bomb")) {total++;}
    }
    else if (width == grid.length-1 && length == 0) //upper right corner
    {
      if (grid[width-1][length+1].equals("bomb")) {total++;}
    }
    else if (width == 0 && length == grid[0].length-1) //lower left corner
    {
      if (grid[width+1][length-1].equals("bomb")) {total++;}
    }
    else if (width == grid.length-1 && length == grid[width].length-1) //lower right corner
    {
      if (grid[width-1][length-1].equals("bomb")) {total++;}
    }
    else if (width == 0) //left side
    {
      if (grid[width+1][length+1].equals("bomb")) {total++;}
      if (grid[width+1][length-1].equals("bomb")) {total++;}
    }
    else if (width == grid.length-1) //right side
    {
      if (grid[width-1][length+1].equals("bomb")) {total++;}
      if (grid[width-1][length-1].equals("bomb")) {total++;}
    }
    else if (length == 0) //top side
    {
      if (grid[width+1][length+1].equals("bomb")) {total++;}
      if (grid[width-1][length+1].equals("bomb")) {total++;}
    }
    else if (length == grid[0].length-1) //bottom side
    {
      if (grid[width+1][length-1].equals("bomb")) {total++;}
      if (grid[width-1][length-1].equals("bomb")) {total++;}
    }
    else{
      if (grid[width-1][length-1].equals("bomb")) {total++;}
      if (grid[width+1][length-1].equals("bomb")) {total++;}
      if (grid[width-1][length+1].equals("bomb")) {total++;}
      if (grid[width+1][length+1].equals("bomb")) {total++;}
    }
    if (total==0) {return "";}
    return String.valueOf(total);
  }
  
}
