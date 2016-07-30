/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix == null || matrix.length == 0) return null;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int start = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int circleCounts = (rows <= cols) ? (rows-1)/2+1 : (cols-1)/2+1;
        while(start < circleCounts){
            for(int i = start; i <= cols-start-1; i++){
                res.add(matrix[start][i]);
            }
            if(start < rows-start-1){
                for(int i = start+1; i <= rows-start-1; i++){
                    res.add(matrix[i][cols-start-1]);
                }
            }
            if((start < cols-start-1) && (start < rows-start-1) ){
                for(int i = cols-start-2; i >= start; i--){
                    res.add(matrix[rows-start-1][i]);
                }  
            }
            if((start < rows-start-2) && (start < cols-start-1)){
                for(int i = rows-start-2; i > start; i--){
                    res.add(matrix[i][start]);
                }  
            }
            start++;
        }
        return res;
    }
}

/*
外部循环边界条件为圈数
内部四个循环边界条件
注意：[1,2,3,4,5,6],
    [[1],[2],[3],[4],[5],[6]],
    [[1,2,3],[4,5,6]]
    几种情况，不然会导致重复打印
*/