package JavaOOP.oop4week;

import jdk.nashorn.internal.runtime.regexp.joni.exception.ValueException;

import javax.xml.bind.ValidationException;
import javax.xml.ws.WebServiceException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.regex.PatternSyntaxException;

/*
Заполни список exceptions десятью различными исключениями.
Первое исключение уже реализовано в методе initExceptions.

Требования:
•	Список exceptions должен содержать 10 элементов.
•	Все элементы списка exceptions должны быть исключениями (потомками класса Throwable).
•	Все элементы списка exceptions должны быть уникальны.
•	Метод initExceptions должен быть статическим.
 */

public class JavaRashOOPExcep0111202100 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

//        } catch (ArithmeticException e) {
//            exceptions.add(e);
//        } catch (NumberFormatException e) {
//            exceptions.add(e);
//        } catch (MissingFormatArgumentException e) {
//            exceptions.add(e);
//        } catch (FormatterClosedException e) {
//            exceptions.add(e);
//        } catch (PatternSyntaxException e) {
//            exceptions.add(e);
//        } catch (StringIndexOutOfBoundsException e) {
//            exceptions.add(e);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            exceptions.add(e);
//        } catch (TypeNotPresentException e) {
//            exceptions.add(e);
//        } catch (WebServiceException e) {
//            exceptions.add(e);
//        } catch (ValueException e) {
//            exceptions.add(e);
        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ClassCastException());
        exceptions.add(new IOException());
        exceptions.add(new InterruptedIOException());
        exceptions.add(new InterruptedException());
        exceptions.add(new SecurityException());
    }
}

