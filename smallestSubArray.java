public class smallestSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int left = 0, n = arr.length;
        int sum = 0, minLen = Integer.MAX_VALUE;
        boolean found = false;
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum >= target) {
                found = true;
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        if (found)
            System.out.println(minLen);
        else
            System.out.println(0);
    }
}
