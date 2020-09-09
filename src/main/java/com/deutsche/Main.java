package com.deutsche;

import demo.Person;
import homework.Vector;

/**
 * @author Evgeny Borisov
 */
public class Main {

    public static void main(String[] args) {
        var dynArray = new Vector();
        System.out.println(dynArray);
        dynArray.push_back(2);
        dynArray.push_front(1);
        System.out.println(dynArray);
        dynArray.push_back(4);
        dynArray.push_front(3);
        dynArray.push_back(6);
        dynArray.push_front(7);
        System.out.println(dynArray);
        System.out.println(dynArray.get(0));
        System.out.println(dynArray.get(3));
    }
}
