// 4 Pointers previous current , future and temp = fut.next inside while loop
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode dummy = new ListNode(-1, head);
        ListNode pre = dummy;
        ListNode cur1 = head;
        ListNode cur2 = head.next;
        
        while(cur2 != null){
            ListNode next = cur2.next;
            cur1.next = next;
            cur2.next = cur1;
            pre.next = cur2;

            //update
            if(next == null){
                break;
            }else{
                pre = cur1;
                cur1 = next;
                cur2 = next.next;
                }
        }
        return dummy.next;
    }
}
