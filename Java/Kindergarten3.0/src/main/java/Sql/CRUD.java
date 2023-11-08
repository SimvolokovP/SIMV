package Sql;

import models.Child;
import models.Group;

import java.util.List;

public interface CRUD {
    static void save(Child child) {};
    static void save(Group group) {};
    static void update(int childId, Child child) {};
    static void update(int groupId, Group group) {};
    static void removeChild(int id) {};
    static void removeGroup(int id) {};
    static List<Child> getChildren() {
        return null;
    };
    static List<Group> getGroups() {return null;};
    static void add(int childId, int groupId) {};
    static void removeFromGroup(int childId) {};
    static void show() {};
    static void show(int groupId) {};
    static void clearChildrenTable() {};
    static void clearGroupsTable() {};
}
