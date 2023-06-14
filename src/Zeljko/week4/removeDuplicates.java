package Zeljko.week4;

public class removeDuplicates {
    public static String removeD(String str){
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
            if(!(result.contains(str.charAt(i)+""))){
                result+=(str.charAt(i)+" ");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeD("AAAALLLLDDD"));
    }
}
