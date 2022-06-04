class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a[] = new int[1002];
        for(int i = 0; i < arr.length; i++) {
            a[arr[i]] = 1;
        }
        int val = 0;
        for(int i = 1; i <= (arr.length + k); i++) {
           if(i< a.length && a[i] == 0) {
               val++;
           }
           if(i >= a.length) {
               val++;
           } if(val == k) {
               return i;
           }
        }
        return -1;
    }
}