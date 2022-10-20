class Solution {
    boolean retval=false;
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,columns=matrix[0].length;
        int i=0;
        
        while(!retval && i<rows){
            if(target >= matrix[i][0] && target <= matrix[i][columns-1]){
               retval=  binarySearch(matrix,target,0,columns,i);
            }
            i++;
        }
        return retval;  
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