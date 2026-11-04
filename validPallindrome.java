// import java.util.Scanner;
// public class validPallindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String STR = sc.nextLine();
//         String str = STR.toLowerCase();
//         StringBuilder store = new StringBuilder();
//         int n = str.length();
//         for (int i = 0; i < n; i++) {
//             if (Character.isLetterOrDigit(str.charAt(i))) {
//                 store.append(str.charAt(i));
//             }
//         }
//         int len = store.length(),count = 0;
//         String rev = new StringBuilder(store).reverse().toString();
//         if(store.toString().equals(rev)){
//             System.out.println("Pallindrome");
//         }else{
//             System.out.println("Not a Pallindrome");
//         }
//     }
// }

// Better
// import java.util.*;
// public class validPallindrome {
// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// String STR = sc.nextLine();
// String str = STR.toLowerCase();
// StringBuilder store = new StringBuilder();
// int n = str.length();
// for(int i=0;i<n;i++){
// if(Character.isLetterOrDigit(str.charAt(i))){
// store.append(str.charAt(i));
// }
// }
// int len = store.length();
// Boolean pal = true;
// for(int i=0;i<len/2;i++){
// if(store.charAt(i)!=store.charAt(len-1-i)){
// pal = false;
// break;
// }
// }
// if(pal==true){
// System.out.println("Pallindrome");
// }else{
// System.out.println("Not a Pallindrome");
// }
// }
// }


//optimal
import java.util.*;

public class validPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String STR = sc.nextLine();
        String str = STR.toLowerCase();
        int i=0,j=str.length()-1;
        boolean pal = true;
        while(i<j){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                i++;
            }
            else if(!Character.isLetterOrDigit(str.charAt(j))){
                j--;
            }
            else if(str.charAt(i)!=str.charAt(j)){
                pal = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        if(pal==true){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not a Pallindrome");
        }
        sc.close();
    }
}