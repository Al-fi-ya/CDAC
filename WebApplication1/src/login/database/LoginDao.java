/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfiya
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.login.database;

import java.sql.*;
import src.login.bean.LoginBean;

/**
 *
 * @author Alfiya
 */
public class LoginDao 
{
        public boolean validate(LoginBean loginBean) throws ClassNotFoundException {
        boolean status = false;
        
        String jdbcURL = "jdbc:mysql://localhost:3306/preksha_2018?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String dbUser = "root";
        String dbPassword = "";
        
        Class.forName("com.mysql.jdbc.Driver");
            try (Connection connection = DriverManager
            .getConnection(jdbcURL, dbUser, dbPassword);
        
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("SELECT * FROM user_login WHERE User_LoginID=? and User_Password=?")) {
            preparedStatement.setString(1, loginBean.getLoginID());
            preparedStatement.setString(2, loginBean.getPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

        
/*    public User checkLogin(String loginid, String password) throws SQLException, ClassNotFoundException
    {
        String jdbcURL = "jdbc:mysql://localhost:3306/preksha_2018?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String dbUser = "root";
        String dbPassword = "";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        String sql="SELECT * FROM user_login WHERE User_LoginID=? and User_Password=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, loginid);
        statement.setString(2, password);
        
        ResultSet result = statement.executeQuery();
        
        User user=null;
        
        if (result.next())
        {
            user= new User();
            user.setFirstName(result.getString("firstname"));
            user.setLastName(result.getString("lastname"));
            user.setLoginId(loginid);
        }
        
        connection.close();
        return user;
       
        }
}

*/