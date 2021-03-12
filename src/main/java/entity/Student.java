package entity;

public class Student {
    String name;
    int id;
    int cm;

    public Student(String name, int id, int cm) {
        this.name = name;
        this.id = id;
        this.cm = cm;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", cm=" + cm +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCm() {
        return cm;
    }

    public void setCm(int cm) {
        this.cm = cm;
    }
}
