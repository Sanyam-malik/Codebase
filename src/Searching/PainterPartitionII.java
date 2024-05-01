package Searching;



/*
 * <metadata>
 * <name>The Painter's Partition Problem-II</name>
 * <status>Needs Revision of Concept</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/PainterPartitionII.png"></description>
 * <url>https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1</url>
 * <date>2024-04-26</date>
 * <level>Hard</level>
 * <companies>Microsoft:Google:CodeNation</companies>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/6A8Oa0XpEwE?si=2PBn0WhAa2JowDqh" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * </metadata>
 * */
public class PainterPartitionII {

    public static long minTime(int[] arr,int n,int k){
        int sum = 0;
        for(int i: arr) {
            sum+=i;
        }
        int start = 1;
        int end = sum;
        long ans = -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            int compute = painters(arr, mid);
            if(compute <= k) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int painters(int[] arr, int middle) {
        int painters = 1;
        int sum = 0;
        for(int i=0; i< arr.length;i++) {
            if(sum + arr[i] <= middle) {
                sum += arr[i];
            } else {
                sum = arr[i];
                if (arr[i] > middle) {
                    return Integer.MAX_VALUE; // Board size exceeds mid, return MAX_VALUE
                }
                painters++;
            }
        }
        return painters;
    }

    public static void main(String[] args) {
        System.out.println(minTime(new int[]{15, 10, 19, 10, 5, 18, 7}, 5, 7));
    }
}
