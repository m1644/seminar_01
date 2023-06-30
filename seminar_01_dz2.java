

/* Задание_2
Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public static int sum2d(String[][] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
        }
    }
    return sum;
}
*/

/* Ответ на задание_2
1. NumberFormatException: 
Если значение в ячейке arr[i][j] не может быть преобразовано в тип int при помощи метода Integer.parseInt(), 
то будет выброшено исключение NumberFormatException.
2. ArrayIndexOutOfBoundsException: 
Если значение i или j выходит за границы массива arr, то будет выброшено исключение ArrayIndexOutOfBoundsException.
3. NullPointerException: 
Если сам массив arr равен null или один из его элементов arr[i] равен null, 
то при попытке обратиться к ячейке arr[i][j] будет выброшено исключение NullPointerException.

Итого, в данном коде могут возникнуть три разных типа исключений: 
1. NumberFormatException
2. ArrayIndexOutOfBoundsException
3. NullPointerException
*/
