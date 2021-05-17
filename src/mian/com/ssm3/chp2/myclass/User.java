package mian.com.ssm3.chp2.myclass;

import java.util.List;

public class User {
    private String name;
    private int age;
    private List<String> list;

    public User(String name,int age,List<String> list){
        super();
        this.name=name;
        this.age=age;
        this.list=list;
    }

    public User(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                '}';
    }
}
