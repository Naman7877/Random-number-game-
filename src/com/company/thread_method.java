package com.company;

class srt extends Thread{

    public void run() {
        while (true){
            System.out.println("this is thread");
        }
    }
}
class thre extends Thread
{
    public void run()
    {
        while (true)
        {
            System.out.println(" naman ");
        }
    }
}

public class thread_method {
    public static void main(String[] args)  {
        srt s1=new srt();

        thre th=new thre();
//      s1.start();
//        try {
//            s1.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //th.start();
        System.out.println(th.getState());
        System.out.println(th.currentThread().getState());
        System.out.println(th.getId());
        System.out.println(th.getName());
        System.out.println(th.getPriority());
        System.out.println(th.getContextClassLoader());
        System.out.println(th.isAlive());
        System.out.println(th.isDaemon());





//        int i = s1.activeCount();
//        System.out.println(i);
//        //s2.checkAccess(s1);
//        var state = s1.getState();
//        System.out.println(state);


    }

    private static class srt2 {
        public void start() {
        }
    }
}
