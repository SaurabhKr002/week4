package listinterface.rotatelist;

import java.util.Collections;
import java.util.List;

public class RotateList {
    public static <T> void rotate(List<T> list, int positions) {
        if (list == null || list.isEmpty() || positions <= 0) {
            return;
        }
        int size = list.size();
        positions = positions % size;
        Collections.rotate(list, -positions);
    }
}
