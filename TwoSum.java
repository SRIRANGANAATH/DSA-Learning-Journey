import java.util.Scanner;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //getting user input
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        //pre-computing
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int more = target - arr[i];
            if(mpp.containsKey(more)){
                //fetching
                System.out.printf("{%d,%d}",mpp.get(more),i);
                return;
            }
            mpp.put(arr[i],i);
        }
     }
}
