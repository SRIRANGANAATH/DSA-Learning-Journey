//better
// import java.util.*;

// public class longestPallindrome {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int len = str.length();
//         HashMap<Character,Integer> mpp = new HashMap<>();
//         for(int i=0;i<len;i++){
//             mpp.put(str.charAt(i),mpp.getOrDefault(str.charAt(i),0)+1);// returns current frequency if found or 0 if not and then increment the value by 1
//         }
//         int count = 0;
//         boolean odd = false;
//         for(Map.Entry<Character,Integer> entry : mpp.entrySet()){
//             if(entry.getValue()%2==0){
//                 count += entry.getValue();
//             }else{
//                 count += entry.getValue() - 1;
//                 odd = true;
//             }
//         }
//         if(odd==true){
//             count++;
//         }
//         System.out.println(count);
//         sc.close();
//     }
// }

//optimal
import java.util.*;

public class longestPallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<len;i++){
            if(set.contains(str.charAt(i))){
                count += 2;
                set.remove(str.charAt(i));
            }else{
                set.add(str.charAt(i));
            }
        }
        if(!set.isEmpty()){
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}