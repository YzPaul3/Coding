//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array, int num1[] , int num2[]) {
        if(array.length < 2 || array == null) return;
        int xorRes = 0;
        for(int i = 0; i<array.length; i++){
            xorRes ^= array[i];
        }
        int bitIndex = findFirstBit(xorRes);
        for(int i = 0; i<array.length; i++){
            if(isBit(array[i], bitIndex)){
                num1[0]^=array[i];
            }else
                num2[0]^=array[i];
        }
    }
    
    public int findFirstBit(int num){
        int bitIndex = 0;
        while( (num&1) == 0 && bitIndex < 32){
            num = num >> 1;
            bitIndex++;
        }
        return bitIndex;
    }
    
    public boolean isBit(int num, int indexBit) {
        num = num >> indexBit;
        return (num & 1) == 1;
    }
}