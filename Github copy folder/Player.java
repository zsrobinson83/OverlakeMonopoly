//Final Project
//Alec Zoe Felix Celina Gavin
//Overlake Monopoly
//Player class Creates players
import java.util.*;
public class Player{

    private int bank;
    private int pos;
    private ArrayList<Place> owner = new ArrayList<Place>();
   
    public Player(){
   
       bank = 1500;
       pos = 0;
   
    }
   
    public void give(int num){
   
       bank += num;
   
    }
   
    public void take(int num){
   
       bank -= num;
   
    }
   
    public void move(int num){
   
       for(int i = num; i > 0; i--){
          if(pos == 3){
             pos = 0;
          }
          else{
             pos++;
          }
            
       }
   
    }
 
    public void ownPlace(){
    }
   
    public int getBank(){
       return bank;
    }
    public int getPos(){
       return pos;
    }
   
   
   
 
 
 }
 