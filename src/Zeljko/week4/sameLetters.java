package Zeljko.week4;

public class sameLetters {
    public static boolean same(String a,String b){

        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            if(b.contains(a.charAt(i)+"")){
                count++;
            }
        }
        if(count==a.length()){
            return true;
        }else {
            return false;
        }
        }



    public static void main(String[] args) {
        System.out.println(same("abc","acb"));
    }
}
