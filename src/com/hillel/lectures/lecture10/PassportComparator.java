package com.hillel.lectures.lecture10;

import java.util.Comparator;

public class PassportComparator implements Comparator<Passport> {

    @Override
    public int compare(Passport o1, Passport o2) {
        return o1.getSeries().length() - o2.getSeries().length();
    }

}
