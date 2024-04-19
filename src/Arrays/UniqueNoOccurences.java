package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * <metadata>
 * <name>Unique Number of Occurrences</name>
 * <status>Completed</status>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Unique_Number_Occurrences.png"></description>
 * <url>https://leetcode.com/problems/unique-number-of-occurrences</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <notes>HashMap or Array(26 length) to count Occurences</notes>
 * <companies>Adobe:Apple:Amazon:Google:Facebook:Bloomberg</companies>
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
