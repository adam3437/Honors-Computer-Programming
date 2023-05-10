/**
 * Creates an array with random numbers and prints the array in ascending order. Prints out sum, min, max, and median of the array
 * @author adam3437
 * 4/12/2023
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
        //finds the sum, max,and min of the array
        System.out.printf("%nSum: %-3s", Arrays.stream(arr).sum());
        System.out.printf("%nMax: %-3s", arr[0]);
        System.out.printf("%nMin: %-3s", arr[9]);
        //finds the median of the array
        System.out.printf("%nMedian: %-3s", (double)(arr[4] + arr[5]) / 2);
    }
}