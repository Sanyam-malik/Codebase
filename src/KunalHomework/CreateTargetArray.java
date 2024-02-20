package KunalHomework;

import java.util.Arrays;

public class CreateTargetArray {


    public static int[] createTargetArray(int[] nums, int[] indexes) {
        for(int i=0; i< nums.length; i++) {
            if(nums[i] != indexes[i]) {
                int oldElem = nums[indexes[i]];
                int currentElem = nums[i];
                if(nums[i] > indexes[i]) {
                    int k = indexes[i];
                    while(k < i) {
                        nums[k+1] = nums[k];
                        k++;
                    }

                }
                nums[indexes[i]] = currentElem;
                System.out.println(Arrays.toString(nums));
            } else {
                continue;
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        int[] nums = {0,1,2,3,4};
        int[] indexes = {0,1,2,2,1};
        createTargetArray(nums, indexes);
        //System.out.println(Arrays.toString(nums));
    }

}
