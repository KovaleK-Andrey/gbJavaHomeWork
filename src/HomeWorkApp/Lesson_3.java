package HomeWorkApp;

import java.util.Arrays;

public class Lesson_3 {
    public static void main(String[] args) {
        arrayExercise1();
        arrayExercise2();
        arrayExercise3();
        arrayExercise4();
        System.out.println(Arrays.toString(arrayExercise5(10, 8)));
        arrayExercise6();
    }

    public static void arrayExercise1() {
        int[] arrayExercise1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arrayExercise1.length; i++) {
            int zero = 0;
            int one = 1;

            if (arrayExercise1[i] == zero) {
                arrayExercise1[i] = one;
            } else {
                arrayExercise1[i] = zero;
            }
        }
        System.out.println(Arrays.toString(arrayExercise1));
    }

    public static void arrayExercise2() {
        int[] arrayExercise2 = new int[100];

        for (int i = 0; i < arrayExercise2.length; i++) {
            arrayExercise2[i] = i + 1;
        }
        System.out.println(Arrays.toString(arrayExercise2));
    }

    public static void arrayExercise3() {
        int[] arrayExercise3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arrayExercise3.length; i++) {
            if (arrayExercise3[i] < 6) {
                arrayExercise3[i] = arrayExercise3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arrayExercise3));
    }

    public static void arrayExercise4() {
        int[][] arrayExercise4 = new int[10][10];

        for (int i = 0; i < arrayExercise4.length; i++) {
            for (int j = 0; j < arrayExercise4[i].length; j++) {
                if (i == j || arrayExercise4.length - i - 1 == j) {
                    arrayExercise4[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arrayExercise4[i]));
        }
    }

    public static int[] arrayExercise5(int len, int initialValue) {
        int[] arrayExercise5 = new int[len];

        for (int i = 0; i < arrayExercise5.length; i++) {
            arrayExercise5[i] = initialValue;
        }
        return arrayExercise5;
    }

    public static void arrayExercise6() {
        int[] array = {20, -5, 3, 2, -11, 4, 5, 2, 4, 8, 99, 1};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение = " + min +"\n" +  "Макимальное значение = " + max);
    }
}
