import javax.swing.JOptionPane;

public class RockPaperScissors 
{
    public static void main(String[] args)
    {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for rock, 2 for paper, or 3 for scissors"));
        int computerInput = (int)(Math.random() * (3-1+1) + 1);
        String userChoice = " ";
        String compChoice = " ";
        if(userInput > 3)
        {
            JOptionPane.showMessageDialog(null,"I said 1, 2, or 3 dumbass");
        }
        if(userInput == 1)
        {
            userChoice = "Rock";
        }
        else if(userInput == 2)
        {
            userChoice = "Paper";
        }
        else if(userInput == 3)
        {
            userChoice = "Scissors";
        }
        else if(computerInput == 1)
        {
            compChoice = "Rock";
        }
        else if(computerInput == 2)
        {
            compChoice = "Paper";
        }
        else if(computerInput == 3)
        {
            compChoice = "Scissors";
        }

        if(userInput == 1 && computerInput == 2)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked " + compChoice + ".");
            JOptionPane.showMessageDialog(null, "You Win!");
        }
        JOptionPane.showMessageDialog(null, computerInput);
    }
}