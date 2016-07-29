// 经推导，答案为2的(n-1)次方

public class Solution1 {
    public int JumpFloorII(int target) {
        int res = 1;
        while((--target)!=0){
            res *= 2;
        }
        return res;
    }
}

public class Solution2 {
    public int JumpFloorII(int target) {
        return 1 << --target;
    }
}