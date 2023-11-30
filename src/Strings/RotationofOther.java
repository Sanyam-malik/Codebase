package Strings;

/*
 * <metadata>
 *   Status: Completed,
 *   URL: https://www.codingninjas.com/studio/problems/check-if-one-string-is-a-rotation-of-another-string_1115683
 * </metadata>
 * */
public class RotationofOther {

    public static int isCyclicRotation(String p, String q)  {
        int maxK = p.length();
        int minK = 1;

        if(p.equals(q)) {
            return 1;
        }

        for(int i=minK; i<maxK; i++) {
            String seqChanged = p.substring(p.length()-i) + p.substring(0, p.length()-i);
            if(seqChanged.equals(q)) {
                return 1;
            }
        }
        return 0;
    }

    /*public static int isCyclicRotation(String p, String q) {
        if (p.length() != q.length()) {
            return 0; // Lengths are different, not a cyclic rotation
        }

        String doubledP = p + p;
        if (doubledP.contains(q)) {
            return 1; // q is a cyclic rotation of p
        }
    }*/

    public static void main(String[] a) {
        System.out.println(isCyclicRotation("abac", "baca"));
    }
}
