import java.util.Scanner;
import java.util.HashMap;
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
        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i], 0)+1);
        }

        for(int i=0;i<q;i++){
            int number = sc.nextInt();
            System.out.println(number + "--->" + mpp.getOrDefault(number,0));
        }
    }
}
