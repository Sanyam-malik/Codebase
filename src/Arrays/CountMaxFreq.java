package Arrays;

/*
 * <metadata>
 *   Name:- Count Elements With Maximum Frequency,
 *   Description:- You are given an array nums consisting of positive integers.</br></br>
        Return the total frequencies of elements in nums such that those elements all have the maximum frequency.</br></br>
        The frequency of an element is the number of occurrences of that element in the array.</br></br>
        <img src="http://lordmaximus.duckdns.org:9000/codebase/Count_Max_Freq.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/count-elements-with-maximum-frequency,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- Solution 1 Hint - Have Two Variables max and count and iterate over 2 times?</br></br>
 *      Solution 2 Hint - Maybe Use Extra Space Probably Array or HashMap?,
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
