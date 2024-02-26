package Arrays;

/*
 * <metadata>
 *   Name:- Count Elements With Maximum Frequency,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/count-elements-with-maximum-frequency,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class CountMaxFreq {

    public static int maxFrequencyElements(int[] nums) {
        int[] maxFreq = new int[101];
        for(int i : nums) {
            maxFreq[i]++;
        }

        int max = 0;
        for(int i: maxFreq) {
            max = Math.max(max, i);
        }

        int count = 0;
        for(int i: maxFreq) {
            if(i == max) count+=i;
        }

        return count;
    }

    public static void main(String args[]) {
        System.out.println(maxFrequencyElements(new int[]{15}));
    }
}
