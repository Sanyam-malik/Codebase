package Strings;


/*
 * <metadata>
 *   Name:- Count Asterisks,
 *   Description:-
        <img src="http://lordmaximus.duckdns.org:9000/codebase/CountAsterisks.png">,
 *   Status:- Completed,
 *   URL:- https://leetcode.com/problems/count-asterisks/description/,
 *   Date:- 2024-03-06,
 *   Level:- Easy,
 *   Notes:- Hint - After 2 pipe symbol are found start counting astericks,
 * </metadata>
 * */
public class CountAsteriks {

    public int countAsterisks(String s) {
        int pipe=0;
        int asterisk=0;
        for(char ch : s.toCharArray()){
            if(ch=='|'){
                pipe++;
            }
            if(pipe%2==0){
                if(ch=='*')
                    asterisk++;
            }
        }
        return asterisk;
    }
}
