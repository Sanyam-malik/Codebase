package Arrays;


public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevCount = 0;
        int count = 0;
        for(int i=0; i< nums.length; i++) {
            if(nums[i] == 0) {
                prevCount = Math.max(prevCount, count);
                count = 0;
            } else {
                count++;
            }
        }
        prevCount = Math.max(prevCount, count);
        return prevCount;

    }
}
