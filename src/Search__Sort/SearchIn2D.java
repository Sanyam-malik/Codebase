package Search__Sort;

public class SearchIn2D {

    public static void main(String[] args){
        int[][] array = new int[][]{
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int searchFor = 34;
        System.out.println("Element present: "+search(array, searchFor));
    }

    public static boolean search(int[][] array, int searchFor) {
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                if(array[i][j] == searchFor) {
                    return true;
                }
            }
        }
        return false;
    }
}
