class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(-95);
        ListNode pt1 = newHead;
        ListNode pt2 = head;
        while(pt2!=null){
            if(pt2.val==pt1.val){
                pt2 = pt2.next;
            }
            else{
                pt1.next = pt2;
                pt2 = pt2.next;
                pt1.next.next = null;
                pt1 = pt1.next;
            }
        }
        return newHead.next;
    }
}