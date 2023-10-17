// Kth Element from last and first is swapped

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null ||head.next==null) return head;
        ListNode beg = null;
        ListNode slowit = new ListNode(-1);
        slowit.next = head;
        ListNode fastit = head;
        boolean check = false;
        while(k!=0){
            k--;
            slowit = slowit.next;
        }
        beg = slowit;
        while(slowit!=null && slowit.next!=null){
            slowit = slowit.next;
            fastit = fastit.next;
        }
        // System.out.println(beg.val+" "+fastit.val);
        int temp = beg.val;
        beg.val = fastit.val;
        fastit.val = temp;
        return head;
    }
}