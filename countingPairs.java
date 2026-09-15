import java.util.Scanner;
import java.util.HashMap;
public class countingPairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //pre-computing
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int more = target - arr[i];
            if(mpp.containsKey(more)){
                count += mpp.get(more);
            }  
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }
        System.out.println(count);
    }
}
