package Arrays;
import java.util.*;

/*
 * <metadata>
 *   Name:- Replace Elements with Greatest Element on Right Side,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMjItNDctNDMucG5n&version_id=null">,
 *   Status:- Completed - Review Again,
 *   URL:- https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Companies:- Facebook,
 *   Notes:- Confusion in Concept is it suffix max? I think it is,
 * </metadata>
 * */
public class ReplaceWithGreater {

    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[] { -1 };
        }

        int[] newArr = new int[arr.length];
        newArr[newArr.length - 1] = -1;
        int max = Integer.MIN_VALUE;
        for (int i = arr.length - 2; i >= 0; i--) {
            int before = arr[i + 1];
            max = Math.max(max, before);
            newArr[i] = max;
        }
        return newArr;
    }

    public static void main(String args[]) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }
}
