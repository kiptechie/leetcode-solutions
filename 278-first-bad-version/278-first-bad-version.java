/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // Brute force
        // List<Integer> badVersions = new ArrayList<>();
        // for (int i = 1; i < n; i++) {
        //     if (isBadVersion(i)) {
        //         badVersions.add(i);
        //     }
        // }
        
        // Binary search
        int left = 1;
        int right = n;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            System.out.println(mid);
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}