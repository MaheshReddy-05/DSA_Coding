class Solution {
    public void reorderList(ListNode head) {
        if(head == null|| head.next ==null) return ;
        ListNode slow = head;
        ListNode fast = head;
        ListNode sloww = null;
        while(fast!=null && fast.next!=null){
            sloww = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode rev = helper(slow);
        if(sloww!=null)  sloww.next = null;
        ListNode newHead = new ListNode(-1);
        ListNode it = newHead;
        while(rev!=null && head!=null){
            it.next = head;
            head = head.next;
            it = it.next;
            it.next = rev;
            rev = rev.next;
            it = it.next;
        }
        while(head!=null){
            it.next = head;
            it = it.next;
            head =head.next;
        }
        print(newHead.next);
        head = newHead.next;
    }
    public ListNode  helper(ListNode head){
        ListNode  temp = null;
        while(head!=null){
            ListNode curr = new ListNode(head.val);
            curr.next = temp;
            temp = curr;
            head = head.next;
        }
        return temp;
    }
    public void print(ListNode head){
        if(head==null) return ;
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}