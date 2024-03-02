package Kunal_Homework.Arrays;
import java.util.*;

/*
 * <metadata>
 *   Name:- Add to Array-Form of Integer,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/add-to-array-form-of-integer,
 *   Date:- 2024-02-21,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class AddToArray {

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=num.length-1; i >= 0; i--) {
            int elem = num[i] + carry;
            if(k > 0) {
                elem = elem+k%10;
                k = k/10;
            }
            carry = elem/10;
            elem = elem%10;
            stack.push(elem);
        }

        while (k!=0) {
            int temp = k%10;
            if (temp+carry>9) {
                stack.push(0);
                carry = 1;
            }
            else {
                stack.push(temp+carry);
                carry=0;
            }
            k/=10;
        }

        if(carry > 0) {
            stack.push(carry);
        }

        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public static void main(String args[]) {
        System.out.println(addToArrayForm(new int[]{1,2,0,0}, 34));
    }


}
