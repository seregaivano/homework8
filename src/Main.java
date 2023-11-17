import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //задача 1
        int[] array = new int[3];

        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] arr1 = {1.57, 7.654, 9.986};
        int[] arr2 = {1, 2, 3, 4, 5, 6};


        //задача 2
        String comma = ", ";
        for (int i = 0; i < array.length; i++) {
            if (i == 2) {
                comma = " ";
            }
            System.out.print(array[i] + comma);
            System.out.print(" ");
        }
        System.out.println();
        String comma1 = ", ";
        for (int i = 0; i < arr1.length; i++) {
            if (i == 2) {
                comma1 = "   ";
            }
            System.out.print(arr1[i] + comma1);
            System.out.print(" ");
        }
        System.out.println();

        String comma2 = ", ";
        for (int i = 0; i < arr2.length; i++) {
            if (i == 4) {
                comma1 = "  ";
            }
            System.out.print(arr2[i] + comma2);
            System.out.print(" ");
        }
        System.out.println();

        // задача 3
        System.out.println();
        int temporary1[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temporary1[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temporary1[i];
            comma = ", ";
            if (i == 2) {
                comma = "  ";
            }
            System.out.print(array[i] + comma);
        }
        System.out.println();
        double temporary2[] = new double[arr1.length];
        for (int j = 0; j < arr1.length; j++) {
            temporary2[arr1.length - 1 - j] =  arr1[j];
        }
        for (int j = 0; j < arr1.length; j++) {
            arr1[j] = temporary2[j];
            comma = ", ";
            if (j == 2) {
                comma = "  ";
            }
            System.out.print(arr1[j] + comma);
        }

        System.out.println();
        for (int i = arr2.length - 1; i >= 0; i--) {
            comma = ", ";
            if (i == 0) {
                comma = "  ";
            }
            System.out.print(arr2[i] + comma);
        }
        //задача 4
        System.out.println();
        int[] temp = new int[array.length];
        for (int i = 0; i < 3; i++) {
            temp[array.length - 1 - i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        System.out.print(Arrays.toString(array));






    }
        }
