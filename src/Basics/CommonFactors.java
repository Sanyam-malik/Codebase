package Basics;

/*
 * <metadata>
 * <name>Number of Common Factors</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Common_Factors.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/number-of-common-factors</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>To find common factor we will start with 1 to the minimum element and check their modulus</notes>
 * <remarks>Revised Once</remarks>
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
