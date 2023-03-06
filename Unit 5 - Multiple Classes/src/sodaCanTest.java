/**
 * This class tests the sodaCan class. It takes user input via scanner and then prints the volume and surface area of the can.
 */
import java.util.Scanner;
public class sodaCanTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the height of the can: ");
        double height = scan.nextDouble();
        System.out.print("Enter the radius of the can: ");
        double radius = scan.nextDouble();
        sodaCan sodaCan1 = new sodaCan(height, radius);
        System.out.println(sodaCan1.toString());
        scan.close();
    }
}
