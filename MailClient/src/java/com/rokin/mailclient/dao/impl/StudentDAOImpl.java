/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.mailclient.dao.impl;

import com.rokin.mailclient.dao.StudentDAO;
import com.rokin.mailclient.dbutil.DbConnection;
import com.rokin.mailclient.entity.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rokin
 */
public class StudentDAOImpl implements StudentDAO{

    private DbConnection db = new DbConnection();
    
    
    @Override
    public List<Student> getAll() throws ClassNotFoundException, SQLException {
        db.openConnection();
        List<Student> studentList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_students";
        PreparedStatement stmt = db.initStatement(sql);
        ResultSet rs = db.executeQuery();
        while(rs.next())
        {
            Student student = new Student();
            student.setId(rs.getInt("Id"));
            student.setFirstName(rs.getString("First_Name"));
            student.setLastName(rs.getString("Last_Name"));
            student.setFaculty(rs.getString("Faculty"));
            student.setEmail(rs.getString("Email"));
            studentList.add(student);
        }
        db.closeConnection(); 
        return studentList;
    }

    @Override
    public Student getById(int id) throws ClassNotFoundException, SQLException {
        db.openConnection();
        String sql = "SELECT * FROM tbl_students WHERE Id=?";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = db.executeQuery();
        
        while(result.next())
        {
            Student student = new Student();
            student.setId(result.getInt("Id"));
            student.setFirstName(result.getString("First_Name"));
            student.setLastName(result.getString("Last_Name"));
            student.setFaculty(result.getString("Faculty"));
            student.setEmail(result.getString("Email"));
            return student;
        }
        db.closeConnection();
        return null;
    }

    @Override
    public int insertStudent(Student student) throws ClassNotFoundException, SQLException 
    {
        db.openConnection();
        String sql = "INSERT INTO tbl_students(First_Name, Last_Name, Faculty, Email) VALUES(?,?,?,?)";
        
        PreparedStatement stmt = db.initStatement(sql);
        
        stmt.setString(1, student.getFirstName());
        stmt.setString(2, student.getLastName());
        stmt.setString(3, student.getFaculty());
        stmt.setString(4, student.getEmail());
        
        int result = stmt.executeUpdate();
        
        db.closeConnection();
        return result;
    }

    @Override
    public int deleteStudent(Student student) throws ClassNotFoundException, SQLException {
        db.openConnection();
        String sql = "DELETE FROM tbl_students WHERE Id=?";
        PreparedStatement stmt = db.initStatement(sql);
        stmt.setInt(1, 0);
    }

    @Override
    public int updateStudent(Student student) throws ClassNotFoundException, SQLException {
        
    }
    
}
