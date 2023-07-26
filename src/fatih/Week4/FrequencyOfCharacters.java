package fatih.Week4;

public class FrequencyOfCharacters {

    /*
        Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static String FrequencyOfChars1(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }

        String result = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            result += nonDup.charAt(j) + "" + count;
        }
        return result;
    }

    public static String FrequencyOfChars2(String str) {
        String result = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            result += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return result;
    }


}
