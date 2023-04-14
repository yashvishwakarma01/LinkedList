class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2!=null){
            return list2;
        }
        if(list2==null && list1!=null){
            return list1;
        }
        if(list1==null && list2==null){
            return null;
        }

        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode head=null;
        ListNode temp3=null;
        int i=0;
        while(temp1!=null && temp2!=null){
            ListNode list=new ListNode();
            if(i==0){
                head=list;
                temp3=head;
            }
            if(temp1.val<=temp2.val){
                list.val=temp1.val;
                temp3.next=list;
                temp3=temp3.next;
                 temp1=temp1.next;
            }else{
                list.val=temp2.val;
                temp3.next=list;
                temp3=temp3.next;
                temp2=temp2.next;
            }     
            i++;
        }
        if(temp1!=null){
            while(temp1!=null){
                ListNode list=new ListNode(temp1.val);
                temp3.next=list;
                temp3=temp3.next;
                temp1=temp1.next;
            }
        }
           if(temp2!=null){
            while(temp2!=null){
                ListNode list=new ListNode(temp2.val);
                temp3.next=list;
                temp3=temp3.next;
                temp2=temp2.next;
            }
        }
        return head;
    }
}
