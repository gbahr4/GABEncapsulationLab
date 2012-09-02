/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeRunDerby;

import java.util.Random;
// Lab Two
/**
 *
 * @author Greg
 */
public class Player {
    private String playerName;
    private int roundOneScore;
    private int roundTwoScore;
    private int roundThreeScore;
    private int totalScore;
    Random randomNumbers = new Random();

    public Player() {
    }

    public Player(String playerName) {
        this.playerName = playerName;
        
    }

    public String getName() {
        return playerName;
    }
    
        
    public int batRoundOne() {
        roundOneScore = randomNumbers.nextInt(30) + 1;
        return roundOneScore;     
    }
     
    public int batRoundTwo() {
        roundTwoScore = randomNumbers.nextInt(30) + 1;
        return roundTwoScore;     
    }
    
    public int batRoundThree() {
        roundThreeScore = randomNumbers.nextInt(30) + 1;
        return roundThreeScore;     
    }
    
    public int addTotalScore() {
        totalScore = roundOneScore + roundTwoScore + roundThreeScore;
        return totalScore;
    }

    public int getRoundOneScore() {
        return roundOneScore;
    }

    public int getRoundTwoScore() {
        return roundTwoScore;
    }

    public int getRoundThreeScore() {
        return roundThreeScore;
    }

    public int getTotalScore() {
        return totalScore;
    }
    
}
