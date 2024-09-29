package Java_consepts.Array;

public class trapping_rainwater {
    public static void trappingRainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i], height[i - 1]);
        }

        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i], height[i + 1]);
        }
        // loop
        int trapWater = 0;
        for (int i = 0; i < n; i++) {
            // waterLevel = min(left max,right max)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapWater= (waterLevel-height)*width;
            trapWater += (waterLevel - height[i]) * 1;
        }
        System.out.println("trapWater is : " + trapWater);
    }

    public static void main(String arf[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappingRainwater(height);
    }
}
