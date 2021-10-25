public class SortedArraysMedian {
    public static void main(String[] args) {
        int[] nums1 = {10, 30, 70, 100};
        int[] nums2 = {20, 25, 90, 150, 180};
//        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0.0;
    }

    // Returns how many numbers in the given sorted array[from, to] are greater than the given number.
    public static int greaterNumbers(int[] array, int number) {
        return greaterNumbers(array, number, 0, array.length - 1);
    }

    // Returns how many numbers in the given sorted array[from, to] are greater than the given number.
    public static int greaterNumbers(int[] array, int number, int from, int to) {
        if (from < 0 || to < 0 || from > array.length - 1 || to > array.length - 1) {
            return 0;
        }
        if (from == to) {
            if (array[from] <= number) {
                return array.length - from - 1;
            } else {
                return array.length - from;
            }
        }
        if (number > array[to]) {
            return array.length - to - 1;
        }
        if (number < array[from]) {
            return array.length - from;
        }
        if (from < to) {
            int mid = (from + to) / 2;
            if (array[mid] <= number) {
                return greaterNumbers(array, number, mid + 1, to);
            } else {
                return greaterNumbers(array, number, from, mid - 1);
            }
        } else {
            return 0;
        }
    }

    // Returns how many numbers in the given sorted array[from, to] are smaller than the given number.
    public static int smallerNumbers(int[] array, int number) {
        return smallerNumbers(array, number, 0, array.length - 1);
    }

    // Returns how many numbers in the given sorted array[from, to] are smaller than the given number.
    public static int smallerNumbers(int[] array, int number, int from, int to) {
        if (from < 0 || to < 0 || from > array.length - 1 || to > array.length - 1) {
            return 0;
        }
        if (from == to) {
            if (array[from] < number) {
                return to + 1;
            } else {
                return to;
            }
        }
        if (number < array[from]) {
            return from;
        }
        if (number > array[to]) {
            return to + 1;
        }
        if (from < to) {
            int mid = (from + to) / 2;
            if (array[mid] >= number) {
                return smallerNumbers(array, number, from, mid - 1);
            } else {
                return smallerNumbers(array, number, mid + 1, to);
            }
        } else {
            return 0;
        }
    }

    // Returns how many numbers in the given sorted array[from, to] are equal to the given number.
    public static int equalNumbers(int[] array, int number) {
        return equalNumbers(array, number, 0, array.length - 1);
    }

    // Returns how many numbers in the given sorted array[from, to] are equal to the given number.
    public static int equalNumbers(int[] array, int number, int from, int to) {
        if (array.length == 0) {
            return 0;
        }
        return array.length - smallerNumbers(array, number) - greaterNumbers(array, number);
    }

}
