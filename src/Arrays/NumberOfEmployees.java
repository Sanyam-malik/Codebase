package Arrays;

/*
 * <metadata>
 *   Name:- Number of Employees Who Met the Target,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdCBmcm9tIDIwMjQtMDMtMDUgMTktMDQtMzgucG5n&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/number-of-employees-who-met-the-target,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- Simple Compare is Enough,
 * </metadata>
 * */
public class NumberOfEmployees {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum = 0;
        for(int hour: hours) {
            if(hour >= target) {
                sum++;
            }
        }
        return sum;
    }


}
