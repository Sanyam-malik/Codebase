package StringProblems;

import java.util.*;

/*
 * <metadata>
 *   Status: InComplete,
 *   URL: https://www.codingninjas.com/studio/problems/find-k-th-character-of-decrypted-string_630508,
 *   Notes: Memory out of bounds
 * </metadata>
 * */
public class FindKthChar {

    public static char kThCharaterOfDecryptedString(String s, Long k) {
        String decryptedStr = decryptString(s);
        char[] chArray = decryptedStr.toCharArray();
        int index = ((k.intValue()-1) % chArray.length);
        return chArray[index];
    }

    public static String decryptString(String s) {
        StringBuilder sb = new StringBuilder();

        String f = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int repeatCount = 0;

                if(i+1 < s.length() && Character.isDigit(s.charAt(i+1))) {
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        repeatCount = repeatCount * 10 + Character.getNumericValue(s.charAt(i));
                        i++;
                    }

                    if (repeatCount > 9) {
                        i--;
                    }
                } else {
                    repeatCount = Character.getNumericValue(s.charAt(i));
                }

                // If repeatCount is 0, append the current character once
                for(int j=1; j<= repeatCount; j++) {
                    sb.append(f);
                }

                f = "";
            } else {
                f += ch;
            }
        }

        return sb.toString();
    }

    public static void main(String[] a) {
        System.out.println(kThCharaterOfDecryptedString("a2b3cd3", 8L));
    }
}
