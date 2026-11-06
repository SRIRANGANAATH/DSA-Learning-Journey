//brute
// import java.util.*;
// public class joiningSortedArrays {
//     public static void main(String[] args){
//         int[] num1 = {1,2,3,4,5,0,0,0,0,0};
//         int[] num2 = {6,7,8,9,10};
//         int m=0;
//         for(int i=0;i<num1.length;i++){
//             if(num1[i]!=0){
//                 m++;
//             }
//         }
//         for(int i=0;i<num2.length;i++){
//             num1[m]=num2[i];
//             m++;
//         }
//         Arrays.sort(num1);
//         for(int i=0;i<num1.length;i++){
//             System.out.print(num1[i]+" ");
//         }
//         System.out.print("\n"+m);
//     }
// }

//better
public class joiningSortedArrays {
    public static void main(String[] args){
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9,10};
        int arr1 = num1.length;
        int arr2 = num2.length;
        int n = arr1+arr2;
        int i=0,j=0;
        int[] temp = new int[n];
        for(int k=0;k<n;k++){
            if(i>=arr1){
                temp[k] = num2[j];
                j++;
            }else if(j>=arr2){
                temp[k] = num1[i];
                i++;
            }
            else if(num1[i]<num2[j]){
                temp[k] = num1[i];
                i++;
            }else if(num1[i]>num2[j]){
                temp[k] = num2[j];
                j++;
            }
        }
        for(int k=0;k<n;k++){
            System.out.print(temp[k]+" ");
        }
    }
}
