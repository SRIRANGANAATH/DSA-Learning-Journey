import java.util.Scanner;
import java.util.HashMap;
public class HashMapPractice {
    public static void main(String[] args){
        //1. Checking whether an element exists
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!mpp.containsKey(arr[i]))
            mpp.put(arr[i],i);
        }
        if(mpp.containsKey(target)){
            System.out.println("Found at index:" +mpp.get(target));
        }else{
            System.out.println("Not found");
        }
    }
}
