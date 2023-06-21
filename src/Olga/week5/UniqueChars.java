package Olga.week5;

public class UniqueChars {

    public static String uniqueChars(String str){

        StringBuilder result = new StringBuilder();

        int count;

        for(int i=0; i<str.length();i++){
            count = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count==1) result.append(str.charAt(i));
        }
        str = result.toString();
        return str;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("AABBCCDEF"));
    }
}
