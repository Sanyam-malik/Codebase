package Strings;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/reverse-the-string_799927
 * </metadata>
 * */
public class ReverseString {

    public static String reverseString(String str) {
        char[] a = str.toCharArray();
        int start = 0;
        int end = a.length - 1;

        while(start<end) {
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return new String(a);
    }

    public static void main(String[] a) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
}
