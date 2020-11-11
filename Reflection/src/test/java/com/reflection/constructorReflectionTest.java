package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;

/**
 * @ClassName constructorReflectionTest
 * @Description TODO
 * @Author ZY
 * @Date2020/8/1 13:51
 * @Version 1.0
 **/
public class constructorReflectionTest {
    public static void main(String[] args) throws Exception {
        User1 user1 = new User1();
        Class user1Class = User1.class;

        //调用含参构造器
        Constructor user1ConstrPra = user1Class.getConstructor(String.class, String.class);
        System.out.println(user1ConstrPra);
        //创建对象
        Object newUser1 = user1ConstrPra.newInstance("男", "testConstructor");
        System.out.println(newUser1);

        Constructor[] constructors = user1Class.getConstructors();
        System.out.println(constructors);

        Constructor constrDeclared = user1Class.getDeclaredConstructor(int.class, String.class, String.class, String.class);
        System.out.println(constrDeclared);


    }
}
