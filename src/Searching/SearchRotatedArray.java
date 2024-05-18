package Searching;


import java.util.Arrays;

/*
 * <metadata>
 * <name>Search in Rotated Sorted Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/SearchRotatedArray.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/binary-search/description/</url>
 * <date>2024-04-06</date>
 * <level>Medium</level>
 * <notes><iframe width="560" height="315" src="https://www.youtube.com/embed/5qGrJbHhqFs?si=KOS3nkO0xf67nwck" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe> <br /> <iframe width="560" height="315" src="https://www.youtube.com/embed/hywGbVJldj0?si=cK0QrsxoXi5W2s4L" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>TCS:OYO:Hike:Grab:Visa:Paytm:Optum:Paytm:Park+:Cisco:Apple:Eaton:Adobe:Yahoo:Amazon:Intuit:Spinny:PayPal:Redbus:Qualys:InMobi:Practo:Maersk:Airtel:Twitch:Yandex:Zillow:Zulily:Oracle:tiktok:VMware:Google:Nvidia:Splunk:DE Shaw:FactSet:Siemens:PhonePe:Proteum:Expedia:Curefit:Groupon:Samsung:Sigmoid:Nagarro:Alibaba:Tencent:Expedia:Flipkart:Snapdeal:Facebook:Qualcomm:Arcesium:Travclan:JPMorgan:SAP Labs:LinkedIn:Rippling:MindTree:HashedIn:Citicorp:Microsoft:Cognizant:Innovacer:Capgemini:Accenture:ShareChat:Delhivery:Bloomberg:Traveloka:ByteDance:MakeMyTrip:BankBazaar:Freecharge:Freshworks:ServiceNow:Salesforce:Informatica:ION Trading:Prystin Care:ZS Associates:Interics Tech:Goldman Sachs:Times Internet:Morgan Stanley:Disney+ Hotstar:NCR Corporation:Kempston Global:EagleView India:Vimana Aerotech:American Express:Navi Technologies:Walmart Global Tech:Veridic Private Limited</companies>
 * <remarks>:Good Question</remarks>
 * </metadata>
 * */
public class SearchRotatedArray {

    public static int search(int[] arr, int target) {
        /*
         * Problem with using Arrays.sort() is Indexes are not correct we might have to use extra space to check diff b/w original and new index
         * */
        if(arr.length == 0) return -1;
        if(arr.length == 1) return arr[0] == target ? 0 : -1;
        int mid = findMiddle(arr);
        int ans = traditionalSearch(arr, 0, mid-1, target);
        if( ans == -1) {
            ans = traditionalSearch(arr, mid, arr.length-1, target);
        }
        return ans;
    }

    public int smallCodeSearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static int findMiddle(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the mid element is greater than the end element, rotation is to the right
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            // If the mid element is less than the end element, rotation is to the left or the mid element is the rotation point
            else {
                end = mid;
            }
        }
        // At the end of the loop, start and end will converge to the rotation point
        return start;
    }

    public static int traditionalSearch(int[] arr, int start, int end, int target){
        while(start <= end) {
            int mid = start + (end - start) /2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        System.out.println(search(new int[]{1, 3}, 3));
    }
}
