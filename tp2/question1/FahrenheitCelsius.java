package question1;
import java.lang.*;

public class FahrenheitCelsius {
 
    
    public static float fahrenheitEnCelsius(int f) {
        float e = (float)5/9*(f-32);
        return e; 
    }

    
    public static void main(String[] args) {
        
        int fahrenheit = 0;
        float celsius = 0;
        for(int i = 0; i<args.length; i++){
        fahrenheit = java.lang.Integer.parseInt(args[i]);
        celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " +((int)(celsius*10)/10.0) +"\u00B0C"); 
        }                                                                          
                                                                                
    }
}

   

