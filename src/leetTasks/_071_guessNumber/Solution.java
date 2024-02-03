package leetTasks._071_guessNumber;

public class Solution {

    private static int pick = 1;

    public static void main(String[] args) {
        int n = 10;

        System.out.println((guessNumber(n)));
    }

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low+(high - low)/2;
            int result = guess(mid);
            if(result > 0) low = mid+1;
            else if(result < 0) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static int guess(int num) {
        if (num < pick) {
            return 1;
        } else if (num > pick) {
            return -1;
        }
        return 0;
    }
}
