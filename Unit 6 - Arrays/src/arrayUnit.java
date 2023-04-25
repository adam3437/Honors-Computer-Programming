/**
 * Makes an array with one element for each possible outcome. Set each element to 0. Then keep calling the random number generator.
 * If it returns a value v, then increment the counter belonging to v.
 * @author Spy-Gaming-TF2
 * 4/19/2023
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class arrayUnit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        //asks the user how many numbers they want to generate
        System.out.print("How many numbers do you want to generate? ");
        int num = scan.nextInt();
        System.out.print("How long should the array be? ");
        int length = scan.nextInt();
        int[] arr = new int[length];
        //picks random ints that were generated to store in the array
        for (int i = 0; i < num; i++)
        {
            int random = rand.nextInt(length);
            arr[random]++;
        }
        System.out.println(Arrays.toString(arr));
        scan.close();
    }
}