package Searching;


/*
 * <metadata>
 *   Name:- Koko Eating Bananas,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/KokoBananas.png">,
 *   Status:- Attempted,
 *   URL:- https://learnyard.com,
 *   Date:- 2024-04-09,
 *   Level:- Medium,
 *   Notes:- <iframe width="560" height="315" src="https://www.youtube.com/embed/qyfekrNni90?si=Tj6FkF9Uv5oJMqJX" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Remarks:- LearnYard Problem,
 *   Companies:- Amazon:Google:Airbnb:Facebook:Microsoft,
 * </metadata>
 * */
public class KokoLovesBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = totalSum(piles);
        int ans = h;
        while(start <= end) {
            int mid = start + (end - start)/2;
            int calHours = hoursRequired(piles, mid);
            if(calHours < h) {
                ans = Math.min(ans, calHours);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int totalSum(int[] piles) {
        int totalSum = 0;
        for(int pile: piles) {
            totalSum+=pile;
        }
        return totalSum;
    }

    public static int hoursRequired(int[] piles, int k) {
        int hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours;
    }

    public static void main(String args[]) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

}
