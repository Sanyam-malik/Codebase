package Basics;

/*
 * <metadata>
 *   Name:- Prime Number,
 *   Description:- <img src="http://lordmaximus.duckdns.org:9001/api/v1/buckets/codebase/objects/download?preview=true&prefix=U2NyZWVuc2hvdF8zOS5wbmc=&version_id=null">,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/prime-number2314/1,
 *   Date:- 2024-02-15,
 *   Level:- Easy,
 *   Companies:- VMWare:Amazon:SAP Labs,
 *   Notes:- See this for All Approaches: <a href="https://www.geeksforgeeks.org/java-prime-number-program/"></a>,
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
