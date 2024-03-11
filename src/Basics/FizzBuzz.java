package Basics;

/*
 * <metadata>
 *   Name:- FizzBuzz,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8zMy5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://www.hackerrank.com/challenges/fizzbuzz/problem,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- Simple If's Statements,
 *   Remarks:- Revised Once,
 * </metadata>
 * */
public class FizzBuzz {

    static void printFizzBuzz() {
        for(int i=1; i< 100; i++) {
            if(i%3 == 0 && i%5 ==0) {
                System.out.println("FizzBuzz");
            } else if(i%3==0) {
                System.out.println("Fizz");
            } else if(i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]) {
        printFizzBuzz();
    }

}
