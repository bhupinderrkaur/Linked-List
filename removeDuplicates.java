class Solution
{
    //unsorted linked list
    public Node removeDuplicates(Node head) 
    {
        HashSet s=new HashSet<>();
        Node curr=head;
        Node prev=null;
        
        if(curr==null)
        return null;
        
        while(curr!=null){
            if(s.contains(curr.data))
            {
                prev.next=curr.next;
            }
            else{
                s.add(curr.data);
                prev=curr;
            }
            curr=curr.next;
    }
    return head;
}
  
  
  //sorted linked list.
    Node removeDuplicates(Node head)
    {
	    Node node=head;
	    if(head==null)return null;
	    while(head.next!=null){
	        if(head.data==head.next.data){
	            head.next=head.next.next;
	        }
	        else head=head.next;
	    }
	    return node;
    }
}
