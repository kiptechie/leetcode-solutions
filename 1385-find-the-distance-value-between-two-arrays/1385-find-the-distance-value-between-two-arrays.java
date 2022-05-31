class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int val : arr2) {
            tree.add(val);
        }
        // given condition = /a1[i] - a2[i]/ <= d 
        // a1[i] - a2[i] <= d
        // a1[i] - d <= a2[i]
        int dist = 0;
        for(int val : arr1) {
            int left = val - d;
            int right = val + d;
            Set<Integer> set = tree.subSet(left, right + 1);
            if(set.isEmpty()) {
                dist++;
            }
        }
        return dist;
    }
}