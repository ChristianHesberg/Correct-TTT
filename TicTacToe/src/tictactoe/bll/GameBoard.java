/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;

import java.lang.reflect.Array;

/**
 *
 * @author Stegger
 */
public class GameBoard implements IGameModel
{
    private boolean isPlayer1;
    public  int[][] boardSquares = new int[3][3];
    public int player;

    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    public int getNextPlayer()
    {
        if (isPlayer1)
        {
            isPlayer1 = false;
            return 0;
        }
        else
        {
            isPlayer1 = true;
            return 1;
        }
    }

    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is succesfull the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver == true
     * this method will always return false.
     */
    public boolean play(int col, int row)
    {
        if (boardSquares[row][col] == -1)
        {
            return true;
        }
        if (boardSquares[row][col] == 0)
        {
            return false;
        }
        if (boardSquares[row][col] == 1)
        {
            return false;
        }
        else
        {
            return false;
        }

    }

    public boolean isGameOver()
    {
        //TODO Implement this method
        return false;
    }

    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    public int getWinner()
    {
        for (int r = 0; r<boardSquares.length; r++ )
        {
            for (int c = 0; c<boardSquares[0].length; c++)
            {
                System.out.print(boardSquares[r][c] + " , ");
                /*
                if (boardSquares[r][c] == boardSquares[r][c+1] & boardSquares[r][c] == boardSquares[r][c+2])
                {
                    System.out.println("winner!");
                }
                if (boardSquares[r][c] == boardSquares[r+1][c] & boardSquares[r][c] == boardSquares[r+2][c])
                {
                    System.out.println("winner");
                }

                 */
            }
            System.out.println();
        }
        return -1;
    }

    /**
     * Resets the game to a new game state.
     */
    public void newGame()
    {
        player = 0;
        for (int r = 0; r<boardSquares.length; r++ )
        {
            for (int c = 0; c < boardSquares[0].length; c++)
            {
                boardSquares[r][c]=-1;
            }
        }
    }

}
