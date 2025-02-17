package annotations.exercises.suppressuncheckedwarnings;

import java.util.ArrayList;
import java.util.List;

class UncheckedWarning {

    @SuppressWarnings("unchecked") // Suppressing unchecked warnings for raw type usage
    public void addElements() {
        List list = new ArrayList(); // No generics used, causes unchecked warning
        list.add("Saurabh");
        list.add(25);
        list.add(true);

        System.out.println("List contents: " + list);
    }
}
