package JavaOOP.oop3week.forOOP2110202101;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaRushMovieFactory2110202101 {
    /*
    У нас есть кинофабрика, но она работает не в полную силу.
    Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
    Вот что тебе нужно сделать для успешного решения:
    Разобраться, что программа умеет делать.
    Все классы должны быть внутри класса Solution.
    Добавить классы Cartoon, Thriller.
            Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
    Аналогично получению объекта SoapOpera сделать:
    добавить в MovieFactory.getMovie получение объекта
    Cartoon для ключа "cartoon".
    добавить в MovieFactory.getMovie получение объекта
    Thriller для ключа "thriller".
    Считать с консоли несколько ключей (строк).
    Важно: ввод заканчивается, как только вводится строка
    не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
Создать переменную movie типа Movie и для каждой введенной строки (ключа):
получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
вывести на экран movie.getClass().getSimpleName().
Требования:
•	Классы Cartoon и Thriller должны быть статическими и
cуществовать внутри класса Solution.
•	Метод MovieFactory.getMovie должен возвращать объект типа
Cartoon при передаче ему строки "cartoon" в качестве параметра.
•	Метод MovieFactory.getMovie должен возвращать объект типа
Thriller при передаче ему строки "thriller" в качестве параметра.
•	Метод main должен считывать строки с клавиатуры.
•	Метод main должен прекращать считывать строки с клавиатуры,
если была введена некорректная строка (не "cartoon", не "thriller" или не "soapOpera").
•	Для каждой введенной строки (в том числе для некорректной)
необходимо вызвать метод MovieFactory.getMovie().
•	Для всех введенных корректных строк необходимо вывести на
экран простые имена (movie.getClass().getSimpleName()) типов объектов,
возвращаемых методом MovieFactory.getMovie().
     */
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7 >>>
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        while ((str = bf.readLine()) != null){
            Movie movie = MovieFactory.getMovie(str);
            if (movie == null){
                return;
            }
            System.out.println(movie.getClass().getSimpleName());
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            switch (key){
                case "soapOpera":
                    movie = new SoapOpera();
                    break;
                case "cartoon":
                    movie = new Cartoon();
                    break;
                case "thriller":
                    movie = new Thriller();
                    break;

            }
            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
//            if ("soapOpera".equals(key)) {
//                movie = new SoapOpera();
//            }

            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3
    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }
}
