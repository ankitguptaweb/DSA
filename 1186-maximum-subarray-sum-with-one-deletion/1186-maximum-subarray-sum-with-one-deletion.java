class Solution {
    public int maximumSum(int[] a) {

        int noDel = a[0];
        int oneDel = Integer.MIN_VALUE;
        int res = a[0];

        for (int i = 1; i < a.length; i++) {

            int prevNoDel = noDel;

            // 0 deletions
            noDel = Math.max(a[i], noDel + a[i]);

            // 1 deletion
            if (oneDel == Integer.MIN_VALUE) {
                oneDel = prevNoDel;
            } else {
                oneDel = Math.max(prevNoDel, oneDel + a[i]);
            }

            res = Math.max(res, Math.max(noDel, oneDel));
        }

        return res;
    }
}