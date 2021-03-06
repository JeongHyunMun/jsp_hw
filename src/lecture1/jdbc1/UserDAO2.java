package lecture1.jdbc1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import lecture1.DB;

public class UserDAO2 {

    public static List<User> findAll() throws Exception {
        String sql = "SELECT s.*, d.departmentName " +
                "FROM user s LEFT JOIN department d ON s.departmentId = d.id";
   try (Connection connection = DB.getConnection("student1");
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery()) {
       ArrayList<User> list = new ArrayList<User>();
       while (resultSet.next()) {
           User user = new User();
           user.setUserid(resultSet.getString("userid"));
           user.setName(resultSet.getString("name"));
           user.setEmail(resultSet.getString("Email"));
           user.setDepartmentName(resultSet.getString("departmentName"));
           user.setUserType(resultSet.getString("userType"));
           list.add(user);
       }
       return list;
   }
}
    public static List<User> findByName(String name) throws Exception {
        String sql = "SELECT s.*, d.departmentName " +
                "FROM user s LEFT JOIN department d ON s.departmentId = d.id " +
                "WHERE s.name LIKE ?";
   try (Connection connection = DB.getConnection("user1");
        PreparedStatement statement = connection.prepareStatement(sql)) {
       statement.setString(1, name + "%");
       try (ResultSet resultSet = statement.executeQuery()) {
           ArrayList<User> list = new ArrayList<User>();
           while (resultSet.next()) {
               User user = new User();
               user.setUserid(resultSet.getString("userid"));
               user.setName(resultSet.getString("name"));
               user.setEmail(resultSet.getString("email"));
               user.setDepartmentName(resultSet.getString("departmentName"));
               user.setUserType(resultSet.getString("userType"));
               list.add(user);
           }
           return list;
       }
   }
}
}
