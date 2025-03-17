class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;
        //check the 0th row
        for(int j=0;j<n;j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        //check the 0th column
        for(int i=0;i<m;i++){
            if(arr[i][0]==0){
                zeroCol = true;
                break;
            }
        }
        //traverse in the matrix without 0th row and 0th column
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0; //marked(i,0) and (0,j) as 0
                    arr[0][j]=0;
                }
            }
        }
        //traverse the 0th row
        for(int j=1;j<n;j++){
            if(arr[0][j]==0){//set jth col to 0
            for(int i=1;i<m;i++){
                arr[i][j]=0;
            }
            }
        }
        //traverse the 0th col
        for(int i=1;i<m;i++){
            if(arr[i][0]==0){//set ith row to 0
            for(int j=1;j<n;j++){
                arr[i][j]=0;
            }
            }
        }
        if(zeroRow==true){//set 0th row to 0
            for(int j=0;j<n;j++){
                arr[0][j]=0;
            }
        }
        if(zeroCol==true){//set the 0th col to 0
        for(int i=0;i<m;i++){
            arr[i][0]=0;
        }
        }
    }
}