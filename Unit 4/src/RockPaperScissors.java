import javax.swing.JOptionPane;

public class RockPaperScissors 
{
    public static void main(String[] args)
    {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for rock, 2 for paper, or 3 for scissors"));
        int compInput = (int)(Math.random() * (3-1+1) + 1);
        String userChoice = " ";
        String opponent = " ";
        String gamesWon = " ";
        String gamesLost = " ";
        if(userInput > 3){ JOptionPane.showMessageDialog(null,"I said 1, 2, or 3 dumbass"); }
        if(userInput == 1){ userChoice = "Rock"; }
        else if(userInput == 2){ userChoice = "Paper"; }
        else if(userInput == 3){ userChoice = "Scissors"; }
        else if(compInput == 1){ opponent = "Rock"; }
        else if(compInput == 2){ opponent = "Paper"; }
        else if(compInput == 3){ opponent = "Scissors"; }
        if(userInput == 1 && compInput == 2)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked paper.");
            JOptionPane.showMessageDialog(null, "You Loose!");
            gamesLost = gamesLost + 1;
        }
        if(userInput == 1 && compInput == 3)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked scissors." );
            JOptionPane.showMessageDialog(null, "You Win!");
            gamesWon = gamesWon + 1;
        }
        if(userInput == 2 && compInput == 1)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked rock.");
            JOptionPane.showMessageDialog(null, "You Win!");
            gamesWon = gamesWon + 1;
        }
        if(userInput == 2 && compInput == 3)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked scissors.");
            JOptionPane.showMessageDialog(null, "You Loose!");
            gamesLost = gamesLost + 1;
        }
        if(userInput == 3 && compInput == 1)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked rock.");
            JOptionPane.showMessageDialog(null, "You Loose!!");
            gamesLost = gamesLost + 1;
        }
        if(userInput == 3 && compInput == 2)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked paper.");
            JOptionPane.showMessageDialog(null, "You Win!");
            gamesWon = gamesWon + 1;
        }
        if(userInput == compInput)
        {
            JOptionPane.showMessageDialog(null, "You picked " + userChoice + ". Your opponent picked " + userChoice + ".");
            JOptionPane.showMessageDialog(null, "It's a tie!");
        }
    }
}