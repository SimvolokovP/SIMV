package SQL;

import model.Child;
import model.Group;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils {
    public static void clearChildList() {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM mydb.childlist");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void clearGroupList() {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM mydb.groups");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Child> getChildList() {
        String query = "select * from mydb.childlist";
        List<Child> list = new ArrayList<Child>();

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery(query);


            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String gender = rs.getString(4);
                list.add(new Child(id,name,gender,age));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}
        return list;
    }

    public static List<Group> getGroupList() {
        String query = "select * from mydb.groups";
        List<Group> list = new ArrayList<Group>();

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery(query);


            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int number = rs.getInt(3);
                String childList = rs.getString(4);
                list.add(new Group(id,name,number));

            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}
        return list;
    }

    public static void save(Child child) {
        String query = "INSERT into mydb.childlist(name, age ,gender) VALUES (?,?,?)";

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,child.getName());
            preparedStatement.setInt(2,child.getAge());
            preparedStatement.setString(3,child.getGender());

            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }

    public static void remove(int id) {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM mydb.childlist WHERE id=" + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void save(Group group) {
        String query = "INSERT into mydb.groups(name, number) VALUES (?,?)";

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,group.getName());
            preparedStatement.setInt(2,group.getNumber());

            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



    public static void add(int groupIndex, int childIndex, String columnName) {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("ALTER TABLE mydb.groups ADD COLUMN " + columnName + " INT NOT NULL AFTER childlist");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        String query = "UPDATE mydb.groups SET " + columnName + " = ? WHERE ID=?";

        try {

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,childIndex);
            preparedStatement.setInt(2,groupIndex);

            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }


}
