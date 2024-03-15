package Recursions;


/*
 * <metadata>
 *   Name:- Power Of Number,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/power-of-numbers-1587115620/1,
 *   Date:- 2024-03-15,
 *   Level:- Easy,
 * </metadata>
 * */
public class PowerOfN {

    public static int PowerofN(int number, int times) {
        if(times == 0) return 1;
        return number*PowerofN(number, times-1);
    }


    public static void main(String args[]) {
        System.out.println(PowerofN(2, 4));
    }

}
