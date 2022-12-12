import java.util.*;

public class InBetween 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter another integer: ");
        int num2 = input.nextInt();
        if (num1 < num2)
        {
            for (int i = num1 + 1; i < num2; i++)
            {
                System.out.print(i + " ");
            }
            if (num2 - num1 == 1)
            {
                System.out.println("There are no integers between the entered values.");
            }
        }
        else if (num1 > num2)
        {
            for (int i = num2 + 1; i < num1; i++)
            {
                System.out.print(i + " ");
            }
        }
        else
        {
            System.out.println("There are no integers between the entered values.");
        }
        input.close();
    }
}
