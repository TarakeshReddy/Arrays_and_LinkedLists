import java.util.*;
public class Removing_duplictes_of_LinkedList {
    int data;
    Removing_duplictes_of_LinkedList head;
    Removing_duplictes_of_LinkedList next;
    public Removing_duplictes_of_LinkedList(){
        head = null;
        next = null;
    }
    public void insert(int data){
        Removing_duplictes_of_LinkedList node1 = new Removing_duplictes_of_LinkedList();
        node1.data = data;
        if (head == null){
            head = node1;
        }
        else{
            Removing_duplictes_of_LinkedList current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = node1;
        }
    }
    public void print_LL() {
        Removing_duplictes_of_LinkedList current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next!=null){
                System.out.print("->");
            }
            current = current.next;
        }
        System.out.println();
    }
    public void remove_dup(){
        Removing_duplictes_of_LinkedList current = head;
        while(current != null){
            Removing_duplictes_of_LinkedList pre = current;
            Removing_duplictes_of_LinkedList temp = current.next;
            while(temp != null){
                if(current.data == temp.data){
                    pre.next = temp.next;
                }
                else{
                    pre = temp;
                }
                temp = temp.next;
            }
            current = current.next;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Removing_duplictes_of_LinkedList node = new Removing_duplictes_of_LinkedList(); 
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            node.insert(arr[i]);
        }
        sc.close();
        node.print_LL();
        node.remove_dup();
        node.print_LL();
    }

}
