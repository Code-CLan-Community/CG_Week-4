package designvotingsystem;

import java.util.*;
// Creating class VotingSystem
public class VotingSystem
{
    // Attribute of the class
    private HashMap<String, Integer> votesMap;
    private LinkedHashMap<String, Integer> orderedVotesMap;
    private TreeMap<String, Integer> sortedVotesMap;

    // Default constructor of the class
    public VotingSystem()
    {
        votesMap = new HashMap<>();
        orderedVotesMap = new LinkedHashMap<>();
        sortedVotesMap = new TreeMap<>();
    }

    public void addCandidate(String candidate)
    {
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);
        orderedVotesMap.put(candidate, votesMap.get(candidate));

        // Sorting votes in descending order
        sortedVotesMap.clear();
        votesMap.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue() - entry1.getValue()) // Sort in descending order
                .forEach(entry -> sortedVotesMap.put(entry.getKey(), entry.getValue()));
    }

    // Method to display data
    public void displayDetails()
    {
        System.out.println("Votes (Ordered by Insertion) " + orderedVotesMap);
        System.out.println("Votes (Sorted Alphabetically) " + sortedVotesMap);
    }
}