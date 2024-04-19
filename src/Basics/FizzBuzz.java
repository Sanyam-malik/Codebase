package Basics;

/*
 * <metadata>
 * <name>FizzBuzz</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/FizzBuzz.png"></description>
 * <status>Completed</status>
 * <url>https://www.hackerrank.com/challenges/fizzbuzz/problem</url>
 * <date>2024-02-14</date>
 * <level>Easy</level>
 * <notes>Simple If's Statements</notes>
 * <remarks>Revised Once</remarks>
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
