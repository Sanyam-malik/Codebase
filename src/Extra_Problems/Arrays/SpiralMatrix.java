package Extra_Problems.Arrays;
import java.util.*;


/*
 * <metadata>
 * <name>Spiral Matrix</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Spiral_Matrix.png"></description>
 * <status>Completed</status>
 * <url>https://leetcode.com/problems/spiral-matrix</url>
 * <date>2024-02-28</date>
 * <level>Easy</level>
 * <notes>Needs A LOT !!!</notes>
 * <remarks>Needs Learning:Needs Practice of Related Problems</remarks>
 * <companies>Jio:OYO:Zoho:Uber:Apple:Adobe:Wipro:Paytm:Cisco:Amazon:Google:Zillow:Oracle:Facebook:LiveRamp:JPMorgan:SAP Labs:Microsoft:Accenture:Cognizant:Salesforce:Browserstack</companies>
 * </metadata>
 * */
public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length - 1;

        while( top<= bottom && left <= right) {
            for (int i= left; i<= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for (int i= right; i>= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right){
                for (int i= bottom; i>= top; i--) {
                    list.add(matrix[i][left]);
                }
                left++;
            }

        }

        return list;
    }

    public static void main(String args[]) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
