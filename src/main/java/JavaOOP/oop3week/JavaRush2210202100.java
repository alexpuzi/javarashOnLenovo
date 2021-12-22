package JavaOOP.oop3week;

import java.util.List;
import java.util.ArrayList;

/*
В этой задаче тебе нужно:
Реализовать метод cleanAllApartments().
Пройтись по списку объектов apartments:
для однокомнатных квартир (OneRoomApt) вызвать метод clean1Room();
для двухкомнатных квартир (TwoRoomApt) вызвать метод clean2Rooms();
для трехкомнатных квартир (ThreeRoomApt) вызвать метод clean3Rooms().
Требования:
•	Метод cleanAllApartments должен принимать список
аппартаметов в качестве параметра.
•	В методе cleanAllApartments для всех однокомнатных
аппартаментов (OneRoomApt), содержащихся в списке,
необходимо вызвать метод clean1Room().
•	В методе cleanAllApartments для всех двухкомнатных
аппартаментов (TwoRoomApt), содержащихся в списке,
 */
public class JavaRush2210202100 {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());
        new ThreeRoomApt().clean3Rooms();
        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {

        for (int i = 0; i < apartments.size(); i++) {
            if (apartments.get(i) instanceof OneRoomApt) {
                ((OneRoomApt) apartments.get(i)).clean1Room();
            } else if (apartments.get(i) instanceof TwoRoomApt) {
                ((TwoRoomApt) apartments.get(i)).clean2Rooms();
            } else if (apartments.get(i) instanceof ThreeRoomApt) {
                ((ThreeRoomApt) apartments.get(i)).clean3Rooms();
            }
        }
        //решение JavaRush
        for (Apartment apartment : apartments) {
            if (apartment instanceof OneRoomApt) ((OneRoomApt) apartment).clean1Room();
            else if (apartment instanceof TwoRoomApt) ((TwoRoomApt) apartment).clean2Rooms();
            else if (apartment instanceof ThreeRoomApt) ((ThreeRoomApt) apartment).clean3Rooms();
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}

