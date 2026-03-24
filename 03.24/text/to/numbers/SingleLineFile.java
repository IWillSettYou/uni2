package text.to.numbers;

import java.io.*;
import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;             

public class SingleLineFile{
    public static int addNumbers(String filename) throws IOException, IllegalArgumentException{
        File file = new File(filename);
        if(!file.exists()) throw new IOException("you stupid");
        if(file.length() == 0) throw new IllegalArgumentException("Empty file");
       
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()){
            String line = reader.nextLine();
            for(String word : line.split(" ")){
                try{
                    word = word + 1;
                } catch(Exception e){
                    System.err.println(word);
                }
            }
        }
        
        return 1;
    }
}