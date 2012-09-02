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
public class Stadium {
    
    private String stadiumName;
    private int distanceToLeftFieldWall;
    private int distanceToCenterFieldWall;
    private int distanceToRightFieldWall;

    public Stadium(String stadiumName, int distanceToLeftFieldWall, 
            int distanceToCenterFieldWall, int distanceToRightFieldWall) {
        this.stadiumName = stadiumName;
        this.distanceToLeftFieldWall = distanceToLeftFieldWall;
        this.distanceToCenterFieldWall = distanceToCenterFieldWall;
        this.distanceToRightFieldWall = distanceToRightFieldWall;
    }

    public Stadium() {
        
    }

    public String getStadiumName() {
        return stadiumName;
    }
    
           
    public int getDistanceToLeftFieldWall() {
        return distanceToLeftFieldWall;
    }
   
    public int getDistanceToCenterFieldWall() {
        return distanceToCenterFieldWall;
    }
    
    
    public int getDistanceToRightFieldWall() {
        return distanceToRightFieldWall;
    }
    
}
