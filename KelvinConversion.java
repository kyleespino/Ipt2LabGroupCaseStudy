/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KelvinConversion;
import java.util.*;
/**
 *
 * @author Bless
 */
public class KelvinConversion {
    
     public static void main(String[] args) {
      
     double temperature;
   
     Scanner sc = new Scanner(System.in);
      System.out.println("TEMPERATURE CONVERSIONS");
       System.out.println("**********************");
     
    System.out.println("KELVIN CONVERSIONS");
           System.out.println("**********************");
         /*==>Kelvin to Celcius <==*/
         System.out.println("Kelvin to Celcius: ");
        temperature = sc.nextInt();
        
        temperature = (temperature - 273.15);
        
        System.out.println("RESULT: " +temperature);
        
        /*==>Kelvin to Fahrenheit <==*/
         System.out.println("Kelvin to Fahrenheit: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 9)/5)-459.67;
        
        System.out.println("RESULT: " +temperature);
        
        /*==>Kelvin to Reaumur <==*/
         System.out.println("Kelvin to Reaumur: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature - 273.15)*4)/5;
        
        System.out.println("RESULT : " +temperature);
        
        /*==>Kelvin to Rankine <==*/
         System.out.println("Kelvin to Rankine: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 9)/5);
        
        System.out.println("RESULT: " +temperature);
        
         System.out.println("END OF KELVIN CONVERSIONS");
         System.out.println("**********************");
}
}