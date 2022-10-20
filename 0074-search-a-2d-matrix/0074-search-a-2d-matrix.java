class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,columns=matrix[0].length;
        int i=0;
        if(target < matrix[0][0] || target > matrix[rows-1][columns-1]){
            return false;
        }
        while(i<rows){
            if(target <= matrix[i][columns-1]){
                return binarySearch(matrix,target,0,columns,i);
            }
            i++;
        }
        return false;  
    }
    public boolean binarySearch(int[][] matrix, int target,int start,int end,int row){
        boolean ret=false;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[row][mid]==target){
                ret= true;
                break;
            }
            else if(target < matrix[row][mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ret;
    }
}