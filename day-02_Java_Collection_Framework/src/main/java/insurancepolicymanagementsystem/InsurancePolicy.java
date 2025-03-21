package insurancepolicymanagementsystem;
import java.time.LocalDate;
import java.util.Objects;

// Creating class InsurancePolicy
public class InsurancePolicy
{
    // Attribute of the class
    final private String policyNumber;
    final private String policyholderName;
    public LocalDate expiryDate;
    final private String coverageType;
    final private double premiumAmount;

    // Parametrized constructor of the class
    public InsurancePolicy(String policyNumber, String policyholderName, LocalDate expiryDate, String coverageType, double premiumAmount)
    {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Creating Getters methods of the class
    public String getPolicyNumber()
    {
        return policyNumber;
    }

    public LocalDate getExpiryDate()
    {
        return expiryDate;
    }

    public String getCoverageType()
    {
        return coverageType;
    }

    @Override
    public String toString()
    {
        return "PolicyNumber " + policyNumber + ", Holder " + policyholderName + ", Expiry " + expiryDate + ", Type " + coverageType + ", Premium " + premiumAmount;
    }

    // Method Equals and HashCode for HashSet usage
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsurancePolicy policy = (InsurancePolicy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(policyNumber);
    }
}