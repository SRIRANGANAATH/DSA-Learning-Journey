//optimal

public class waterContainer {
    public static void main(String[] args) {
        int[] height = { 2, 5, 3, 4, 6 };
        int i = 0;
        int j = height.length - 1;
        int maxArea = 0;
        while(i<j){
            int width = Math.abs(i-j);
            int area = width * Math.min(height[i],height[j]);
            maxArea = Math.max(maxArea,area);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.print(maxArea);
    }
}
