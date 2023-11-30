package Strings;

/*
 * <metadata>
 *   Status:- InComplete,
 *   URL:- Unknown,
 *   Notes:- Memory Out of bounds
 * </metadata>
 * */
public class NextLargestPalindrome {

    public static String nextLargestPalindrome(String number, int length) {
        boolean isOdd = length%2!=0;

        String value = number.substring(0, !isOdd ? length/2 : length/2+1);
        String valueReverse = new StringBuilder(value).reverse().toString();
        String temp = number.substring(length/2);
        if(isOdd) {
            valueReverse=valueReverse.substring(1, valueReverse.length());
        }

        while(Integer.parseInt(String.valueOf(valueReverse)) <= Integer.parseInt(temp)){
            value = Integer.toString(Integer.parseInt(value)+1);
            valueReverse = new StringBuilder(value).reverse().toString();
            if(isOdd) {
                valueReverse=valueReverse.substring(1);
            }
        }

        return value+valueReverse;
    }

    public static void main(String[] a) {
        String pattern = "43771804044551";
        System.out.println(nextLargestPalindrome(pattern, pattern.length()));
    }
}
