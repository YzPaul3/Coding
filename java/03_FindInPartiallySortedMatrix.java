/*
在一个二维数组中，每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
思路：
矩阵是有序的，从左下角来看，向上数字递减，向右数字递增，
因此从左下角开始查找，当要查找数字比左下角数字大时。右移
要查找数字比左下角数字小时，上移
*/
public class Solution {
    public boolean Find(int [][] array,int target) {
        int rows = array.length - 1;
        int cols = array[0].length - 1;
        int i = 0;
        while((rows>=0) && (i<=cols)){
            if(array[rows][i] < target)
                i++;
            else if(array[rows][i] > target)
                rows--;
            else return true;
        }
        return false;  
    }
}