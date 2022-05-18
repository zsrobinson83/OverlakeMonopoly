
//Final Project
//Alec Zoe Felix Celina Gavin
//Overlake Monopoly
//place class creates the place objects of the game
import java.util.*;
public class Place{

   private Player owner;
   private int cost;
   private int rent;
   private String name;
   private boolean finished = false;
    public Place(String placeName ,Player person, int costs, int rents){
      owner = person;
      cost = costs;
      rent = rents;
      name = placeName;
    }
   //What int are we returning from this? Because this should probably be a void method.
    public void runPlace(Player play){
      if(this.owner ==  null){
              System.out.println("Do you want to buy this property? Cost to buy: " + cost);
              Scanner myObj = new Scanner(System.in);
              String response = myObj.nextLine();
              //needs to throw a response if answers no and can delete try and catch
              
               if(response.toLowerCase().equals("yes")){
                  play.take(cost);
                  this.owner = play;
                  play.addPlace(this);
               }
               else if (response.toLowerCase().equals("no")){
                  //auction or does nothing
               }
               else {
                  System.out.println("Not a valid response");
               }
            }
      else if(this.owner == play){
 
      }
      else{
 play.take(rent);
 owner.give(rent);
       }
       
   
    }
   public String getName(){
      return this.name;
   }
 
 }
 