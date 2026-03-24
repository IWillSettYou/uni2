package text.to.numbers;

import static  
org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.*;
import java.io.File;                  
import java.io.FileNotFoundException; 
import java.util.Scanner;    



public class SingleLineFileUnitTest{


    @Test
    void addNumbers_IOException() throws IOException, IllegalArgumentException{

        assertEquals(1, SingleLineFile.addNumbers("sdkfjgskhfsdfs.txt"));

        assertThrows(IOException.class, () -> {
            throw new IOException("expected the unexpected");
        });
        
    }

    void addNumbers_IllegalArgumentException() throws IOException, IllegalArgumentException{

        assertEquals(1, SingleLineFile.addNumbers("text.txt"));

        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("expected the unexpected2");
        });

        
    }

    
}