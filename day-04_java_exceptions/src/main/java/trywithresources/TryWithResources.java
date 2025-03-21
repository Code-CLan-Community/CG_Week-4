package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("file.txt")))
        {
            String vrLine = br.readLine();
            if (vrLine != null) {
                System.out.println(vrLine);
            }
        }
        catch(IOException e){
            System.out.println("Error reading file");
        }
    }
}
