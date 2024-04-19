package Arrays;

/*
 * <metadata>
 * <name>Shifting Letters II</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Shifting_Letters_II.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/shifting-letters-ii/description/</url>
 * <date>2024-03-11</date>
 * <level>Medium</level>
 * <notes>Solution 1 - Nested Loops</br></br></notes>
 * <remarks>Needs Algorithm Improvement</remarks>
 * </metadata>
 * */
public class ShiftingLettersII {

    public static String shiftingLettersSol1(String s, int[][] shifts) {
        char[] chArray = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] sArray = s.toCharArray();
        for(int[] shift: shifts){
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];
            for(int i=start; i<= end; i++) {
                int index = Character.getNumericValue(sArray[i]) - Character.getNumericValue('a');
                if(direction==1) {
                    index = (index+1) % chArray.length;
                    sArray[i] = chArray[index];
                } else {
                    index = ((index-1) + chArray.length) % chArray.length;
                    sArray[i] = chArray[index];
                }
            }
        }

        return new String(sArray);
    }

    public static void main(String args[]) {
        int[][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLettersSol1("abc", shifts));
    }
}
