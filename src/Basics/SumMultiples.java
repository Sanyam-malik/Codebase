package Basics;

/*
 * <metadata>
 *   Name:- Sum Multiples,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF80Mi5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/sum-multiples,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
 * </metadata>
 * */
public class SumMultiples {
    public static int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(i% 3 == 0 || i% 5 == 0 || i% 7 == 0) sum+=i;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sumOfMultiples(7));
    }
}
