class MyLinkedList {
    private class Node{
        int data;
        Node next;
        Node(int val)
        {
            this.data=val;
        }
    }
    Node head;
    int length=0;
    public MyLinkedList() {
        this.head=null;
        this.length=0;
    }
    
    public int get(int index) {
        Node temp=head;
        if(index>=length)
        return -1;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
        length+=1;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        length+=1;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>length)
        {
            return ;
        }
        else if(index==0)
        {
            addAtHead(val);
        }
        else if(index==length)
        {
            addAtTail(val);
        }
        else
        {
            Node newNode=new Node(val);
            Node temp=head;
            for(int i=0;i<index-1;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            length+=1;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= length) return;
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
