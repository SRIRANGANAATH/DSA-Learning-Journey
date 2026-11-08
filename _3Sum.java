
//optimal
import java.util.*;

public class _3Sum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(arr);
        int n = arr.length;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    System.out.println(arr[i] + "," + arr[left] + "," + arr[right]);
                    left++;
                    right--;
                    found = true;
                    while (left < right && (arr[left] == arr[left - 1])) {
                        left++;
                        // continue;
                    }
                    while (left < right && (arr[right] == arr[right + 1])) {
                        right--;
                        // continue;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        if (found == false) {
            System.out.println("No 3Sum elements");
        }
    }
}
