class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int boundary = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int curr = arr[mid];
            int next = arr[mid + 1];
            if (curr > next) {
                boundary = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return boundary;
    }
}