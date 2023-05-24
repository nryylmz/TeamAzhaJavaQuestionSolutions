package Week1;

public class oddOrEven {

    public static void main(String[] args) {

        int num = 35 ; // given number

        if(num % 3 == 0){ // if the given number divisible by 3
            System.out.println("odd number"); // then it is an odd number
        } else if (num % 2 == 0) { // if the given number is divisible by 2
            System.out.println("even number"); // then it is an even number
        }else{ // otherwise
            System.out.println("invalid number"); // the given number is invalid.
        }
        System.out.println("================================================================");
        // OR
        int num2 = 26;

        boolean isOdd = num2 % 3  == 0;

        boolean isEven = !isOdd;

        System.out.println(num2+ " is an even number "+ isEven);
        System.out.println(num2+ " is an odd number "+ isOdd);

    }



}


// write a method which can identifies given number is odd or even