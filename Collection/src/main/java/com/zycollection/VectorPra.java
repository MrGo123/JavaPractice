package com.zycollection;

import java.util.Iterator;
import java.util.Vector;

/**
 * @ClassName VectorPra
 * @Description TODO
 * @Author ZY
 * @Date2020/11/11 21:13
 * @Version 1.0
 **/
public class VectorPra {
    public static void main(String[] args) {
        //初始默认容量为10，呈两倍扩容
        Vector<Integer> vector = new Vector<Integer>();
        //初始容量设定为3，每次扩容容量加2
        Vector<Integer> vector2 = new Vector<Integer>(3,2);

        //往vector中添加一个元素
        vector.add(1);
        vector.add(2);
        for (Integer i : vector) {
            System.out.println(i);
        }
        vector2.add(3);
        vector2.add(4);

        //往vector中添加 一个集合 的元素
        vector.addAll(vector2);
        for (Integer i : vector) {
            System.out.println(i);
        }
        //返回当前向量的容量
        System.out.println(vector.capacity());
        //返回当前向量元素数
        System.out.println(vector.size());
        //返回第一个元素
        System.out.println(vector.firstElement());
        //判空
        System.out.println(vector.isEmpty());
        //移除指定位置元素
        vector.remove(1);
        Iterator<Integer> iter = vector.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
