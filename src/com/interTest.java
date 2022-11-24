package com;

public class interTest {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        U u1 = new U();

        c1.trans(u1);
    }
}
class Computer{
    public void trans(USB usb)
    {
        usb.start();
        System.out.println("做了一系列的操作");
        usb.start();
    }
}
interface USB{
    public abstract  void start();
    void  stop();
}
class U implements USB{

    @Override
    public void start() {
        System.out.println("实现了usb的接口");
    }

    @Override
    public void stop() {
        System.out.println("实现了usb的停止");
    }
}
