package pers.xmr.javase.basic;

/**
 * @author xmr
 * @date 2020/4/22 15:05
 * @description
 */
public class Cycle {
    public static void main(String[] args) {
        int index =0;
        ok:
        for (int i = 0 ; i < 100; i ++) {
            for (int j = 0 ; j < 1000; j++) {
                index ++;
                if (j == 5) {
                   // break ok;
                }
            }
        }
        System.out.println(index);
    }
}
