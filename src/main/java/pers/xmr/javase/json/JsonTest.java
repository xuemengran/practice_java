package pers.xmr.javase.json;

import com.alibaba.fastjson.JSONObject;

/**
 * @author xmr
 * @date 2020/4/2 11:18
 * @description
 */
public class JsonTest {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.toString());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("MER_DISCOUNT_CUSTID", "");
        jsonObject.put("MER_FROZEN_VOUCHERSN", "");
        jsonObject.put("MER_DISCOUNT" , 0.0);
        jsonObject.put("MER_DISCOUNT_STATE" , "");
        jsonObject.put("MER_DISCOUNT_ACCOUNTID" , "");
        System.out.println(jsonObject.toJSONString());
    }


}
