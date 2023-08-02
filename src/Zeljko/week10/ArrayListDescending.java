package Zeljko.week10;

import java.util.ArrayList;

public class ArrayListDescending {

    public static void sortDescending(ArrayList<Integer> list ){
        int n = list.size();

        for (int i = 0; i < n-1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(list.get(j)<list.get(j+1 )){
                    int temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        sortDescending(numbers);
        System.out.println(numbers);
    }
}
