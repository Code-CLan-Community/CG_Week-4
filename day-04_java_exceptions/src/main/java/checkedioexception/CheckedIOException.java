package checkedioexception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedIOException {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("A FileNotFoundException occurred: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }
    }
}
