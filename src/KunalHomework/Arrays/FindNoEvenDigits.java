package KunalHomework.Arrays;

/*
 * <metadata>
 *   Name:- Find Numbers with Even Number of Digits,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/find-numbers-with-even-number-of-digits,
 *   Date:- 2024-02-18,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class FindNoEvenDigits {

    public int findNumbers(int[] nums) {
        int result= 0;
        for(int num: nums) {
            int countNo = (int)Math.log10(num)+1;
            result += (countNo%2 == 0 ? 1 : 0);
        }
        return result;
    }

}
