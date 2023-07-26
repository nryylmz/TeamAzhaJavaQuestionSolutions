package fatih.Week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmed {
    /*
    Remove "Ahmed"
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
    Write a java operation to remove all the names named 'Ahmed'
     */

    public static void removeAhmed() {

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names1.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names1);


        List<String> names2 = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        Iterator<String> it = names2.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        System.out.println(names2);

    }
}
