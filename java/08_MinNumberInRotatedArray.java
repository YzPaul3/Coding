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