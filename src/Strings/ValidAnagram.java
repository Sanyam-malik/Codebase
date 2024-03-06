package Strings;

/*
 * <metadata>
 *   Name:- Valid Anagram,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF80LnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/valid-anagram/description/,
 *   Date:- 2024-03-06,
 *   Level:- Easy,
 *   Companies:- Apple:Amazon:Affirm:Google:Spotify:Facebook:Bloomberg:Microsoft:Goldman Sachs,
 *   Notes:- Solution - Create an array or use a hashmap,
 * </metadata>
 * */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
