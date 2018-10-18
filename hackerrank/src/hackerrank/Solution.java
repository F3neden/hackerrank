/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Benutzer1
 */
public class Solution {
    
    public Solution() {
    }

    // create a new Method for each solution inside this class
    public int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        int[] result = new int [grades[0]];
        
        // Iterate trough each grade 
        for (int i = 1; i < result.length + 1; i++)
        {
            if (grades[i] >= 38)
            {
                if (grades[i]%5 >= 3)
                {   
                    System.out.println("Ergebnis des Modulo");
                    grades[i] = grades[i] + (5 - (grades[i] % 5));
                }
            }
            result[i-1] = grades[i];
        }
        
        return result;
    }
    
    public int stockMaximize(int[] prices) {
        int result = 0;
        int max = 0;
        
        // Always good to double check for null input
        if( prices != null ){
            /*Always, take care of passing the data type in generic field*/
            List<Integer> gekauft = new LinkedList<>();
            System.out.println("stockMaximize wird aufgerufen \n");
            for (int i = 0; i<prices.length; i++) {
                for (int j = i; j<prices.length; j++) {
                    if (prices[i]<prices[j])
                    {
                        // Kaufen 
                        if (!gekauft.contains(prices[i])) {
                            System.out.println( "bei " + prices[i] +" wird gekauft, weil " + prices[j] + " groeßer ist." );
                            gekauft.add(prices[i]);
                        }
                        else {
                            System.out.println("bei " + prices[i] + " wurde bereits gekauft!");
                        }
                        
                        // Maximum / Maxima finden
                        if (prices[j] > max)
                        {
                            max = prices[j];
                        }
                        
                        System.out.println("");
                    }
                    
                    // vielleicht nur den nächsten wert also i+1 betrachten?
                    if ((gekauft.size() > 0) && (prices[j] < prices[i]))
                    {   
                        // derzeitiger Wert lokales oder globales Maximum?
                        System.out.println( prices[i] + " als Maximum gefunden!");
                        
                        for (int k = 0; k<prices.length; k++) {
                            if (prices[j] > max)
                            {
                                max = prices[j];
                            }
                        }
                        
                        // if global
                        // alles verkaufen
                        // von neu starten
                        
                        // if lokal
                        // kaufen
                    }
                }
            }
            
            System.out.println("Das Maximum ist: " + max);
            
            
            // Verkaufen            
            Iterator<Integer> it = gekauft.iterator();
            while (it.hasNext())
            {
                result = result + (max - it.next());
            }
        }
        return result;
    }
}
