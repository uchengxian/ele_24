package com;

import java.awt.*;

public class interfaceS {
    public static void main(String[] args) {
        Plant p1 = new Plant();
        p1.fly();
        p1.flys();
        //静态方法只能自己使用
        Fly.methods();
        p1.methods1();
    }

}
interface Gong{
    void die();
}
interface Fly{
    //java8新特性可以在接口中定义一个静态方法
    public static void methods(){
        System.out.println("输出一条语句");
    }
    default void methods1(){
        System.out.println("输出了一个方法");
    }
    //public static final可省略自动修饰
    int MAX_ = 7000;
    int MIN_ = 1;
    //public abstract

    public abstract void fly();
    void flys();
}
class Plant implements Fly{

    @Override
    public void fly() {
        System.out.println("芜湖起飞");
    }

    @Override
    public void flys() {
        System.out.println("起飞结束");
    }
}
class Zd implements Fly,Gong{
    //继承多个接口重写方法
    @Override
    public void die() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void flys() {

    }
}