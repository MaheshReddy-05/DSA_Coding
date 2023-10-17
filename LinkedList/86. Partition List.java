class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode right = new ListNode(-1);
        ListNode it1 = left;
        ListNode it2 = right;

        while(head!=null){
            if(head.val<x){
                it1.next = head;
                head = head.next;
                it1 = it1.next;
                it1.next = null;
            }
            else{
                it2.next = head;
                head = head.next;
                it2 = it2.next;
                it2.next = null;
            }
        }
        if(left==null) return right;
        it1.next = right.next;
        return left.next;
    }
}