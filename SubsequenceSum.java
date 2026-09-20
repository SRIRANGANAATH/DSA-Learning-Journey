import java.util.*;

class SubsequenceSum
{
    public static void findSum(int i,List<Integer> list,int[] arr,int sum,int n,int target){
        if(i>=n){
            if(sum==target){
                for(var num : list){
                    System.out.print(num+" ");
                }
                System.out.println();
            }
            return;
        }
        list.add(arr[i]);
        sum += arr[i];
        findSum(i+1,list,arr,sum,n,target);
        list.remove(list.size()-1);
        sum -= arr[i];
        findSum(i+1,list,arr,sum,n,target);
    }
    
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int target = sc.nextInt();
	    List<Integer> list = new ArrayList<>();
	    findSum(0,list,arr,0,n,target);
	}
}
