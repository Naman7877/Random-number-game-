package com.company;

class th1 extends Thread{
    public th1(String name)
    {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("this is thread 1");
    }
}
class th2 extends Thread{
    public th2(String s1)
    {
        super(s1);
    }

    @Override
    public void run() {
        System.out.println("this is 2 thread");
    }
}


class th3 implements Runnable{
    @Override
    public void run() {
        System.out.println("this is thread 3");
    }
    void th3(String name)
    {
        System.out.println(name);
    }
}
public class thread {
    public static void main(String[] args) {
    th1 obj1=new th1("naman");
    th2 obj2=new th2("naman");
        obj1.start();
        obj2.start();
        System.out.println("the is  is "+ obj1.getId());
        System.out.println("the is  is "+ obj2.getId());
        System.out.println("the is  is "+ obj1.getName());

        th3 obj3=new th3();
        Thread t1=new Thread(obj3);
        System.out.println(t1.getId());



    }
}