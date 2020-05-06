package pers.xmr.javase.thread;

/**
 * @author xmr
 * @date 2020/4/27 16:44
 * @description
 */
public class TheradTest extends Thread{
    public static void main(String[] args) {
       new TheradTest(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i ++) {
                    System.out.println("多线程1! " + i);
                }

            }
        }.start();
        new TheradTest(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i ++) {
                    System.out.println("多线程2! " + i );
                }

            }
        }.start();
    }

}
