package Strings;

/*
 * <metadata>
 * <name>Reverse String</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReverseString.png"></description>
 * <url>https://leetcode.com/problems/reverse-string/description</url>
 * <date>2024-03-05</date>
 * <level>Easy</level>
 * <companies>Apple:Amazon:TCS:Intel:Adobe:Facebook:Microsoft</companies>
 * <notes>Solution - Two pointers with replacing each time</notes>
 * </metadata>
 * */
public class ReverseString {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }

}
