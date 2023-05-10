/**
 * Create a user defined 2d array that allows a user to pick the number of rows and columns to be printed. Assign each index in the 2d array with a random number. 
 * Print the array in rows and columns. Space each value in the console using the printf method.  Print the sum of each row to the right of each row. 
 * @author adam3437
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
		int columns = Integer.parseInt(JOptionPane.showInputDialog("How many columns do you want?"));
        //make a 2d array with the user input
        int[][] array = new int[rows][columns];
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
				//print out sum of each row
				if(j == array[i].length - 1)
				{
					int sum = 0;
					for(int k = 0; k < array[i].length; k++)
					{
						sum += array[i][k];
					}
					//print out equals sign and sum
					System.out.print("= ");
					System.out.printf("%-5d", sum);
				}
        	}
        	System.out.println();
        }
	}
}