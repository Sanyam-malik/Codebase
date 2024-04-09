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
        int start = mininum(piles);
        int end = totalSum(piles);
        while(start <= end) {
            int mid = start + (end - start)/2;
            int calHours = hoursRequired(piles, mid);
            if(calHours == h) {
                return mid;
            } else if(calHours < h) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int totalSum(int[] piles) {
        int totalSum = 0;
        for(int pile: piles) {
            totalSum+=pile;
        }
        return totalSum;
    }

    public static int mininum(int[] piles) {
        int min = Integer.MAX_VALUE;
        for(int pile: piles) {
            min = Math.min(pile, min);
        }
        return min;
    }

    public static int hoursRequired(int[] piles, int speed) {
        int hours = 0;
        int start = 0;
        int end = piles.length-1;
        while (start <= end) {
            int remaining = piles[start] - speed;
            if(remaining <= 0) {
                start++;
            } else {
                piles[start]  = remaining;
            }
            hours++;
        }
        return hours;
    }

    public static void main(String args[]) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

}
