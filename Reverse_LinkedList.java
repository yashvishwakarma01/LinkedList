class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    
    {  if(head==null){
        return head;
    }
       Node temp;
       Node currNode=head;
       Node prevNode=null;
       while(currNode!=null){
           Node nextNode=currNode.next;
           
           currNode.next=prevNode;
           prevNode=currNode;
           currNode=nextNode;
       }
       temp=head;
       head.next=null;
       head=prevNode;
       return head;
    }
}
