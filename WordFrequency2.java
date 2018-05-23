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
        
        //iterate through ArrayList 'text1' and populate HashMap 'file1'
        for(String word : text1) {
            int i = 0;   
            i = file1.get(word); //get the value (num of occurrences of word)
            sorted.put(word, i);
        }
        
        for(String word : text2) {
            int i = 0;   
            i = file2.get(word); //get the value (no of occurrences of word)
            
            if(sorted.containsKey(word)){
                if(file2.get(word) > sorted.get(word)) {
                    sorted.put(word, file2.get(word));
                }
            }
            
            else 
                sorted.put(word, i);
        }
            
         // iterate through ? again to find the maximum value     
        int  max=0;
        for(String key : sorted.keySet()) {
            if(sorted.get(key) > max)
                max = sorted.get(key);
        } 
        
        
         for(int i = max; i > 0; i--) {
            //iterate through the whole map and print all entries
            for (String key : sorted.keySet()) {
                int val1=0, val2=0;
                if(file1.containsKey(key)) 
                    val1 = file1.get(key);
                if(file2.containsKey(key)) 
                    val2 = file2.get(key);
                if(sorted.get(key) == i)
                    System.out.println(key + " " + val1 + " " + val2);
            }
         }
        
        
    }
}   








