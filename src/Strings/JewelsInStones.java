package Strings;


/*
 * <metadata>
 * <name>Jewels and Stones</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/JewelsAndStones.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/jewels-and-stones/description/</url>
 * <date>2024-03-06</date>
 * <level>Easy</level>
 * <companies>Amazon:Adobe:Google</companies>
 * <notes>Hint - String to charArray and iterate over</notes>
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
