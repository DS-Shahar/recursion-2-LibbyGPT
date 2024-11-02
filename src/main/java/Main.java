package recursion;

public class Main {

    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + sumArray(arr, index - 1);
    }

    public static int countPositive(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        int count = 0;
        if (arr[index] > 0) {
            count = 1;
        }
        return count + countPositive(arr, index - 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return findIndex(arr, target, index + 1);
    }

    public static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static boolean hasNoPrimes(int[] arr, int index) {
        if (index == arr.length) {
            return true;
        }
        if (isPrime(arr[index])) {
            return false;
        }
        return hasNoPrimes(arr, index + 1);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 6};
        int target = 5;

        System.out.println("Sum of array elements up to the given index: " + sumArray(intArray, 2));
        System.out.println("Number of positive elements up to the given index: " + countPositive(intArray, 2));
        System.out.println("Index of target element " + target + ": " + findIndex(intArray, target, 0));
        System.out.println("Is the array sorted: " + isSorted(intArray, 0));
        System.out.println("Has no prime numbers in array: " + hasNoPrimes(intArray, 0));
    }
}
