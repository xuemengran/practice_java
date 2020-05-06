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
        jsonObject.put("KEY1", "");
        jsonObject.put("KEY2", "");
        jsonObject.put("KEY3" , 0.0);
        jsonObject.put("KEY4" , "");
        jsonObject.put("KEY5" , "");
        System.out.println(jsonObject.toJSONString());
    }


}
