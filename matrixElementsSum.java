int matrixElementsSum(int[][] matrix) {
    int sum =0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[i].length;j++){
            if(matrix[i][j]!=0){
                if(matrix[i][j]==-1){continue;}
                sum+=matrix[i][j];
            } else{
                int n=i+1;
                while(n<matrix.length){
                    if(matrix[i+1][j]==0){break;}
                    matrix[n][j]=-1;
                    n++;
                }
                
                
            }
        }
    } return sum;
}
