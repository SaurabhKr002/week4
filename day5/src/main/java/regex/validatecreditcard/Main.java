package regex.validatecreditcard;

public class Main {
    public static void main(String[] args) {
        String[] testCards = {
                "4123456789012345",  // Valid Visa
                "5123456789012345",  // Valid MasterCard
                "6123456789012345",  // Invalid (Does not start with 4 or 5)
                "412345678901234",   // Invalid (Only 15 digits)
                "51234567890123456", // Invalid (17 digits)
                "4222222222222222",  // Valid Visa
                "5423232323232323"   // Valid MasterCard
        };

        for (String card : testCards) {
            System.out.println(card + " --> " + CreditCardValidator.validateCreditCard(card));
        }
    }
}
