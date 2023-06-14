package Olga_week4;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static Set removeDuplicates(String str){

        Set<Character> set = new HashSet<>();

        for(char each : str.toCharArray()){
            set.add(each);
        }
        return set;
    }

    public static void main(String[] args) {
        System.out.println("removeDuplicates(\"aaannnaj\") = " + removeDuplicates("aaannnaj"));
    }
}
