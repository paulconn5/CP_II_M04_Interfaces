import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShortLister implements Filter {
    public static void main(String[] args) throws IOException {
        int words = 0;
        Scanner fileScanner = null;

        File selectedFile = null;
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            selectedFile = chooser.getSelectedFile();
            fileScanner = new Scanner(selectedFile);
        }

            while(fileScanner.hasNext()) {
                words++;
                String word = fileScanner.next();
        }

        System.out.println("# of words is: " + words);
        fileScanner.close();
    }


    @Override
    public boolean accept(Object x) {
        return false;
    }
}
