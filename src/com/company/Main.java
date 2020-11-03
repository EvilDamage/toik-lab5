package com.company;

public class Main {

    public static void main(String[] args) {
        StackOperations stack = new Stack();

        System.out.println(stack.get());
        System.out.println(stack.pop());

        stack.push("Ala");
        stack.push("ma");
        stack.push("kota");
        stack.push("a");
        stack.push("kot");
        stack.push("ma");
        stack.push("Ale");

        System.out.println(stack.get());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.get());

    }
}
