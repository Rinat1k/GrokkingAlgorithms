package alghorithms;

import java.util.Arrays;

// O(log2n)
public class BinarySearch {

    public int run(int[] data, int target) {
        int mid, guess;
        int beg = 0;
        int end = data.length - 1;

        while (beg <= end) {
            mid = (beg + end) / 2;
            guess = data[mid];

            if (target == guess) return mid;
            if (target > guess) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

}
