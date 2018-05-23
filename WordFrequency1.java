import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.*;


public class WordFrequency1 {

    private ArrayList<String> text;
    
    
    public WordFrequency1(ArrayList<String> section) {
        
        text = section;
        HashMap<String, Integer> occurrences = new HashMap<String, Integer>();

        for(String word : text) {
            int i = 0;   
            if(occurrences.containsKey(word))
                i = occurrences.get(word) + 1; //get the value (no of occurrences of word)
            else i = 1;
            //add entry: key = word, value = either 1 or last value + 1
            occurrences.put(word, i);
        }
        //iterate through the whole map and print all entries
        for (HashMap.Entry<String, Integer> entry : occurrences.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value + "\n");
        }
    }
}   
