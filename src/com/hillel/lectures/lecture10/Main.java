package com.hillel.lectures.lecture10;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
//        HashMap<String, Integer> countryToPopulation = new HashMap<>();
//        countryToPopulation.put("Ukraine", 40_000_000);
//        countryToPopulation.put("Canada", 32_000_000);
//        countryToPopulation.put("China", 2_000_000_000);
//        System.out.println(countryToPopulation);
//        countryToPopulation.put("Ukraine", 22_000_000);
//        System.out.println(countryToPopulation);
//
//        int ukrainePopulation = countryToPopulation.get("Ukraine");
//        System.out.println(ukrainePopulation);
//
//        HashMap<String, List<String>> surnameToNames = new HashMap<>();
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Barak");
//        names.add("Michel");
//        surnameToNames.put("Obama", names);
//        System.out.println(surnameToNames);

        Passport mikesPassport = new Passport("KM", "123123");
        Passport nicksPassport = new Passport("DCA", "233334");
        Passport nPassport = new Passport("A", "233334");
        Passport mPassport = new Passport("Aasdasdasd", "233334");
        Person mike = new Person("Mike", 23);
        Person nick = new Person("Nick", 48);
        mike.setPassport(mikesPassport);
        nick.setPassport(nicksPassport);

        TreeMap<Passport, Person> passportToPerson = new TreeMap<>(new PassportComparator().reversed());
        passportToPerson.put(mike.getPassport(), mike);
        passportToPerson.put(nick.getPassport(), nick);
        passportToPerson.put(mPassport, mike);
        passportToPerson.put(nPassport, nick);
        System.out.println(passportToPerson);

//        for (Map.Entry<Passport, Person> entry : passportToPerson.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        passportToPerson.forEach((passport, person) -> {
//            System.out.println(passport);
//            System.out.println(person);
//        });
//
//
//        System.out.println(passportToPerson.containsKey(mikesPassport));

//        for (Passport passport : passportToPerson.keySet()) {
//            System.out.println(passport);
//        }
//
//        for (Person person : passportToPerson.values()) {
//            System.out.println(person);
//        }


    }

}