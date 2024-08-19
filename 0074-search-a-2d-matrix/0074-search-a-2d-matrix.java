class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;
        int l=0,r=matrix.length-1,m=0,t;
        while(l<r){
            m=l+(r-l)/2;
            if(target == matrix[m][0]) return true;

            if(target < matrix[m][0]) 
                r=m-1;
            else if(target > matrix[m][0] && target > matrix[m][matrix[m].length-1])
                l=m+1;
            else {
                l=m;
                break;
            }
        }
        t=l;
        l=0;
        r=matrix[m].length-1;
        while(l<=r){
            m=l+(r-l)/2;
            if(target == matrix[t][m]) return true;
            if(target < matrix[t][m])
                r=m-1;
            else
                l=m+1;
        }
        return flag;
    }
}