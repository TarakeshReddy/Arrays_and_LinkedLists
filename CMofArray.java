import java.util.*;
public class CMofArray {
public static void main(String args[])throws Exception{
        int res=1;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0;i<N;i++ ){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0;i<N;i++ ){
            res = res*arr[i];
            arr[i] = res;
        }
        System.out.println(Arrays.toString(arr));
    }
}
