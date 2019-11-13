/*
   RollingRockSimulation.java
   by Kriti Sharma and Andrea Wu
   11/7/2019
   Period 3
*/

import java.util.Random;

public class RollingRockSimulation {

   public static void main(String[] args) {
      Random gen = new Random(); 
      
      int feet_pushed = 0;
      int count = 0;
      int successes = 0;
      int twice = 0; 
      int two_in_succession = 0;
      
      do {
      
         count++;
         
         int number = gen.nextInt(10);
      
         if (number != 0) {
            feet_pushed += number;
            
            //System.out.print(feet_pushed + " ");
            
         } else {
            feet_pushed = 0;
                
            //System.out.println(feet_pushed);
            
            twice = 0;
         }
         
         if (feet_pushed >= 100) {
            successes++;
            
            //System.out.println("! Reached the top of the hill !");
            
            feet_pushed = 0;
            
            twice++;
            
            if (twice >= 2) {
               two_in_succession++;
            }
            
         }
         
         
      } while (count <= 10000);
      
      System.out.println("The rock reached the top of the hill and was successfully crushed " + successes + " times.");
      
      double average_attempts = (10000 / (double)successes);
      System.out.printf("It takes on average %.2f attempts to achieve a success.", average_attempts);
      
      System.out.println("\n\nThe number of times two boulders made it in sucession is " + two_in_succession + "times.");
   
   
   } //end main method
   
} // end class