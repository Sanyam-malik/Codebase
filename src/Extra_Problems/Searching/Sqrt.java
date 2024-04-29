package Extra_Problems.Searching;


/*
 * <metadata>
 * <name>Sqrt(x) - Revision</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Sqrt.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/sqrtx/</url>
 * <date>2024-04-12</date>
 * <level>Easy</level>
 * <notes>No Notes Needed</notes>
 * <companies>Apple:Adobe:Amazon:Google:LinkedIn:Microsoft:Bloomberg</companies>
 * <remarks>Kunal Kushwaha</remarks>
 * <countinclusion>no</countinclusion>
 * </metadata>
 * */
public class Sqrt {

    public int mySqrt(int x) {
        // For special cases when x is 0 or 1, return x.
        if (x == 0 || x == 1)
            return x;

        // Initialize the search range for the square root.
        int start = 1;
        int end = x;
        int mid = -1;

        // Perform binary search to find the square root of x.
        while (start <= end) {
            // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.
            mid = start + (end - start) / 2;

            // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            else if (mid * mid == x)
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else
                // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }

        // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
        // However, since we might have been using integer division in the calculations,
        // we round down the value of "end" to the nearest integer to get the correct square root.
        return Math.round(end);
    }
}
