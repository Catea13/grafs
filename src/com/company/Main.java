package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Graph G9 are 7 puncte = 7 persoane
        Person P1 = new Person("P1");
        Person P2 = new Person("P2");
        Person P3 = new Person("P3");
        Person P4 = new Person("P4");
        Person P5 = new Person("P5");
        Person P6 = new Person("P6");
        Person P7 = new Person("P7");
        // Make connections between people
        P1.addFriends(P5, P4, P3, P2);
        P2.addFriends(P1, P3, P7);
        P3.addFriends(P1, P2, P6);
        P4.addFriends(P1, P6);
        P5.addFriends(P1, P6);
        P6.addFriends(P5, P4, P3, P7);
        P7.addFriends(P2, P6);
        ArrayList<Person> personList = new ArrayList<Person>(




                Arrays.asList(P1, P2, P3, P4, P5, P6, P7));
        for (Person person : personList) {
            person.printFriendList();
        }
    }
}
    