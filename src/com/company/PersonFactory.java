package com.company;

public class PersonFactory {

    public static OnlyReadable get(String name, int age){
        return new PersonMutable(name, age);
    }
}
