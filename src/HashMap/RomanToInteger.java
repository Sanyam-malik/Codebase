package HashMap;

import java.util.HashMap;
import java.util.Map;



/*
 * <metadata>
 * <name>Roman to Integer</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/RomantoInteger.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/roman-to-integer/description/</url>
 * <date>2024-05-19</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>Adobe:Apple:Yahoo:Amazon:Google:TikTok:Facebook:Bloomberg:Microsoft</companies>
 * <notes>Using HashMap</notes>
 * </metadata>
 * */
public class RomanToInteger {

    public static Map<Character, Integer> convertMap = new HashMap<>();

    static  {
        convertMap.put('I', 1);
        convertMap.put('V', 5);
        convertMap.put('X', 10);
        convertMap.put('L', 50);
        convertMap.put('C', 100);
        convertMap.put('D', 500);
        convertMap.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int sum = 0;
        Character prev = null;
        for(Character ch: s.toCharArray()) {
            if (prev != null) {
                int value = convertMap.get(ch);
                if ((prev == 'I' && (ch == 'V' || ch == 'X'))
                        || (prev == 'X' && (ch == 'L' || ch == 'C'))
                        || (prev == 'C' && (ch == 'D' || ch == 'M'))) {
                    sum -= convertMap.get(prev);
                    value = (convertMap.get(ch) - convertMap.get(prev));
                }
                sum += value;
                prev = ch;
            }  else {
                sum += convertMap.get(ch);
                prev = ch;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
