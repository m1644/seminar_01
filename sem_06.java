import java.util.Arrays;


/* Задание №6
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”
*/

public class sem_06 {

    public static void main(String[] args) {
        Integer[] arr = {1, null, 3, null, 5};
        checkArray(arr);
    }

    public static void checkArray(Integer[] arr) {
        boolean hasNull = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Null found at index " + i);
                hasNull = true;
            }
        }

        if (hasNull) {
            highlightNulls(arr);
        }
    }

    public static void highlightNulls(Integer[] arr) {
        Integer[] highlightedArr = new Integer[arr.length];
        Arrays.fill(highlightedArr, 0);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                highlightedArr[i] = 1;
            }
        }

        System.out.println("Highlighted array: " + Arrays.toString(highlightedArr));
    }

}
