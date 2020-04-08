package pers.xmr.javase.designpatterns;

/**
 * @author xmr
 * @date 2020/4/2 19:37
 * @description 把公用的部分抽象出一个方法,不同的部分做成一个抽象类,交由子类实现
 */
public abstract class Template {
    public final void getTime() {
        long startTime = System.currentTimeMillis();
        handle();
        long endTime = System.currentTimeMillis();
        System.out.println("方法执行耗时! " + (endTime - startTime));
    }

    abstract void handle();
}
