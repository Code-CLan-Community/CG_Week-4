package insurancepolicymanagementsystemusingmap;
import java.time.LocalDate;

public class InsurancePolicy2
{
    private String policyNumber;
    private String policyHolderName;
    private LocalDate expiryDate;

    public InsurancePolicy2(String policyNumber, String policyHolderName, LocalDate expiryDate)
    {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber()
    {
        return policyNumber;
    }

    public String getPolicyHolderName()
    {
        return policyHolderName;
    }

    public LocalDate getExpiryDate()
    {
        return expiryDate;
    }

    @Override
    public String toString()
    {
        return "Policy Number is  " + policyNumber + ", Policy Holder Name is " + policyHolderName + ", Expiry Date is  " + expiryDate;
    }
}

