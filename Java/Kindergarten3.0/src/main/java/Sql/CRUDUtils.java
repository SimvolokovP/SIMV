package Sql;

import models.Child;
import models.Group;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDUtils implements CRUD {
    public static void save(Child child) {
        String query = "INSERT into kindergarten.children(name, age ,gender, height, weight) VALUES (?,?,?,?,?)";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,child.getName());
            preparedStatement.setInt(2,child.getAge());
            preparedStatement.setString(3,child.getGender());
            preparedStatement.setDouble(4,child.getHeight());
            preparedStatement.setDouble(5,child.getWeight());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }

    public static void save(Group group) {
        String query = "INSERT into kindergarten.groups(group_name, number) VALUES (?,?)";

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,group.getName());
            preparedStatement.setInt(2,group.getNumber());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }

    public static void update(int childId, Child child) {
        String query = "UPDATE kindergarten.children SET name = ?, age = ?, gender= ?, height= ?, weight= ?  WHERE ID=?";
        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,child.getName());
            preparedStatement.setInt(2,child.getAge());
            preparedStatement.setString(3,child.getGender());
            preparedStatement.setDouble(4,child.getHeight());
            preparedStatement.setDouble(5,child.getWeight());
            preparedStatement.setDouble(6,childId);
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }

    public static void update(int groupId, Group group) {
        String query = "UPDATE kindergarten.groups SET name = ?, number = ? WHERE ID=?";
        try {

            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,group.getName());
            preparedStatement.setInt(2,group.getNumber());
            preparedStatement.setInt(3,groupId);
            preparedStatement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }

    public static void removeChild(int id) {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM kindergarten.children WHERE id=" + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void removeGroup(int id) {


        try {
            Connection connection = DBUtils.getConnection();


            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM kindergarten.groups WHERE id=" + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Child> getChildren() {
        String query = "select * from kindergarten.children";
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
                double height = rs.getDouble(5);
                double weight = rs.getDouble(6);
                list.add(new Child(id,name,age, gender, height, weight));


            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}
        return list;
    }

    public static List<Group> getGroups() {
        String query = "select * from kindergarten.groups";
        List<Group> list = new ArrayList<Group>();

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery(query);


            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int number = rs.getInt(3);
                list.add(new Group(id,name,number));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}
        return list;
    }

    public static void add(int childId, int groupId) {
        String query = "UPDATE kindergarten.children SET group_id = ? WHERE ID=?";
        try {

            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,groupId);
            preparedStatement.setInt(2,childId);

            preparedStatement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }

    public static void removeFromGroup(int childId) {
        String query = "UPDATE kindergarten.children SET group_id = ? WHERE ID=?";
        try {

            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,0);
            preparedStatement.setInt(2,childId);

            preparedStatement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);}

    }
    public static void show() {
        String query = "SELECT name, group_name from `groups` g right join children c on g.id = c.group_id";

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet rs = preparedStatement.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String groupName = rs.getString("group_name");
                System.out.println(name + ":" + groupName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void show(int groupId) {
        String query = "SELECT name, group_name from `groups` g join children c on g.id = c.group_id WHERE g.id =" + groupId;

        try {
            Connection connection = DBUtils.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query);

            ResultSet rs = preparedStatement.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("name");
                String groupName = rs.getString("group_name");
                System.out.println(name + ":" + groupName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void clearGroupsTable() {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM kindergarten.groups");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void clearChildrenTable() {
        Connection connection = DBUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            statement.execute("DELETE FROM kindergarten.children");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


