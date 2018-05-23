import java.util.*;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {    
        
        textFile[] files = new textFile[5]; // there will be 5 instances of class textFile
        
        // load all files 
        files[0] = new textFile(0); //index = 0 --> fileNames[0] = "test1.txt"
        
        files[1] = new textFile(1); //index = 1 --> fileNames[1] = "test2.txt"
        
        files[2] = new textFile(2); //index = 2 --> fileNames[2] = "test3.txt"
        
        files[3] = new textFile(3); //index = 3 --> fileNames[3] = "test4.txt"
       
        files[4] = new textFile(4); //index = 4 --> fileNames[4] = "test5.txt"
        
        
        
        // ask for input - which files are we comparing?
 
        Scanner reader = new Scanner(System.in);
        
        // get the number of the first file
        System.out.println("Please enter the number of the file (from 1 to 5): ");
        int indexA = reader.nextInt(); //scan the next (and the only one) token of the input
        
        // get the number of the second file
        System.out.println("Please enter the number of the file you'd like to check file " + indexA +  " against: ");
        int indexB = reader.nextInt(); 
        System.out.println("\n");
        
        // validation - are A, B, integers between 1 and 5? 
        
        //get the tokenized contents of both files in ArrayLists
        ArrayList<String> textA = (files[indexA-1]).getText();
        ArrayList<String> textB = files[indexB-1].getText();
        
        //compare the word counts for both files and print the result
        WordFrequency2 freq2 = new WordFrequency2(textA, textB);

       
        
    }
}
