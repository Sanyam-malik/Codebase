package LearnYardHomework;

/*
 * <metadata>
 *   Name:- FizzBuzz,
 *   Status:- Completed,
 *   URL:- https://www.hackerrank.com/challenges/fizzbuzz/problem,
 *   Date:- 2024-02-14,
 *   Level:- Easy,
 *   Notes:- No Notes Needed,
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
