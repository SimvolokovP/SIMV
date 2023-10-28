package SQL;

import model.Child;
import model.Group;

public class App {
    public static void main(String[] args) {
        CRUDUtils.updateChild(7, "Josh");
        CRUDUtils.updateGroup(3, 4);
        CRUDUtils.updateChild(7,5);
        System.out.println(CRUDUtils.getChildList());
        Child child = new Child("Misha", "male", 4);
        Group group = new Group("Sun", 55);

        System.out.println(group);
        CRUDUtils.add(3,8, group);
        System.out.println(CRUDUtils.getGroupList());
    }
}
