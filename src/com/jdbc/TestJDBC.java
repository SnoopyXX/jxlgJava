package com.jdbc;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        //   alt + enter   ctrl + 1
        ResultSet rs = null;
        PreparedStatement pspt = null;
        Connection connection = null;
        try {
            //1 加载JDBC驱动类
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            //2 创建Connection对象
             connection =
                    DriverManager.getConnection(url,"root",
                                                "");
            //3 创建PreparedStatement对象  预编译对象
//            String sql = "select * from help_topic";
//            ? 占位符
            String sql = "insert into clazz values(?,?)";//插入 insert
            pspt = connection.prepareStatement(sql);
            pspt.setString(1,"4");
            pspt.setString(2,"四班");
            //4 创建结果集对象
//            rs = pspt.executeQuery();
            /*
                executeUpdate() 新增、删除、更新
                返回整数，可以根据返回的整数来判断操作是否成功
             */
            int result = pspt.executeUpdate();
            if (result == 1){
                System.out.println("success");
            }else{
                System.out.println("error");
            }
//            while (rs.next()){
//                String name = rs.getString(2);
//                System.out.println(name+"-----------");
//            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
//                rs.close();
                pspt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
