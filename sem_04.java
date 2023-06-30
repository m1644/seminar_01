


/* Задание №4
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее сообщение пользователю.
*/

public class sem_04 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        int result = sumElements(matrix);
        if (result == -1) {
            System.out.println("Количество строк не равно количеству столбцов!");
        } else if (result == -2) {
            System.out.println("Массив должен содержать только 0 и 1!");
        } else {
            System.out.printf("Сумма элементов массива: %d", result);
        }
    }
    public static int sumElements(int[][] matrix) {
        int n = matrix.length;

        // проверяем, является ли массив квадратным
        for (int[] row : matrix) {
            if (row.length != n) {
                return -1;
            }
        }

        // проверяем, что в каждой ячейке лежит 0 или 1
        for (int[] row : matrix) {
            for (int element : row) {
                if (element != 0 && element != 1) {
                    return -2;
                }
            }
        }

        // считаем сумму элементов
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }

}
