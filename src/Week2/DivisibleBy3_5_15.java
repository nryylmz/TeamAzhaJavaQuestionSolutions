package Week2;

import java.util.ArrayList;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {

        ArrayList<Integer> by15 = new ArrayList<>();
        ArrayList<Integer> by5 = new ArrayList<>();
        ArrayList<Integer> by3 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if( i % 15 == 0){
                by15.add(i);
            }

            if( i % 5 == 0){
                by5.add(i);
            }

            if( i % 3 == 0){
                by3.add(i);
            }
        }

        System.out.println("Divisible By 15: " + by15);
        System.out.println("Divisible By 5: " + by5);
        System.out.println("Divisible By 3: " + by3);

    }

}
