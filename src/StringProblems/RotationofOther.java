package StringProblems;

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

    public static void main(String[] a) {
        System.out.println(isCyclicRotation("abac", "baca"));
    }
}
