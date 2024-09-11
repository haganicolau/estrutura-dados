package com.datastructure.test;

public class Test {

    public static void main(String[] args) {
        SimpleHashSet<Name> set = new SimpleHashSet<>();
        Name name1 = new Name("teste");
        Name name2 = new Name("teste");
        boolean result1 = set.add(name1);
        boolean result2 = set.add(name2);
        boolean result3 = set.add(name1);
//        boolean result4 = set.remove(name1);
        name1.setName("teste2");
        System.out.println("encerrou");
    }
}

