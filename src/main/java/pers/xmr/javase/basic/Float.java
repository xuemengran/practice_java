package pers.xmr.javase.basic;

import java.text.DecimalFormat;
import java.math.BigDecimal;
/**
 * @author xmr
 * @date 2020/3/16 10:31
 * @description
 */
public class Float {
    public static void main(String[] args) {
        DecimalFormat dcmFmt = new DecimalFormat("0.00");
        System.out.println(Double.valueOf(dcmFmt.format(1.1 + 2.2)));

        BigDecimal add = new BigDecimal("1.1").add(new BigDecimal("2.2"));
        System.out.println(add);
    }
}
