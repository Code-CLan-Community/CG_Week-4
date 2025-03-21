package mapinterface.wordfrequencycounter;
import java.util.HashMap;
import java.util.Map;
// Creating class WordFrequencyCounter to count frequency of each word
public class WordFrequencyCounter
{
    // Method to find frequency of word
    public static Map<String, Integer> countingWordFrequency(String text)
    {
        Map<String, Integer> countWordMap = new HashMap<>();
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");

        for (String word : words)
        {
            countWordMap.put(word, countWordMap.getOrDefault(word, 0) + 1);
        }

        return countWordMap;
    }

    // Main method
    public static void main(String[] args)
    {
            String text = "Hello world, hello Java!";
            // Calling method
            Map<String, Integer> wordCount = countingWordFrequency(text);
            System.out.println(wordCount);
    }
}

