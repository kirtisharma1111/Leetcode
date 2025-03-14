class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length, n = matrix[0].length;
        int minr = 0, maxr = m-1;
        int minc=0, maxc = n-1;
        while(minr<=maxr && minc<=maxc){
            for(int j = minc;j<=maxc;j++){
                ans.add(matrix[minr][j]);
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            for(int i=minr;i<=maxr;i++){
                ans.add(matrix[i][maxc]);
            }
            maxc--;
            if(minr>maxr || minc>maxc) break;
            for(int j=maxc;j>=minc;j--){
                ans.add(matrix[maxr][j]);
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                ans.add(matrix[i][minc]);
            }
            minc++;
        }
        return ans;
    }
}