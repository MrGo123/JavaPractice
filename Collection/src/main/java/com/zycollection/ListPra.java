package com.zycollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName ListPra
 * @Description test List
 * @Author ZY
 * @Date2020/8/19 16:44
 * @Version 1.0
 **/
public class ListPra {
    public static void main(String[] args) {
        //声明并定义一个LinkedList
        // List<String> nameList = new LinkedList<String>();
        List<String> nameList = new ArrayList<String>();

        //List.add()
        nameList.add("he");
        nameList.add("ye");
        nameList.add("huang");
        nameList.add("lv");
        nameList.add("gan");
        nameList.add("li");
        nameList.add("liu");
        nameList.add("guan");

        //在指定位置插入元素，该位置往后的元素向后移
        nameList.add(2, "insert to 2");
        nameList.add(3, "insert to 3");

        //删除指定元素
        nameList.remove("he");

        //删除指定位置的元素
        nameList.remove(0);


        //获取指定位置的元素
        System.out.println(nameList.get(2));

        //使用Iterator调用nameList中的iterator方法，hasNext()判断下一个元素是否为空
        for (Iterator<String> it = nameList.iterator(); it.hasNext(); ) {
            //next()取元素
            System.out.println(it.next());
        }

        //清空List
        nameList.clear();
        System.out.println(nameList.size());

        //使用for each输出List内容
        // for (String c:nameList){
        //     System.out.println(c);
        // }

    }
}