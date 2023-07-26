package Filiz.week04;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String removeDup = "AAABBBCCC"; // ABC
        String result = "";

        for (int i = 0; i < removeDup.length(); i++) {
            if(result.contains(""+removeDup.charAt(i))){ // if the char is already contained in the string
                continue; // skip it
            }
            result += removeDup.charAt(i);

        }
        System.out.println(result);

    }
}


/*
3. Remove Duplicates
Write a return method that can remove the duplicated values from String
  Ex: removeDup("AAABBBCCC") ==> ABC

 */