package insurancepolicymanagementsystemusingmap;

import java.time.LocalDate;
// Creating main class InsurancePolicyManagementSystem2
public class InsurancePolicyManagementSystem2
{
    // Main method
    public static void main(String[] args)
    {
        // Creating object of InsurancePolicyManager2
        InsurancePolicyManager2 insurancePolicyManager2 = new InsurancePolicyManager2();

        // Add some policies
        insurancePolicyManager2.addPolicy(new InsurancePolicy2("101", "Abhishek", LocalDate.of(2025, 1, 10)));
        insurancePolicyManager2.addPolicy(new InsurancePolicy2("102", "Neeraj", LocalDate.of(2025, 2, 15)));
        insurancePolicyManager2.addPolicy(new InsurancePolicy2("103", "Rajan", LocalDate.of(2025, 3, 20)));

        // Displaying policy by number
        System.out.println("Display Policy Number 101");
        System.out.println(insurancePolicyManager2.getPolicyByNumber("101"));

        // Displaying policies expiring within next 30 days
        System.out.println("\nPolicies expiring within the next 30 days ");
        for (InsurancePolicy2 policy : insurancePolicyManager2.getPoliciesExpiringWithinNext30Days())
        {
            System.out.println(policy);
        }

        // Displaying policies for a specific policyholder
        System.out.println("\nPolicies for Abhishek ");
        for (InsurancePolicy2 policy : insurancePolicyManager2.getPoliciesByPolicyHolderName("Abhishek"))
        {
            System.out.println(policy);
        }
    }
}