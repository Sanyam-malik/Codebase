package Arrays;

/*
 * <metadata>
 * <name>K-Concatenation Maximum Sum</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/KConcat_Maximum_Sum.png"></description>
 * <status>Try Again</status>
 * <url>https://leetcode.com/problems/k-concatenation-maximum-sum/description/</url>
 * <date>2024-03-29</date>
 * <level>Medium</level>
 * <notes>Solve Using Kadane Algorithm <br /> <iframe width="560" height="315" src="https://www.youtube.com/embed/qnoOu5Usb4o?si=8z-wIHSAboWPK6G5" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * </metadata>
 * */
public class KConcatMaxSum {

    public static int mod = (int)(Math.pow(10, 9) + 7);
    public static int kConcatenationMaxSum(int[] arr, int k) {
        // 3 cases to consider:
        // case1: max = max subarray (k == 1)
        // case2: max = max(kaden, maxPrefixSum + maxSuffixSum + (k - 2) * sum) (sum >=0 && k > 1)
        // case3: max = max(kaden, maxPrefixSum + maxSuffixSum) (sum < 0 && k > 1)

        int n = arr.length;
        long sum = 0;
        // calculate sum of whole array
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int kaden = kadenAlg(arr);
        // case1
        // if only 1 array, then answer is the max subarray sum
        if (k == 1) {
            return kaden;
        }
        // calculate max value of prefix sum and max value of suffix sum
        long prefixSum = 0;
        long suffixSum = 0;
        long maxPrefixSum = 0;
        long maxSuffixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum = (prefixSum+ arr[i]) % mod;
            maxPrefixSum = Math.max(maxPrefixSum, prefixSum);
        }
        for (int i = n - 1; i >= 0; i--) {
            suffixSum = (suffixSum + arr[i]) % mod;
            maxSuffixSum = Math.max(maxSuffixSum, suffixSum);
        }

        // case 2:
        if (sum >= 0) {
            return Math.max(kaden, (int)((sum * (k - 2)  + maxSuffixSum + maxPrefixSum) % mod));
        }
        // case 3:
        else {
            return Math.max(kaden, (int)((maxSuffixSum + maxPrefixSum) % mod));
        }
    }
    public static int kadenAlg(int[] arr) {
        long maxSoFar = 0, maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = (maxEndingHere + arr[i]) % mod;
            if (maxEndingHere < 0) maxEndingHere = 0;
            else {
                maxSoFar = Math.max(maxSoFar, maxEndingHere);
            }
        }
        return (int)maxSoFar;
    }


    public static void main(String args[]) {
        System.out.println(kConcatenationMaxSum(new int[]{1, -2, 1}, 5));
    }


}
