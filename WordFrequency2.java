/**
 * This class takes two ArrayLists as parameters in constructor.
 * It creates three HashMaps:
 * An entry in all three maps: @param file1, @param file2 and @param sorted consists of a word and the number of its' occurrences.
 * @param sorted Value set consist of the bigger value from between @param file1 and @param file2.
 *
 */

import java.util.*;

public class WordFrequency2 {

    private ArrayList<String> text1, text2;
    
    public WordFrequency2(ArrayList<String> file1Arr, ArrayList<String> file2Arr) {
        
        text1 = file1Arr;
        text2 = file2Arr;        
        
        // init three HashMaps, third one is a merge of the first two
        HashMap<String, Integer> file1 = new HashMap<String, Integer>();
        HashMap<String, Integer> file2 = new HashMap<String, Integer>();
        HashMap<String, Integer> sorted = new HashMap<String, Integer>();
        
        // iterate through ArrayList 'text1' and populate HashMap 'file1'
        for(String word : text1) {
        
            int i = 0;   
            
            /*
             * map.get(key) = value (here: num of occurrences of the word)
             * if the word (key) is already present in the HashMap then only increment the num of occurrences (value) by 1
             * in other words - add entry: key = word, value = either 1 or last value + 1
             */
            
            if(file1.containsKey(word))
                i = file1.get(word) + 1; 
            else i = 1;
           
            file1.put(word, i);
        }
        
        // iterate through ArrayList 'text2' and populate HashMap 'file2'
        for(String word : text2) {
            int i = 0;   
            if(file2.containsKey(word))
                i = file2.get(word) + 1; //get the value (num of occurrences of word) and increment by 1
            else i = 1;
            //add entry: key = word, value = either 1 or last value + 1
            file2.put(word, i);
        }
        
        //now both HashMaps are populated
        //SORT BY VALUE AND PRINT:
        
        // iterate through ArrayList 'text1' and copy all entries to HashMap 'sorted'
        for(String word : text1) {
            int i = 0;   
            i = file1.get(word); //get the value (num of occurrences of word)
            sorted.put(word, i);
        }
        
        /* iterate through ArrayList 'text2' and copy to HashMap 'sorted' 
         * only the values which are not already in it OR are in it 
         * AND are greater than values for the same key in 'file1' (or 'sorted') 
         * --> useful for sorting
         */
         
        for(String word : text2) {
            int i = 0;   
            i = file2.get(word); //get the value (no of occurrences of word)

            if(sorted.containsKey(word)){
                if(file2.get(word) > sorted.get(word)) {
                    sorted.put(word, file2.get(word));
                }
            }
            // key not in 'sorted'
            else 
                sorted.put(word, i);
        }
            
         // iterate through 'sorted' to find the maximum value     
        int  max=0;
        for(String key : sorted.keySet()) {
            if(sorted.get(key) > max)
                max = sorted.get(key);
        } 
        
         /**
          * The loop goes from the maximum value to 0, printing an entry from @param sorted if the value (sorted.get(key)) == loop index.  
          * This way we can easily print the entries with the highest values first (print in descending order).
          * If there's no matching value for the given index, we simply don't print anything for this iteration of the outer loop.
          *
          * The inner loop iterates through the keySet of the @param sorted map.
          * If one of the files does not contain given key, we print '0' occurrences.  
          */
          
         for(int i = max; i > 0; i--) {
            
            for (String key : sorted.keySet()) {
            
                int val1=0, val2=0;
                
                if(file1.containsKey(key)) 
                    val1 = file1.get(key);
                    
                if(file2.containsKey(key)) 
                    val2 = file2.get(key);
                
                // does the value == index?    
                if(sorted.get(key) == i)
                    System.out.println(key + " " + val1 + " " + val2);
            }
        }      
    }
}   








