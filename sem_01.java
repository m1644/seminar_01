


/* Задание №1
Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, 
в качестве кода ошибки, иначе - длину массива.
 */

public class sem_01 {

    public static int checkArrayLength(int[] arr, int minimumLength) {
        if (arr.length < minimumLength) {
            return -1; // возвращаем -1 в случае ошибки
        } else {
            return arr.length; // возвращаем длину массива
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int minimumLength1 = 4;
        int result1 = checkArrayLength(array1, minimumLength1);
        System.out.println("Результат для array1: " + result1);

        int[] array2 = {4, 5, 6, 7};
        int minimumLength2 = 3;
        int result2 = checkArrayLength(array2, minimumLength2);
        System.out.println("Результат для array2: " + result2);
    }
    
}
