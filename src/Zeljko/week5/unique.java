package Zeljko.week5;

public class unique {
    public static void main(String[] args) {
        System.out.println(uniqueChar("AAABBBCCCDEF"));
    }
    public static String uniqueChar(String str){
        String unique ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            int frequency =0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)==ch){
                    frequency++;
                }
            }
            if(frequency==1){
                unique+=ch;
            }

        }
        return unique;


    }
}
