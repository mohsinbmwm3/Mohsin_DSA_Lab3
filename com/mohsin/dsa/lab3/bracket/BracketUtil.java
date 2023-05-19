package com.mohsin.dsa.lab3.bracket;

import java.util.Deque;
import java.util.ArrayDeque;

class BracketUtil {
    boolean areBracketsBalanced(String expr) {
		Deque<Character> stack = new ArrayDeque<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);
			
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}

			if (stack.isEmpty()) return false;
			
			char top = stack.pop();
			switch (x) {
				case ')':
					if (top == '{' || top == '[') return false;
					break;
					
				case '}':
					if (top == '(' || top == '[') return false;
					break;

				case ']':
					if (top == '(' || top == '{') return false;
					break;
			}
		}
		return stack.isEmpty();
	}
}
