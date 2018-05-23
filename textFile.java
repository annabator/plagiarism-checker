import java.util.*;
import java.io.*;

public class textFile {

    private ArrayList<String> text = new ArrayList<String>();  
    private String[] fileNames = {"test1.txt", "test2.txt", "test3.txt", "test4.txt", "test5.txt"};
    private int index;
    
    public textFile(int i) {
        
        index = i; 
        
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
            
        }
        
        catch (IOException e) {
            System.out.println(e);
        }        
        
    }
    
    public  ArrayList<String> getText() {
        return text;
    }    

}   

    
