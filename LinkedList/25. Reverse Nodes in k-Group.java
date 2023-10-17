class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
      int len = leng(head);
      return helper(head,len,k);
    }
    public int leng(ListNode head){
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public ListNode helper(ListNode head,int left,int k){
        if(left<k) return head;
        ListNode kk = head;
        ListNode dum = head;
        for(int i=0;i<k;i++){
            dum = dum.next;
        }
        dum = helper(dum,left-k,k);

        ListNode tem = null;
        ListNode kl = head;
        int i = 0;
        while(i!=k){
            i++;
            ListNode next = head.next;
            head.next = tem;
            tem = head;
            head = next;
        }
        kl.next = dum;
        return tem;
    }
}