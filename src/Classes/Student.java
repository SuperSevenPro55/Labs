package Classes;

public class Student implements Comparable<Student> {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public int compareTo(Student other) {
        if (this.getAge() != other.getAge()) {
            return Integer.compare(this.getAge(), other.getAge());
        }
        return this.getName().compareTo(other.getName());
    }

    @Override
    public String toString() { return this.getName() + ' ' + this.getAge();}
}