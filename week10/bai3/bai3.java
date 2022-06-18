package bai3;

import java.util.Stack;

/**
 * bai3
 */
public class bai3 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(4);
        stack.push(5);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);

        while(!stack.empty()){
            int tmp = stack.pop();
            System.out.println(tmp);
            if(tmp == stack.lastElement()) stack.pop();
        }
    }
}