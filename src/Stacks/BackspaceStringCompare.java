package Stacks;




/*
 * <metadata>
 * <name>Backspace String Compare</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/BackspaceStringCompare.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/backspace-string-compare/description/</url>
 * <date>2024-05-20</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>IBM:Visa:Apple:Google:Amazon:Oracle:tiktok:Facebook:Microsoft:Bloomberg:CodeNation:Booking.com:Goldman Sachs</companies>
 * <notes>Using the StringBuilder as Stack</notes>
 * </metadata>
 * */
public class BackspaceStringCompare {

    public static boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(Character ch : s.toCharArray()) {
            if(ch == '#') {
                if(sb1.length() - 1 >= 0) {
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            } else {
                sb1.append(ch);
            }
        }

        for(Character ch : t.toCharArray()) {
            if(ch == '#') {
                if(sb2.length() - 1 >= 0) {
                    sb2.deleteCharAt(sb2.length()-1);
                }
            } else {
                sb2.append(ch);
            }
        }
        return sb1.compareTo(sb2) == 0;
    }

    public static void main(String args[]) {
        System.out.println(backspaceCompare("ab#c", "ad#c"));
    }
}
