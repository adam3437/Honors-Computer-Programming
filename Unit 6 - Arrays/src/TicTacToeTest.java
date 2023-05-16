/**
 * This program tests the TicTacToe class by prompting the user to set positions on the board and printing out the result.
 * @author adam3437
 * 5/16/23
 */
import javax.swing.JOptionPane;
public class TicTacToeTest
{
   public static void main(String[] args)
   {
      // X gets the first move
      char player = 'x';

      TicTacToe game = new TicTacToe();
      while (true) {
         // calls game.toString( )
         System.out.println(game);

         String input = JOptionPane.showInputDialog("Row for " + player + " (Cancel to exit)");
         // quit the game?
         if (input == null) {
            System.exit(0);
         }
         int row = Integer.parseInt(input);
         //adjust for zero indexing
         row = row - 1;

         input = JOptionPane.showInputDialog("Column for " + player);
         int column = Integer.parseInt(input);
         // adjust for zero indexing
         column = column - 1;

         // make a move
         game.set(row, column, player);
         // toggle the player
         if (player == 'x') {player = 'o';}
         else {player = 'x';}
      }
   }
}