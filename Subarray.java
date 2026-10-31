import java.util.*;
public class Subarray {
    public static int subArray(int n,int[] arr){
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                // count++;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                    System.out.print(arr[k]+" ");

                }
                System.out.println();
            }
            return sum;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x = subArray(n,arr);
        System.out.println(x);
    }
}


//max sub array sum length
// import java.util.*;
// class Subarray{
//     public static int SubArray(int n,int[] arr,int k){
//         HashMap<Long,Integer> mpp = new HashMap<>();
//         long sum = 0,rem = 0;
//         int maxlen = 0;

//         for(int i=0;i<n;i++){
//             sum += arr[i];
//             if(sum==k){
//                 maxlen = i+1;
//             }
//             rem = sum - k;
//             int len = 0;
//             if(mpp.containsKey(rem)){
//                len = i - mpp.get(rem);
//                maxlen = Math.max(maxlen,len);
//             }
//             if(!mpp.containsKey(sum)){
//                 mpp.put(sum,i);
//             }
//         }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int k = sc.nextInt();
//         int max = SubArray(n,arr,k);
//         System.out.println(max);
//     }
// }
