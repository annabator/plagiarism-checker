import java.util.*;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class WordFrequency {

    private ArrayList<String> text;
    private int columns=2, rows=0, max=0; //max = biggest value (for the word with the most occurrences)
    private String[] columnNames={"Word", "Count"};
    private String[][] data;
   // private JTable table;
    public WordFrequency(ArrayList<String> section) {
        
        text = section;
        Map<String, Integer> occurrences = new HashMap<String, Integer>();

        for(String word : text) {
            int i = 0;   
            if(occurrences.containsKey(word))
                i = occurrences.get(word) + 1; //get the value (no of occurrences of word) and increment it by 1
            else {
                rows++; // when we exit the loop rows will be the number of unique entries (words) 
                i = 1;
            }    
            //add entry: key = word, value = either 1 or last value + 1
            occurrences.put(word, i);
        }
        
        // entries for the table
        data = new String [rows][columns];
        
        
        // sort the hashmap by value
        
        for(int i = max; i>0; i--) {
            for(String key: occurrences.keySet()) { //iterate through the set of keys only 
                
                int value = (occurrences.get(key));
                if(value == i) { // get(key) returns the value (no of occurrences) for the given key. if it matches i, add to the array
                    String valueStr = Integer.toString(occurrences.get(key)); //cast to string to avoid making row an object (String[] easier)
                    data[rows][0] = key;
                    data[rows][1] = valueStr;
                    //occurrences.get(key) = value
                } //enf of if statement
            }//end of inner for loop    
        }//end of outer for loop    
        
       //table = new JTable(data, columnNames);
        
    } // end of constructor

    public String[][] getData() {
        return data;
    }
    
    public String[] getColumnNames() {
        return columnNames;
    }
    
    
}

