import java.util.Scanner;

class queueinsert3
{
    static int front = -1;
    static int rear = -1;
    static int size = 5;
    static int[] queue = new int[size];

    static void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = value;
            System.out.println(value + " inserted");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements to insert: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int val = sc.nextInt();
            enqueue(val);
        }
    }
}
