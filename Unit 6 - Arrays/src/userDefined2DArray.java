/**
 * Create a user defined 2d array that allows a user to pick the number of rows and columns to be printed. Assign each index in the 2d array with a random number. 
 * Print the array in rows and columns. Space each value in the console using the printf method.  Print the sum of each row to the right of each row. 
 * @author Spy-Gaming-TF2
 * 5/3/23
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class userDefined2DArray 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int rows = Integer.parseInt(JOptionPane.showInputDialog("How many rows do you want?"));
		int collumns = Integer.parseInt(JOptionPane.showInputDialog("How many collumns do you want?"));
        //make a 2d array with the user input
        int[][] array = new int[rows][collumns];
        //fill the array with random numbers
        for(int i = 0; i < array.length; i++)
        {
        	for(int j = 0; j < array[i].length; j++)
        	{
        		array[i][j] = rand.nextInt(100);
        	}
        }
        for(int i = 0; i < array.length; i++)
        {
        	for(int j = 0; j < array[i].length; j++)
        	{
        		System.out.printf("%-5d", array[i][j]);
        	}
        	System.out.println();
        }
	}
}