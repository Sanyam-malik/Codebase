package Sorting;
import java.util.Arrays;

/*
 * <metadata>
 *   Name:- Minimum Platforms,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/MinimumPlatforms.png">,
 *   Status:- Try Again,
 *   URL:- https://www.geeksforgeeks.org/problems/minimum-platforms-1587115620/1,
 *   Date:- 2024-04-12,
 *   Level:- Medium,
 *   Notes:- Just Sort and while arr[i] <= dept[i] platform++ else platform-- </br> <a href="https://takeuforward.org/data-structure/minimum-number-of-platforms-required-for-a-railway/">Solution Link</a>,
 *   Companies:- Paytm:Amazon:Microsoft:DE Shaw:Hike:Walmart:Adobe:Google:Boomerang Commerce:Zillious:Atlassian,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class MinimumPlatforms {
    static int findPlatform(int arr[], int dep[], int n) {
        Arrays.sort(arr) ;
        Arrays.sort(dep) ;

        int plat = 1, result = 1;
        int i = 1 , j = 0 ;

        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                plat++;
                i++;
            }
            else if(arr[i]>=dep[j]){
                j++;
                plat--;
            }
            if(plat>result){
                result = plat;
            }
        }
        return result;
    }

    public static void main(String args[]) {
        System.out.println(findPlatform(new int[]{900, 1100, 1235}, new int[]{1000, 1200, 1240}, 3));
    }


}
