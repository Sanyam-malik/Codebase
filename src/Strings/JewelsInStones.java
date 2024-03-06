package Strings;


/*
 * <metadata>
 *   Name:- Jewels and Stones,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8zLnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/jewels-and-stones/description/,
 *   Date:- 2024-03-06,
 *   Level:- Easy,
 *   Companies:- Amazon:Adobe:Google,
 *   Notes:- Hint - String to charArray and iterate over,
 * </metadata>
 * */
public class JewelsInStones {

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();

        for(char c: stonesArray) {
            for(char j: jewelsArray) {
                if(c==j) count++;
            }
        }

        return count;

    }
}
