package Sorting;

import java.util.Arrays;

/*
 * <metadata>
 * <name>Count Inversions</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/CountInversions.png"></description>
 * <status>Needs Revision of Concept</status>
 * <url>https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1</url>
 * <date>2024-04-11</date>
 * <level>Medium</level>
 * <notes>Recursive Variable to store the result and merge sort / quick sort</notes>
 * <remarks>Good Question</remarks>
 * <companies>Flipkart:Amazon:Microsoft:MakeMyTrip:Adobe:BankBazaar:Myntra</companies>
 * </metadata>
 * */
public class CountInversions {
    static long conquer(long arr[],int lo,int mid,int hi){
        long temp[]=new long[hi-lo+1];
        int pos=0;
        int i=lo;
        int j=mid+1;
        long invCount=0;
        while(i<=mid && j<=hi){
            if(arr[i]>arr[j]){
                temp[pos++]=arr[j++];
                invCount+=(mid-i+1);
            }
            else{
                temp[pos++]=arr[i++];
            }
        }

        while(i<=mid){
            temp[pos++]=arr[i++];
        }
        while(j<=hi){
            temp[pos++]=arr[j++];
        }

        for(int k=0,l=lo;k<temp.length;k++,l++){
            arr[l]=temp[k];
        }
        return invCount;
    }
    static long divide(long arr[],int lo,int hi){
        if(lo>=hi){
            return 0;
        }
        int mid=lo+(hi-lo)/2;
        long invCount=divide(arr,lo,mid);
        invCount+=divide(arr,mid+1,hi);
        invCount+=conquer(arr,lo,mid,hi);
        return invCount;
    }
    static long inversionCount(long arr[], long N) {
        // Your Code Here
        return divide(arr,0,(int)N-1);
    }

}
