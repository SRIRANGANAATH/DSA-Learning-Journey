//brute force to find missing
import java.util.*;
public class missingElements {
    public static int missing(int[] arr,int n){
        for(int i=1;i<=n+1;i++){
            boolean flag=false;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int miss=missing(arr,n);
        System.out.println(miss);
    }
}
