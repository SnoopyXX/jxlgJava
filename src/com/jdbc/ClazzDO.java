package com.jdbc;

import java.sql.SQLException;

public class ClazzDO {

    //新增
    public int save(Clazz clazz){
        int result = 0;
        String[] objs = {clazz.getId(),clazz.getName()};
        try {
            result= new DBUtils().getPre("insert into clazz values(?,?)",objs).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    //修改
    public int update(Clazz clazz){
        int result = 0;
        String[] objs = {clazz.getName(),clazz.getId()};
        try {
            result= new DBUtils().getPre("update clazz set name = ? where id = ?",objs).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
    //删除

    //查询

}
