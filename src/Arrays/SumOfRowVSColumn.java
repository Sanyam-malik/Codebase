package Arrays;


/*
 * <metadata>
 *   Name:- Sums of i-th row and i-th column,
 *   Status:- Completed,
 *   URL:- https://www.geeksforgeeks.org/problems/sums-of-i-th-row-and-i-th-column3054/1,
 *   Date:- 2024-02-27,
 *   Level:- Easy,
 *   Notes:- No Notes,
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
