package app.leetcode;

import java.util.HashMap;
import java.util.Stack;

/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

Input s = "{[{()}]}"
Output: true

Solution :

Rough -
1. We may need pair of all available parentheses 
2. if string is started with { then it should end with }
3. {[{()}]} as we can see here string is started with { and it has ended with } same applies for all chars in all positions in the string
4. start = 0 | end = length - 1
5. start = 0,1,2,3,4,5,6,7 | end = end - start // this way we will get the even index of both sides of char array
*/

public class ValidParentheses {

	public static boolean runV1(String s) {

		if (s.length() == 1 || s.length() % 2 != 0) {
			return false;
		}

		HashMap<Character, Character> parenthesesPair = new HashMap<Character, Character>();
		parenthesesPair.put('(', ')');
		parenthesesPair.put('{', '}');
		parenthesesPair.put('[', ']');
		
		parenthesesPair.hashCode();

		System.out.println("Input string length = " + s.length());

		for (int i = 0, j = 1; j <= s.length() - 1; i += 2, j += 2) {
			System.out.println(">>>> LOOP ITERATION START >>>> ");
			char one = s.charAt(i);
			char two = s.charAt(j);
			System.out.println("i = " + i + " | j = " + j);

			System.out.print("Comparing " + one + " = " + two);

			if (!parenthesesPair.containsKey(one)) {
				return false;
			}

			if (two == parenthesesPair.get(one)) {
				System.out.println(" YES");
				System.out.println("<<<< LOOP ITERATION END <<<<");
				continue;
			} else {
				System.out.println(" NO");
				System.out.println("<<<< LOOP ITERATION END <<<<");
				return false;
			}
		}
		return true;
	}

	// {[{()}]}
	public static boolean runV2(String s) {
		if (s.length() == 1 || s.length() % 2 != 0) {
			return false;
		}

		HashMap<Character, Character> parenthesesPair = new HashMap<Character, Character>();
		parenthesesPair.put('(', ')');
		parenthesesPair.put('{', '}');
		parenthesesPair.put('[', ']');

		System.out.println("Input string length = " + s.length());

		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			System.out.println(">>>> LOOP ITERATION START >>>> ");
			char one = s.charAt(i);
			char two = s.charAt(j);

			System.out.println("i = " + i + " | j = " + j);
			System.out.print("Comparing " + one + " = " + two);

			if (!parenthesesPair.containsKey(one)) {
				return false;
			}

			if (two == parenthesesPair.get(one)) {
				System.out.println(" YES");
				System.out.println("<<<< LOOP ITERATION END <<<<");
				continue;
			} else {
				System.out.println(" NO");
				System.out.println("<<<< LOOP ITERATION END <<<<");
				return false;
			}

		}
		return true;
	}

	// {[]}
	public static boolean runV3(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(')
				stack.pop();
			else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{')
				stack.pop();
			else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[')
				stack.pop();
			else
				return false;
		}
		return stack.isEmpty();
	}
}
