package Arrays;

/*
 * <metadata>
 *   Name:- Shifting Letters II,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF83Mi5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/shifting-letters-ii/description/,
 *   Date:- 2024-03-11,
 *   Level:- Medium,
 *   Notes:- Solution 1 - Nested Loops</br></br>,
 *   Remarks:- Needs Algorithm Improvement,
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
