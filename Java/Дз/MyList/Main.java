package com.company;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(24);
        list.add(70);
        list.add(30);
        list.add(21);
        list.add(8);
        list.add(23);
        System.out.println(list.toString());
        list.sort();
        System.out.println(list.toString());
    }
}
