package Model.ADT;

import Model.Exceptions.ADTException;
import java.util.Stack;

public class MyStack<T> implements IStack<T> {
    private Stack<T> stk;

    public MyStack(){
        this.stk = new Stack<T>();
    }
    @Override
    public T pop() throws ADTException {
        if (stk.isEmpty()){
            throw new ADTException("Stack is empty");
        }
        return stk.pop();
    }

    @Override
    public void push(T value) {
        stk.push(value);
    }

    @Override
    public boolean isEmpty(){
        return stk.isEmpty();
    }

    @Override
    public Stack<T> getStack() {
        return stk;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        for (T el: stk){
            str.append(el).append(" ");
        }
        return str.toString();
    }
}
