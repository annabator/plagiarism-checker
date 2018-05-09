import java.io.*;
import java.util.StringTokenizer;

public class Paragraph {
    private fileName; 
    public Paragraph(String fName) {
            fileName = fName;
        }
    public static void main(String[] args) {
       
        try {
        //???????
        //get a FileName var from a specific existing instance of File class (but do not make a new instance!) 
        //so e.g. I've initialised new File = File2 in MainGUI and now want to get Filename="test2.txt" 
        //U AN IDIOT THAT'S WHAT ARGUMENTS ARE FOR PFFFF just pass it in a constructor
            //File mtFile = new File();
            //fileName = FileInstance.getFileName();
            
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
             
            while(line != null) {
                int length = line.length(), i = 0;
                //when we proceed to a new line, we create a new instance of the array words
                String[] words = new String[300]; //!!!change to ArrayList cos it's flexible!!!
                //tokenizer breaks the line into single words, ignoring punctuation marks
                //punctuation marks and whitespace are set as delimiters which separate tokens (words)
                //returnDelims flag is set to false so that delims are not returned (printed out) as tokens 
                //in the while loop below each token will be converted to lowercase
                StringTokenizer tokenizer = new StringTokenizer(line, " -,.:;?![]'()\"", false); // \" means ignore double quotation marks
                
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
