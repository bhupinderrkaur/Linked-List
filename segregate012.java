class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
         int zero=0,one=0,two=0;
        Node cur=head;
        while(cur!=null)
        {
            if(cur.data==0)
            zero++;
            else if(cur.data==1)
            one++;
            else
            two++;
            cur=cur.next;
        }
        cur=head;
         while(cur!=null)
        {
            if(zero>0)
            {
                cur.data=0;
                zero--;
            }
            else if(one>0)
            {
                cur.data=1;
                one--;
            }
            else if(two>0)
            {
                cur.data=2;
                two--;
            }
            cur=cur.next;
        }
        
        return head;
    }
}
