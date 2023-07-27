import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 6, 3, 5};
        int[] arr2 = new int[]{7, 1, 2, 4, 4};
        int[] arr3 = new int[]{7, 1, 2, 4, 4, 6};

        System.out.println(Arrays.toString(difference(arr1, arr2)));
        System.out.println(Arrays.toString(difference(arr1, arr3)));
    }

    public static int[] difference(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("length not equal to");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                newArr[i] = arr1[i] - arr2[i];
            }
        }
        return newArr;
    }
}