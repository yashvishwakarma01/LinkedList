class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        Node fast=head;
        Node slow=head;
        if(head==null){
            return false;
        }
        boolean b=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                b=true;
                break;
            }
        }
        
        if(b==true){
            return true;
        }else{
            return false;
        }
    }
}
