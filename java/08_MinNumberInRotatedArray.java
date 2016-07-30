/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
*/
import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        int start = 0;
        int end = array.length - 1;
        // 如果第一位小于最后一位，则第一位就是最小值
        if (array[start] < array[end]) return array[start];
        // 如果第一位等于最后一位，则顺序遍历，求出最小值
        if (array[start] == array[end]) {
            int min = 0;
            for(int i = 1; i < array.length; i++){
                if(array[i] <= array[min]){
                    min = i;
                }
            }
            return array[min];
        }
        // 如果第一位大于最后一位，用二分查找法
        while(array[start] >= array[end]){
            int mid = (start + end)/2;
            if(end - start == 1) return array[end];
            if(array[mid] >= array[end]){
                start = mid;
            }else if(array[mid] <= array[end]){
                end = mid;
            }
        }
        return array[end];
    }
}