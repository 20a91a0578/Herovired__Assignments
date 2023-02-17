import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
class MergetwoList {
    public static Node mergeLists(Node list1, Node list2) {
        Node head1 = list1;
        Node head2 = list2;
        Node result=new Node(-2);
        Node k=result;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                result.next=head1;
                result=head1;
                head1 = head1.next;
            } else {
                result.next=head2;
                result=head2;
                head2 = head2.next;
            }
        }
        while (head1 != null) {
            result.next=head1;
            result=head1;
            head1 = head1.next;
        }
        while (head2 != null) {
            result.next=head2;
            result=head2;
            head2 = head2.next;
        }
        return k.next;
    }
      static Node createList(int a[])
    {Node head=null;
        for(int i=0;i<a.length;i++)
        {
            Node j=new Node(a[i]);
            if(head==null)
            head=j;
            else{
                Node ptr=head;
                while(ptr.next!=null)
                {
                    ptr=ptr.next;
                }
                ptr.next=j;
            }
        }
        return head;
    }
    static void printList(Node head)
    {
        Node ptr=head;
        while(ptr.next!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
        System.out.print(ptr.data+"\n");
        System.out.println();
    }
    public static Node sortList(Node head) {
        Node current = head;
        Node index = null;
        int temp;
        if (head == null) {
            return null;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
            return head;
        }
    }
    public static void main(String[] args) {
        Scanner  s=new Scanner(System.in);
        System.out.println("enter length of first list");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter first list data");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        System.out.println("enter length  of second list");
        int m=s.nextInt();
        int b[]=new int[m];
        System.out.println("enter first list data");
        for(int i=0;i<m;i++)
        b[i]=s.nextInt();
        Node head1=createList(a);
        Node head2=createList(b);
        head1=sortList(head1);
        head2=sortList(head2);
        head1=mergeLists(head1,head2);
        System.out.println("\n After merging lists in sorted order: ");
        printList(head1);
        s.close();
    }
}
