/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeRunDerby;

// Lab Two
/**
 *
 * @author Greg
 * 
 */


public class Game {
    private String stadiumName;
    private int distanceToLeftFieldWall;
    private int distanceToCenterFieldWall;
    private int distanceToRightFieldWall;
    private String playerName;
    private int roundOneScore;
    private int roundTwoScore;
    private int roundThreeScore;
    private int totalScore;
    

    public Game() {
    }
    
    public void createStadium() {
        // validate name and distances
              
    }
       
    public void namePlayerOne() {
        // validate name
           
    }
    
    public void namePlayerTwo() {
        // validate name
        
    }
    
    public void playGame() {
         Player playerOne = new Player(playerName);
         Player playerTwo = new Player(playerName);
         
         playerOne.batRoundOne();
         playerTwo.batRoundOne();
         playerOne.batRoundTwo();
         playerTwo.batRoundTwo();
         playerOne.batRoundTwo();
         playerTwo.batRoundThree();
         playerOne.batRoundThree();
         playerOne.addTotalScore();
         playerTwo.addTotalScore();
        
         }
    
    }
