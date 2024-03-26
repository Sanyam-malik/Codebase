package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * <metadata>
 *   Name:- Unique Number of Occurrences,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9000/codebase/Unique_Number_Occurrences.png">,
 *   URL:- https://leetcode.com/problems/unique-number-of-occurrences,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Notes:- HashMap or Array(26 length) to count Occurences,
 *   Companies:- Adobe:Apple:Amazon:Google:Facebook:Bloomberg,
 * </metadata>
 * */
public class UniqueNoOccurences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> check=new HashSet<>();
        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(check.contains(m.getValue()))
                return false;
            else
                check.add(m.getValue());
        }
        return true;
    }

}
