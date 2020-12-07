package javaswing;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Queens extends JFrame
{
    static int width ;
    static int height;
    
    static Image image;

   public static JPanel squares[][] = new JPanel[50][50]; //Initialize squares for 50x50 maximum, changed by user input of nqueens.


    
    public  Queens(int numq){
        squares = new JPanel[numq][numq];
        setSize(600,600);
        setLayout(new GridLayout(numq, numq));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        height = (this.getHeight() / 12 );
        width = (this.getWidth() / 12);
        
        System.out.println("Height and width" + height + "\t" + width);  //this method creates the chess board
        for (int i = 0; i < numq; i++) {
            for (int j = 0; j < numq; j++) {
                squares[i][j] = new JPanel(new BorderLayout());
                if ((i + j) % 2 == 0) {                    
                    squares[i][j].setBackground(Color.black);
                } else {
                    squares[i][j].setBackground(Color.white);
                }   
                add(squares[i][j]);
            }
        }
        
        try{
            image = ImageIO.read(new File("C:\\Users\\Chris\\Desktop\\queen.jpg"));	//uploads the queens display
            image = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);		//you may need to change this on your PC
            	
        } catch(IOException e){
            System.out.println("Pic not found");
        }        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void setSquares(int b[],int numq)
    {
        for (int y = 0; y < numq; y++)
	    {
	      for (int x = 0; x < numq; x++)
	      {
	        if(b[y] == x)
	        {
	        	squares[y][x].add(new JLabel(new ImageIcon(image)));	//this will set the queens based on the
	        }															//position found in the HillClimbing and Genetic Algorithm classes
	      }
	    }
    }
}
