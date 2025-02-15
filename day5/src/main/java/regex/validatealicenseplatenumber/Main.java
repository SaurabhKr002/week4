package regex.validatealicenseplatenumber;

public class Main {
    public static void main(String[] args) {
        System.out.println(LicensePlateValidator.isValidLicensePlate("AB1234")); // true
        System.out.println(LicensePlateValidator.isValidLicensePlate("1234AB")); // false
        System.out.println(LicensePlateValidator.isValidLicensePlate("AB12345")); // false
    }
}
