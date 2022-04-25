package HomeWorkApp;

public class Main {

    public static void main(String[] args) {

        printThreeWords();
        checkSumSign(0, -10);
        printColor(0);
        compareNumbers(11, 11);

    }

    public static void  printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void  checkSumSign(int a, int b) {
        String result = a + b >= 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(result);
    }

    public static void printColor(int a) {
        if (a <= 0) {
            System.out.println("Красный");
        } else if (a > 0 && a <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        String result = a >= b ? "a >= b" : "a < b";
        System.out.println(result);
    }
}
