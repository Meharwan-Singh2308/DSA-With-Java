public class trappedWater {

    public static int trappedWater(int[] height, int n) {
        // Calculate Left max Boundary ✅
        int[] rmax = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            // 2 > max , max = 2
            max = height[i] > max ? height[i] : max;
            rmax[i] = max;
        }

        // Calculate Right max Boundary ✅

        int[] lmax = new int[n];
        max = 0;

        for (int i = n - 1; i >= 0; i--) {
            max = height[i] > max ? height[i] : max;
            lmax[i] = max;
        }

        // Water level = Min Right and Left

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(lmax[i], rmax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
        // Trapped Water = Water level - height[i]
        // return Trapped Water

    }

    public static void main(String args[]) {
        int[] height = { 4, 2, 0, 6, 3, 2,5 };
        int n = height.length;
        System.out.println(trappedWater(height, n));
    }
}
