// 和为S的连续正数序列
import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        if(sum < 3) return list;
        int start = 1;
        int end = 2;
        int mid = (sum + 1)/2;
        int addRes = start + end;
        while(start < mid){ // 序列至少有两个数字，一直增加start到(sum+1)/2
            if(addRes == sum){
                ArrayList<Integer> temp=new ArrayList<Integer>();
                for(int i = start; i<=end; i++){
                    temp.add(i);
                }
                list.add(temp);
                addRes -= (start++);
            }else if(addRes < sum){
                addRes += (++end);
            } else {
                addRes -= (start++);
            }
        }
        return list;
      
    }
}