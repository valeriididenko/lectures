package com.hillel.lectures.lecture11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        TreeSet<String> names = new TreeSet<>();
//        names.add("Nick");
//        names.add("Mike");
//        names.add("Clark");
//        names.add("zczc");
//        names.add("zczcasd");
//        names.add("Azxc");
//        names.add("BB");
//        System.out.println(names);
//
//        System.out.println(names.headSet("Clark", true));
//        System.out.println(names.first());
//        System.out.println(names.last());
//
//        HashSet<String> anotherNames = new HashSet<>();
//        anotherNames.add("Mike");
//        anotherNames.add("Clark");
//        anotherNames.add("zczc");
//        System.out.println(anotherNames);
//
//        names.retainAll(anotherNames);
//        System.out.println(names);
//        System.out.println(anotherNames);


//        Vector<String> vector = new Vector<>();
//        vector.add("Aasd");
//
//        Enumeration<String> elements = vector.elements();

//        HashSet<String> names = new HashSet<>();
//        names.add("Mike");
//        names.add("Clark");
//        names.add("zczc");
//        System.out.println(names);
//
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()) {
//            String name = iterator.next();
//            iterator.remove();
//            iterator.remove();
//            System.out.println(name);
//        }
//
//        System.out.println(names);

        List<Integer> money = new ArrayList<>();
        money.add(100);
        money.add(200);
        money.add(13);
        money.add(15);
        money.add(14);

        Iterator<Integer> iterator = money.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next == 200) {
                iterator.remove();
            }
            System.out.println(next);
        }

//        ListIterator<Integer> integerListIterator = money.listIterator();
//        while (integerListIterator.hasNext()) {
//            int nextIndex = integerListIterator.nextIndex();
//            Integer integer = integerListIterator.next();
//            if (nextIndex == 3) {
//                integerListIterator.add(integer * 100);
//            }
//            System.out.println(nextIndex + ": " + integer);
//        }

        System.out.println(money);

//        System.out.println();
//        while (integerListIterator.hasPrevious()) {
//            int previousIndex = integerListIterator.previousIndex();
//            Integer integer = integerListIterator.previous();
//            System.out.println(previousIndex + ": " + integer);
//        }
    }

}