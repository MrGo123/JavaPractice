package com.zy;

import java.util.Arrays;

/**
 * @ClassName GenericsDemo
 * @Description TODO
 * @Author ZY
 * @Date2020/8/4 14:56
 * @Version 1.0
 **/
public class GenericsDemo {
    public static void main(String[] args) {
        String[] ss = new String[]{"orange", "apple", "pear"};
        //使用数组的排序函数
        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss));
    }
}
