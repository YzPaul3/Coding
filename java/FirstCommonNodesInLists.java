/*
输入两个链表，找出它们的第一个公共结点。
*/
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int len1 = getListLength(pHead1);
        int len2 = getListLength(pHead2);
        if(len1 == 0 || len2 == 0) return null;
        if(len1 > len2){
            int dif = len1 - len2;
            while(dif!=0){
                pHead1 = pHead1.next;
                dif--;
            }
        } else {
            int dif = len2 - len1;
            while(dif!=0){
                pHead2 = pHead2.next;
                dif--;
            }
        }
        while( pHead1 != null ){
            if(pHead1 == pHead2) return pHead1;
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return null;
        
    }
    
    
    public int getListLength(ListNode phead) {
        if(phead == null) return 0;
        ListNode pNode = phead;
        int len = 1;
        while(pNode != null){
            pNode = pNode.next;
            len++;
        }
        return len;
    }
}