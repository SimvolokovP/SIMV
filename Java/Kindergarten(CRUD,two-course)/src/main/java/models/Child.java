package models;

public class Child extends Human {
    protected Group group;
    protected double height;
    protected double weight;


    public Child(int id, String name, int age, String gender, Group group, double height, double weight) {
        super(id, name, age, gender);
        this.group = group;
        this.height = height;
        this.weight = weight;
    }

    public Child(String name, int age, String gender, Group group, double height, double weight) {
        super(name, age, gender);
        this.group = group;
        this.height = height;
        this.weight = weight;
    }


    public  Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public  double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Child{" +
                "group=" + group +
                ", height=" + height +
                ", weight=" + weight +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
