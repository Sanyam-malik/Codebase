package Problem_Of_The_Day;
import java.util.*;
/*
 * <metadata>
 *   Status:- Completed,
 *   Date:- 2023-11-27,
 *   URL:- https://www.codingninjas.com/studio/problems/pretty-json_1112618
 * </metadata>
 * */
public class PrettyJSON {

    public static ArrayList<String> prettyJSON(String str) {
        StringBuilder sb = new StringBuilder();
        int spaces = 0;
        for(char ch: str.toCharArray()) {

            if(ch == '[' || ch == '{') {
                addSpaces(sb, spaces);
                spaces++;
                sb.append(ch);
                addSpaces(sb, spaces);
            }
            else if(ch == ']' || ch == '}') {
                spaces--;
                addSpaces(sb, spaces);
                sb.append(ch);
            } else {
                sb.append(ch);
                if(ch == ',') {
                    addSpaces(sb, spaces);
                }
            }
        }

        String[] strArray = sb.toString().trim().split("\n");
        return new ArrayList<>(Arrays.asList(strArray));
    }

    public static void addSpaces(StringBuilder sb, int spaces) {
        if(spaces > 0) {
            sb.append("\n");
            while (spaces > 0) {
                sb.append("    ");
                spaces--;
            }
        } else {
            sb.append("\n");
        }
    }

    public static void main(String args[]) {
        System.out.println(prettyJSON("[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]"));
    }
}
