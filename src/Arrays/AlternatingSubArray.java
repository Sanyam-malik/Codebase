package Arrays;

/*
 * <metadata>
 * <name>Longest Alternating Subarray</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/LongestAlternatingSubarray.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/longest-alternating-subarray/description/</url>
 * <date>2024-03-08</date>
 * <level>Easy</level>
 * <remarks>Solve Using Dynamic Programming</remarks>
 * <notes>Solution 1 Hint - Kadane Algorithm</br></br>            Solution 2 Hint - Using Dp</notes>
 * </metadata>
 * */
class AlternatingSubArray {
    public int alternatingSubarray(int[] nums) {
        int ans=0,i=0,temp=0;
        boolean a=false;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i+1]-nums[i] == 1 && !a)
            {
                temp++;
                a=true;
            }
            else if(nums[i+1]-nums[i]== -1 && a)
            {
                temp++;
                a=false;
            }
            else
            {
                ans=Math.max(ans,temp);
                temp=0;
                if(nums[i+1]-nums[i] == 1)
                {
                    temp++;
                    a=true;
                }
                else{
                    a=false;
                }
            }
        }
        ans=Math.max(ans,temp);
        return (ans > 0 ? ans + 1 : -1);
    }
}