public class TransposeMatrix {
    public static void main(String[] args)
    {

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10,11,12}
        };
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] output = new int[cols][rows]; // transpose matrix r c x c r /

        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                output[i][j] = mat[j][i]; // i j = j i
            }
        }
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }

    }
}
