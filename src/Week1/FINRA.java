package Week1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class FINRA
{
/*
3. FINRA :
Write a method which prints out the numbers from 1 to 30, but print "FIN" instead of numbers for multiples of 3, "RA" instead of numbers for numbers that are multiples of 5, and a multiple of both 3 and 5 for "FINRA" instead of the number.
 */

    //OPTION 1: USING A FOR LOOP TO ITERATE THROUGH THE NUMBER AND PRINT THEM OUT:
    public static void finra (int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("FINRA ");
            }

            else if(i % 3 == 0)
            {
                System.out.print( "FIN ");
            }
            else if(i % 5 == 0)
            {
                System.out.print("RA ");
            }

            else
                System.out.print(i + " ");
        }
    }

    public static String[] finRA (int n)
    {
        String [] result = new String[n];

        for(int i = 0; i < result.length; i++)
        {
            int j = i+1;
            result [i] = ((j % 3 == 0) && (j % 5 == 0))? "FINRA" : (j % 3 == 0)? "FIN" : (j % 5 == 0)? "RA": String.valueOf(j);
        }
        return result;

    }
public static void main(String[] args)
{
    //OPTION 1: USING A FOR LOOP TO ITERATE THROUGH THE NUMBERS AND PRINT THEM OUT:
    finra(30);

    //OPTION 2: USING AN ARRAY TO STORE THE RESULT AND PRINT IT
    System.out.println();
    System.out.println(Arrays.toString(finRA(30)));
}

}
