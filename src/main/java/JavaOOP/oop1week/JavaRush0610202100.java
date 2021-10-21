package JavaOOP.oop1week;

/*
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл:
каждую строчку — с новой строки.
Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего считывать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь
не введет строку "exit".
•	Программа должна записать все введенные строки
 (включая "exit", но не включая имя файла) в файл:
 каждую строчку — с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter
после использования.
•	Метод main не должен выводить данные на экран.
 */

import java.io.*;

public class JavaRush0610202100 {
    private static final String strForTest = "C:\\Users\\alexPuziAlphalegion\\IdeaProjects\\javarashOnLenovo\\src\\main\\resources\\forJavaRush.txt";
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        BufferedWriter bfr = new BufferedWriter(new FileWriter(str));
        StringBuilder builder = new StringBuilder();
        String s = "";
        while(!str.equals("exit"))
            str = bf.readLine();
        builder.append(s).append("\n");
        bfr.write(builder.toString());
        bfr.close();
    }
}
