package Basics;

/*
 * <metadata>
 *   Name:- Number of Common Factors,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Common_Factors.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/number-of-common-factors,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- To find common factor we will start with 1 to the minimum element and check their modulus,
 *   Remarks:- Revised Once,
 * </metadata>
 * */
public class CommonFactors {

    public static int commonFactors(int a, int b) {
        int sum = 0;
        int min = Math.min(a, b);
        for(int i=1; i<=min; i++) {
            if((a%i) == 0 && b%i==0){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(commonFactors(25, 30));
    }

}
