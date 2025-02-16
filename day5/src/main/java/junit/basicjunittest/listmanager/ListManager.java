package junit.basicjunittest.listmanager;

import java.util.List;

public class ListManager {

    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        if (list != null) {
            list.add(element);
        }
    }

    // Method to remove an element from the list
    public boolean removeElement(List<Integer> list, int element) {
        if (list != null) {
            return list.remove(Integer.valueOf(element));
        }
        return false;
    }

    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return (list != null) ? list.size() : 0;
    }
}
