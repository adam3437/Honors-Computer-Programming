import java.util.*;

public class Login 
{
    public static void main(String[] args)
    {
        boolean run = true;
        int tries = 0;
        Scanner input = new Scanner(System.in);
        String username = "admin";
        String password = "admin";
        while(run == true)
        {
            System.out.println("Enter your username: ");
            String user = input.nextLine();
            System.out.println("Enter your password: ");
            String pass = input.nextLine();
            if(user.equals(username) && pass.equals(password))
            {
                System.out.println("Welcome " + user);
                run = false;
            }
            else
            {
                System.out.println("Incorrect username or password");
                tries = tries + 1;
            }
            if(tries == 3)
            {
                System.out.println("You have exceeded the number of tries");
                run = false;
            }
        }
    }
}
