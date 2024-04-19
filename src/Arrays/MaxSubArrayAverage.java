package Arrays;



/*
 * <metadata>
 * <name>Maximum Average Subarray I</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Maximus_Average_Subarray_I.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/maximum-average-subarray-i/description/</url>
 * <date>2024-03-08</date>
 * <level>Easy</level>
 * <companies>Facebook</companies>
 * <notes>Solution 1 Hint - Naive Approach Two for loops</br></br>            Solution 2 Hint - Sliding Window calculate runningSum for first window then reduce the runningSum in other for loop one by one and add next element and calculate tempAverage</notes>
 * </metadata>
 * */
public class MaxSubArrayAverage {

    public static double findMaxAverage(int[] nums, int k) {
        double maxAverage = 0;

        int runningSum = 0;
        for(int i=0; i< k;i++) {
            runningSum+=nums[i];
        }
        maxAverage = (double) runningSum /k;

        for(int i=k; i< nums.length; i++) {
            int removedNo = nums[i-k];
            runningSum-=removedNo;
            runningSum+=nums[i];
            double temp = (double) runningSum /k;
            maxAverage=Math.max(maxAverage, temp);
        }

        return maxAverage;
    }

    public static void main(String args[]) {
        int[] arr = {1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(arr, k));
    }

}
