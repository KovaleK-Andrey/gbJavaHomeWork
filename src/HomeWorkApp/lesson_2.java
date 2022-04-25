package HomeWorkApp;

public class lesson_2 {

    public static void main(String[] args) {
        valueCheck(4,16);
        printTheValue(-10);
        printTrueNumber(0);
        printStringNTimes("Тест вывода", 4);
        determinationHighnessYear(200);

    }


    public static void valueCheck(int a, int b) {
        boolean result = a + b >= 10 && a + b <= 20 ? true : false;
        System.out.println(result);
    }

    public static void printTheValue(int a) {
        String result = a >= 0 ? "Передали положительное число" : "Передали отрицательное число";
        System.out.println(result);
    }

    public static void printTrueNumber(int a) {
        boolean result = a < 0 ? true : false;
        System.out.println(result);
    }

    public static void printStringNTimes(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean determinationHighnessYear(int a) {
        boolean result;
        if (a % 4 == 0) {

            if (a % 400 == 0) {
                System.out.println(true);
                return true;
            }
            if (a % 100 == 0) {
                System.out.println(false);
                return false;
            }
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
