import java.util.*;
public class Socks_Pair {
        public static int countOccurrences(int[] array) {
        int count = 1;
        int no_pairs = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                if ((count &1) !=0){
                    no_pairs +=1;
                }
                count =1;
            }
        }
        if ((count & 1) == 1) {
            no_pairs++;
        }

        return no_pairs;
    }
    public static void main(String args[])throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0;i<x;i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(arr);
        int p = countOccurrences(arr);
        System.out.println(p);
        }

    }

