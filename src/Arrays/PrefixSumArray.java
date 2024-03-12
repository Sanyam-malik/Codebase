package Arrays;



/*
 * <metadata>
 *   Name:- Prefix Max Array,
 *   Description:- Given a array find the max of the ith element,
 *   Status:- Completed,
 *   URL:- https://learnyard.com/,
 *   Date:- 2024-03-12,
 *   Level:- Easy,
 *   Notes:- Store the maximum of i th element with i-1 element,
 *   Remarks:- LearnYard Problem
 * </metadata>
 * */
public class PrefixSumArray {

    public int[] prefixMax(int[] array) {
        int[] result = new int[array.length];
        result[0] = array[0];
        for(int i=1; i<array.length; i++) {
            result[i]=Math.max(array[i], array[i-1]);
        }
        return result;
    }

    public static void main(String args[]) {

    }

}
