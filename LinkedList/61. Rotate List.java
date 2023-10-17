class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null) return head;
        ListNode later = head;
        int len =getLength(head);
        if(k%len==0 || len<=1 || k<=0) return head;
        k = k%len;
        int breakPoint =  len - k;
        while(breakPoint>1 && head!=null){
            breakPoint--;
            head = head.next;
        }
        ListNode curr = head.next;
        ListNode newHead = curr;
        head.next = null;
        System.out.println(curr.val+" "+len+" "+breakPoint+" "+k);
        while(curr!=null && curr.next!=null){
            curr = curr.next;
        }
        curr.next = later;
        return newHead;
    }
    public int getLength(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}