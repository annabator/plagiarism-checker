import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.*;


public class WordFrequency {

    private ArrayList<String> paragraph;
    
    
    public WordFrequency(ArrayList<String> section) {
        
        paragraph = section;
    }
    
   // public Map<String, Integer> returnFrequency() { //why Integer not int as data type? + later return type 
    
    public static void main(String[] args) {    
        HashMap<String, Integer> occurrences = new HashMap<String, Integer>();
        
        
        //use hashmap or linkedhashmap and sortByValue --> many implications, e.g values can't be retrieved by key anymore, or:
        //use treemap and somehow use it to sort by value (write your own methd)

      occurrences.put("Zara",1);
      occurrences.put("Mahnaz", 3);
      occurrences.put("Ayan", 50);
      
      //Set<String> keySet = occurrences.keySet(); //look up entryset!
      /*Iterator it = occurrences.entrySet().iterator();
        
        while (it.hasNext()) {
            Integer key = keySetIterator.next();
            
            System.out.println(key + " " + occurrences.get(key) + "\n");
        }*/
        //iterate through the map
        for (HashMap.Entry<String, Integer> entry : occurrences.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value + "\n");
        }
        
        
        
        
        
        
        
        
        
        

    }
}
