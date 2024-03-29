package Recursions;

import java.util.ArrayList;



/*
 * <metadata>
 *   Name:- Pascal Triangle,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/PascalTriangle.png">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/pascal-triangle0652/1,
 *   Date:- 2024-03-30,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Remarks:- Good Question:Solve Using Dynamic Programming,
 *   Companies:- Amazon:Microsoft:Adobe,
 * </metadata>
 * */
public class PascalTriangle {

    public static void printPascal(int n){
    // An auxiliary array to store generated pascal triangle values
        int[][] arr = new int[n][n];

    // Iterate through every line and print integer(s) in it
        for (int line = 0; line < n; line++) {
            // Every line has number of integers equal to line number
            for (int i = 0; i <= line; i++) {
                // First and last values in every row are 1
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else // Other values are sum of values just above and left of above
                    arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
                System.out.print(arr[line][i]);
            }
            System.out.println("");
        }
    }

    ArrayList<Long> nthRowOfPascalTriangle(int n) {

        long mod=(long)Math.pow(10,9)+7;
        ArrayList<Long>ans=new ArrayList<>();

        long dp[]=new long[n];

        dp[0]=1;

        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                dp[j]=(dp[j]+dp[j-1])%mod;
            }
        }

        for(int i=0;i<n;i++)
        {
            ans.add(dp[i]);
        }
        return ans;
    }

    public static void main(String ar[]) {
        printPascal(6);
    }

}
