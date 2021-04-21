/*
Author: Kaitlyn Bui
Date: 04.20.2021
Program: Color Mixer
Purpose: Input two colors, outputs the combo of both
*/
import java.util.*;

public class ColorMixer{
   /*
   Method: exists
   Purpose: tests if inputted colors is part of primary colors
   */
   public static boolean exists(String[] colors, String key){
      for(String foo : colors){
         if (foo.equals(key)){return true;}
      }
      
      return false;
   }
   /*
   Method: colorMixer
   Purpose: Returns the combination of two colors
   */
   public static String colorMixer(String c1, String c2){
      if (c1.equals(c2)){
         return c2;
      }
      
      else if((c1.equals("red") || c2.equals("red")) && (c1.equals("blue") || c2.equals("blue"))){
         return "purple";
      }
      
      else if((c1.equals("red") || c2.equals("red")) && (c1.equals("yellow") || c2.equals("yellow"))){
         return "orange";
      }
      
      else {
         return "green";
      }


   }
   
   public static void main(String[] args){
      String c1, c2; 
      String[] colors={"red", "blue", "yellow"};
      Scanner bob=new Scanner(System.in);
      
      System.out.println("Hello user! Welcome to the color mixer.");
      
      do{
         System.out.println("Please input two primary colors to combine them.");
         System.out.print("\nColors: ");
         c1=bob.next();
         c1=c1.toLowerCase();
         System.out.print(c1+" + ");
         c2=bob.next();
         c2=c2.toLowerCase();
         
      }
      
      while (!(exists(colors, c1) & exists(colors, c2))) ;
      
      System.out.print("= "+colorMixer(c1, c2));

      
   }
   
}