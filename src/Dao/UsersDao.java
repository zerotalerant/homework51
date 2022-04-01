package Dao;

import DataBaseConnection.DBC;
import Model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsersDao {
    private final static Connection conn = DBC.connect ();

    public int insertUsers ( Users users )
    {
        String SQL = "INSERT INTO users (id, login, password, email)" + "VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = null;
        try
        {
            preparedStatement = conn.prepareStatement ( SQL );
            preparedStatement.setInt ( 1, users.getId () );
            preparedStatement.setString ( 2, users.getLogin () );
            preparedStatement.setString ( 3, users.getPassword () );
            preparedStatement.setString ( 4, users.getEmail () );
            return preparedStatement.executeUpdate ();
        } catch (SQLException e)
        {
            System.out.println ( e.getMessage () );
        } finally
        {
            try
            {
                preparedStatement.close ();

                conn.close ();
            } catch (SQLException e)
            {
                System.out.println ( e.getMessage () );
            }
        }
        return 0;
    }

    public int updateUser ()
    {
        return 0;
    }

    public int deleteUser ()
    {
        return 0;
    }

    public List<Users> selectUsers ()
    {
        return null;
    }
}
