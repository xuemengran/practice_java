package pers.xmr.javase.designpatterns;

/**
 * @author xmr
 * @date 2020/4/1 11:38
 * @description 单例模式
 */
public class SingleTon {
    public static void main(String[] args) {
        SingleTon singleTon = getInstance();
        SingleTon singleTon2 = getInstance();
        SingleTon singleTon3 = getSingleTon();
        SingleTon singleTon4 = getSingleTon();
        System.out.println(singleTon == singleTon2);
        System.out.println(singleTon3 == singleTon4);
    }

    private SingleTon(){}
    private static SingleTon singleTon;
    private static SingleTon singleTon2 = new SingleTon();
    // 单例模式,懒汉式,延迟加载
    public static SingleTon getInstance() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
    // 单例模式,饿汉式,创建的时候就加载
    public static SingleTon getSingleTon() {
        return singleTon2;
    }
    // 线程安全的单例模式
    public static  synchronized SingleTon getSingleTon2() {
        if (singleTon == null) {
            singleTon = new SingleTon();
        }
        return singleTon;
    }
    // 高性能的线程安全的单例模式
    public static SingleTon getSingleTon3() {
        if (singleTon == null) {
            synchronized (SingleTon.class) {
                singleTon = new SingleTon();
            }
        }
        return singleTon;
    }
}
