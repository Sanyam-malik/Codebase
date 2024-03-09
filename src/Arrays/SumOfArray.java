package Arrays;

/*
 * <metadata>
 *   Name:- Sum of Array,
 *   Status:- Completed,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8yNC5wbmc=&version_id=null">,
 *   URL:- https://www.geeksforgeeks.org/problems/sum-of-array2326/1,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- Regular Loop,
 * </metadata>
 * */
public class SumOfArray {

    int sum(int arr[], int n) {
        int sum = 0;
        for(int i: arr) {
            sum+=i;
        }

        return sum;
    }

}
