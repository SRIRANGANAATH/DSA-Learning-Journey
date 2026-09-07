import java.util.Scanner;
public class HashConceptChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();

        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;   
        }
        // char[] queries = new char[q];
        for(int i=q-1;i>=0;i--){
            char ch = sc.next().charAt(0);
            System.out.println(ch + "--->" + hash[ch-'a']);
        }
    }
}
