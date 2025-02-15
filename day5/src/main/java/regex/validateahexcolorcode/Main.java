package regex.validateahexcolorcode;

public class Main {
    public static void main(String []args){
        System.out.println(HexColorValidator.isValidHexColor("#FFA500"));
        System.out.println(HexColorValidator.isValidHexColor("#ff4500"));
        System.out.println(HexColorValidator.isValidHexColor("#123"));
    }
}
