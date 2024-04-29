package Extra_Problems.Arrays;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Plus One - Revision</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PlusOne.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/plus-one</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <companies>Adobe:Apple:Google:Amazon:Facebook:ByteDance</companies>
 * <notes>Modulus Divide Technique</notes>
 * <countinclusion>no</countinclusion>
 * </metadata>
 * */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        Integer[] revNo = reverseNo(digits);
        int carry = 1;
        int index = 0;
        do {
            int sum = revNo[index] != null ? revNo[index] + carry : carry;
            revNo[index++] = sum % 10;

            if(sum >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
        } while (carry > 0);
        int size = digits.length;
        if(revNo[revNo.length-1] != null) {
            size+= 1;
        }
        int[] result = new int[size];
        int indx = 0;
        for(int i=revNo.length-1; i>=0; i--) {
            if(revNo[i] != null) {
                result[indx++] = revNo[i];
            }
        }

        return result;
    }

    public static Integer[] reverseNo(int[] no){
        Integer[] temp = new Integer[no.length+1];
        int index = 0;
        for(int i=no.length-1; i>=0; i--) {
            temp[index++] = no[i];
        }
        return temp;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(plusOne(new int[]{4, 2, 9})));
    }
}
