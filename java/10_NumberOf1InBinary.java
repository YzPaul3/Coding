// 用flag(1，10，100，1000，...)和n的每位进行位与，来判断1的个数
public class Solution {
public int  NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while(flag != 0){
            if((n & flag) != 0)
                count++;
            flag = flag << 1;
        }
        return count;   
     }
}