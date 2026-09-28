//brute force to find missing
// import java.util.*;
// public class missingElements {
//     public static int missing(int[] arr,int n){
//         for(int i=1;i<=n+1;i++){
//             boolean flag=false;
//             for(int j=0;j<n;j++){
//                 if(arr[j]==i){
//                     flag=true;
//                     break;
//                 }
//             }
//             if(!flag){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int miss=missing(arr,n);
//         System.out.println(miss);
//     }
// }


//better solution to find missing element
import java.util.*;
public class missingElements{
    public static int HashMissing(int[] arr,int n){
        int hash[] = new int[n+1];
        for(int i=0;i<n-1;i++){
            hash[arr[i]]++;
        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        int n = 5;
        int arr[] = {1,2,3,5};
        // for(int i=0;i<n;i++){
        //     arr[i] = sc.nextInt();
        // }
        int miss = HashMissing(arr,n);
        System.out.println(miss);
    }
}
