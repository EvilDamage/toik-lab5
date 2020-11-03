package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Stack implements StackOperations{

    private ArrayList<String> stack = new ArrayList<>();

    @Override
    public List<String> get() {
        return stack;
    }

    @Override
    public Optional<String> pop() {
        if(stack.isEmpty()){
            return Optional.empty();
        }

        Optional<String> lastStackItem = Optional.of(stack.get(stack.size() - 1));
        stack.remove(stack.size() - 1);
        return lastStackItem;
    }

    @Override
    public void push(String item) {
        stack.add(item);
    }
}
