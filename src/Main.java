import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[][] = {{ 1, 9 }, { 13, 17 }, { 31, 18} };
        System.out.println(Arrays.deepHashCode(array)+"\n");


        int[][] array1 = {
                { 8, 7, 4 },
                { 3, 6, 5 },
                { 0, 2, 1 } };
        int[][] array2 = {
                { 8, 4, 0 },
                { 6, 7, 5 },
                { 3, 2, 1 } };
        System.out.println("Hash array1 " + Arrays.deepHashCode(array1));
        System.out.println("Hash array2 " + Arrays.deepHashCode(array2));
    }
}