

/* Задание_1
Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/

public class seminar_01_dz1 {

    public static void main(String[] args) {
        try {
            method1();
            method2();
            method3();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    // Метод, который генерирует ArithmeticException (деление на ноль)
    public static void method1() {
        int numerator = 10;
        int denominator = 0;    // 2
        int result = numerator / denominator; // Приведет к ArithmeticException
    }

    // Метод, который генерирует NullPointerException
    public static void method2() {
        String str = null;  // "Hello"
        int length = str.length(); // Приведет к NullPointerException
    }

    // Метод, который генерирует ArrayIndexOutOfBoundsException
    public static void method3() {
        int[] arr = {1, 2, 3};
        int element = arr[5]; // Приведет к ArrayIndexOutOfBoundsException
    }
}
