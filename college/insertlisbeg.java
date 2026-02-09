import java.util.Scanner;
public class insertlisbeg {
    public static ListNode insertAtBeginning(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if(head==null){
            newNode.next=head;
            return newNode;
        }
        newNode.next=head;
        head=newNode;
        return head;
    }
    public static void printList(ListNode head) {
        if(head==null)
        System.out.print("List is empty");
        
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ListNode head = null;
        if (n > 0) {
            head = new ListNode(scanner.nextInt());
            ListNode current = head;

            for (int i = 1; i < n; i++) {
                current.next = new ListNode(scanner.nextInt());
                current = current.next;
            }
        }
        int value = scanner.nextInt();
        head = insertAtBeginning(head, value);

        printList(head);
    }
}
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
