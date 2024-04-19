package Basics;

/*
 * <metadata>
 * <name>Sum Multiples</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Sum_Multiples.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/sum-multiples</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class SumMultiples {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i% 3 == 0 || i% 5 == 0 || i% 7 == 0) sum+=i;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumOfMultiples(7));
    }
}
