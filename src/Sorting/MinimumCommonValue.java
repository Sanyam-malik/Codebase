package Sorting;

/*
 * <metadata>
 * <name>Minimum Common Value</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumCommonValue.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/minimum-common-value/</url>
 * <date>2024-04-11</date>
 * <level>Easy</level>
 * <notes>Just Use Two Pointers Approach</notes>
 * <remarks>LearnYard Problem</remarks>
 * <companies>Apple:Microsoft</companies>
 * </metadata>
 * */
public class MinimumCommonValue {

    public int getCommon(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int ptr1 = 0, ptr2 = 0;
        while(ptr1 < len1 && ptr2 < len2){
            if(nums1[ptr1] < nums2[ptr2]){
                ptr1++;
            }else if(nums1[ptr1] > nums2[ptr2]){
                ptr2++;
            }else{
                return nums1[ptr1];
            }
        }
        return -1;
    }

}
