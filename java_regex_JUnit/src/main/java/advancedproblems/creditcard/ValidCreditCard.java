package advancedproblems.creditcard;
public class ValidCreditCard {
    public static boolean ValidVisa(String cardNumber) {
        return cardNumber.matches("^4\\d{15}$");
    }
    public static boolean ValidMasterCard(String cardNumber) {
        return cardNumber.matches("^5\\d{15}$");
    }
    public static void main(String[] args) {
        String visaCard = "4123456789012345";       // Valid Visa
        String masterCard = "5123456789012345";     // Valid MasterCard

        System.out.println("Visa Card Valid: " + ValidVisa(visaCard));
        System.out.println("MasterCard Valid: " + ValidMasterCard(masterCard));
    }
}
