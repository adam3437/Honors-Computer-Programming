import javax.swing.JOptionPane;

public class Guessing_Game
{
	public static void main(String[] args)
	{
		int max = 100;
		int min = 1;
		int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a whole # between 1 and 100"));
		double numGen = (Math.random()*(max-min+1)+min);
		
		while (input != numGen) 
		{
			JOptionPane.showMessageDialog(null, "You guessed wrong dumbass!");
			int wrongGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
			if(wrongGuess == numGen)
			{
				JOptionPane.showMessageDialog(null, "You guessed correctly!");
				return;
			}
		}
	}
}
