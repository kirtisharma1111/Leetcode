class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int minr = 0, maxr = n-1;
        int minc = 0, maxc = n-1;
        int element = 1;
        while(minr<=maxr && minc<=maxc){
            for(int j=minc;j<=maxc;j++){
                matrix[minr][j]=element;
                element++;   
            }
            minr++;
            for(int i=minr;i<=maxr;i++){
                matrix[i][maxc]=element;
                element++;
            }
            maxc--;
            for(int j=maxc;j>=minc;j--){
                matrix[maxr][j]=element;
                element++;
            }
            maxr--;
            for(int i=maxr;i>=minr;i--){
                matrix[i][minc]=element;
                element++;
            }
            minc++;
        }
        return matrix;
    }
}