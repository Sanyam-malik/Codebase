package Arrays;


/*
 * <metadata>
 * <name>Sums of i-th row and i-th column</name>
 * <description><img src="http://lordmaximus.duckdns.org:9000/codebase/Sum_of_particular_row_column.png"></description>
 * <status>Completed</status>
 * <url>https://www.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1</url>
 * <date>2024-02-27</date>
 * <level>Easy</level>
 * <notes>Calculate RowSum & ColSum Later Compare them</notes>
 * </metadata>
 * */
public class SumOfRowVSColumn {

    int sumOfRowCol(int n, int m, int a[][]) {
        int temp = Math.min(n, m);
        int rowSum[] = new int[temp];
        int colSum[] = new int[temp];
        int sum = 0;
        for(int i=0; i<temp; i++)
        {
            for(int j=0; j<m; j++)
            {
                sum+=a[i][j];
            }
            rowSum[i] = sum;
            sum = 0;
        }
        sum = 0;
        for(int i=0; i<temp; i++)
        {
            for(int j=0; j<n; j++)
            {
                sum+=a[j][i];
            }
            colSum[i] = sum;
            sum = 0;
        }
        for(int i=0; i<temp; i++)
        {
            if(rowSum[i]!=colSum[i])
            {
                return 0;
            }
        }
        return 1;

    }

}
