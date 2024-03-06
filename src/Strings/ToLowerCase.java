package Strings;



/*
 * <metadata>
 *   Name:- To Lower Case,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8yLnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/to-lower-case/description/,
 *   Date:- 2024-03-06,
 *   Level:- Easy,
 *   Companies:- Amazon,
 *   Notes:- Solution Hint - Just use ToLowerCase() Function or do same like in code,
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
