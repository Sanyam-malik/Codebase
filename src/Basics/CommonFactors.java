package LearnYardHomework;

/*
 * <metadata>
 *   Name:- Number of Common Factors,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/number-of-common-factors,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
