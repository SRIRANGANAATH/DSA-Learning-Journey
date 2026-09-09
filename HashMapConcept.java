import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HashMapConcept {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        //getting user input
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        //pre-computing
        HashMap<Integer,Integer> mpp = new HashMap<>();
        //enhanced for-loop
        for(int number : arr){
            mpp.put(number,mpp.getOrDefault(number, 0)+1);
        }

        for(int i=0;i<q;i++){
            int number = sc.nextInt();
            //fetching
            System.out.println(number + "--->" + mpp.getOrDefault(number,0));
        }
    }
}
