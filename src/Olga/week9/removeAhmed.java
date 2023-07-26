package Olga.week9;

import java.util.ArrayList;

public class removeAhmed {

    public static ArrayList<String> removeStr(ArrayList<String> list, String toRemove){

        ArrayList<String> resultList = new ArrayList<>();

        for(String each : list){
            if(!(each.equals(toRemove))){
                resultList.add(each);
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmed");
        list.add("John");
        list.add("Margareth");

        String str = "Ahmed";

        System.out.println("removeStr(list,str) = " + removeStr(list, str));
    }
}
