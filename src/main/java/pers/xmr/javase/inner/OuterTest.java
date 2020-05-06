package pers.xmr.javase.inner;

/**
 * @author xmr
 * @date 2020/4/2 20:44
 * @description
 */
public class OuterTest implements Runnable{

    int num = 1;

    @Override
    public void run() {
        
    }

    private class Inner {
        int num = 3;
        void testMethod() {

            System.out.println("Hello World! ");
        }
    }
    public void test() {
        Inner inner = new Inner();
        inner.testMethod();
        System.out.println(inner.num);
    }
    public static void main(String[] args) {
       OuterTest outer = new OuterTest();
       outer.test();
    }
}
