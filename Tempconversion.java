/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconversion;

/**
 *
 * @author JD
 */
import java.util.*;
public class Tempconversion {

 
    public static void main(String[] args) {
        double temperature;
   
     Scanner sc = new Scanner(System.in);
     
     
          System.out.println("REAUMUR CONVERSIONS");
           System.out.println("**********************");
          /*==>Reaumur to Celcius<==*/
         System.out.println("Reaumur to Celcius: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 5)/4);
        
        System.out.println("RESULT : " +temperature);
        
         /*==>Reaumur to Fahrenheit<==*/
         System.out.println("Reaumur to Fahrenheit: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 9)/4)+32;
        
        System.out.println("RESULT : " +temperature);
        
         /*==>Reaumur to Kelvin<==*/
         System.out.println("Reaumur to Kelvin: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 5)/4)+273.15;
        
        System.out.println("RESULT : " +temperature);
        
         /*==>Reaumur to Rankine<==*/
         System.out.println("Reaumur to Rankine: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 9)/4)+491.67;
        
        System.out.println("RESULT : " +temperature);
        
         System.out.println("END OF REAUMUR CONVERSIONS");
          System.out.println("---------------------------");
         System.out.println("RANKINE CONVERSIONS");
          System.out.println("**********************");
         /*==>Rankine to Celcius<==*/
         System.out.println("Rankine to Celcius: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature - 491.67)*5)/9;
        
        System.out.println("RESULT : " +temperature);
        
        /*==>Rankine to Fahrenheit<==*/
         System.out.println("Rankine to Fahrenheit: ");
        temperature = sc.nextInt();
        
        temperature = (temperature - 459.67);
        
        System.out.println("RESULT : " +temperature);
        
        /*==>Rankine to Kelvin<==*/
         System.out.println("Rankine to Kelvin : ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 5)/ 9);
        
        System.out.println("RESULT: " +temperature);
        
         /*==>Rankine to Reaumur<==*/
         System.out.println("Rankine to Reaumur: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature - 491.67f)* 4)/9;
        
        System.out.println("RESULT : " +temperature);
         System.out.println("---------------------------");
         System.out.println("END OF RANKINE CONVERSIONS");
          System.out.println("**********************");
        System.out.println("===END OF ALL TEMPERATURE CONVERSIONS===");
    }
    
}
