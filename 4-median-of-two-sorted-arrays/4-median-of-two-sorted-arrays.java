class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> mergedArr = new ArrayList<>();
        for (int n: nums1) {
            mergedArr.add(n);
        }
        for (int n: nums2) {
            mergedArr.add(n);
        }
        Collections.sort(mergedArr);
        if (mergedArr.isEmpty()) {
            return 0;
        }
        if (mergedArr.size() == 1) {
            return (double) mergedArr.get(0);
        }
        int left = 0;
        int right = mergedArr.size() - 1;
        int mid = left + (right - left) / 2;
        if (mergedArr.size() % 2 == 0) {
            return (double) (mergedArr.get(mid) + mergedArr.get(mid + 1)) / 2;
        }
        return (double) mergedArr.get(mid);
    }
}