import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister {

    //CollectAll method takes in an ArrayList<String> and a Filter called "filter"
    //If the filter returns true for object in notChecked ArrayList<String>, it adds it into an
    //accepted arraylist. The method returns the accepted arraylist.
    public static ArrayList<String> collectAll(ArrayList<String> notChecked, Filter filter) {
        ArrayList<String> accepted = new ArrayList<>();
        for (String obj : notChecked) {
            if (filter.accept(obj)) {
                accepted.add(obj);
            }
        }
        return accepted;
    }

    public static void main(String[] args) throws IOException {
        //Unfiltered words ArrayList
        ArrayList<String> words = new ArrayList<>();

        //Scan File
        Scanner fileScanner = null;
        File selectedFile = null;
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = chooser.getSelectedFile();
            fileScanner = new Scanner(selectedFile);
        }
        //Add words to file
            while(fileScanner.hasNext()) {
                String word = fileScanner.next();
                words.add(word);
        }
            fileScanner.close();
            //Implments an interface called "Filter" that uses ShortWordFilter boolean.
            //Words is rewritten after running through the ShortWordFilter.
            Filter filter = new ShortWordFilter();
            words = collectAll(words, filter);
            System.out.println("Short Words:");
            System.out.println(words);
    }
}
