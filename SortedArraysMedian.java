public class SortedArraysMedian {
    public static void main(String[] args) {
        int[] nums1 = {10, 30, 70, 100};
        int[] nums2 = {20, 25, 90, 150, 180};
//        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0.0;
    }

    // Returns how many numbers in the given sorted array are greater than the given number.
    public static int greaterNumbers(int[] array, int number) {
        return greaterNumbers(array, number, 0, array.length - 1);
    }

    // Returns how many numbers in the given sorted array in [arrayStart, arrayEnd] range are greater than the given number.
    public static int greaterNumbers(int[] array, int number, int arrayStart, int arrayEnd) {
        return greaterNumbers(array, number, arrayStart, arrayEnd, arrayStart, arrayEnd);
    }

    // Returns how many numbers in the given sorted array in [arrayStart, arrayEnd] range are greater than the given number.
    private static int greaterNumbers(int[] array, int number, int arrayStart, int arrayEnd, int from, int to) {
        if (from < 0 || to < 0 || from > array.length - 1 || to > array.length - 1) {
            return 0;
        }
        if (from == to) {
            if (array[from] <= number) {
                return arrayEnd + 1 - from - 1;
            } else {
                return arrayEnd + 1 - from;
            }
        }
        if (number > array[to]) {
            return arrayEnd + 1 - to - 1;
        }
        if (number < array[from]) {
            return arrayEnd + 1 - from;
        }
        if (from < to) {
            int mid = (from + to) / 2;
            if (array[mid] <= number) {
                return greaterNumbers(array, number, arrayStart, arrayEnd, mid + 1, to);
            } else {
                return greaterNumbers(array, number, arrayStart, arrayEnd, from, mid - 1);
            }
        } else {
            return 0;
        }
    }

    // Returns how many numbers in the given sorted array are smaller than the given number.
    public static int smallerNumbers(int[] array, int number) {
        return smallerNumbers(array, number, 0, array.length - 1);
    }

    // Returns how many numbers in the given sorted array in [arrayStart, arrayEnd] range are smaller than the given number.
    public static int smallerNumbers(int[] array, int number, int arrayStart, int arrayEnd) {
        return smallerNumbers(array, number, arrayStart, arrayEnd, arrayStart, arrayEnd);
    }

    // Returns how many numbers in the given sorted array in [arrayStart, arrayEnd] range are smaller than the given number.
    private static int smallerNumbers(int[] array, int number, int arrayStart, int arrayEnd, int from, int to) {
        if (from < 0 || to < 0 || from > array.length - 1 || to > array.length - 1) {
            return 0;
        }
        if (from == to) {
            if (array[from] < number) {
                return to + 1 - arrayStart;
            } else {
                return to - arrayStart;
            }
        }
        if (number < array[from]) {
            return from - arrayStart;
        }
        if (number > array[to]) {
            return to + 1 - arrayStart;
        }
        if (from < to) {
            int mid = (from + to) / 2;
            if (array[mid] >= number) {
                return smallerNumbers(array, number, arrayStart, arrayEnd, from, mid - 1);
            } else {
                return smallerNumbers(array, number, arrayStart, arrayEnd, mid + 1, to);
            }
        } else {
            return 0;
        }
    }

    // Returns how many numbers in the given sorted array are equal to the given number.
    public static int equalNumbers(int[] array, int number) {
        return equalNumbers(array, number, 0, array.length - 1);
    }

    // Returns how many numbers in the given sorted array in [arrayStart, arrayEnd] range are equal to the given number.
    public static int equalNumbers(int[] array, int number, int arrayStart, int arrayEnd) {
        if (array.length == 0 || arrayStart > arrayEnd) {
            return 0;
        }
        return arrayEnd - arrayStart + 1 - smallerNumbers(array, number, arrayStart, arrayEnd) - greaterNumbers(array, number, arrayStart, arrayEnd);
    }

}
