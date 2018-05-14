import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class textFile {

    private ArrayList<String> text = new ArrayList<String>();  
    private String[] fileNames = {"lol.txt", "test2.txt", "test3.txt", "test4.txt", "test5.txt"};
    private int index;
    
    public textFile(int i) {
        index = i; //VALIDATION --> 0 <= i <5, i = int
        
        try {
            FileReader fr = new FileReader(fileNames[index]);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            
            while(line != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, " -,.:;?![]'()\"", false); 
                
                while(tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    token = token.toLowerCase();
                    text.add(token);
                }
                
                line = reader.readLine();
            }   
            reader.close();  
            
            
           // for(String word : text) 
             //   System.out.println(word);
                
            
        }
        
        catch (IOException e) {
            System.out.println(e);
        }        
        
    }
    
    public  ArrayList<String> getText() {
        return text;
    }    
}   

    
