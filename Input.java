import java.io.*;
import java.util.StringTokenizer;

public class Input{
   // private String[] fileNames = {"lol.txt", "test2.txt","test3.txt", "test4.txt","test5.txt"};
    public static void main(String[] args) {
        
        try {
            File file = new File("lol.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
             
            while(line != null) {
                int length = line.length(), i = 0;
                String[] words = new String[300]; //for now leave it like that, one paragraph won't be longer
                //tokenizer breaks the line into single words, ignoring punctuation marks
                //punctuation marks and whitespace are set as delimiters which separate tokens (words)
                //returnDelims flag is set to false so that delims are not returned (printed out) as tokens 
                //in the while loop below each token will be converted to lowercase
                StringTokenizer tokenizer = new StringTokenizer(line, " -,.:;?![]'()\"", false);
                
                while(tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    token = token.toLowerCase();
                    words[i] = token;
                    System.out.println(words[i] + " ");
                    i++;
                }
                line = reader.readLine(); 
            }
            
            reader.close();
            
        }
         // FileNotFoundException is a subclass of IOException so can't be multi-catched
        catch (IOException e) {
            System.out.println(e);
        }        
    }
}
