package com.company;

public class Main {

    public static void main(String[] args) {
        OnlyReadable onlyReadable = PersonFactory.get("John", 30);
        onlyReadable.getName();
        onlyReadable.getAge();
    }
}
