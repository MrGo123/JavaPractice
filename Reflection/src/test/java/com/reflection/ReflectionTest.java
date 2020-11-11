package com.reflection;

import java.lang.reflect.Field;

public class ReflectionTest {
    public static <field> void main(String[] args) throws Exception {

        //      一、获取Class对象的三种方法
        System.out.println("一、获取Class对象的三种方法");
        //      1. Class.forName("全类名")
        Class userForName = Class.forName("com.reflection.User");
        System.out.println(userForName);
        //      2.className.class
        Class userClass = User.class;
        System.out.println(userClass);
        //      3.getClass()
        User user = new User();
        Class getUser = user.getClass();
        System.out.println(getUser);

        //********************************************************//
        //    二、Class对象功能
        System.out.println("二、Class对象功能");
        //       * 获取成员变量
        //        1.获取所有public修饰的成员变量：Class.getFields()
        System.out.println("1.获取所有public修饰的成员变量");
        Field[] fields = userForName.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        //        2. 获取一个指定名称的public修饰的成员变量：Class.getField(“变量名”)
        System.out.println("2.获取一个指定名称的public修饰的成员变量");
        Field fields1 = userClass.getField("testGetField");
        System.out.println(fields1);
        System.out.println("操作部分——获取与设置对应的值");
        //         操作
        //        (1). 获取一个field对象（即成员变量）的值：field对象.get(Class对象)
        System.out.println(fields1.get(user));
        //        (2). 设置一个成员变量的值：field对象.set(Class对象,"值")
        fields1.set(user, "changed");
        System.out.println(user.testGetField);

        //        3. 获取(User的)所有的成员变量
        System.out.println("3.获取所有成员变量");
        Field[] declaredFields = userForName.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        System.out.println("4.获取一个public成员变量");
        //获取public变量的值
        Field oneDelcaredField = userForName.getDeclaredField("testGetField");
        System.out.println(oneDelcaredField.get(user));
        System.out.println("4.获取一个private成员变量的值");
        //获取private变量的值
        Field onePrivateDeclaredField = userForName.getDeclaredField("id");
        onePrivateDeclaredField.setAccessible(true);//暴力反射
        Object value = onePrivateDeclaredField.get(user);
        System.out.println(value);

        System.out.println(user);
    }
}
