package Week2;

public class PrimeNumber {
    public static void main(String[] args) {

int max = 100;

        for (int i = 2; i < max; i++) {

            boolean isPrime= true; //we assume true, and we prove the opposite that it is not

            for (int j = 2; j < i ; j++) {   // we start at 2, excluding 0, 1
                if(i % j ==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i + " ");
            }
        }

    }
}

/*
Prime Number
  Prime Number is a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11,..).
  Write a method that can check if a number is prime or not.

 */