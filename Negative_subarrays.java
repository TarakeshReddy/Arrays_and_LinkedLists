import java.util.*;
public class Negative_subarrays {
    static int sum1(int []sub){
        int sum =0;
        for(int i=0;i<sub.length;i++){
           sum = sum + sub[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int x  = sc.nextInt();
        int k = 0;
        int arr[] = new int[x];
        for(int i=0;i<x;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i =0;i<x;i++)
        {
            for(int j=i+1;j<=x;j++)
            {  k=0;
               int[] sub = Arrays.copyOfRange(arr,i,j);
                k = sum1(sub);
                if (k < 0){
                    count ++;
                }
                
            }
        }
        System.out.println(count);
    }
}

