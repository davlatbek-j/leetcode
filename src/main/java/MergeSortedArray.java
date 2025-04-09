public class MergeSortedArray
{
    public static void main(String[] args)
    {

    }

    static class Solution
    {
        public void merge(int[] nums1, int m, int[] nums2, int n)
        {
            nums1[m + n - 1] = Math.max(nums1[m - 1], nums2[n - 1]);
            nums1[0] = Math.min(nums1[0], nums2[0]);
        }
    }
}
