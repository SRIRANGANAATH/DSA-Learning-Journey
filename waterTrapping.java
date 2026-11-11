public class waterTrapping {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 3, 2, 5 };
        int left = 0;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int water = 0;
        // for (int i = 0; i < height.length; i++) {
            while (left < right) {
                if (leftmax <= rightmax) {
                    leftmax = Math.max(height[left], leftmax);
                    water += leftmax - height[left];
                    left++;
                } else {
                    rightmax = Math.max(height[right], rightmax);
                    water += rightmax - height[right];
                    right--;
                }
            }
        // }
        System.out.println(water);
    }
}
