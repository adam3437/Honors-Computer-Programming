public class Counting_Loop
 {
    public static void main(String[] args)
    {
        for (int i = 212; i <= 376; i++)
        {
            if (i % 2 == 0)
            {
                System.out.printf(i + " ");
            }
            if (i % 30 == 0)
            {
                System.out.println();
            }
        }
    }
}