package com.chen.vip;

import com.chen.vip.bean.You;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: harry.chen
 * Date: 13-12-19
 * Time: 下午4:28
 */
public class MapShoot {
    public static void main(String[] args) {
                           List<You.Type> s = new ArrayList<You.Type>();
        s.add(You.Type.Man);
        s.add(You.Type.Women);
        s.add(You.Type.Man);
        System.out.println(s.toString());
        Map<String,String> map = new HashMap<String, String>();
        System.out.println(map.get("xx"));
        if(!map.containsKey("xx")){
            System.out.println(You.Type.Man);
        }
    }


}
