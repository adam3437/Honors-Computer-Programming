import javax.swing.*;

public class Count_By_Any
{
    public static void main(String[]args)
    {
        int x = 0;
        int y = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to count by"));
        int count = -1;
        while(x <= 200)
        {
            System.out.printf(x + " ");
            count ++;
            if(count % 10 == 0)
            {
                System.out.println();
            }
            x = x + y;

        }
    }
}
