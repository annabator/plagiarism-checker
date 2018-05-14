import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class Driver {

    public static void main(String[] args) {    
        textFile file0 = new textFile(0); //index = 0 --> fileNames[0] = "lol.txt"
        ArrayList<String> text = file0.getText();
        WordFrequency freq = new WordFrequency(text);   

    }
}
