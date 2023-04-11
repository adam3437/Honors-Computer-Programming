/**
 * Creates an array with random numbers and prints the array in ascending order
 * @author S26600283 (Adam Chavez)
 * 4/11/2023
 */
import java.util.Arrays;
import java.util.Random;
public class randomArray
{
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(200)+1;
        }
        System.out.print("Original Array: ");
        System.out.printf("%-3s", Arrays.toString(arr));
        //sorts the array in ascending order
        Arrays.sort(arr);
        System.out.printf("%nAscending Order: %-3s", Arrays.toString(arr));
        //Sorts the array in descending order
        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.printf("%nDescending Order: %-3s", Arrays.toString(arr));
        //finds the sum, max, min, and median of the array
        System.out.printf("%nSum: %-3s", Arrays.stream(arr).sum());
        System.out.printf("%nMax: %-3s", Arrays.stream(arr).max().getAsInt());
        System.out.printf("%nMin: %-3s", Arrays.stream(arr).min().getAsInt());
    }
}