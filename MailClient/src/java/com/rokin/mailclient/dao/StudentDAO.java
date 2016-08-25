/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rokin.mailclient.dao;

import com.rokin.mailclient.entity.Student;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rokin
 */
public interface StudentDAO {
    
    List<Student> getAll() throws ClassNotFoundException, SQLException;
    Student getById(int id) throws ClassNotFoundException, SQLException;
    int insertStudent(Student student) throws ClassNotFoundException, SQLException;
    int deleteStudent(Student student) throws ClassNotFoundException, SQLException;
    int updateStudent(Student student) throws ClassNotFoundException, SQLException;
}
