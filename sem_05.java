import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


/* Задание №5
Дан класс - https://github.com/sabinaIsm/test/blob/d2ebf811b85139783b1a0dcbe3714dbb28deee82/RandomExceptionsClass.java
Запустите код, с помощью анализа стектрейса найдите и по возможности исправьте ошибки, 
добейтесь корректного выполнения программы.
*/

public class sem_05 {

    public static void main(String[] args) throws IOException {
        callMethod6("");
        //ArrayList<String> stringArraysList = (ArrayList<String>) callMethod1();
        int a=10, b=0;
        callMethod6("");
        int div = callMethod2(a, b);
        System.out.println(div);
        callMethod6("");
        //callMethod3(stringArraysList);
    }

    private static void callMethod6(String s) {
        System.out.println("Hello World, it's me!");
    }

    private static void callMethod3(ArrayList<String> stringArraysList) {
        callMethod6("");
        callMethod3(stringArraysList);
    }

    private static Collection<String> callMethod1() throws IOException {
        callMethod2(100000000, 10-10);
        return new LinkedList<>();
    }

    public static int callMethod2(int a, int b) throws IOException {
        callMethod6("");
//        FileInputStream fis = new FileInputStream("1.txt");
//        fis.read();
//
//        if(fis.available() > 0) throw new RuntimeException();
        int num = callMethod4("1240");
        return 1;
    }

    private static int callMethod4(String s) {
        callMethod5(s);
        return Integer.parseInt(s);
    }

    private static void callMethod5(String s) {
        callMethod6("");
        String[] strings = new String[5];
        for (int i = 0; i < strings.length; i++){
            strings[i] = s;
        }
    }
}
