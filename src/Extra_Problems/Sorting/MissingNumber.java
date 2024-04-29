package Extra_Problems.Sorting;

/*
 * <metadata>
 * <name>Missing Number - Revision</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MissingNumber.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/missing-number/description/</url>
 * <date>2024-04-16</date>
 * <level>Easy</level>
 * <companies>Adobe:Apple:Amazon:VMware:Nvidia:Facebook:Microsoft:Salesforce</companies>
 * <notes>1. Use Cyclic Sort </br> 2. Use Difference b/w Actual Sum and sum of the elements</notes>
 * <countinclusion>no</countinclusion>
 * </metadata>
 * */
public class MissingNumber {
    public int missingNumberActualSum(int[] nums) {
        int sum = 0;
        int actual = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            actual = actual+i;
        }
        return actual + nums.length - sum;
    }
    public int missingNumberCyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) {
                int correctIndex = nums[i];
                // Swap nums[i] and nums[correctIndex]
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }

        // Find the first index i where nums[i] != i
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

}
