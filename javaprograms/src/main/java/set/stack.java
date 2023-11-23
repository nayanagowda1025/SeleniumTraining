package set;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        // s.pop();
         //s.pop();
        System.out.println(s);
        s.peek();
        System.out.println(s);
       System.out.println( s.search(30));
	}

}
