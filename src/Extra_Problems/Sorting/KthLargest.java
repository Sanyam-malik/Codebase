package Extra_Problems.Sorting;


/*
 * <metadata>
 * <name>Kth Largest Element in an Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/KLargest.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/kth-largest-element-in-an-array/description/</url>
 * <date>2024-04-12</date>
 * <level>Medium</level>
 * <notes>Use Arrays.sort() or PriorityQueue</notes>
 * <remarks>Solve Using Priority Queue</remarks>
 * <companies>TCS:OYO:Hike:ABCO:eBay:Uber:Cisco:Apple:Optum:Adobe:VMWare:Amazon:Oracle:Paypal:Intuit:Sysvin:Google:tiktok:Expedia:Spotify:Samsung:Infosys:Alibaba:Facebook:Accolite:Snapdeal:LinkedIn:Sprinklr:Travclan:ByteDance:JP Morgan:Accenture:Microsoft:Bloomberg:Salesforce:GreenCloud:Walmart Labs:Pristyn Care:DealShare.in:Silicon Labs:Goldman Sachs:Times Internet:Newgen Software:McKinsey & Company:Hexaware Technologies</companies>
 * </metadata>
 * */
public class KthLargest {

    public static int findKthLargest(int[] nums, int k) {
        int[] maxArray = new int[nums.length];
        for(int i=1; i< maxArray.length; i++) {
            maxArray[i]=Math.max(maxArray[i-1], nums[i]);
        }
        return maxArray[k-1];
    }

    public static void main(String args[]) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
    }
}
