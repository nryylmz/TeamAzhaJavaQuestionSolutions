package Marsela2.week3;

public class RemoveDuplicates {


    public static void main(String[] args) {
        
        
        String removeDup = "AAAABBBBCCCCDDDDDEEEEGGGGGG";

        String result = "";

        for (int i = 0; i < removeDup.length(); i++) {


            if(result.contains("" + removeDup.charAt(i) )){
                continue; //if character is already contained in new string, skip it
            }
            result += removeDup.charAt(i);

        }
        System.out.println(result);
    }

}

/*
Remove Duplicates
Write a return method that can remove the duplicated values from String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */