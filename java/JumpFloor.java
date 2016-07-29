public class Solution {
    public int JumpFloor(int target) {
        if(target == 1) return 1;
        if(target == 2) return 2;
        int res = 0;
        int tarMinusOne = 2;
        int tarMinusTwo = 1;
        for(int i = 3; i <= target; i++){
            res = tarMinusTwo + tarMinusOne;
            tarMinusTwo = tarMinusOne;
            tarMinusOne = res;
        }
        return res;
    }
}