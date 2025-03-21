package insurancepolicymanagementsystem;

import java.time.LocalDate;

// Creating main class InsurancePolicyManagementSystem
public class InsurancePolicyManagementSystem
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of InsurancePolicyManager class
        InsurancePolicyManager insurancePolicyManager = new InsurancePolicyManager();

        // Adding Policies
        insurancePolicyManager.addPolicy(new InsurancePolicy("101", "Abhishek", LocalDate.now().plusDays(6), "Health", 650.0));
        insurancePolicyManager.addPolicy(new InsurancePolicy("102", "Rajan", LocalDate.now().plusDays(20), "Health", 1000.0));
        insurancePolicyManager.addPolicy(new InsurancePolicy("103", "Sachin", LocalDate.now().plusDays(13), "Auto", 500.0));
        insurancePolicyManager.addPolicy(new InsurancePolicy("104", "Sudeep", LocalDate.now().plusDays(30), "Home", 1500.0));

        // Displaying all unique Policies
        insurancePolicyManager.displayAllPolicies();

        // Displaying Policies which are expiring soon
        insurancePolicyManager.displayExpiringSoonPolicies();

        // Retrieve Policies with a Specific Coverage Type
        insurancePolicyManager.displayPoliciesByCoverageType("Health");

        // Checking for Duplicate Policies
        insurancePolicyManager.displayDuplicatePolicies();

        // Performance Comparison of HashSet, LinkedHashSet and TreeSet
        insurancePolicyManager.performanceComparison();
    }
}
