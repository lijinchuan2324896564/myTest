package com.web.tom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.web.tom.entity.Student;


public class StudentDao {
    public List<Student> getAllStudent() {
        List<Student> list = new ArrayList<Student>();
        Connection conn = DbHelper.getConnection();
        String sql = "select * from student";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                Student student = new Student();
                int stNumber=rst.getInt ("stNumber");
                String name=rst.getString("name");
                String major=rst.getString("major");
                student.setStNumber (stNumber); // 得到ID
                student.setName (name);
                student.setMajor (major);
                list.add(student);
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean addStudent(Student student) { // 添加信息
        String sql = "INSERT INTO `student`(`stNumber`,`name`,`major`) VALUES (?,?,?)";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, student.getStNumber ());
            pst.setString(2, student.getName ());
            pst.setString(3, student.getMajor ());
            int count = pst.executeUpdate();//SQL查询更新了多少行
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateStudent(Student student) { // 修改
        String sql = "UPDATE `student` SET `name`=?,`major`=? WHERE `stNumber` = ?";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1,student.getName());
            pst.setString(2, student.getMajor ());
            pst.setInt(3, student.getStNumber ()); // 根据的stNumber
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false; // 是否修改的判断
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteStudent(int stNumber) { // 删除
        String sql = "delete from student where stNumber = ?";
        Connection conn = DbHelper.getConnection();
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, stNumber);
            int count = pst.executeUpdate();
            pst.close();
            return count > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Student selectStudentByStNumber(int stNumber) {
        Connection conn = DbHelper.getConnection();
        String sql = "Select * from student where stNumber = " + stNumber;
        Student student = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                student = new Student ();
                student.setStNumber (rst.getInt("stNumber"));
                student.setName(rst.getString("name"));
                student.setMajor(rst.getString("major"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student ;
    }
    public Student selectStudentByname(String name) {
        Connection conn = DbHelper.getConnection();
        String sql = "select * from student where name = '"+name+"'" ;
        Student student = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rst = pst.executeQuery();
            while (rst.next()) {
                student = new Student ();
                student.setStNumber (rst.getInt("stNumber"));
                student.setName(rst.getString("name"));
                student.setMajor(rst.getString("major"));
                System.out.print (rst.getString("name"));
            }
            rst.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student ;
    }
}
