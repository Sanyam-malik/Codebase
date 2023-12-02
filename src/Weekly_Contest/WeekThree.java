package Weekly_Contest;

public class WeekThree {

    static int goodSpell(int n, String s) {
        // Write your code here.
        char[] ch = s.toCharArray();
        int firstP = 1, secondP = 1;
        int mid = n/2;

        for(int i=0; i<mid;i++) {
            firstP = firstP*Character.getNumericValue(ch[i]);
        }

        for(int i=mid; i<n;i++) {
            secondP = secondP*Character.getNumericValue(ch[i]);
        }

        if(firstP == secondP) {
            return 1;
        } else {
            return 0;
        }

    }

    static int countMoves(int n, int []a) {
        int[] counts = updateCounts(n, a);
        int oddCount = counts[0];
        int divCount = counts[1];
        if(oddCount == divCount) {
            return Math.min(n-oddCount, getDivisibleMoves(a));
        }
        else if(oddCount > divCount) {
            // It will be this because to make a even no to odd you need to just add one
            return n-oddCount;
        } else {
            // For this calculate nearest divisible of 3 to the no and add their difference
            return getDivisibleMoves(a);
        }
    }

    static int closestInteger(int a, int b) {
        int c2 = (a + b) - (a % b);
        return c2;
    }


    static int getDivisibleMoves(int a[]) {
        int moves = 0;
        for(int i=0; i< a.length; i++) {
            if(a[i]%3!=0) {
                int temp = closestInteger(a[i], 3);
                moves+= temp-a[i];
            }
        }
        return moves;
    }

    private static int[] updateCounts(int n, int[] a) {
        int oddCount = 0;
        int divisibleCount = 0;
        int left = 0;
        int right = n -1;
        while(left<=right) {
            if(left != right) {
                int leftelem = a[left];
                int rightelem = a[right];
                if (leftelem % 2 != 0 && rightelem % 2 != 0) {
                    oddCount += 2;
                } else if (leftelem % 2 != 0 || rightelem % 2 != 0) {
                    oddCount += 1;
                }

                if (leftelem % 3 == 0 && rightelem % 3 == 0) {
                    divisibleCount += 2;
                } else if (leftelem % 3 == 0 || rightelem % 3 == 0) {
                    divisibleCount += 1;
                }
            } else {
                int elem = a[left];
                if (elem % 2 != 0) {
                    oddCount += 1;
                }
                if (elem % 3 == 0) {
                    divisibleCount += 1;
                }
            }
            left++;
            right--;
        }
        return new int[]{oddCount, divisibleCount};
    }

    public static void main(String[] args) {
        System.out.println(countMoves(4, new int[]{11, 6, 2, 4}));
    }
}
