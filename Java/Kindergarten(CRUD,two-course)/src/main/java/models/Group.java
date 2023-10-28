package models;

public class Group {
    protected Long id;
    protected String name;
    protected int number;

    public Group(Long id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Group(String name, int number) {
        this.name = name;
        this.number = number;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
