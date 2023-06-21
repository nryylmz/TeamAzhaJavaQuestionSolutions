package fatih.Week3;

public class PrimeNumber {

    public static boolean isPrimeNumber(int num) {

        if (num <= 1) {
            return false;
        }

        //for (int i = 2; i < num; i++) { //10000
        //for (int i = 2; i < num / 2; i++) { // 5000
        for (int i = 2; i < Math.sqrt(num); i++) { // 100
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

}

