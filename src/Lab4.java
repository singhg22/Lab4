import java.util.Arrays;
import java.util.Collections;

public class Lab4 {
    public static Integer[] sortArray(Integer[] element){
        Integer[] copyArray = new Integer[5];
        System.arraycopy(element,0,copyArray,0,element.length);
        Arrays.sort(copyArray, Collections.reverseOrder());
        return copyArray;

    }
    public static void main(String[] args){
        Integer[] array1 = new Integer[]{1,2,3,4,5};
        Integer[] array2 = new Integer[]{10,9,8,7,6};
        Integer[] array3 = new Integer[]{15,11,19,7,9};
        Integer[] array4 = new Integer[]{100,6,16,20,3};
        Integer[] array5 = new Integer[]{51,3,30,21,1};

        System.out.println(Arrays.toString(sortArray(array1)));
        System.out.println(Arrays.toString(sortArray(array2)));
        System.out.println(Arrays.toString(sortArray(array3)));
        System.out.println(Arrays.toString(sortArray(array4)));
        System.out.println(Arrays.toString(sortArray(array5)));

    }
}
