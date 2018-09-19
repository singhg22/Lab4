import java.util.Arrays;
import java.util.Collections;

public class Lab4 {

    public void main(String[] args) {
        // write your code here
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{10, 9, 8, 7, 6};
        int[] array3 = new int[]{15, 11, 19, 7, 9};
        int[] array4 = new int[]{100, 6, 16, 20, 3};
        int[] array5 = new int[]{51, 3, 30, 21, 1};
        try {
            sortArray(array1);
            sortArray(array2);
            sortArray(array3);
            sortArray(array4);
            sortArray(array5);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred");
        }
    }

    public static Integer[] sortArray(int[] srcArray) {

        }
    }
}
