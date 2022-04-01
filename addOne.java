class Solution{
 public static Node reverseNode(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null)
        {
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            
        }
        return prev;
    }

    public static Node addOne(Node head) 
    { 
     
        Node prev = null;
        int carry = 1;
        head = reverseNode(head);
        Node curr = head;
        while (curr != null)
        {
            int sum = curr.data + carry; // if sum=10
            curr.data = sum % 10;          // curr.data=0
            carry = sum / 10;             // carry=1

            prev = curr;
            curr = curr.next;
        }
        
        if (carry != 0)
        {
            prev.next = new Node(carry);
            prev = prev.next;
            prev.next = null;
        }
        
        return reverseNode(head);
    }
}
