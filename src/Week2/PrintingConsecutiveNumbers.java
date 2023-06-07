package Week2;

public class PrintingConsecutiveNumbers {
   
public static void secondJavaQa(int n ){

    String result = "";

    for (int i = 1; i < n ; i++) {
        if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
            result += "CodilityTestCoders\n";
        } else if(i % 2 == 0 && i % 3 == 0 ){
            result += "CodilityTest\n";
    }else if(i % 2 == 0 && i % 5 == 0){
            result += "TestCoders\n";
        } else if (i % 2 == 0) {
            result+= "Codility\n";
        } else if (i % 5 == 0 ) {
            result += "Coders\n";
        } else if (i % 3 == 0 ) {
            result += "Test\n";

        }else{
            result += i + "\n";
        }

        System.out.println(result);


    }


}
       
        




    


}
