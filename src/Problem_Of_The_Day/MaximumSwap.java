package Problem_Of_The_Day;

/*
 * <metadata>
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/maximum-swap_1262144
 * </metadata>
 * */
public class MaximumSwap {

    public static int maximumSwap(int n){
        int result = n;
        char[] nos = Integer.toString(n).toCharArray();
        int left = 0;
        int right = nos.length-1;
        while(left < right) {
            int val1 = Character.getNumericValue(nos[left]);
            int val2 = Character.getNumericValue(nos[right]);

            result = Math.max(result, swap(nos, left, right));

            if(val1 == val2) {
                left++;
                right--;
            }
            else if(val1 < val2) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    static int swap(char nos[], int left, int right){
        char newch[] = new char[nos.length];
        for(int i=0; i< nos.length;i++) {
            newch[i] = nos[i];
        }

        char temp = newch[left];
        newch[left] = newch[right];
        newch[right] = temp;

        return Integer.parseInt(new String(newch));
    }

    public static void main(String[] a) {
        System.out.println(maximumSwap(21426));
    }
}
