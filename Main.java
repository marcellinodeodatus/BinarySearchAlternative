public class Main {

    public static int Search(int[] values, int target) {
        int low = 0;
        int high = values.length - 1;

        while (low <= high && target >= values[low] && target <= values[high]) {
            if (low == high) {
                if (values[low] == target) {
                    return low;
                } else {
                    return -1;
                }
            }

            // Estimating the position based on interpolation
            int pos = low + (int)((double)(target - values[low]) / (values[high] - values[low]) * (high - low));

            // Check if the target is at pos
            if (values[pos] == target) {
                return pos;
            }

            // If the target is larger, adjust the lower bound
            if (values[pos] < target) {
                low = pos + 1;
            }
            // If the target is smaller, adjust the upper bound
            else {
                high = pos - 1;
            }
        }

        // Target not found
        return -1;
    }

    public static void main(String[] args) {

        // declare array
        int[] values = {10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85};

        // declare the target value
        int target = 80;

        // print out
        System.out.println("Target found at index: " + Search(values, target));

        // Worst-case Run-time test
        int[] values2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 100};
        int target2 = 1;
        System.out.println("Target 2 found at index: " + Search(values2, target2));


    } // end driver main


} // end class Main