package SuperstoreCode;

import java.util.*;
public class Winner extends Item{

    Winner(int Adder, int Cost, String title, String Category, int vampcost) {
        super(Adder, Cost, title, Category, vampcost);
        
    }
    Random rando = new Random();
    
    @Override 
    public  void setSale(Random rando, ArrayList<Item> Wares,  ArrayList<Item> Multipliers ){
      int doodle = rando.nextInt(1,3);
      int d = rando.nextInt(0, Wares.size());
      int c = rando.nextInt(0, Multipliers.size());  
      
      if ( doodle == 1 ) {
        Wares.get(d).Cost /= 1;
        Multipliers.get(c).Cost/=1;
        System.out.println("Special sale on " + Wares.get(d).title + " and " + Multipliers.get(c).title + "!");
        System.out.println(" ");
        
      }
      if (doodle==2) {
        Wares.get(d).Cost*=1;
        Multipliers.get(c).Cost*=1;
        System.out.println("Wuh oh, the price of  " + Wares.get(d).title + " and " + Multipliers.get(c).title + " went way up!");
        System.out.println(" ");
      }
     
    }

}
