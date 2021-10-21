package JavaOOP.oop1week;
import java.io.*;
import java.util.Scanner;
/*
В этой задаче тебе нужно:
Считать с консоли путь к файлу.
Вывести в консоли (на экран) содержимое файла.
Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
Требования:
•	Программа должна считывать c консоли путь к файлу.
•	Программа должна выводить на экран содержимое файла.
•	Поток чтения из файла (FileInputStream) должен быть закрыт.
•	BufferedReader также должен быть закрыт.
 */
public class JRoop0510202100 {
    private static final String strForTest = "C:\\Users\\alexPuziAlphalegion\\IdeaProjects\\javarashOnLenovo\\src\\main\\resources\\forJavaRush.txt";
    private static final int intForTest = 12345;
    public static void main(String[] args) throws IOException{

    /*
    ////////////мой вариант///////////////
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String whereFile = bf.readLine();
//        OutputStream outputStream = new FileOutputStream(whereFile);//Запись объекта MyClass в фай
//        outputStream.write(1233);
//        outputStream.close();
        InputStream inputStream = new FileInputStream(whereFile);
//        InputStream inputStream = new FileInputStream(strForTest);
        inputStream.read();
        System.out.println(inputStream.read());
        inputStream.close();
     ////////////мой вариант///////////////
     */
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      String sourceFileName = bf.readLine();
      FileInputStream fi = new FileInputStream(sourceFileName);
      Scanner sc = new Scanner(fi);
      StringBuilder strB = new StringBuilder();
      while (sc.hasNext()){
          strB.append(sc.nextLine()).append("\n");
      }
      System.out.println(strB.toString());
      sc.close();
      bf.close();
    }
    public static class MyObject{
        MyObject(){

        }
    }
}