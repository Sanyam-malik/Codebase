package Basics;

/*
 * <metadata>
 *   Name:- Prime Number,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/prime-number2314,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Companies:- Google:Microsoft
 *   Notes:- No Notes Needed,
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
