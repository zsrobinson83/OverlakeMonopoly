
//Final Project
//Alec Zoe Felix Celina Gavin
//Overlake Monopoly
//place class creates the place objects of the game
import java.util.*;
public class Place{

    private Player owner;
    private int cost;
    private int rent;
   
    public Place(Player person, int costs, int rents){
   
       owner = person;
       cost = costs;
       rent = rents;
   
    }
   //What int are we returning from this? Because this should probably be a void method.
    public void runPlace(Player play){
   
 
       if(this.owner ==  null){
              System.out.println("Do you want to buy this property? Cost to buy: " + cost);
              Scanner myObj = new Scanner(System.in);
              String response = myObj.nextLine();
              if(response.toLowerCase().equals("yes")){
              play.take(cost);
             this.owner = play;
              }
       }
       else if(this.owner == play){
 
       }
       else{
 play.take(rent);
 owner.give(rent);
       }
       
   
    }
 
 }
 
