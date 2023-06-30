

/* Задание_3
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен разности элементов 
двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

public class seminar_01_dz3 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 9, 8, 7, 6};

        int[] result = calculateDifference(array1, array2);

        if (result != null) {
            for (int diff : result) {
                System.out.print(diff + " ");
            }
        } else {
            System.out.println("Массивы имеют разную длину.");
        }
    }

    public static int[] calculateDifference(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return null; // Массивы имеют разную длину
        }

        int[] result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }

}
