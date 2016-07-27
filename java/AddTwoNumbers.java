public class Solution {
    public int Add(int num1,int num2) {
        int sum, carry;
        while(num2 != 0){      // 有进位则继续运算
            sum = num1 ^ num2;     // 异或，只相加不进位
            carry = (num1 & num2) << 1;    // 进位，位与运算，然后左移
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}