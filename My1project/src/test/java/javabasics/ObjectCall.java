package javabasics;

public class ObjectCall {
    public static void main(String[] args) {
//        StaticAndNonstatic ss = new StaticAndNonstatic();
//        ss.m2();  // non static methods call only by create an object

        StaticAndNonstatic.m1(); // static methods call directly without creating an object

    }
}