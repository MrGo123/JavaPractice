package com.zycollection;

import java.util.Iterator;
import java.util.Stack;

/**
 * @ClassName StackPra
 * @Description TODO
 * @Author ZY
 * @Date2020/11/11 19:35
 * @Version 1.0
 *
 * The <code>Stack</code> class represents a last-in-first-out
 * (LIFO) stack of objects. It extends class <tt>Vector</tt> with five
 * operations that allow a vector to be treated as a stack. The usual
 * <tt>push</tt> and <tt>pop</tt> operations are provided, as well as a
 * method to <tt>peek</tt> at the top item on the stack, a method to test
 * for whether the stack is <tt>empty</tt>, and a method to <tt>search</tt>
 * the stack for an item and discover how far it is from the top.
 * <p>
 * When a stack is first created, it contains no items.
 *
 * <p>A more complete and consistent set of LIFO stack operations is
 * provided by the {@link Deque} interface and its implementations, which
 * should be used in preference to this class.  For example:
 * <pre>   {@code
 *   Deque<Integer> stack = new ArrayDeque<Integer>();}</pre>
 *
 * @author  Jonathan Payne
 * @since   JDK1.0
 */
public class StackPra {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        //往栈中加入元素
        stack.add(1);

        //入栈
        stack.push(2);

        //往栈的指定位置加入元素
        stack.add(1, 3);

        //for each遍历栈
        for (Integer i : stack) {
            System.out.println(i);
        }

        //获取栈顶元素，但不弹出
        System.out.println(stack.peek());

        //获取栈顶元素，且弹出
        System.out.println(stack.pop());

        //使用迭代器遍历栈
        Iterator<Integer> iter = stack.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        //返回查询元素相对于栈顶的位置，栈顶位置=1，不存在则返回-1
        //元素1在栈中的位置相对于栈顶（1）为2
        System.out.println(stack.search(1));
        //查找不存在元素返回-1
        System.out.println(stack.search(4));

        //获取指定位置（vector中）元素
        //3
        System.out.println(stack.get(1));
        //1
        System.out.println(stack.get(0));

        //向栈中添加元素，与add相同
        stack.addElement(5);
        //5
        System.out.println(stack.get(2));
    }
}
