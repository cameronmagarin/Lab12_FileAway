import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.JFileChooser;

public class Magarin_Cameron_Lab12FileAway {
    public static void main(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        File selectedFile;
        String rec = "";
        String[] words = null;

        
        
            File workingDirectory = new File(System.getProperty("user.dir"));

            chooser.setCurrentDirectory(workingDirectory);

            if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                selectedFile = chooser.getSelectedFile();
                Path file = selectedFile.toPath();
                InputStream in = 
                    new BufferedInputStream(Files.newInputStream(file));
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                    int line = 0;// value to hold the number of lines in the file
                    int wordCount = 0; // value to hold the number of words in the file
                    int charCount= 0; // value to old the number of characters in the file
                    
                    while(reader.ready())
                    {
                        rec = reader.readLine();
                        line++; //increases after line is read
                        words = rec.split(" ");//splits each line by space
                        wordCount = wordCount + words.length;// counts the spaces between words along with the last word 
                        for(String word : words)//splits each word in the array
                        {
                            charCount = charCount + words.length;
                        }
                        

                        

                        
                        
                    }
                    reader.close();
                    System.out.println("The file selected was " + file);
                    System.out.println("This file contains this many lines: " + line);
                    System.out.println("This file contains this many words: " + wordCount);
                    System.out.println("This file contains this many characters: "+ charCount);

                    System.out.println("Data file read!");

            }
            else
            {
                System.out.println("File was not chosen");
                System.out.println("Please restart the program");
            }
    }
}
