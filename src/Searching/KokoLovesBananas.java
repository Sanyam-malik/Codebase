package Searching;


/*
 * <metadata>
 *   Name:- Koko Eating Bananas,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/KokoBananas.png">,
 *   Status:- Pending,
 *   URL:- https://learnyard.com,
 *   Date:- 2024-04-09,
 *   Level:- Medium,
 *   Notes:- <iframe width="560" height="315" src="https://www.youtube.com/embed/qyfekrNni90?si=Tj6FkF9Uv5oJMqJX" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>,
 *   Remarks:- LearnYard Problem,
 * </metadata>
 * */
public class KokoLovesBananas {
    public static int minEatingSpeed(int[] piles, int h) {

    }

    public static int hoursRequired(int[] piles, int speed) {
        int hours = 0;
        int start = 0;
        int end = piles.length-1;
        while (start <= end) {
            int remaining = piles[start] - speed;
            if(remaining == 0) {
                start++;
            } else {
                piles[start]  = remaining;
            }
        }
        return hours;
    }

    public static void main(String args[]) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

}
