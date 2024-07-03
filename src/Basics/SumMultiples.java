package Basics;

/*
 * <metadata>
 * <name>Sum Multiples</name>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/sum-multiples/description/</url>
 * <date>2024-07-02</date>
 * <level>Easy</level>
 * </metadata>
 * */
public class SumMultiples {

    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i%3==0 || i%5==0 || i%7==0) {
                sum += i;
            }
        }
        return sum;
    }
}
