package Arrays;

/*
 * <metadata>
 *   Name:- Number of Employees Who Met the Target,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/number-of-employees-who-met-the-target,
 *   Date:- 2024-02-23,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
