package Searching;

/*
 * <metadata>
 * <name>Peak Index in a Mountain Array</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Peak_Index_Mountain_Array.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/peak-index-in-a-mountain-array/description/</url>
 * <date>2024-04-18</date>
 * <level>Medium</level>
 * <notes>Binary Search <br/><br/> <iframe width="560" height="315" src="https://www.youtube.com/embed/cXxmbemS6XM?si=yxXifkyBBxx0zaYM" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></notes>
 * <companies>TCS:OLA:Uber:Hike:Zeta:Wipro:Byjus:Dunzo:Wipro:Apple:Adobe:Amazon:Google:Walmart:Groupon:Facebook:Accolite:Microsoft:Bloomberg:Goldman Sachs:APT Portfolio:De Shaw India:Proschant India:Josh Technologies</companies>
 * <remarks></remarks>
 * </metadata>
 * */
public class PeakIndexMountainArray {

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String args[]) {
        System.out.println(peakIndexInMountainArray(new int[]{0,10,5,2}));
    }

}
