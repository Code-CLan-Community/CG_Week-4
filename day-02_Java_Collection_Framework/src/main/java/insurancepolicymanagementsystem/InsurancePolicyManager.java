package insurancepolicymanagementsystem;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.LocalDate;

public class InsurancePolicyManager
{
    // Storing Policies in different Sets
    final private Set <InsurancePolicy> hashSet = new HashSet<>();
    final private Set <InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    final private Set <InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(InsurancePolicy :: getExpiryDate));

    // Method to add a policy
    public void addPolicy(InsurancePolicy insurancePolicy)
    {
        hashSet.add(insurancePolicy);
        linkedHashSet.add(insurancePolicy);
        treeSet.add(insurancePolicy);
    }

    // Method to display all unique Policies
    public void displayAllPolicies()
    {
        System.out.println("\nAll Unique Policies ");
        hashSet.forEach(System.out::println);
    }

    // Method to display Policies which are expiring soon
    public void displayExpiringSoonPolicies()
    {
        LocalDate currentDate = LocalDate.now();
        System.out.println("\nPolicies Expiring Soon (within next 30 days)");
        treeSet.forEach(insurancePolicy -> {
            if (ChronoUnit.DAYS.between(currentDate, insurancePolicy.getExpiryDate()) <= 30) {
                System.out.println(insurancePolicy);
            }
        });
    }

    // Method to display Policies by Coverage Type
    public void displayPoliciesByCoverageType(String coverageType)
    {
        System.out.println("\nPolicies with Coverage Type " + coverageType);
        treeSet.forEach(policy -> {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                System.out.println(policy);
            }
        });
    }

    // Method to Check for Duplicate Policies based on policy number
    public void displayDuplicatePolicies()
    {
        System.out.println("\nChecking for duplicate policies ");
        Set <String> policyNumbers = new HashSet<>();
        for (InsurancePolicy insurancePolicy : treeSet)
        {
            if (!policyNumbers.add(insurancePolicy.getPolicyNumber()))
            {
                System.out.println("Duplicate Policy found " + insurancePolicy);
            }
            else
            {
                System.out.println("No duplicate policy found ");
            }
        }
    }

    // Method for Performance Comparison of HashSet, LinkedHashSet and TreeSet
    public void performanceComparison()
    {
        // Time taken by HashSet to add policies
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++)
        {
            addPolicy(new InsurancePolicy("Policy" + i, "Name" + i, LocalDate.now().plusDays(i), "Home", 500.0));
        }
        long endTime = System.nanoTime();
        System.out.println("\nTime taken by HashSet to add 1000000 policies " + (endTime - startTime));

        // Time taken by LinkedHashSet to remove policies
        startTime = System.nanoTime();
        linkedHashSet.remove(new InsurancePolicy("Policy778899", "Name778899", LocalDate.now(), "Home", 500.0));
        endTime = System.nanoTime();
        System.out.println("Time taken by LinkedHashSet to remove policies " + (endTime - startTime));

        // Time taken by TreeSet to search policies
        startTime = System.nanoTime();
        treeSet.contains(new InsurancePolicy("Policy778899", "Name778899", LocalDate.now(), "Home", 500.0));
        endTime = System.nanoTime();
        System.out.println("Time taken by TreeSet to search policies " + (endTime - startTime));
    }
}
