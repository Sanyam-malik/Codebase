package Strings;

/*
 * <metadata>
 *   Name:- Reverse String,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMTQtMjMtNDgucG5n&version_id=null">,
 *   URL:- https://leetcode.com/problems/reverse-string/description,
 *   Date:- 2024-03-05,
 *   Level:- Easy,
 *   Companies:- Apple:Amazon:TCS:Intel:Adobe:Facebook:Microsoft
 *   Notes:- Solution - Two pointers with replacing each time,
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
