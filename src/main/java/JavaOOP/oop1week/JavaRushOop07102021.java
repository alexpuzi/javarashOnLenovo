package JavaOOP.oop1week;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла — FileInputStream.
 */
public class JavaRushOop07102021 {
    private static final String strForTest = "C:\\Users\\alexPuziAlphalegion\\IdeaProjects\\javarashOnLenovo\\src\\main\\resources\\forJavaRush.txt";
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//      String strEnter = bf.readLine();//для ввода пути к файлу
//
        List<Integer> integerList = new ArrayList<Integer>();
        FileInputStream fileInputStream = new FileInputStream(strForTest);
        Scanner scanner = new Scanner(fileInputStream);

        while(scanner.hasNext()){
            int value = scanner.nextInt();
            if (value % 2 == 0) integerList.add(value);
        }
        Collections.sort(integerList);

        for (Integer value : integerList) {
            System.out.println(value);
        }
        scanner.close();
        fileInputStream.close();
    }
}


