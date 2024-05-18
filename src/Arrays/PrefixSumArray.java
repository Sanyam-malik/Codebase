package Arrays;



/*
 * <metadata>
 * <name>Prefix Max Array</name>
 * <description>Given a array find the max of the ith element</description>
 * <status>Completed</status>
 * <url>https://learnyard.com/</url>
 * <date>2024-03-12</date>
 * <level>Easy</level>
 * <notes>Store the maximum of i th element with i-1 element</notes>
 * <remarks></remarks>
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
