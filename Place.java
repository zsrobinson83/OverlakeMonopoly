
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
   private boolean isPlace;
   private boolean isCard;
   private boolean finished = false;
   public Place(String placeName ,Player person, int costs, int rents, boolean place, boolean card){
      owner = person;
      cost = costs;
      rent = rents;
      name = placeName;
      isPlace = place;
      isCard = card;
      
    }
   
    public void runPlace(Player play){
       if(this.isPlace){
         if(this.owner ==  null){
              System.out.println("Do you want to buy this property? Cost to buy: " + cost);
              Scanner myObj = new Scanner(System.in);
              String response = myObj.nextLine();
              finished = false;
              while(finished == false){
                  if(response.toLowerCase().equals("yes")){
                     play.take(cost);
                     this.owner = play;
                     play.addPlace(this);
                  }
                  else if (response.toLowerCase().equals("no")){
                     //auction or does nothing
                     //I dont think auctions are the best idea, maybe we can add it later
                  }
                  else {
                     System.out.println("Not a valid response");
                  }
              }
               
         }
         else if(this.owner == play){
 
         }
         else{
            play.take(rent);
            owner.give(rent);
         }
       }
   
       if(this.isCard){
         randNum = (int)(Math.random() * 3)
         if(randNum == 0){
            System.out.println("You fail ap calc, and lose 50 dollars. ");
            play.take(50);
         }
      }
   
   
   public String getName(){
      return this.name;
   }
 
 }
 
