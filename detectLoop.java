class Solution {
    //Using hashmap
    public static boolean detectLoop(Node head){
        // Add code here
        Map<Node,Integer> map=new HashMap<>();
        while(head!=null){
            
            if(map.get(head) !=null) return true;
            else
            map.put(head,1);
            head=head.next;
        }
        return false;
    }
  //using slow fast pointers

  public static boolean detectLoop(Node head){
        // Add code here
        Node slow, fast;
        slow = fast = head;
    
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
    
            if (fast == slow)
            {
                return true;
            }
        }
        return false;
    }
}
