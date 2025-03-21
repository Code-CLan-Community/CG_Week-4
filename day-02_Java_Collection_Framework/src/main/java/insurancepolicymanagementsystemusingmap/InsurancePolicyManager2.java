package insurancepolicymanagementsystemusingmap;

import java.time.LocalDate;
import java.util.*;
// Creating class InsurancePolicyManager2
public class InsurancePolicyManager2
{
    // Attribute of the class
    private HashMap<String, InsurancePolicy2> policyMap;
    private LinkedHashMap<String, InsurancePolicy2> insertionOrderPolicyMap;
    private TreeMap<LocalDate, InsurancePolicy2> expiryDatePolicyMap;

    // Default constructor
    public InsurancePolicyManager2()
    {
        policyMap = new HashMap<>();
        insertionOrderPolicyMap = new LinkedHashMap<>();
        expiryDatePolicyMap = new TreeMap<>();
    }

    // Method to Add policies
    public void addPolicy(InsurancePolicy2 policy)
    {
        policyMap.put(policy.getPolicyNumber(), policy);
        insertionOrderPolicyMap.put(policy.getPolicyNumber(), policy);
        expiryDatePolicyMap.put(policy.getExpiryDate(), policy);
    }
    // Method to get policy number
    public InsurancePolicy2 getPolicyByNumber(String policyNumber)
    {
        return policyMap.get(policyNumber);
    }

    // Method to get policies expiring within next 30 days
    public List<InsurancePolicy2> getPoliciesExpiringWithinNext30Days()
    {
        LocalDate today = LocalDate.now();
        LocalDate thirtyDaysFromNow = today.plusDays(30);
        return new ArrayList<>(expiryDatePolicyMap.subMap(today, thirtyDaysFromNow).values());
    }

    // Method to get policies by policy holder Name
    public List<InsurancePolicy2> getPoliciesByPolicyHolderName(String policyHolderName)
    {
        List<InsurancePolicy2> result = new ArrayList<>();
        for (InsurancePolicy2 policy : insertionOrderPolicyMap.values())
        {
            if (policy.getPolicyHolderName().equalsIgnoreCase(policyHolderName))
            {
                result.add(policy);
            }
        }
        return result;
    }

    // Method to remove policies
    public void removeExpiredPolicies()
    {
        LocalDate today = LocalDate.now();
        expiryDatePolicyMap.headMap(today).clear();
        policyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
        insertionOrderPolicyMap.values().removeIf(policy -> policy.getExpiryDate().isBefore(today));
    }
}
