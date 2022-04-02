class Solution
{
    //check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node slow=head;
        Node fast=head;
        while(slow.next!=null && fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node curr=slow;
        Node nxt=null;
        Node prev=null;
        while(curr!=null){
            nxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxt;
        }
        fast=head;
        while(prev!=null && fast!=null){
            if(fast.data!=prev.data) return false;
            prev=prev.next;
            fast=fast.next;
        }
        return true;
    }    
}

