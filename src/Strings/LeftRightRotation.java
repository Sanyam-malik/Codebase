package Strings;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/left-and-right-rotation-of-a-string_840707
 * </metadata>
 * */
public class LeftRightRotation {
    public static String leftRotate(String str, int d) {
        if(d > str.length()) {
            d = d%str.length();
        }
        StringBuilder sb= new StringBuilder();
        char[] chArray = str.toCharArray();
        for(int i=d; i< chArray.length; i++) {
            sb.append(chArray[i]);
        }

        for(int i=0; i <=d-1;i++) {
            sb.append(chArray[i]);
        }
        return sb.toString();
    }

    public static String rightRotate(String str, int d) {
        if(d > str.length()) {
            d = d%str.length();
        }
        StringBuilder sb= new StringBuilder();
        char[] chArray = str.toCharArray();
        for(int i=chArray.length-d; i < chArray.length;i++) {
            sb.append(chArray[i]);
        }
        for(int i=0; i< chArray.length-d; i++) {
            sb.append(chArray[i]);
        }
        return sb.toString();
    }



    public static void main(String[] a) {
        System.out.println(leftRotate("c", 10));
        System.out.println(rightRotate("c", 10));
    }
}
