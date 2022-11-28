public class Counting_Loop
 {
    public static void main(String[] args)
    {
        //print out all even numbers from 212 to 376
        for (int i = 212; i <= 376; i++)
        {
            if (i % 2 == 0)
            {
                System.out.printf(i + " ");
            }
            //only print 15 numbers per line
            if (i % 30 == 0)
            {
                System.out.println();
            }
        }
    }
}