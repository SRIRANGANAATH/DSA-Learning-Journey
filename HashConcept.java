//learning Hash Concept
import java.util.Scanner;
class HashConcept{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int max = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] Hash = new int[max+1];
        // Hash[max] = {0};
        for(int i=0;i<n;i++){
            Hash[arr[i]]++;
        }
        for(int i=q;i>=0;i--){
            int number = sc.nextInt();
            System.out.println(number + "--->" + Hash[number]);
        } 
    }
}