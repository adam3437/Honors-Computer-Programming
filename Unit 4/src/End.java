import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class End
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner file = new Scanner(new File("/workspaces/Honors-Computer-Programming/Unit 4/src/names.dat"));
        while (file.hasNext())
        {
            String names = file.next();
            System.out.println(names);            
        }
    }
}