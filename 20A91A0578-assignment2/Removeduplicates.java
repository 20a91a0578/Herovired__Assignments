import java.util.*;
class Node{
    int data;
    Node next;
    Node(int x){
        this.data=x;
        this.next=null;
    }
}
public class Removeduplicates {
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
    static Node removeDuplicates(Node head){
        Node ptr=head;
        Node pre=ptr;
        ArrayList<Integer> hs=new ArrayList<>();
        while(ptr!=null)
        {
            if(!hs.contains(ptr.data)){
                hs.add(ptr.data);
                pre=ptr;
                ptr=ptr.next;
            }
            else
            {
                pre.next=ptr.next;
                ptr=ptr.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of nodes in linked list");
        int n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter values in linked  list:");
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        Node head=createList(a);
        System.out.println("List Before Removing Duplicates");
        printList(head);
        System.out.println("List After Removing Duplicates:");
        head=removeDuplicates(head);
        printList(head);
s.close();
    }
}
