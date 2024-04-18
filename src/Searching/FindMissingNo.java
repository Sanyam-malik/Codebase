package Searching;
import java.util.*;

/*
 * <metadata>
 *   Name:- Kth Missing Positive Number,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Kth_Missing_Positive_Number.png">,
 *   Status:- Check Where to put,
 *   URL:- https://leetcode.com/problems/kth-missing-positive-number/description/,
 *   Date:- 2024-04-18,
 *   Level:- Easy,
 *   Notes:- 1. Using Brute Force </br> 2. Binary Search</br>,
 *   Companies:- TikTok:Google:Amazon:Facebook:Microsoft,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class FindMissingNo {

    public int findKthPositive_Brute_Force(int[] arr, int k) {
        int i=1;
        int j=0;
        while(k>0){
            if(j<arr.length){
                if(arr[j]>i){
                    k--;
                    i++;
                }
                else if(arr[j]<i){
                    j++;
                }
                else{
                    j++;
                    i++;
                }
            }
            else{
                i++;
                k--;
            }

        }
        return i-1;
    }

    public static int findKthPositive_Binary_Search(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while (start<=end) {
            int mid = start + (end - start)/2;
            int missing_no = arr[mid] - (mid+1);
            if(missing_no < k) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return start+k;
    }

    public static void main(String args[]) {
        System.out.println(findKthPositive_Binary_Search(new int[]{2,3,4,7,11}, 5));
    }

}
