
//Final Project
//Alec Zoe Felix Celina Gavin
//Overlake Monopoly
//Game  class runs the game loop
import java.util.*;

public class Game{


   public static void main(String args[]){
  
     
      boolean gameOver = false;
     
      Player playerOne = new Player();
      Player playerTwo = new Player();
  
      Place squareOne = new Place(null, 200, 0);
      Place squareTwo = new Place(null, 0, 100);
      Place squareThree = new Place(null, 0, 150);
      Place squareFour = new Place(null, 0, 120);
  
      Place[] board = {squareOne, squareTwo, squareThree, squareFour};
      Player[] order = {playerOne, playerTwo};
    
      int turn = 0;
     
      while(!gameOver){
     
         Scanner myObj = new Scanner(System.in);
         int move = myObj.nextInt();
        
         order[turn % 2].move(move);
        
         board[order[turn % 2].getPos()].runPlace(order[turn % 2]);
        
         turn++;
     
      }
  
   }  
 

}
