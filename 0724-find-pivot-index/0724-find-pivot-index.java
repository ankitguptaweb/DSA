class Solution {
    public int pivotIndex(int[] a) {
        int n = a.length;

        int sum = 0;

 for (int i = 0; i < n; i++) {
            sum += a[i];
        }
 int left = 0;
        for (int i = 0; i < n; i++) {
            int right = sum - left - a[i];

            if (left == right) {
                return i;
            }

            left += a[i];
        }

        return -1;
    }
}