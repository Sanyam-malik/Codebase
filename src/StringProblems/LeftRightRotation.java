package StringProblems;

public class LeftRightRotation {
    public static String leftRotate(String str, int d) {
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
        System.out.println(leftRotate("nzodtgieiqsaektkmuwonkqbpezjpeqtxqgdckbekxgvvsntlglomptotdjabqggbagtshnormgtvqnbnqbmyfxgjzlpggfvvyym", 1));
        System.out.println(rightRotate("nzodtgieiqsaektkmuwonkqbpezjpeqtxqgdckbekxgvvsntlglomptotdjabqggbagtshnormgtvqnbnqbmyfxgjzlpggfvvyym", 1));
    }
}
