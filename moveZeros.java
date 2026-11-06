//brute
// public class moveZeros {
//     public static void main(String[] args){
//         int[] arr = {1,0,3,0,0,3,9,0};
//         int len = arr.length;
//         int[] temp = new int[len];
//         int j = 0;
//         for(int i=0;i<len;i++){
//             if(arr[i]!=0){
//                 temp[j++] = arr[i];
//             }
//         }
//         for(int i=0;i<len;i++){
//             arr[i] = temp[i];
//         }
//         for(int i=0;i<len;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


//better
// public class moveZeros {
//     public static void main(String[] args){
//         int[] arr = {1,0,3,0,0,3,9,0};
//         int n = arr.length;
//         int j = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=0){
//                 arr[j++] = arr[i]; 
//             }
//         }
//         while(j<n){
//             arr[j++] = 0;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// optimal
public class moveZeros {
    public static void main(String[] args){
        int[] arr = {1,0,3,0,0,3,9,0};
        int n = arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            int temp;
            if(arr[j]!=0){
                // arr[i]=arr[j];
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}