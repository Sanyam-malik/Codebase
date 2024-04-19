package Arrays;

/*
 * <metadata>
 * <name>Number of Employees Who Met the Target</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/NoOfEmployees.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/number-of-employees-who-met-the-target</url>
 * <date>2024-02-23</date>
 * <level>Easy</level>
 * <notes>Simple Compare is Enough</notes>
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
