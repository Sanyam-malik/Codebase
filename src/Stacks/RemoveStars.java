package Stacks;

/*
 * <metadata>
 * <name>Removing Stars From a String</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/RemoveStars.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/backspace-string-compare/description/</url>
 * <date>2024-05-20</date>
 * <level>Medium</level>
 * <remarks>Good Question</remarks>
 * <companies>Amazon</companies>
 * <notes>Using the StringBuilder as Stack</notes>
 * </metadata>
 * */
public class RemoveStars {

    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(Character ch: s.toCharArray()) {
            if(ch == '*' && sb.length() - 1 >= 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        System.out.println(removeStars("leet**cod*e"));
    }
}
