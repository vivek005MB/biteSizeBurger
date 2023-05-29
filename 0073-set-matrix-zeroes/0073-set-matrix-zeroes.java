class Solution {
    public void setZeroes(int[][] matrix) {
        // method1(matrix); // T.c ; O(N * M) S.C : O(N + M)
        method2(matrix); // T.c : O(N * M) S.C : O(1)
        
    }
    public void method2(int[][] mat)
    {
        int n = mat.length;
        int m = mat[0].length;
        int r0 = 1;
        for(int i = 0; i < m; i++)
        {
            if(mat[0][i] == 0){
                r0 = 0;
                break;
            }
        }
        for(int i = 1; i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                if(mat[i][j] == 0)
                {
                    // mark 0 at row 0;
                    // mark 0 at col 0;
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
        for(int i = 1; i < n; i++)
        {
            if(mat[i][0] == 0){
                Arrays.fill(mat[i],0);
            }
        }
        for(int i = 0; i<m;i++)
        {
            if(mat[0][i]==0)
            {
                for(int j = 0; j < n; j++)
                {
                    mat[j][i] = 0;
                }
            }
        }
        if(r0 == 0){
            Arrays.fill(mat[0],0);
        }
        
    }
    public void method1(int[][] matrix)
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        
        for(int i = 0; i<n;i++)
        {
            if(row[i] == 1)
                Arrays.fill(matrix[i],0);
        }
        for(int j = 0; j<m; j++)
        {
            if(col[j] == 1)
            {
                for(int i = 0; i<n;i++)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}