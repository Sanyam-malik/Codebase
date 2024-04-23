package Arrays;
import java.util.*;

/*
 * <metadata>
 * <name>Replace Elements with Greatest Element on Right Side</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/ReplaceElementWithGreatest.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <remarks>Complex To Understand</remarks>
 * <companies>Facebook</companies>
 * <notes>Confusion in Concept is it suffix max? I think it is</notes>
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
