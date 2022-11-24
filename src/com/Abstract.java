package com;

public class Abstract {
    public static void main(String[] args) {
        Person p1 = new Person() {
            @Override
            public void eat() {
                System.out.println("xih chi ");
            }
        };
        p1.eat();
    }
}
abstract class Person{
    int age ;
    String name ;
    abstract public void eat();
    public Person(int age , String name){
        this.age = age ;
        this.name = name ;
    }   public Person(){
    }
}
abstract class Student extends Person{
    @Override
    abstract public void eat() ;
    abstract public void walt();
    public  Student(int age ,String name ){
        super(age,name);
    }
    public  Student(){
    }
}
class Studen extends Student{
    @Override
    public void eat() {
    }
    @Override
    public void walt() {

    }
}