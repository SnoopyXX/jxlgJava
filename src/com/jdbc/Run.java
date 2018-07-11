package com.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Run {
    public static void main(String[] args) {
        ClazzDO clazzDO = new ClazzDO();
        Clazz clazz = new Clazz();
//        System.out.println(UUID.randomUUID().toString()
//                .replaceAll("-",""));
//        clazz.setId("7");
//        clazz.setName("7ban");
//        clazzDO.save(clazz);
        List<Object> list1 = new ArrayList<>();
//        list1.add("1");
        list1.add("一班");
        List<Clazz> list = clazzDO.find(list1);
        for (Clazz c:list
             ) {
            System.out.println(c.toString());
        }

//        System.out.println(clazzDO.delete("7"));
    }
}
