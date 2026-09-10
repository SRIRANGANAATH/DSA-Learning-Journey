import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class HashMapPractice {
    public static void main(String[] args){
        //1. Checking whether an element exists

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int target = sc.nextInt();

        // HashMap<Integer,Integer> mpp = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(!mpp.containsKey(arr[i]))
        //     mpp.put(arr[i],i);
        // }
        // if(mpp.containsKey(target)){
        //     System.out.println("Found at index:" +mpp.get(target));
        // }else{
        //     System.out.println("Not found");
        // }


        //2. Finding number with highest frequency
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int max=0,maxElement=0;
        // int low=0,lowElement=0;
        // HashMap<Integer,Integer> mpp = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1); //returns current frequency if found and 0 if not and increments by 1
        // }
        // int currentFrequency = 0,currentElement = 0;
        // for(Map.Entry<Integer,Integer> entry: mpp.entrySet()){
        //     // if(entry.values())
        //     currentFrequency = entry.getValue();
        //     currentElement = entry.getKey();
        //     if(currentFrequency > max){
        //         max = currentFrequency;
        //         maxElement = currentElement;
        //     }
        //     if(max > currentFrequency){
        //         low = currentFrequency;
        //         lowElement = currentElement;
        //     }
        // }
        // System.out.println(maxElement+" : "+max);
        // System.out.println(lowElement+" : "+low);


        //3. Count distinct Elements
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }
        // Method - 1
        // for(Map.Entry<Integer,Integer> entry: mpp.entrySet()){
        //         count++;
        // }
        // System.out.println(count);

        //Method - 2 (in-built method)
        System.out.println(mpp.size());
    }
}
