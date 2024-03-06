package Strings;

/*
 * <metadata>
 *   Name:- Reverse Only Letters,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF80LnBuZw==&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/reverse-only-letters/description/,
 *   Date:- 2024-03-06,
 *   Level:- Easy,
 *   Companies:- Amazon,
 *   Notes:- Solution 1 - Replace using two pointers</br></br>Solution 2 - Use StringBuilder Effectively,
 * </metadata>
 * */
public class ReverseOnlyLetters {

    public static String reverseOnlyLetters(String s) {
        char[] chArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                sb.append(ch);
            }
        }

        sb.reverse();
        for(int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if(!(ch >= 'A' && ch <= 'Z') && !(ch >= 'a' && ch <= 'z')) {
                sb.insert(i, ch);
            }
        }
        return sb.toString();
    }
    public String reverseOnlyLettersNoSpace(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char c1 = arr[i];
            char c2 = arr[j];
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                //Replacement
                arr[i++] = c2;
                arr[j--] = c1;
            }
            if (!Character.isLetter(c2)) {
                j--;
            }
            if (!Character.isLetter(c1)) {
                i++;
            }
        }

        return new String(arr);

    }

    public static void main(String args[]) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

}