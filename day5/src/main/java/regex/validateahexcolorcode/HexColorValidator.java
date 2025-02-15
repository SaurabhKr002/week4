package regex.validateahexcolorcode;

public class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        return color.matches("^#([A-Fa-f0-9]{6})$");
    }
}
