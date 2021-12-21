package com.hillel.lectures.lecture13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        names.add("Mike");
        names.add("Nick");

        Consumer<String> helloLambda = name -> System.out.println("Hello, " + name);
        Consumer<String> goodbyeLambda = name -> System.out.println("Goodbye, " + name);

        names.forEach(helloLambda);
        names.forEach(goodbyeLambda);


//        StringHandler stringHandler = new StringHandler() {
//            @Override
//            public void handle(String str, String another, int x) {
//                System.out.println(x + " Handle str: " + str + " " + another);
//            }
//        };

        StringHandler anotherStringHandler = (string, another, number) -> System.out.println(number + "Handle str: " + string + " " + another);
//
//        for (String name : names) {
//            anotherStringHandler.handle(name, "hello", 10);
//        }

//
//        Function<String, Integer> calculateLengthOfString = string -> string.length() * 2;
//        Function<Integer, Integer> multiplyOn3 = number -> number * 3;
//        Function<User, String> nameAndSurnameConcatenation = user -> user.getName() + " " + user.getLastName();

//        int newLength = calculateLengthOfString.apply("Hello");
//        int multipliedNumber = multiplyOn3.apply(4);
//        String fullName = nameAndSurnameConcatenation.apply(new User("Tom", "Cruise", 23));
//
//        System.out.println(newLength);
//        System.out.println(multipliedNumber);
//        System.out.println(fullName);
//        System.out.println();
//
//        Predicate<Integer> isOdd = number -> number % 2 == 0;
//        System.out.println(isOdd.test(23));
//        System.out.println(isOdd.test(24));
//        System.out.println(isOdd.test(0));

        names.add("asdasdasdasdasdasd");
        names.add("adzxczxzcxzcssssssssssssss");
        names.add("czx");
        names.add("we");
        names.add("s");
//        List<String> filteredStrings = filterStringMore10(names);
//        System.out.println(filteredStrings);
//        filteredStrings = filterStringMore3(names);
//        System.out.println(filteredStrings);


//        List<String> longString = filterString(names, s -> s.length() > 10);
//        List<String> shortStrings = filterString(names, s -> s.length() < 10);
//        List<String> stringsStartedWithA = filterString(names, s -> s.toUpperCase().charAt(0) == 'A' );
//
//        System.out.println(longString);
//        System.out.println(shortStrings);
//        System.out.println(stringsStartedWithA);


//        User nick = new User("Nick", "", 20);
//        System.out.println(nick);
//        UnaryOperator<User> updateLastName = user -> {
//            user.setLastName("Kick");
//            return user;
//        };
//        User updatedNick = updateLastName.apply(nick);
//        System.out.println(updatedNick);


//        BiFunction<Double, Integer, String> testBiFunction = (firstNumber, secondNumber) ->
//                "New string is: " + firstNumber + " - " + secondNumber;
//
//        System.out.println(testBiFunction.apply(23.4, 6));


        Random random = new Random();

        Supplier<Integer> generator = () -> random.nextInt();

        System.out.println(generator.get());
        System.out.println(generator.get());
        System.out.println(generator.get());

    }

    private static List<String> filterString(List<String> strings, Predicate<String> isValid) {
        List<String> filtered = new ArrayList<>();
        strings.forEach(s -> {
            if (isValid.test(s)) {
                filtered.add(s);
            }
        });
        return filtered;
    }

    private static List<String> filterStringMore10(List<String> strings) {
        List<String> filtered = new ArrayList<>();
        strings.forEach(s -> {
            if (s.length() > 10) {
                filtered.add(s);
            }
        });
        return filtered;
    }

    private static List<String> filterStringMore3(List<String> strings) {
        List<String> filtered = new ArrayList<>();
        strings.forEach(s -> {
            if (s.length() > 3) {
                filtered.add(s);
            }
        });
        return filtered;
    }

}