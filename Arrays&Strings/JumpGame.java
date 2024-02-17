public class JumpGame {

    public static boolean Method2(int nums[]) {
        int flagPosition = nums.length - 1;
        for (int idx = nums.length - 2; idx >= 0; idx++) {
            if (nums[idx] + idx >= flagPosition) {
                flagPosition -= idx;
            }
        }
        return flagPosition == 0;
    }

    // TLE
    public static boolean recursive(int nums[], int idx) {
        if (idx >= nums.length) {
            return false;
        }
        if (idx == nums.length - 1) {
            return true;
        }
        for (int i = 1; i <= nums[idx]; i++) {
            if (recursive(nums, idx + i)) {
                return true;
            }
        }
        return false;
    }

    public static boolean Method1(int nums[]) {
        return recursive(nums, 0);
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 1, 0, 4 };
        System.out.println(Method1(nums));
    }
}
