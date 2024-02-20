package KunalHomework;

public class CellOdd {
    public static int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        int[][] temp = new int[m][n];
        for(int r=0; r< indices.length ; r++) {
            int row = indices[r][0];
            int column = indices[r][1];
            for(int columnIterator=0; columnIterator < n; columnIterator++) {
                temp[row][columnIterator] += 1;
            }

            for(int rowIterator=0; rowIterator < m; rowIterator++) {
                temp[rowIterator][column] += 1;
            }
        }

        // Count Condition
        for(int r=0; r< temp.length ; r++) {
            for(int c=0; c< temp[r].length ; c++) {
                if(temp[r][c] % 2 !=0 ) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(2, 3, indices));
    }
}
