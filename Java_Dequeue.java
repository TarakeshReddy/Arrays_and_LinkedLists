import java.util.*;
public class Java_Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> hs = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int c = 0 ;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        } 
        in.close();
        for(int i = 0 ; i < n ; i++){
            deque.add(nums[i]);
            if(deque.size()>m)
            {
                int removed = deque.removeFirst();
                if(!deque.contains(removed))
                {
                    hs.remove(removed);
                }
            }
            hs.add(nums[i]);
            if(hs.size()>c){
                c = hs.size();
            }
        }
        System.out.println(c);
    }
}

