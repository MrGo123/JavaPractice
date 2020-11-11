package com.reflection;

/**
 * @ClassName User1
 * @Description TODO
 * @Author ZY
 * @Date2020/8/1 12:41
 * @Version 1.0
 **/
public class User1 {
    private int id;
    private String name;
    public String sex;
    public String testConstructor = "testGetFieldDone";

    public User1() {
    }

    public User1(int id, String name, String sex, String testConstructor) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.testConstructor = testConstructor;
    }

    @Override
    public String toString() {
        return "User1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", testConstructor='" + testConstructor + '\'' +
                '}';
    }

    public User1(String sex, String testGetField) {
        this.sex = sex;
        this.testConstructor = testGetField;
    }
}
