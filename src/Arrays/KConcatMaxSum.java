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

    public static int kConcatenationMaxSum(int[] arr, int k) {
        int mod = 1000000007;
        long sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum +arr[i];
        }
        if(k==1){
            int num = kadaneAlgo(arr)%mod;
            return num<0? 0:num;
        }
        else if(sum < 0){
            int num = (kadaneofTwo(arr)%mod);
            return num < 0 ? 0: num;
        }
        int sum2 = kadaneofTwo(arr);
        // int sum1 = kadaneAlgo(arr);
        // if(sum2>sum1){
        long newSum = (k-2)*sum;
        return (int)(sum2 + (newSum)%mod)%mod;
        // }
        // return (sum1+ (k-1)*sum)%mod;
    }

    public static int kadaneAlgo(int[] arr){
        int mod = 1000000000+7;
        long sum = 0, maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            maxSum = Math.max(sum, maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        return (int)(maxSum)%mod;
    }

    public static int kadaneofTwo(int[] arr){
        int mod = 1000000000+7;
        int nums[] = new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            nums[i] = arr[i];
        }
        for(int i=0;i<arr.length;i++){
            nums[i+arr.length] = arr[i];
        }
        return (kadaneAlgo(nums)%mod);
    }


    public static void main(String args[]) {
        System.out.println(kConcatenationMaxSum(new int[]{1, -2, 1}, 5));
    }


}
