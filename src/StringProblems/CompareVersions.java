package StringProblems;

/*
 * <metadata>
 *   Status: InComplete,
 *   URL: https://www.codingninjas.com/studio/problems/compare-versions_1062582
 * </metadata>
 * */
public class CompareVersions {
    public static int compareVersions(String a, String b) {
        return hasGreatorVersion(a, b);
    }

    public static int hasGreatorVersion(String a, String b) {
        int length = Math.min(a.length(), b.length());
        for(int i=0; i< length; i++) {
            if(a.charAt(i) == '.' && b.charAt(i) == '.') {
                continue;
            }

            if(Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i))) {
                return 1;
            }
            else if(Character.getNumericValue(b.charAt(i)) > Character.getNumericValue(a.charAt(i))) {
                return -1;
            }
        }

        if(a.length() > b.length()) {
            return 1;
        }
        else if(b.length() > a.length()) {
            return -1;
        }
        return 0;
    }

    /*public static int hasGreatorVersion(String a, String b) {
        int add1 = 0, add2 = 0;
        for(char ch: a.toCharArray()) {
            add1 += Character.getNumericValue(ch);
        }

        for(char ch: b.toCharArray()) {
            add2 += Character.getNumericValue(ch);
        }

        if(add1 > add2) {
            return 1;
        }
        else if(add2 > add1) {
            return -1;
        }
        else {
            if(a.length() > b.length()) {
                return 1;
            }
            else if(b.length() > a.length()) {
                return -1;
            }
            else {
                return 0;
            }
        }
    }*/

    public static void main(String[] a) {
        System.out.println(compareVersions("12.99999", "13"));
    }
}
