class Solution {
    
    private void flip(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    
    private void invert(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
    }
    
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) { // O(n)
            int[] curr = image[i];
            flip(curr); // O(m)
            invert(curr); // O(m)
        }
        return image; // O(m + n)
    }
}