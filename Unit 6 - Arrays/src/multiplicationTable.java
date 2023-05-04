/**
 * Uses a 2d array to print a multiplication table
 * @author Spy-Gaming-TF2
 * 5/4/23
 */
import java.util.Arrays;
public class multiplicationTable
{
    public static void main(String[] args)
    {
        int[][] table = new int[12][12];
        //fill the array with multiplication table values without nested for loops
        for(int i = 0; i < table.length; i++)
        {
            Arrays.fill(table[i], i + 1);
        }
        //print the array
        for(int i = 0; i < table.length; i++)
        {
            for(int j = 0; j < table[i].length; j++)
            {
                System.out.printf("%-5d", table[i][j] * (j + 1));
            }
            System.out.println();
        }
    }
}
