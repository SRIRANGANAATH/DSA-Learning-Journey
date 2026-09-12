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
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // int count = 0;
        // HashMap<Integer,Integer> mpp = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        // }
        // // Method - 1
        // // for(Map.Entry<Integer,Integer> entry: mpp.entrySet()){
        // //         count++;
        // // }
        // // System.out.println(count);

        // //Method - 2 (in-built method)
        // System.out.println(mpp.size());


        //4. Printing Duplicates
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        // HashMap<Integer,Integer> mpp = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> entry : mpp.entrySet()){
        //     if(entry.getValue() > 1){
        //         System.out.println(entry.getKey());
        //     }
        // }


        //5. Checking whether two strings are anagrams
        Scanner sc = new Scanner(System.in);
        String S1 = sc.nextLine();
        String S2 = sc.nextLine();

        String s1 = S1.replaceAll("\\s+","").toLowerCase();
        String s2 = S2.replaceAll("\\s+","").toLowerCase();
        HashMap<Character,Integer> mpp1 = new HashMap<>();
        HashMap<Character,Integer> mpp2 = new HashMap<>();
        for(int i=0,j=0;i<s1.length() || j<s2.length();i++,j++){
            if(i<s1.length())
            mpp1.put(s1.charAt(i),mpp1.getOrDefault(s1.charAt(i), 0)+1);
            if(j<s2.length())
            mpp2.put(s2.charAt(j),mpp2.getOrDefault(s2.charAt(j), 0)+1);
        }
        if(mpp1.equals(mpp2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
