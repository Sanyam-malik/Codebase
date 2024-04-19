package Arrays;



/*
 * <metadata>
 * <name>Next Permutation</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Next_Permutation.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/next-permutation/description/</url>
 * <date>2024-03-15</date>
 * <level>Medium</level>
 * <companies>Amazon:Microsoft</companies>
 * <notes>Solution 1: Find the breaking point    </br><img src="https://assets.leetcode.com/users/images/ec3b008b-3542-429e-aefe-07d870e88e5d_1682940260.9485922.png"></br>    </br>Swap the breaking point index value with the index that is just greator than the breaking point value    </br>Reverse the array from breaking part</br></notes>
 * <remarks>LearnYard Problem:Good Question:Needs Revision of Concept</remarks>
 * </metadata>
 * */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point
        if(ind1==-1){
            reverse(nums,0);
        }

        else{
            // step 2 find next greater element and swap with ind2
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]>nums[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(nums,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(nums,ind1+1);
        }
    }
    void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int[] nums,int start){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}
