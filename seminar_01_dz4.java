

/* Задание_4
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.
Важно: 
При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
*/

public class seminar_01_dz4 {

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль недопустимо");
            }
            result[i] = arr1[i] / arr2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {6, 8, 10};
        int[] array2 = {2, 4, 5};

        try {
            int[] result = divideArrays(array1, array2);
            for (int value : result) {
                System.out.println(value);
            }
        } catch (RuntimeException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
