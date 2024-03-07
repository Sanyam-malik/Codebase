package Strings;


import java.util.HashSet;

/*
 * <metadata>
 *   Name:- Length of the longest substring,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8xNC5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/length-of-the-longest-substring3036/1,
 *   Date:- 2024-03-08,
 *   Level:- Medium,
 *   Companies:- Morgan Stanley:Amazon:Microsoft:Google:Synopsys,
 *   Notes:-
 *           Solution 1 Hint - Naive Approach Two for loops</br></br>
 *           Solution 2 Hint - Variable Sliding Window Using Two Pointers starting left, right = 0; right will be increment each time when a character is encountered which is already present left is then incremented and max is found each time.,
 * </metadata>
 * */
public class LengthOfLongestSubString {

    int longestUniqueSubsttr(String S){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right=0;
        int max = 0;
        while(right < S.length())
        {
            if(!set.contains(S.charAt(right)))
            {
                set.add(S.charAt(right));
                right++;
            }
            else
            {
                max = Math.max(max,set.size());
                set.remove(S.charAt(left));
                left++;
            }
        }
        max = Math.max(max,set.size());
        return max;
    }

}
