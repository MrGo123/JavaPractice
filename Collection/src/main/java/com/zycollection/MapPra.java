package com.zycollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName MapPra
 * @Description TODO
 * @Author ZY
 * @Date2020/8/20 10:14
 * @Version 1.0
 **/
public class MapPra {
    public static void main(String[] args) {
        //定义一个map，hashMap
        Map<Integer, String> aMap = new HashMap<Integer, String>();
        Map<Integer, String> bMap = new HashMap<Integer, String>();

        //存入键值对
        aMap.put(1, "one");
        aMap.put(2, "two");
        aMap.put(4, "four");
        bMap.put(1, "one");
        bMap.put(2, "two");

        //查询是否存在key
        System.out.println(aMap.containsKey(1));

        //查询是否存在某个value
        System.out.println(aMap.containsValue("one"));

        //使用equals匹配两个map，观察是否相同
        System.out.println(aMap.equals(bMap));

        //通过key获取一个元素
        System.out.println(aMap.get(1));

        //调用方法，观察是否map为空
        System.out.println(aMap.isEmpty());

        //获取map长度
        System.out.println(aMap.size());

        //移除一个键值对
        System.out.println(aMap.remove(1, "one"));

        //使用for each，调用keyset()，通过key遍历
        for (Integer key : aMap.keySet()) {
            System.out.println(key + "=" + aMap.get(key));
        }

        //使用for each，调用Map的entrySet()，获取key和value
        for (Map.Entry<Integer, String> entry : aMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
