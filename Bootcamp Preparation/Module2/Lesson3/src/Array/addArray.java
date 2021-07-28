package Array;
import java.util.Arrays;

public class addArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = new int[array1.length + array2.length];
        int index=0;
        //for each
        for (int i:array1){
            array3[index]=i;
            index++;
        }
        for (int i:array2){
            array3[index]=i;
            index++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
