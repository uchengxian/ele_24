package com;

public class Clas {
    public static void main(String[] args) {
        Persons.Students st = new Persons.Students();
        st.fun2();
//        调用非静态
        Persons p1 = new Persons();
        Persons.Man m1 = p1.new Man();
    }
}
class Persons{
    int age;
    String name ;
    public void fun(){
        System.out.println("输出了一个方法");
    }
    public void fun2(){
        System.out.println("输出了一个方法");
    }
    public void fun3(){
        System.out.println("输出了3个方法");
    }
    static
    public void fun4(){
        System.out.println("输出了4个方法");
    }
    static class Students{
        public void fun2(){
            System.out.println("输出了第二个方法");
        }
    }
    class Man{
        public void show(){
            System.out.println("输出了一个人");
        }
    }
}
