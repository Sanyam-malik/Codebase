package Arrays;

/*
 * <metadata>
 *   Name:- Longest Alternating Subarray,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8xOS5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/longest-alternating-subarray/description/,
 *   Date:- 2024-03-08,
 *   Level:- Easy,
 *   Remarks:- Solve Using Dynamic Programming,
 *   Notes:-
 *           Solution 1 Hint - Kadane Algorithm</br></br>
 *           Solution 2 Hint - Using Dp,
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