package Strings;

import java.util.Stack;

/*
 * <metadata>
 *   Status:- InComplete,
 *   URL:- https://www.codingninjas.com/studio/problems/multiply-strings_982763,
 *   Notes:- Memory Out of bounds
 * </metadata>
 * */
public class MultiplyStrings {

    public static String multiplyStrings(String a, String b) {
        String[] s = new String[b.length()];
        for(int i=0; i<b.length(); i++) {
            int no = Character.getNumericValue(b.charAt(i));
            int savingIndex = b.length()-i-1;
            s[savingIndex] = multiplyNo(a, no, savingIndex);
        }

        String additionString = "";
        for(String str : s) {
            additionString = addition(additionString, str);
        }

        if(isAllZeroes(additionString)) {
            return "0";
        }

        return additionString;

    }

    public static boolean isAllZeroes(String input) {
        for(char ch: input.toCharArray()) {
            if(Character.getNumericValue(ch)!=0) {
                return false;
            }
        }
        return true;
    }

    public static String addition(String a, String b) {

        if(a.isEmpty()) {
            return b;
        }

        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        int j=b.length()-1;
        for(int i=a.length()-1 ; i>=0 ; i--) {
            int v1 = Character.getNumericValue(a.charAt(i));
            int v2 = Character.getNumericValue(b.charAt(j));
            int temp = v1+v2+carry;
            carry = temp/10;
            stack.push(temp%10);
            j--;
        }

        while(j>=0){
            stack.push(Character.getNumericValue(b.charAt(j)+carry));
            j--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static String multiplyNo(String a, int b, int precedingZeroes) {
        int carry = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=a.length()-1; i>= 0; i--) {
            int no = Character.getNumericValue(a.charAt(i));
            int temp = (no*b)+carry;
            carry = temp/10;

            if(i!=0) {
                stack.push(temp % 10);
            } else {
                stack.push(temp);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        while(precedingZeroes > 0) {
            sb.append("0");
            precedingZeroes--;
        }
        return sb.toString();
    }

    public static void main(String[] a) {
        System.out.println(multiplyStrings("45", "15"));
    }
}
