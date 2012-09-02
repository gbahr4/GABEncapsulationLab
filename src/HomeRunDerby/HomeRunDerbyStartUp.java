/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeRunDerby;
// Lab Two

/**
 *
 * @author Greg
 */
public class HomeRunDerbyStartUp {
   
    public static void main(String[] args) {
        Game game = new Game();
           
        game.createStadium(); 
        game.namePlayerOne();
        Player playerOne = new Player();
        game.namePlayerTwo();
        Player playerTwo = new Player();
        game.playGame();
        
        
    }
}  

