/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celciusandfahrenheitconversion;

/**
 *
 * @author Kyle
 */
import java.util.*;
public class CelciusAndFahrenheitConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     double temperature;
   
     Scanner sc = new Scanner(System.in);
          System.out.println("TEMPERATURE CONVERSIONS");
           System.out.println("**********************");
     System.out.println("CELCIUS CONVERSIONS");
      System.out.println("**********************");
     /*==>Celcius to Fahrenheit<==*/
     System.out.println("Celcius to Fahrenheit: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature + 32)*9)/5;
        
        System.out.println("RESULT: " +temperature);
        
        /*==>Celcius to kelvin <==*/
         System.out.println("Celcius to Kelvin: ");
        temperature = sc.nextInt();
        
        temperature = (temperature + 273.15);
        
        System.out.println("RESULT: " +temperature);
        
              /*==>Celcius to Reaumur <==*/
         System.out.println("Celcius to Reaumur: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature * 4.0)/5.0);
        
        System.out.println("RESULT: " +temperature);
        
         /*==>Celcius to Rankine <==*/
         System.out.println("Celcius to Rankine: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature +273.15)*9)/5;
        
        System.out.println("RESULT: " +temperature);
        
         System.out.println("END OF CELCIUS CONVERSIONS");
         System.out.println("---------------------------");
         System.out.println("FAHRENHEIT CONVERSIONS");
          System.out.println("**********************");
         /*==>Fahrenheit to Celcius<==*/
     System.out.println("Fahrenheit to Celcius: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature - 32)*5)/9;
           System.out.println("RESULT: " +temperature);
           
            /*==>Fahrenheit to Kelvin <==*/
         System.out.println("Fahrenheit to Kelvin: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature + 459.67)*5)/9;
        
        System.out.println("RESULT: " +temperature);
        
        /*==>Fahrenheit to Reaumur <==*/
         System.out.println("Fahrenheit to Reaumur: ");
        temperature = sc.nextInt();
        
        temperature = ((temperature -32)*4)/9;
        
        System.out.println("RESULT: " +temperature);
        
          /*==>Fahrenheit to Rankine <==*/
         System.out.println("Fahrenheit to Rankine: ");
        temperature = sc.nextInt();
        
        temperature = (temperature + 459.67);
        
        System.out.println("RESULT: " +temperature);
        
         System.out.println("END OF FAHRENHEIT CONVERSIONS");

    }
    
    }
