package Problem_Of_The_Day;
import java.util.*;


/*
 * <metadata>
 *   Name:- Find The Nearest Supporter,
 *   Status:- Completed,
 *   URL:- https://www.codingninjas.com/studio/problems/find-the-nearest-supporter_1082335,
 *   Date:- 2023-12-03
 * </metadata>
 * */
public class NearestSupporter {

    /*public static ArrayList<Integer> prevSmall(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.size();i++) {
            int supporter = getSupporter(arr, i);
            list.add(supporter);
        }
        return list;
    }

    static int getSupporter(ArrayList<Integer> arr, int end) {
        int minIndex = end;
        int right = end - 1;
        while(right >= 0) {
            if(arr.get(right) < arr.get(end)) {
                minIndex = right;
                break;
            } else {
                right--;
            }
        }
        return minIndex == end ? -1 : arr.get(minIndex);
    }*/

    public static ArrayList<Integer> prevSmall(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr.get(stack.peek()) >= arr.get(i)) {
                stack.pop();
            }

            int supporterIndex = stack.isEmpty() ? -1 : stack.peek();
            result.add(supporterIndex == -1 ? -1 : arr.get(supporterIndex));

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(prevSmall(new ArrayList<>(List.of(3, 1, 5, 12, 10)), 5));
    }
}
