public class Count_By_Five
{
    public static void main(String[] args)
    {
        int x = 0;
        while(x <= 200)
        {
            System.out.printf(x + " ");
            if(x % 50 == 0)
            {
                System.out.println();
            }
            x = x + 5;
        }
    }
}
