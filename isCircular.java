class LL
{
   boolean isCircular(Node head)
   {
      Node curr=head;
      Node start=head;
      if(head==null) return true;

      while(curr.next!=null){
      if(curr.next==start){
        return true;
      }
      curr=curr.next;
      }
      return false;
   }
}
