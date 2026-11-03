//brute
// public class removeElements {
//     public static void main(String[] args){
//         int[] arr = {3,2,2,3,4,2};
//         int val = 2;
//         int n = arr.length;
//         int[] temp = new int[arr.length];
//         int j=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]!=val){
//                 temp[j] = arr[i];
//                 j++;
//             }
//         }
//         for(int i=0;i<j;i++){
//             System.out.print(temp[i]+" ");
//         }
//     }
// }

//better
// class removeDuplicates{
//     public static void main(String[] args){
//         int[] arr = {3,2,2,3,4,2};
//         int val = 2;
//         int n = arr.length;
//         int i=0;
//         while(i<n){
//             if(arr[i]==val){
//                 for(int j=i;j<n;j++){
//                     arr[j]=arr[j+1];
//                 }
//                 n--;
//             }else{
//                 i++;
//             }
//         }
//         for(int j=0;j<n;j++){
//             System.out.print(arr[j]+" ");
//         }
//     }
// }

//optimal
class removeDuplicates{
    public static void main(String[] args){
        int[] arr = {3,2,2,3,4,2};
        int val = 2;
        int n = arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
        }
        for(int j=0;j<i;j++){
            System.out.println(arr[j]+" ");
        }
    }
}