import java.util.*;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;
        while (low <= high) {
            int i = (low + high) / 2;          // Partition index in nums1
            int j = (m + n + 1) / 2 - i;       // Partition index in nums2

            // Handle edge cases (when partition is at the start or end)
            int maxLeftA = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRightA = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int maxLeftB = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRightB = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Check if partition is valid
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                // If total length is even
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } 
                // If total length is odd
                else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } 
            // If not valid, move search space
            else if (maxLeftA > minRightB) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        // Should never reach here for valid inputs
        throw new IllegalArgumentException("Input arrays are not sorted or invalid");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median: " + findMedianSortedArrays(nums1, nums2));

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median: " + findMedianSortedArrays(nums3, nums4));

        int[] nums5 = {0, 0};
        int[] nums6 = {0, 0};
        System.out.println("Median: " + findMedianSortedArrays(nums5, nums6));
    }
}
