package SQL;

import model.Child;
import model.Group;

public class App {
    public static void main(String[] args) {

        Group group1 = new Group("Sun", 21);
        Group group2 = new Group("Ship", 33);
        Child child1 = new Child("Alex", "male", 2);
        Child child2 = new Child("Liza", "female", 4);

        CRUDUtils.add(3,6,"child2");
        System.out.println(CRUDUtils.getGroupList());
    }
}
