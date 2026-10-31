// removing duplicates from a sorted list

//brute force
// import java.util.*;
// class removeDuplicates{
//     public static void main(String[] args){
//         int[] arr={1,1,1,3,4,4,5,5,9,11,11};
//         for(int i=0;i<arr.length;i++){
//             int duplicate = 0;
//             for(int j=0;j<i;j++){
//                 if(arr[i]==arr[j]){
//                     duplicate=1;
//                     break;
//                 }
//                 // System.out.print(arr[j]+" ");
//             }
//             if(duplicate==0){
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }
// }

//optimal - HashSet
// import java.util.*;
// class removeDuplicates{
//     public static void main(String[] args){
//         int[] arr={1,1,1,3,4,4,5,5,9,11,11};
//         HashSet<Integer> hset = new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             hset.add(arr[i]);
//         }
//         for(var set:hset){
//             System.out.print(set+" ");
//         }
//     }
// }

//better/best - two pointer
class removeDuplicates{
    public static void main(String[] args){
        int[] arr={1,1,1,3,4,4,5,5,9,11,11};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        i++;
        System.out.println("Unique Elements: "+i);
        for(int j=0;j<i;j++){
            System.out.print(arr[j]+" ");
        }
    }
}