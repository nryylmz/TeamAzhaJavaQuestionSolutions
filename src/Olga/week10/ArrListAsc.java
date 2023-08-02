package Olga.week10;

import java.util.ArrayList;

public class ArrListAsc {

    public static ArrayList<Integer> listOrderAsc(ArrayList<Integer> list){

        for(int j = 0; j<list.size()-1; j++) {
            for (int i = 0; i < list.size() - 1 - j; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(100);

        System.out.println("listOrderAsc(list) = " + listOrderAsc(list));
    }

}
