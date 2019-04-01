/**
 * This class outlines a Volleyball or Racquetball simulation
 * depending on the String specified in the constructor.
 * 
 * The simulation is run when <code>runSim()</code> is called and 
 * utilizes the recursive method <code>PlayUntilWin()</code>
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class VolleyRacquetSim
{
    /**
     * Differentiates the two games.
     * Volleyball goes to 25 instead of 15 and must win by 2.
     */
    private boolean winByTwo;
    private int winScore;

    /**
     * Probability that team A wins a given point.
     */
    private double probPointA;

    /**
     * New <code>VolleyRacquetSim</code> instance
     * 
     * If the game is volleyball <code>winByTwo</code> is set to true
     * and set to false for racquetball.
     */ 
    public VolleyRacquetSim(String game, double probPointA)
    {
        /* initialize instance variables */
        
        
    }

    /**
     * New <code>VolleyRacquetSim</code> instance
     * 
     * If the game is volleyball <code>winByTwo</code> is set to true
     * and set to false for racquetball. Default probability that team A wins is 50%.
     */ 
    public VolleyRacquetSim(String game)
    {
        /* initialize instance variables */
        
        
    }

    public void runSim()
    {
        /* Loop for the number of simulations specified. Call playUntilWin() and print results */
        
        
        
    }

    public String playUntilWin(String server, String receiver, double probWinVolley, int serverScore, int recScore)
    {
        /* Create the recursive method based on the outline from class */
        
        
        
    }
}
