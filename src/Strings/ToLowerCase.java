package Strings;



/*
 * <metadata>
 * <name>To Lower Case</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ToLowerCase.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/to-lower-case/description/</url>
 * <date>2024-03-06</date>
 * <level>Easy</level>
 * <companies>Amazon</companies>
 * <notes>Solution Hint - Just use ToLowerCase() Function or do same like in code</notes>
 * </metadata>
 * */
public class ToLowerCase {

    public String toLowerCase(String s) {
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if ('A' <= arr[i] && arr[i] <= 'Z'){
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }
}
