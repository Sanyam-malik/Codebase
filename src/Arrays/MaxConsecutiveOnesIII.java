package Arrays;


/*
 * <metadata>
 * <name>Max Consecutive Ones III</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Max_Consecutive_Ones_III.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/max-consecutive-ones-iii/description/</url>
 * <date>2024-03-12</date>
 * <level>Medium</level>
 * <companies>Apple:Google:Amazon:Facebook:Microsoft:ByteDance:Bloomberg</companies>
 * <remarks>Needs Revision of Concept:</remarks>
 * <notes>Use Variable Sliding Window if zero is encountered update the zero count else increase the window size if zero count is greator shrink the size</notes>
 * </metadata>
 * */
public class MaxConsecutiveOnesIII {

    public static int findMaxConsecutiveOnes(int[] nums, int k) {
        int result = 0;
        int zeroCount = 0;
        int left = 0, right = 0;
        while (right < nums.length) {
            if(nums[right] == 0) {
                zeroCount++;
            }

            while(zeroCount > k) {
                if(nums[left]==0) {
                    zeroCount--;
                }
                left++;
            }
            result = Math.max(result, right - left + 1);
            right++;
        }
        return result;
    }

    public int longestOnes(int[] nums, int k) {
        int start = 0, zc = 0;
        int ans = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zc++;
            }
            while (zc > k) {
                if (nums[start] == 0) {
                    zc--;
                }
                start++;
            }
            ans = Math.max(end - start + 1, ans);
        }
        return ans;
    }

    public static void main(String args[]){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums, 2));
    }

}
