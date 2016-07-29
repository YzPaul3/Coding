// 矩形覆盖，斐波那契
public class Solution {
    public int RectCover(int target) {
        if(target == 1 || target == 2 ) return target;
        int res = 0;
        int resMinusOne = 2;
        int resMinusTwo = 1;
        for( int i = 3; i <= target; i++){
            res = resMinusOne + resMinusTwo;
            resMinusTwo = resMinusOne;
            resMinusOne = res;
        }
        return res;
    }
}