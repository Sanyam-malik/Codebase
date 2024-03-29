package Recursions;

import java.util.HashMap;
import java.util.Map;



/*
 * <metadata>
 *   Name:- Fibonacci Number,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/FibonacciNo.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/fibonacci-number/description/,
 *   Date:- 2024-03-29,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 *   Companies:- Zoom:Adobe:Apple:Amazon:Oracle:Google:Facebook:Microsoft:Goldman Sachs,
 * </metadata>
 * */
public class FibonacciNo {

    private static Map<Integer, Integer> cache = new HashMap<>();

    public static int fib(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        if (!cache.containsKey(n-1)) {
            cache.put(n-1, fib(n-1));
        }


        if (!cache.containsKey(n-2)) {
            cache.put(n-2, fib(n-2));
        }

        return cache.get(n-2) + cache.get(n-1);
    }

    public static void main(String args[]) {
        System.out.println(fib(6));
    }
}
