package Strings;


/*
 * <metadata>
 * <name>Count Asterisks</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/CountAsterisks.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/count-asterisks/description/</url>
 * <date>2024-03-06</date>
 * <level>Easy</level>
 * <notes>Hint - After 2 pipe symbol are found start counting astericks</notes>
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
