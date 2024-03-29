package Arrays;

/*
 * <metadata>
 *   Name:- K-Concatenation Maximum Sum,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/KConcat_Maximum_Sum.png">,
 *   Status:- Try Again,
 *   URL:- https://leetcode.com/problems/k-concatenation-maximum-sum/description/,
 *   Date:- 2024-03-29,
 *   Level:- Medium,
 *   Notes:- Solve Using Kadane Algorithm <br /> <iframe width="560" height="315" src="https://www.youtube.com/embed/qnoOu5Usb4o?si=8z-wIHSAboWPK6G5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 * </metadata>
 * */
public class KConcatMaxSum {

    public static int kConcatenationMaxSum(int[] arr, int k) {
        int sum = 0;
        for(int a: arr) {
            if( a > 0){
                sum+=a;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(kConcatenationMaxSum(new int[]{1, -2, 1}, 5));
    }


}
