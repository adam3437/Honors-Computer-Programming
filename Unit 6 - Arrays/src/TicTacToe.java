/**
 * Behind the scenes stuff for a Tic Tac Toe game
 * @author adam3437
 * 5/16/23
 */
public class TicTacToe
{
/*****************************
   Constructs an empty board.
******************************/
public TicTacToe( )
{
   board = new char[ROWS][COLUMNS];
   // fill with spaces
   for (int i = 0; i < ROWS; i++)
   {
        for (int j = 0; j < COLUMNS; j++)
        {
             board[i][j] = ' ';
        }
   }

}

/***********************************************************
   Sets a field in the board. The field must be unoccupied.
   @param i the row index
   @param j the column index
   @param player the player ('x' or 'o')
************************************************************/
public void set(int i, int j, char player)
{
   if (board[i][j] != ' ')
   {
      throw new IllegalArgumentException("Position occupied");
   }
   board[i][j] = player;
}

/********************************************************
   Creates a string representation of the board such as
   |x  o|
   |  x |
   |   o|
   @return the string representation
*********************************************************/
public String toString( )
{
   StringBuilder r = new StringBuilder();
   for (int i = 0; i < ROWS; i++)
   {
      r.append("|");
      for (int j = 0; j < COLUMNS; j++)
      {
         r.append(board[i][j]);
      }
      r.append("|\n");
   }
   return r.toString();
}

private char[ ][ ] board;
private static final int ROWS = 3;
private static final int COLUMNS = 3;
}


