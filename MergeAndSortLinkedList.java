import java.util.*;

public class MergeAndSortLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node mergeAndSortLists(Node head1, Node head2) {
        // Merge the two linked lists
        Node mergedList = null;
        Node tail = null;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                if (mergedList == null) {
                    mergedList = tail = head1;
                } else {
                    tail.next = head1;
                    tail = tail.next;
                }
                head1 = head1.next;
            } else {
                if (mergedList == null) {
                    mergedList = tail = head2;
                } else {
                    tail.next = head2;
                    tail = tail.next;
                }
                head2 = head2.next;
            }
        }

        // Add the remaining elements of the first linked list, if any
        if (head1 != null) {
            if (mergedList == null) {
                mergedList = head1;
            } else {
                tail.next = head1;
            }
        }

        // Add the remaining elements of the second linked list, if any
        if (head2 != null) {
            if (mergedList == null) {
                mergedList = head2;
            } else {
                tail.next = head2;
            }
        }

        return mergedList;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of Linked-List-1 (space-separated):");
        String list1Input = scanner.nextLine().trim();
        Node head1 = createLinkedList(list1Input);

        System.out.println("Enter the elements of Linked-List-2 (space-separated):");
        String list2Input = scanner.nextLine().trim();
        Node head2 = createLinkedList(list2Input);

        scanner.close();

        System.out.print("Linked-List-1: ");
        printLinkedList(head1);
        System.out.print("Linked-List-2: ");
        printLinkedList(head2);

        Node mergedAndSorted = mergeAndSortLists(head1, head2);

        System.out.print("Output: ");
        printLinkedList(mergedAndSorted);
    }

    public static Node createLinkedList(String input) {
        if (input.isEmpty()) {
            return null;
        }

        Node head = null;
        Node tail = null;
        String[] elements = input.split("\\s+");
        for (String element : elements) {
            try {
                int data = Integer.parseInt(element);
                Node newNode = new Node(data);
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter valid integers separated by spaces.");
                System.exit(1);
            }
        }
        return head;
    }
}
