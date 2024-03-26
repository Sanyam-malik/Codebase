package Arrays;

import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Plus One,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/PlusOne.png">,
 *   URL:- https://leetcode.com/problems/plus-one,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Companies:- Adobe:Apple:Google:Amazon:Facebook:ByteDance,
 *   Notes:- To Add One We have to reverse the no add the 1 to reversed no first digit if it exceeds 9 then add 1 to second digit and so on.,
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
