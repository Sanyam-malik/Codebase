package Searching;


/*
 * <metadata>
 *   Name:- Koko Eating Bananas,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/KokoBananas.png">,
 *   Status:- Completed,
 *   URL:- https://learnyard.com,
 *   Date:- 2024-04-09,
 *   Level:- Medium,
 *   Notes:- <iframe width="560" height="315" src="https://www.youtube.com/embed/qyfekrNni90?si=Tj6FkF9Uv5oJMqJX" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Remarks:- LearnYard Problem:Good Question,
 *   Companies:- Amazon:Google:Airbnb:Facebook:Microsoft,
 * </metadata>
 * */
public class KokoLovesBananas {

    static long hoursRequired(int[] arr, int k) {
        // 'long' is important, because otherwise
        // 'hoursReq' can overflow
        long hoursReq = 0;
        for(int num : arr) {
            //Ceil is required
            hoursReq += (long) Math.ceil((double) num /k);
        }
        return hoursReq;
    }

    public static int max(int[] piles) {
        int max = Integer.MIN_VALUE;
        for(int pile: piles) {
            max= Math.max(max, pile);
        }
        return max;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = max(piles), ans = -1;
        while(l <= r) {
            int mid = (l + r)/2;
            if(hoursRequired(piles, mid) <= h) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

}
