package Olga.week9;

import java.util.ArrayList;

public class removeVal {

    public static ArrayList<Integer> removeVal(ArrayList<Integer> list){

        ArrayList<Integer> result = new ArrayList<>();

        for(Integer each : list){
            if(!(each > 100)){
                result.add(each);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(190);
        list.add(5);

        System.out.println("removeVal(list) = " + removeVal(list));
    }
}
