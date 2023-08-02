package Loredana.week9;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveAhmed
{
    public static ArrayList<String> removeName(ArrayList<String> arr, String name) {
        arr.removeIf(p -> p.equals(name)); //remove all name occurrences from the list

        return arr;
    }

    public static void main(String[] args)
    {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ahmed");
        arrayList.add("John");
        arrayList.add("Eric");
        arrayList.add("Ahmed");
        arrayList.add("Thomas");
        arrayList.add("Daniel");
        arrayList.add("Ahmed");
        arrayList.add("Daniela");

        String nameToBeRemoved = "Ahmed";
        System.out.println(removeName(arrayList, nameToBeRemoved));

    }

    /*
    ArrayList - Remove "Ahmed"
  Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....'
  Write a java operation to remove all the names named 'Ahmed'
     */
}
