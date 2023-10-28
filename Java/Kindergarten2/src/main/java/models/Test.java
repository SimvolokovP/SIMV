package models;

public class Test {
    public static void main(String[] args) {
        Group group = new Group("Sun", 55);
        Child child = new Child("Anton", 5, "male", group, 120.5 , 22.4);
        System.out.println(group);
        System.out.println(child);
    }
}
