package Basics;

/*
 * <metadata>
 *   Name:- Add Digits,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8yOS5wbmc=&version_id=null">,
 *   URL:- https://leetcode.com/problems/add-digits,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- Modulus and Divide Technique to Sum the Digits,
 *   Companies:- Bloomberg,
 *   Remarks:- Revised Once,
 * </metadata>
 * */
public class AddDigits {
    public static int addDigits(int num) {
        int sum = num;
        while(sum >= 10) {
            sum = addDigitsHelper(sum);
        }
        return sum;

    }

    public static int addDigitsHelper(int num) {
        int sum = 0;
        while(num > 0) {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(addDigits(38));
    }
}
