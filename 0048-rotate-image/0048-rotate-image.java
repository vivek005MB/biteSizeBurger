class Solution {
    public void rotate(int[][] matrix) {
        // T.c : O(N * N)
        // S.c : O(1)
        swap(matrix);
        transpose(matrix);
        
    }
    public void transpose(int[][] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n; i++)
        {
            for(int j =i+1; j<n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    public void swap(int[][] arr)
    {
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <j){
            for(int k =0; k<n; k++)
            {
                int temp = arr[i][k];
                arr[i][k] = arr[j][k];
                arr[j][k] = temp;
            }
            i++;
            j--;
        }
    }
}