// Recursive Way
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        if(head==null || head.next==null ) return head;
        LinkedListNode<Integer> rec = reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return rec;
    }
}

// Iterative Way
public class Solution 
{
    public static LinkedListNode<Integer> reverseLinkedList(LinkedListNode<Integer> head) 
    {
        LinkedListNode<Integer> newHead = null;
        while(head!=null){
            LinkedListNode<Integer> curr = head;
            head = head.next;
            curr.next = newHead;
            newHead = curr;
        }
        return newHead;
    }
}
