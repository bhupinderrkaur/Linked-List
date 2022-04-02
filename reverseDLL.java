class DLL{
public static Node reverseDLL(Node  head)
{
   Node curr=head;
   while(curr.next!=null)
   curr=curr.next;
   head=curr;
   while(curr!=null){
       Node t=curr.next;
       curr.next=curr.prev;
       curr.prev=t;
       curr=curr.next;
   }

   return head;
}
}
