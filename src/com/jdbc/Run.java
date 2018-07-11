package com.jdbc;

import java.util.UUID;

public class Run {
    public static void main(String[] args) {
        ClazzDO clazzDO = new ClazzDO();
        Clazz clazz = new Clazz();
        System.out.println(UUID.randomUUID().toString()
                .replaceAll("-",""));
//        clazz.setId("7");
//        clazz.setName("7ban");
//        clazzDO.save(clazz);
    }
}
