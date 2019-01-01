package com.web.tom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.web.tom.entity.Admin;
import com.web.tom.entity.Student;


public class AdminDao {
    public List<Admin> getAllAdmin() {
        List<Admin> list = new ArrayList<Admin>();
        Connection conn = DbHelper.getConnection();
        String sql = "select * from _admin";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Admin admin = new Admin();
                int id=rst.getInt ("id");
                String username=rst.getString("username");
                String userpwd=rst.getString("userpwd");
                admin.setId(id); // 得到ID
                admin.setUsername(username);
                admin.setUserpwd(userpwd);
                list.add(admin);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addAdmin(Admin admin) { // 添加信息
        String sql = "INSERT INTO `_admin`(`id`,`username`,`userpwd`) VALUES (?,?,?)";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, admin.getId());
            pst.setString(2, admin.getUsername());
            pst.setString(3, admin.getUserpwd());
            int count = pst.executeUpdate();//SQL查询更新了多少行
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateAdmin(Admin admin) { // 修改
        String sql = "UPDATE `_admin` SET `username`=?,`userpwd`=? WHERE `id` = ?";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, admin.getUsername());
            pst.setString(2, admin.getUserpwd());
            pst.setInt(3, admin.getId()); // 根据的ID
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false; // 是否修改的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteAdmin(int id) { // 删除
        String sql = "delete from _admin where id = ?";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false; // 是否删除的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Admin selectAdminById(int id) {
        Connection conn = DbHelper.getConnection();
        String sql = "select * from _admin where id = " + id;
        Admin admin = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                admin = new Admin();
                admin.setId(rst.getInt("id"));
                admin.setUsername(rst.getString("username"));
                admin.setUserpwd(rst.getString("userpwd"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }
    public Admin selectAdminByname(String username) {
        Connection conn = DbHelper.getConnection();
        String sql = "select * from _admin where username = '"+username+"'" ;
        Admin admin = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                admin = new Admin ();
                admin.setId (rst.getInt("id"));
                admin.setUsername (rst.getString("username"));
                admin.setUserpwd (rst.getString("userpwd"));
//                System.out.print (rst.getString("name"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return admin;
    }
    public Admin queryAdminByidAndPwd(Admin admin){
        String sql="select username,userpwd from _admin where username=? and userpwd=?";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, admin.getUsername());
            pst.setString(2, admin.getUserpwd());
            ResultSet rs = pst.executeQuery ();
            while (rs.next ()){
                admin =new Admin ();
                admin.setUsername (rs.getString ("username"));
                admin.setUserpwd (rs.getString ("userpwd"));
            }
        } catch (SQLException e) {
            e.printStackTrace ();
        } return admin;
    }
}
