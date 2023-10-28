package models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ChildFactory {
    public Child createChild(ResultSet rs) throws SQLException {
        Child child = null;
        child = new Child(rs.getInt("id"), rs.getString("name"), rs.getInt("age"),
                rs.getString("gender"), (Group) rs.getObject("Group"), rs.getDouble("Height"),
                rs.getDouble("Weight"));

        return child;
    }
}
