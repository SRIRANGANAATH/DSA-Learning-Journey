import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class RecursionSubsequence {
    public static void subsequence(int i, int n, int[] arr, List<Integer> list) {
        if (i == n) {
            if (list.isEmpty() == true) {
                System.out.println("{}");
            } else {
                for (Integer num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
                return;
            }
        }
        list.add(arr[i]);
        subsequence(i + 1, n, arr, list);
        list.remove(list.size() - 1);
        subsequence(i + 1, n, arr, list);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        subsequence(0, n, arr, list);
    }
}
