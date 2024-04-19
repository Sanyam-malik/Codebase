package Basics;

/*
 * <metadata>
 * <name>Prime Number</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Prime_Numbers.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/prime-number2314/1</url>
 * <date>2024-02-15</date>
 * <level>Easy</level>
 * <companies>VMWare:Amazon:SAP Labs</companies>
 * <notes>See this for All Approaches: <a href="https://www.geeksforgeeks.org/java-prime-number-program/">Click Here</a></notes>
 * <remarks>Revised Once</remarks>
 * </metadata>
 * */
public class PrimeNos {

    static int isPrime(int N){
        if(N < 2) return 0;
        for(int i=2; i*i<=N; i++) {
            if((N%i) == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(1));
    }
}
