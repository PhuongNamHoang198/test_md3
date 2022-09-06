package com.codegym.service;

import com.codegym.connection.ConnectionJDBC;
import com.codegym.model.Student;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements IStudentDAO{
    private Connection connection = ConnectionJDBC.getInstance().getConnect();

    private final String SELECT_ALL_STUDENT = "select * from student where status like 'on';";
    private final String SELECT_STUDENT_BY_NAME = "select * from student where name like ?;";
    private final String INSERT_STUDENT = "insert into student (name, birth, address, phone, email, class_id) values (?,?,?,?,?,?);";
    private final String DELETE_STUDENT = "update student set status = 'off' where id = ?;";
    private final String EDIT_STUDENT = "update student set name = ?, birth = ?,address = ?,phone=?,email=?,class_id=? where id = ?;";

    @Override
    public List<Student> findAll() {
        List<Student> studentList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_STUDENT);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Date birth = rs.getDate("birth");
                String address = rs.getString("address");
                String phone = rs.getString("phone");
                String email = rs.getString("email");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }

    @Override
    public List<Student> findByName(String name) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void edit(int id, Student student) {

    }

    @Override
    public void delete(Student student) {

    }
}
