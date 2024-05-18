package Searching;

import java.util.Arrays;


/*
 * <metadata>
 * <name>Minimum Number of Days to Make m Bouquets</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumDaysWaitBouquets.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/</url>
 * <date>2024-04-23</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/TXAuxeYBTdg?si=NbyWecr6CzExVfM1" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <remarks>:Good Question</remarks>
 * <companies>Google</companies>
 * </metadata>
 * */
public class MinimumDaysWaitBouquets {

    public static int bouquetFormed(int arr[],int day,int conFlower){
        int bouquet=0;
        int n=arr.length;
        int temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=day){
                temp++;
            }else{
                bouquet+=temp/conFlower;
                temp=0;
            }
        }
        bouquet+=temp/conFlower;
        return bouquet;
    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((m*k)>n){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int ele:bloomDay){
            low=Math.min(low,ele);
            high=Math.max(high,ele);
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int bouquet=bouquetFormed(bloomDay,mid,k);
            if(bouquet>=m){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(minDays(new int[]{7,7,7,7,12,7,7}, 3, 2));
    }
}
