package Problem_Of_The_Day;

import java.util.*;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/find-all-anagrams_975387,
 *   Date:- 2023-11-29
 * </metadata>
 * */
public class FindAllAnagrams {

    /*public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m){
        ArrayList<Integer> result = new ArrayList<>();
        // Write your code here.
        Map<Character, Integer> hashmap1 = new HashMap<Character, Integer>();
        for(char ch: ptr.toCharArray()) {
            hashmap1.put(ch, hashmap1.getOrDefault(ch, 0)+1);
        }

        if(n >= m) {
            int left = 0;
            int right = m - 1;

            while(left <= right && right < n) {
                Map<Character, Integer> hashmap2 = new HashMap<>();
                for(int i=left; i<= right; i++) {
                    hashmap2.put(str.charAt(i), hashmap2.getOrDefault(str.charAt(i), 0)+1);
                }

                boolean isAnagram = true;
                for(Map.Entry<Character, Integer> entry: hashmap1.entrySet()) {
                    if(hashmap2.get(entry.getKey()) != entry.getValue()) {
                        isAnagram = false;
                    }
                }

                if(isAnagram) {
                    result.add(left);
                }

                left++;
                right++;
            }

        }
        return result;
    }*/

    public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m){
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(m>n) return ans;

        for(int i=0;i<=n-m;i++){
            if(isAnagram(str.substring(i,i+m),ptr)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static boolean isAnagram(String str1,String str2){
        int[] hash=new int[26];
        for(int i=0;i<str1.length();i++){
            hash[str1.charAt(i)-'A']+=1;
            hash[str2.charAt(i)-'A']-=1;
        }
        for(int count : hash){
            if(count!=0) return false;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(findAnagramsIndices("ABABABA", 7, "A", 1));
    }
}
