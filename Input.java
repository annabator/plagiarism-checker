/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.InputStreamReader;*/
import java.io.*;

public class Input{
    public static void main(String[] args) {
        
        
        try {
            File file = new File("lol.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
        
            while(line != null) {
                System.out.println(line + "\n");
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
