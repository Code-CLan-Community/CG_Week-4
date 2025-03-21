package designvotingsystem;
// Creating main class DesignVotingSystem
public class DesignVotingSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of VotingSystem class
        VotingSystem vote = new VotingSystem();
        // Calling their method
        vote.addCandidate("Abhishek");
        vote.addCandidate("Sachin");
        vote.addCandidate("Rajan");
        vote.displayDetails();
    }
}
