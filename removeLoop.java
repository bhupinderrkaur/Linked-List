
class Solution
{

    public static void removeLoop(Node head){
       
        Node slow=head;
        Node fast=head;
        while(slow.next!=null && fast.next!=null && fast.next.next!=null){
           //meeting point
                slow=slow.next;
                fast=fast.next.next;
            if(slow==fast) break;
        }
        if(slow==head){ //if first node is meeting point
            while(fast.next!=slow)
            fast=fast.next;
            fast.next=null;
        }
        else if(slow==fast){
            slow=head; //make them run towards each other to meet at loop start
            while(slow.next!=fast.next ){ //slow!=fast if u want start point of loop
                fast=fast.next;
                slow=slow.next;
            }
            fast.next=null;
        }
        
    }
}
