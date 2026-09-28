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


// //better solution to find missing element
// import java.util.*;
// public class missingElements{
//     public static int HashMissing(int[] arr,int n){
//         int hash[] = new int[n+2];
//         for(int i=0;i<n-1;i++){
//             hash[arr[i]]++;
//         }
//         for(int i=1;i<=n;i++){
//             if(hash[i]==0){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         // int n = 5;
//         // int arr[] = {1,2,3,5};
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int miss = HashMissing(arr,n);
//         System.out.println(miss);
//     }
// }


//optimal solution
// approach-1===>Sum
// public class missingElements{
//     public static void main(String[] args){
//         int n = 5;
//         int sum = 0;
//         int[] arr = {1,2,3,5};
//         for(int i=0;i<n-1;i++){
//             sum += arr[i];
//         }
//         int tot = (n*(n+1))/2;
//         int miss = tot - sum;
//         System.out.println(miss);
//     }
// }

// approach-2===>XOR
import java.util.*;
public class missingElements{
    public static int MissingXOR(int[] arr,int n){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor1 = xor1 ^ arr[i];
            xor2 = xor2 ^ i+1;
        }
            xor2 = xor2 ^ n;
        int xor=0;
        return xor = xor1^xor2;
    }
    public static void main(String[] args){
        int n = 5;
        int[] arr = {1,2,4,5};
        int miss = MissingXOR(arr,n);
        System.out.print(miss);
    }
}