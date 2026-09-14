class Solution {

    public int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            //move 1 step
            slow = sumOfSquares(slow);
           // move 2 step
            fast = sumOfSquares(sumOfSquares(fast));

        } while (slow != fast);

        return slow == 1;
    }
}