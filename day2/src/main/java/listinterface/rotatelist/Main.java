package listinterface.rotatelist;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        System.out.println("Original List: " + numbers);
        RotateList.rotate(numbers, rotateBy);
        System.out.println("Rotated List: " + numbers);
    }
}
