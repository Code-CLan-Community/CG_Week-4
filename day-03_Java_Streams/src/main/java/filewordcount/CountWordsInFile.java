package filewordcount;
import java.io.*;
import java.util.*;
// Creating class CountWordsInFile to counts the number of words in a given text file
public class CountWordsInFile
{
    // Main method
    public static void main(String[] args)
    {
        // Storing file path
        String filePath = "D:\\Capgemini\\Coding Question\\CG_Week_4\\Day_03_Java_Streams\\sourcefile.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try
        {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bufferedReader.readLine()) != null)
            {
                String[] words = line.split("\\W+");
                for (String word : words)
                {
                    if (!word.isEmpty())
                    {
                        word = word.toLowerCase();
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occurred due to " + e.getMessage());
        }

        List<Map.Entry<String, Integer>> sortedWordCount = new ArrayList<>(wordCount.entrySet());
        sortedWordCount.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        System.out.println("Top 5 most frequently occurring words ");
        for (int i = 0; i < Math.min(5, sortedWordCount.size()); i++)
        {
            Map.Entry<String, Integer> entry = sortedWordCount.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
