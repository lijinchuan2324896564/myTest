package com.web.tom.dao;

import com.web.tom.entity.Sign;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SignDao {
    public List<Sign> getAllSign() {
        List<Sign> list = new ArrayList<Sign> ();
        Connection conn = DbHelper.getConnection();
        String sql = "select * from sign";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Sign sign = new Sign();
                int id=rst.getInt ("id");
                int stNumber=rst.getInt ("stNumber");
                String name=rst.getString("name");
                String date=rst.getString("date");
                sign.setStNumber (stNumber);
                sign.setName (name);
                sign.setDate(date);
                list.add(sign);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean addSign(Sign sign) { // 添加信息
        String sql = "INSERT INTO `sign`(`stNumber`,`name`,`date`) VALUES (?,?,?)";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, sign.getStNumber ());
            pst.setString(2, sign.getName ());
            pst.setString(3, sign.getDate ());
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public List<Sign> selectSign(Sign sign) {
        List<Sign> list = new ArrayList<Sign> ();
        Connection conn = DbHelper.getConnection();
        String sql = "select * from sign where stNumber = ? ";
//        System.out.print (sql);
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
//            pst.setString(1, String.valueOf (sign.getStNumber ()));
            pst.setInt(1, sign.getStNumber ());
//            pst.setString(2, sign.getName ());
            ResultSet rst = pst.executeQuery();
            while (rst.next ()){
                sign=new Sign ();
//                sign.setId (rst.getInt ("id"));
                sign.setStNumber (rst.getInt ("stNumber"));
                sign.setName (rst.getString ("name"));
                sign.setDate (rst.getString ("date"));
                list.add(sign);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  list;
    }
}
