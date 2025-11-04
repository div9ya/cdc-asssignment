/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) 
        return head;
        int count=lenList(head);
        k=k%count;
        if(k==0)
        return head;
        ListNode revHead=reverse(head);
        ListNode temp=revHead;
        for(int i=0;i<k-1&&temp!=null;i++)
        {
            temp=temp.next;
        }
        ListNode h1=revHead;
        ListNode h2=temp.next;
        temp.next=null;
        h1=reverse(h1);
        h2=reverse(h2);
        ListNode t=h1;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=h2;
        return h1;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public int lenList(ListNode head)
    {
        int count=0;
        while(head!=null)
        {
            head=head.next;
            count+=1;
        }
        return count;
    }
}
