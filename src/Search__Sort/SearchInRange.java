import java.util.Arrays;

public class SearchInRange {

    public static void main(String[] args){
        int searchFor = -7;
        int startIndex = 1;
        int endIndex = 4;
        int[] array = new int[]{18, 12, -7, 3, 14, 28};
        System.out.println("Is '"+searchFor+"' present in "+ Arrays.toString(array) +" : "+search(array, searchFor, startIndex, endIndex));
    }

    public static boolean search(int[] array, int searchFor, int startIndex, int endIndex) {
        for(int i=startIndex; i<=endIndex;i++) {
            if(array[i]==searchFor) {
                return true;
            }
        }
        return false;
    }
}
