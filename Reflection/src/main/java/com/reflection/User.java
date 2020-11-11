package com.reflection;

public class User {
    private int id;
    private String name;
    public String sex;
    public String testGetField = "testGetFieldDone";

    public int getId() {
        return id;
    }

    public User() {
    }

    public User(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", testGetField='" + testGetField + '\'' +
                '}';
    }
}
