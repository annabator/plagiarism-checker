/**
 * Class textFile takes the index in the @param fileNames array as parameter in constructor.
 *
 * @exception IOException On input error for file reading.
 *
 * @param tokenizer is an instance of StringTokenizer.
 * It breaks the text files into tokens.
 *
 * @see java.util.StringTokenizer#returnDelims(String str, String delim, boolean returnDelims) method has the returnDelims flag set to false.
 * this way delimiter characters are not considered to be tokens and they only serve to separate the tokens.
 * delimiters will thus not be included in the word count nor will they be printed out
 */

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
        /**
         * This accessor method allows the Driver to get the tokenized content from desired file.
         */
        return text;
    }    

}   

    
