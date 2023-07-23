import java.util.Scanner;

public class Missing_Element {
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i = 0;i<num;i++ ){
            arr[i] = sc.nextInt(); //Take input as consecutive numbers
        }
        sc.close();
        int first = arr[0];
        int last = arr[num - 1];

        for (int i = first; i < last; i++) {
            if (!contains(arr, i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean contains(int[] arr, int element) {
        for (int num : arr) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }
    
}
