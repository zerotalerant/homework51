package Dao;

import DataBaseConnection.DBC;
import Model.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class TeacherDao {
        private final static Connection conn = DBC.connect();
        public int insertTeacher( Teacher teacher) {
            String SQL = "INSERT INTO teacher (id, fisrt_name, second_name, hours_of_work, phonenumber)" + "VALUES(?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            try {
                preparedStatement = conn.prepareStatement(SQL);
                preparedStatement.setInt(1, teacher.getId());
                preparedStatement.setString(2, teacher.getFirstName ());
                preparedStatement.setString(2, teacher.getSecondName ());
                preparedStatement.setTime(3, teacher.getWorkingHours ());
                preparedStatement.setString(4, teacher.getPhonenumber());
                return preparedStatement.executeUpdate();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    preparedStatement.close();

                    conn.close();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
                }
            }
            return 0;
        }


    public int updateTeacher() {
        return 0;
    }

    public int deleteTeacher() {
        return 0;
    }

    public List<Teacher> selectTeacher() {
        return null;
    }
}
