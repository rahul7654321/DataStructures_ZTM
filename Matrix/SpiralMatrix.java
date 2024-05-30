public class SpiralMatrix {
    public static void main(String[] args) {

        int[][] mat = new int[3][3];
        int row = 0;
        int col = 0;
        int rows = mat.length;
        int cols = mat[0].length;

        int tot = rows * cols;
        int num = 1;

        while(num <= tot)
        {
            while(col < cols && mat[row][col]==0)
            {
                mat[row][col] = num;
                num++;
                col++;//++ --

            }
            col--; // -+ -- +- ++
            row++;
            while(row < rows && mat[row][col]==0)
            {
                mat[row][col] = num;
                num++;
                row++;

            }
            col--;
            row--;
            while(col >=0 && mat[row][col]==0)
            {
                mat[row][col] = num;
                num++;
                col--;

            }
            col++;
            row--;
            while(row >= 0 && mat[row][col]==0)
            {
                mat[row][col] = num;
                num++;
                row--;

            }
            col++;
            row++;




        }


        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}