package Stacks;

/*
 * <metadata>
 * <name>Make The String Great</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/MakeStringGreat.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/make-the-string-great/description/</url>
 * <date>2024-05-20</date>
 * <level>Easy</level>
 * <remarks>Good Question</remarks>
 * <companies>Adobe:Google</companies>
 * <notes>Using the StringBuilder as Stack</notes>
 * </metadata>
 * */
public class MakeStringGreat {

    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        for(Character ch: s.toCharArray()) {
            Character prev = sb.length() - 1 >= 0 ? sb.charAt(sb.length() - 1) : null;
            if(Character.isUpperCase(ch) && prev != null && Character.toLowerCase(ch) == prev) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else if(Character.isLowerCase(ch) && prev != null && Character.toUpperCase(ch) == prev) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        System.out.println(makeGood("Pp"));
    }

}
