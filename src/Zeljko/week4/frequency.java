package Zeljko.week4;

public class frequency {
    public static String frequencyOfC(String str){
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(!(result.contains(str.charAt(i)+""))){
                result+=(str.charAt(i)+"")+ count;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfC("AAAAFFFLL"));
    }
}
